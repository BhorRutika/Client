package Utility;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import com.google.gson.Gson;

import Helper.Common;
import Model.FileUpload_Model;

public class FileUploader {

	public static void main(String[] args) {
		String serverUrl = "http://it.mh-hsc.ac.in/Exam/UploadFile/";
		String filePath = "C:\\Users\\MSBSHSE-AIO\\March_2024\\P111011.ANS";

		try {
			uploadFile(serverUrl, filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void uploadFile(String serverUrl, String filePath) throws IOException {
		File file = new File(filePath);
		System.out.println(file);
		if (!file.exists()) {
			System.err.println("File not found: " + filePath);
			return;
		}

		if (file.length() > 10 * 1024 * 1024) {
			System.err.println("File size exceeds 10MB limit.");
			return;
		}
		Common common=new Common();
		URL url = new URL(serverUrl);
		/*
		 * HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		 * System.out.println(connection);
		 */
		HttpClient httpClient = HttpClient.newBuilder().build();
		
		try {
			FileUpload_Model fu=new FileUpload_Model();
			fu.Seat_No="P111011";
			fu.Batch="B2";
			byte[] byteData = Files.readAllBytes(Paths.get(common.GetAnsFilePath(fu.Seat_No)));
			fu.Bytes=byteData;
			/*
			 * try{ fu.File=encoder(common.GetAnsFilePath(fu.Seat_No)); } catch (Exception
			 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
			 */
			Gson gson = new Gson();
			String json = gson.toJson(fu); //fu
			System.out.println(json);		
			HttpRequest request = HttpRequest.newBuilder()
					.POST(HttpRequest.BodyPublishers.ofString(json))
					.header("Content-Type", "application/json") 
					.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
							common.Get_Index_No().toString().substring(2, 5)) + "Login"+"UploadFile"))
					.build();
			HttpResponse respons = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(respons.body());
			FileUpload_Model Object = gson.fromJson((String) respons.body(), FileUpload_Model.class);
			
			System.out.println("File Uploaded Successfully");} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			} 

		/*
		 * // Set connection properties connection.setDoOutput(true);
		 * connection.setRequestMethod("POST");
		 * 
		 * connection.setRequestProperty("Content-Type", "application/octet-stream");
		 * connection.setRequestProperty("Content-Disposition","attachment; filename=\""
		 * + file.getName() + "\"");
		 * 
		 * 
		 * // Write file content to the connection output stream try (OutputStream
		 * outputStream = connection.getOutputStream(); FileInputStream inputStream =
		 * new FileInputStream(file)) { byte[] buffer = new byte[4096]; int bytesRead;
		 * while ((bytesRead = inputStream.read(buffer)) != -1) {
		 * outputStream.write(buffer, 0, bytesRead); } outputStream.flush(); }
		 * 
		 * // Check server response int responseCode = connection.getResponseCode();
		 * System.out.println(responseCode); if (responseCode ==
		 * HttpURLConnection.HTTP_OK) {
		 * System.out.println("File uploaded successfully."); } else {
		 * System.err.println("Failed to upload file. Server response code: " +
		 * responseCode); }
		 * 
		 * connection.disconnect();
		 */
	}
	public static  String encoder(String filePath) 
	{
        String base64File = "";
        File file = new File(filePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a file from file system
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            
            base64File = Base64.getEncoder().encodeToString(fileData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the file " + ioe);
        }
        return base64File;
    }

}
