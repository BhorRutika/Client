package Helper;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JLabel;
import Model.*;
import Helper.*;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Answer_Submit {
	
	
	
	private static final String FolderName = "March_2024";
	Answer_Model Answer_Model = new Answer_Model();
	Common common=new Common();
	
	HttpClient httpClient = HttpClient.newBuilder().build();
	static Login_Model login_details;
	
	
	//Print statement
	public static void Print(String MSG,int Active)
	{
		if(Active<=9) 
		{
			System.out.println("\n"+MSG);
		}
		
	}
	
	
	//Answer Submit Que 1
	public void Question1(Answer1_Model Am1) 
	{	
		Gson gson = new Gson();
		String json = gson.toJson(Am1);
		//Print(json,1);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json)) 
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) +"Question1")).build();
		try {
				httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
				{ 
					
					Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
					if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
					{ 
						System.out.println(response1.body());
						common.ShowMessage(null, "Question 1 Submitted Successfully");
					}
					else 
					{ 
						System.out.println(response1.body()); 
					} return null; })
			.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}	
	
	//Answer Submit Que 2
	public void Question2(Answer2_Model Am2) 
	{
		Gson gson = new Gson();
		String json = gson.toJson(Am2);
		//Print(json,2);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) + "Question2")).build();
		try {
			httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
			{ 
				Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
				if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
				{ 
					System.out.println(response1.body());
					common.ShowMessage(null, "Question 2 Submitted Successfully");
				}
				else 
				{ 
					System.out.println(response1.body()); 
				} return null; })
		.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		}
	
	//Answer Submit Que 3
	public void Question3(Answer3_Model Am3) 
	{
		Gson gson = new Gson();
		String json = gson.toJson(Am3);
		//Print(json,3);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) +"Question3")).build();
		try {
			httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
			{ 
				Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
				if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
				{ 
					System.out.println(response1.body());
					common.ShowMessage(null, "Question 3 Submitted Successfully");
				}
				else 
				{ 
					System.out.println(response1.body()); 
				} return null; })
		.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 	}
	
	//Answer Submit Que 4
	public void Question4(Answer4_Model Am4) 
	{
		Gson gson = new Gson();
		String json = gson.toJson(Am4);
		//Print(json,4);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) +"Question4")).build();
		try {
			httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
			{ 
				Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
				if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
				{ 
					System.out.println(response1.body());
					common.ShowMessage(null, "Question 4 Submitted Successfully");
				}
				else 
				{ 
					System.out.println(response1.body()); 
				} return null; })
		.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 	
		}
	
	//Answer Submit Que 5
	public void Question5(Answer5_Model Am5) 
	{
		Gson gson = new Gson();
		String json = gson.toJson(Am5);
		//Print(json,5);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) +"Question5")).build();
		try {
			httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
			{ 
				Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
				if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
				{ 
					System.out.println(response1.body());
					common.ShowMessage(null, "Question 5 Submitted Successfully");
				}
				else 
				{ 
					System.out.println(response1.body()); 
				} return null; })
		.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
	
	//Answer Submit Que 6
	public void Question6(Answer6_Model Am6) 
	{
		Gson gson = new Gson();
		String json = gson.toJson(Am6);
		//Print(json,6);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) +"Question6")).build();
		try {
			httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
			{ 
				Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
				if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
				{ 
					System.out.println(response1.body());
					common.ShowMessage(null, "Question 6 Submitted Successfully");
				}
				else 
				{ 
					System.out.println(response1.body()); 
				} return null; })
		.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 	
		}
	
	//Answer Submit Que 7
	public void Question7(Answer7_Model Am7) 
	{
		Gson gson = new Gson();
		String json = gson.toJson(Am7);
		//Print(json,7);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) +"Question7")).build();
		try {
			httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
			{ 
				Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
				if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
				{ 
					System.out.println(response1.body());
					common.ShowMessage(null, "Question 7 Submitted Successfully");
				}
				else 
				{ 
					System.out.println(response1.body()); 
				} return null; })
		.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
	
	//Answer Submit Que 8
	public void Question8(Answer8_Model Am8) 
	{
		Gson gson = new Gson();
		String json = gson.toJson(Am8);
		Print(json,8);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) + "Question8")).build();
		try {
			httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
			{ 
				Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
				if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
				{ 
					System.out.println(response1.body());
					common.ShowMessage(null, "Question 8 Submitted Successfully");
				}
				else 
				{ 
					System.out.println(response1.body()); 
				} return null; })
		.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 	
	}
	
	public void All_Ans(Answer_Model Am)
	{
		Gson gson = new Gson();
		String json = gson.toJson(Am);
		System.out.println(json);
		//Print(json,1);
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json)) 
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) +"Final_Ans")).build();
		try {
				httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
				{ 
					
					Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
					System.out.println("All_Ans: "+response1.body());
					if (response.Result.trim().equalsIgnoreCase("SUCCESS")) 
					{ 
						System.out.println(response1.body());
						common.ShowMessage(null, "All Answers Submitted Successfully");
					}
					else 
					{ 
						System.out.println(response1.body()); 
					} return null; })
			.exceptionally(we -> { System.err.println("Error" + we.getMessage()); return null; });
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	
	}
	
	//Answer File Uploading to server
	public void FileUpload(String seat_No) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException, IOException, InterruptedException
	{
		FileUpload_Model fu=new FileUpload_Model();
		fu.Seat_No=seat_No;
		fu.Batch="B2";
		
		byte[] byteData = Files.readAllBytes(Paths.get(common.GetAnsFilePath(seat_No)));
		fu.Bytes=byteData;
		try{
		  fu.File=encoder(common.GetAnsFilePath(seat_No));
		  } catch (Exception e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
		try {
		Gson gson = new Gson();
		String json = gson.toJson(fu); //fu
					
		HttpRequest request = HttpRequest.newBuilder()
				.POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json") 
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) + "Login"+"UploadFile_Base64"))
				.build();
		HttpResponse respons = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(respons.body());
		FileUpload_Model Object = gson.fromJson((String) respons.body(), FileUpload_Model.class);
		
		Print("File Uploaded Successfully", 9);} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
	}
	
	//Encoding Answer file into Base64
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
	
    public static void uploadFile(String serverUrl, String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("File not found: " + filePath);
            return;
        }

        if (file.length() > 10 * 1024 * 1024) {
            System.err.println("File size exceeds 10MB limit.");
            return;
        }

        URL url = new URL(serverUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set connection properties
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/octet-stream");
        connection.setRequestProperty("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"");

        // Write file content to the connection output stream
        try (OutputStream outputStream = connection.getOutputStream();
             FileInputStream inputStream = new FileInputStream(file)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            outputStream.flush();
        }

        // Check server response
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            System.out.println("File uploaded successfully.");
        } else {
            System.err.println("Failed to upload file. Server response code: " + responseCode);
        }

        connection.disconnect();
    }

	
	
	
	
	
	

	
	
	
}
