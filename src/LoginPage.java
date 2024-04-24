import java.awt.EventQueue;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.sound.midi.Receiver;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;

import com.google.gson.Gson;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import Model.*;
import Helper.*;

public class LoginPage extends JFrame implements ActionListener, KeyListener {

	private static final String DIndex_No = null;
	private JPanel contentPane;
	private JTextField SeatTxt;
	private JPasswordField passwordField1 = new JPasswordField("");

	public String qual = "";
	public String DecIndex;
	public static String servertime;
	public static String Seatnoo;
	public static final String Password = "";
	public String FolderName = "March_2024";
	public String Key = "ONLINEEXAM_M2022";
	Answer_Submit AS = new Answer_Submit();
	public JLabel Index;
	static JButton btnlogin;
	static JButton Exit;
	static JRadioButton Science_RadioButton = new JRadioButton("Science");
	static JRadioButton Arts_RadioButton = new JRadioButton("Arts");
	static JRadioButton Commerce_RadioButton = new JRadioButton("Commerce");

	String path = System.getProperty("user.home") + File.separator + FolderName;

	static Common common = new Common();
	private Robot robot;
	private JPasswordField passwordField;
	DateTime_Model datetime_model = new DateTime_Model();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @param seat_No
	 * @param date2
	 * @param date2
	 * @param date2
	 * @param date2
	 * @throws IOException
	 * @throws BadPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws InvalidAlgorithmParameterException
	 * @throws NoSuchPaddingException
	 * @throws NoSuchAlgorithmException
	 * @throws InvalidKeyException
	 */

	public LoginPage(DateTime_Model model) throws IOException, InvalidKeyException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {

		datetime_model = model;

		addKeyListener(this);
		setFocusable(true);

		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Image/ssc-pune-logo.png"));
		setIconImage(icon.getImage());
		setAutoRequestFocus(true);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(624, 428);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MouseRecenter("ContentPane"));

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 623, 95);
		contentPane.add(panel);
		panel.setLayout(null);

		setVisible(true);

		FileInputStream file = new FileInputStream(path + "/Index_No.txt");

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(file))) {
			String Indexnumber = reader.readLine();
			DecIndex = AESCipher.aesDecryptString(Indexnumber, Key);
		}

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/Image/Header.jpg")));
		lblNewLabel.setBounds(0, 0, 630, 95);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Login Screen");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(0, 0, 128));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_1.setBounds(237, 106, 92, 32);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("College Index No -");
		lblNewLabel_2.setForeground(new Color(0, 0, 139));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(57, 166, 130, 25);
		contentPane.add(lblNewLabel_2);

		JLabel Index = new JLabel("" + DecIndex);
		Index.setFont(new Font("Tahoma", Font.BOLD, 12));
		Index.setBounds(224, 166, 118, 25);
		contentPane.add(Index);

		JLabel lblNewLabel_4 = new JLabel("Date -");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setBounds(438, 166, 49, 25);
		contentPane.add(lblNewLabel_4);

		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		String newstring = new SimpleDateFormat("dd-MM-yyyy").format(date);
		// System.out.print(newstring);
		JLabel lblNewLabel_5 = new JLabel("" + newstring);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(486, 166, 92, 25);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Enter Seat No -");
		lblNewLabel_6.setForeground(new Color(0, 0, 128));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(57, 202, 130, 25);
		contentPane.add(lblNewLabel_6);

		SeatTxt = new JTextField();
		SeatTxt.addKeyListener(this);
		SeatTxt.setDocument(new JTextFieldLimit(7));
		SeatTxt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SeatTxt.setBounds(224, 203, 118, 25);
		contentPane.add(SeatTxt);
		SeatTxt.setColumns(10);
		//SeatTxt.setText("P111011");

		JLabel lblNewLabel_7 = new JLabel("Stream -");
		lblNewLabel_7.setForeground(new Color(0, 0, 128));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(57, 238, 130, 25);
		contentPane.add(lblNewLabel_7);

		Science_RadioButton = new JRadioButton("Science");
		Science_RadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		Science_RadioButton.setBounds(224, 239, 75, 25);
		contentPane.add(Science_RadioButton);

		Arts_RadioButton = new JRadioButton("Arts");
		Arts_RadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		Arts_RadioButton.setBounds(303, 239, 57, 25);
		contentPane.add(Arts_RadioButton);

		Commerce_RadioButton = new JRadioButton("Commerce");
		Commerce_RadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		Commerce_RadioButton.setBounds(362, 239, 98, 25);
		contentPane.add(Commerce_RadioButton);

		ButtonGroup bg = new ButtonGroup();
		bg.add(Science_RadioButton);
		bg.add(Arts_RadioButton);
		bg.add(Commerce_RadioButton);

		JLabel lblNewLabel_8 = new JLabel("Invigilator Signature -");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setBounds(57, 274, 141, 25);
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("(Invigilator should check all the data filled by student)");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(57, 324, 444, 25);
		contentPane.add(lblNewLabel_9);

		JButton btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlogin.setForeground(new Color(0, 0, 128));
		btnlogin.addActionListener(this);
		btnlogin.setBounds(175, 360, 89, 23);
		contentPane.add(btnlogin);

		JButton Exit = new JButton("Exit");
		Exit.setForeground(new Color(0, 0, 128));
		Exit.setFont(new Font("Tahoma", Font.BOLD, 11));
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		Exit.setBounds(292, 360, 89, 23);
		contentPane.add(Exit);

		passwordField1.setEchoChar('*');
		passwordField1.setBounds(224, 276, 118, 22);
		//passwordField1.setText("sambqq1q");
		contentPane.add(passwordField1);

	}

	// Custom MouseListener implementation
	private class MouseRecenter extends MouseAdapter {
		private String componentName;

		public MouseRecenter(String componentName) {
			this.componentName = componentName;

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component source = (Component) e.getSource();
			Container ss = source.getParent();
			if (componentName == "Button") {
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component source = (Component) e.getSource();
			Container ss = source.getParent();

			setSize(620, 400);
			Dimension frameSize = getSize();

			int frameWidth = frameSize.width;
			int frameHeight = frameSize.height;

			if (componentName == "ContentPane"
					&& (e.getX() < 0 || e.getX() >= frameWidth || e.getY() < 0 || e.getY() >= frameHeight)) {
				draw(e.getX(), e.getY());
			}
		}
	}

	public void actionPerformed(ActionEvent e) {

		Seatnoo = SeatTxt.getText();
		CheckExamTime();

	}

	public void CheckExamTime() {
		try {

			if (SeatTxt.getText().equals("")) {
				common.ShowMessage(null, "Enter Seat no.");
			} else if (SeatTxt.getText().length() != 7) {
				common.ShowMessage(null, "Seat no. must be of 1 Character and 6 Digits");
			}

			String stream = "";
			if (Science_RadioButton.isSelected()) {
				qual = "97";
			} else if (Arts_RadioButton.isSelected()) {
				qual = "98";
			} else if (Commerce_RadioButton.isSelected()) {
				qual = "99";
			} else {
				qual = "";
			}

			if (qual.equals("")) {
				common.ShowMessage(null, "Select Stream");
			}

			int HOUR = 0, MINUTE = 0, SECONDS = 0;
			String sysUIFormat = datetime_model.AMPM, Batch = "";
			MINUTE = Integer.valueOf(datetime_model.MIN);
			HOUR = Integer.valueOf(datetime_model.HR);
			if (sysUIFormat.equals("PM")) {
				if (HOUR >= 12) {

				} else {
					HOUR = HOUR + 12;
				}
			}

			if (HOUR >= Common.Morning_Batch_Start_Hour() && HOUR <= Common.Morning_Batch_End_Hour()) // Morning Batch
			{
				
				if (datetime_model.DD .equals(Common.Exam_Day1())) {
					Batch = "B1";
				} else if (datetime_model.DD.equals( Common.Exam_Day2())) {
					Batch = "B3";
				} else if (datetime_model.DD.equals( Common.Exam_Day3())) {
					Batch = "B5";
				} else if (datetime_model.DD.equals( Common.Exam_Day4())) {
					Batch = "B7";
				}

			} 
			else if (HOUR >= Common.Afternoon_Batch_Start_Hour() && HOUR <= Common.Afternoon_Batch_End_Hour()) // Afternoon
																													// Batch
			{
				if (datetime_model.DD.equals(Common.Exam_Day1())) {
					Batch = "B2";
				} else if (datetime_model.DD.equals( Common.Exam_Day2())) {
					Batch = "B4";
				} else if (datetime_model.DD.equals( Common.Exam_Day3())) {
					Batch = "B6";
				} else if (datetime_model.DD.equals( Common.Exam_Day4())) {
					Batch = "B8";
				}
			} else {

			}
			
			if (!Batch.equals(passwordField1.getText().substring(3, 4).toUpperCase()
					+ passwordField1.getText().substring(6, 7).toUpperCase())
					&& !datetime_model.DD.equals(Common.Dry_Run_Day())) 
			{

				common.ShowMessage(null,
						"Invalid Password" + Batch + " " + passwordField1.getText() + " "
								+ passwordField1.getText().substring(3, 4).toUpperCase() + " "
								+ passwordField1.getText().substring(6, 7).toUpperCase());
				return;
			}

			Login_Model request_model = new Login_Model();
			request_model.Index_No = "" + DecIndex;
			request_model.Seat_No = "" + Seatnoo;
			request_model.Batch = "" + Batch;
			request_model.Stream = "" + qual;
			request_model.Password = passwordField1.getText();

			Gson gson = new Gson();
			String json = gson.toJson(request_model);
			System.out.println(json);
			AS.Print(json, 1);
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
				 * Response_Model response = gson.fromJson(respons.body(),
				 * Response_Model.class); //System.out.println(qual + request_model.Batch);
				 */
				
				httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response1 -> 
					{
						 System.out.println(response1.body());
						 Response_Model response = gson.fromJson(response1.body(), Response_Model.class);
						 response.Login_Model.Paper_ID="MP";
						 if (response.Result.trim().equalsIgnoreCase("SUCCESS")) {
								try {
									if (!response.Login_Model.Seat_No.trim().equals(SeatTxt.getText().trim())) 
									{
										common.ShowMessage(null, "Retry Login... !!! Server Might be Busy");
										btnlogin.setVisible(true);
										Exit.setVisible(true);
										
									}
									common.ShowMessage(null, response.Message);
									String batch = response.Login_Model.Batch.trim().toUpperCase();
									if ((batch.equals("B1")) || (batch.equals("B3")) || (batch.equals("B5"))
											|| (batch.equals("B7"))) {
										response.Login_Model.Session = "Morning";
									} else if ((batch.equals("B2")) || (batch.equals("B4")) || (batch.equals("B6"))
											|| (batch.equals("B8"))) {
										response.Login_Model.Session = "Afternoon";
									} else {
										common.ShowMessage(null, "Invalid Batch ");
										System.exit(0);
									}
									String PageText = Get_Paper(common 
											.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
													common.Get_Index_No().toString().substring(2, 4))
											.replace("Exam/", "") + "TXT/" + response.Login_Model.Paper_ID + ".txt");
									System.out.println(PageText);
									if (PageText.equals("")) {
										common.ShowMessage(null,
												"No Internet Connection Rerun Application Again!!! Error Code:- 1000");
										Enable_Button();
									} else {
										response.Login_Model.Page_Text = PageText;
										if (Integer.parseInt((response.Login_Model.Relogin_Count .equals("") ) ? "0"
												: response.Login_Model.Relogin_Count) > 1) {
											common.WriteAnsFile(response.Login_Model.Seat_No, "¶Relogin£");
										} else {
											common.WriteAnsFile(response.Login_Model.Seat_No, "¶Start of the file£");
										}
										common.WriteAnsFile(response.Login_Model.Seat_No,
												"¶Seat_No£" + response.Login_Model.Seat_No);
										common.WriteAnsFile(response.Login_Model.Seat_No, "¶Login_MSG£" + response.Message);
										common.WriteAnsFile(response.Login_Model.Seat_No,
												"¶Paper_ID£" + response.Login_Model.Paper_ID);
										common.WriteAnsFile(response.Login_Model.Seat_No,
												"¶Exam_Time£" + DateFormat.getDateTimeInstance().format(new Date()) + "");

										dispose();
										Instruction_Screen frameintro1 = new Instruction_Screen(response.Login_Model);
										frameintro1.setVisible(true);
										frameintro1.setLocationRelativeTo(null);
									}

								} catch (Exception e1) {
									e1.printStackTrace();
								}
							}
						else 
						{ 
							System.out.println("failed !!"); 
						} 
						return null; 
						}).exceptionally(we -> { System.err.println("Error fetching weather data for  " + we.getMessage()); return null; });
							
				
				
				

			} catch (Exception e1) {
				common.ShowMessage(null, "Error:" + e1);
			}

		} catch (Exception ex) {

		}

	}

	void Enable_Button() {
		btnlogin.setVisible(true);
		Exit.setVisible(true);
		btnlogin.setText("Submit");
	}

	public String Get_Paper(String URL) {
		try {
			StringBuilder content = new StringBuilder();
			// paper
			URL url = new URL(URL);
			URLConnection urlConnection = url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;
			// reading from the urlconnection using the bufferedreader
			while ((line = bufferedReader.readLine()) != null) {
				content.append(line.replace("ï»¿", ""));
			}
			bufferedReader.close();

			return content.toString();

		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return "";
	}

	public void draw(int mouseX, int mouseY) {
		try {
			Robot bot = new Robot();
			bot.mouseMove(680, 346);
			// System.out.print(" MouseX Mouse y"+mouseX +mouseY);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

		char keyChar = e.getKeyChar();
		if (Character.isLowerCase(keyChar)) {
			e.setKeyChar(Character.toUpperCase(keyChar));
		}

		char c1 = e.getKeyChar();
		String text = SeatTxt.getText();

		if (c1 == KeyEvent.VK_BACK_SPACE) {
			return;
		}
		// Validate input: one character followed by six digits
		if (!(text.length() == 0 && Character.isLetter(c1))
				&& !(text.length() >= 1 && text.length() <= 7 && Character.isDigit(c1))) {
			e.consume(); // Discard the key event
			common.ShowMessage(null, "Invalid input. Please enter one character followed by six digits.");
		}

		/*
		 * char c = e.getKeyChar(); if (!(Character.isDigit(c) || (c ==
		 * KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
		 * Toolkit.getDefaultToolkit().beep(); e.consume(); }
		 */

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ALT) {
			common.ShowMessage(null, "Alt key Pressed!!");
			System.exit(0);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	
	public void myAsyncMethodInAnotherClass() throws InterruptedException, ExecutionException {
	    final Receiver receiver; 
	    ExecutorService executorService = Executors.newFixedThreadPool(10);

	    Future future = executorService.submit(new Runnable() {
	        public void run() {
	            System.out.println("Asynchronous task");
	            //receiver.doSomeThingElse();
	        }
	    }); 

	    executorService.shutdown();
	}
}
