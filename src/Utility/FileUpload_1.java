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

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.google.gson.Gson;
import Model.FileUpload_Model;
import Model.Response_Model;
import Helper.Common;


public class FileUpload_1 {
	
	static Response_Model responce=new Response_Model();
	Common common=new Common();
	HttpClient httpClient = HttpClient.newBuilder().build();
	//static File fileToUpload=new File("/Client/src/P123456.txt");
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		FileUpload_Model fu=new FileUpload_Model();

		byte[] byteData = Files.readAllBytes(Paths.get(System.getProperty("user.home") + File.separator + "M2022//Rutika.ans"));
		System.out.println("Size:-"+byteData.length);

		 try{
		 fu.Seat_No="P123456";
		fu.Batch="D1";
		//String fdata=encoder(Paths.get(System.getProperty("user.home") + File.separator + "M2022//P123456.ans").toString());
		fu.File=encoder(Paths.get(System.getProperty("user.home") + File.separator + "M2022//Rutika.ans").toString());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		String json = gson.toJson(fu);
		System.out.println(json);

		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request1 = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create("http://it.mh-hsc.ac.in/Exam/UploadFile_Base64")).build();
		HttpResponse<String> respons = httpClient.send(request1, HttpResponse.BodyHandlers.ofString());

		Response_Model Object = gson.fromJson(respons.body(), Response_Model.class);
		try {
			System.out.println(Object.Message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	

	public static  String encoder(String filePath) {
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
