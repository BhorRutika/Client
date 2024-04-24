package Utility;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.google.gson.Gson;

import Helper.Common;
import Model.Login_Model;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginApi_Call extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	Common common = new Common();
	Login_Model request_model= new Login_Model(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginApi_Call frame = new LoginApi_Call();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginApi_Call() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.setBounds(168, 173, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Gson gson = new Gson();
				String json = gson.toJson(request_model);
				System.out.println(json);
				HttpClient httpClient = HttpClient.newBuilder().build();
				HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
						.header("Content-Type", "application/json")
						.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
								common.Get_Index_No().toString().substring(2, 4)) + "Login"))
						.build();
				try {
					
					/*
					 * HttpResponse<String> respons = httpClient.send(request,
					 * HttpResponse.BodyHandlers.ofString()); System.out.println(respons.body());
					 */
					  
					httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()) .thenApply(response -> 
					{ if (response.statusCode() == 200) { System.out.println( response.body()); }
					else { System.out.println("Error fetching "+ response.statusCode()); } return null; })
					.exceptionally(we -> { System.err.println("Error fetching weather data for  " + we.getMessage()); return null; }); 
				
				System.out.println( "test"); 
				
					
				}	
			 catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	});
}
	
	 private static void crunnchifyPrint(Object data) {
	        System.out.println(data);
	    }
}
