import javax.swing.JFrame;
import javax.swing.JProgressBar;
import com.google.gson.Gson;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Date;
import Model.*;
import Helper.*;

public class ProgressBarExample<Date> extends JFrame implements ActionListener, KeyListener {
	JLabel lblNewLabel_2 = new JLabel();
	public String Date, Month;
	Common common = new Common();
	String path = System.getProperty("user.home") + File.separator + common.FolderName;
	public static ProgressBarExample main;
	public static String servertime;
	public String DecIndex;
	public String Key = "ONLINEEXAM_M2022";

	public static void main(String[] args) throws IOException, ParseException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {

		main = new ProgressBarExample();
		main.setUndecorated(true);
		main.setSize(450, 330);
		main.setLocationRelativeTo(null);
		main.setDefaultCloseOperation(EXIT_ON_CLOSE);
		main.setVisible(true);
		main.iterate();

		/*
		 * int num = 43; Passing_Value Pv = new Passing_Value(num); new
		 * Thread(Pv).start();
		 */

	}

	JProgressBar Progressbar;
	static int i = 0;
	int num = 0;

	ProgressBarExample() throws IOException {

		common.Get_Index_No();
		// Shut down when alt key pressed
		addKeyListener(this);
		setAlwaysOnTop(true);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Image/ssc-pune-logo.png"));
		setIconImage(icon.getImage());

		Progressbar = new JProgressBar(0, 500);
		Progressbar.setBounds(150, 251, 160, 17);
		Progressbar.setValue(0);
		Progressbar.setStringPainted(true);
		getContentPane().add(Progressbar);
		setSize(474, 369);
		getContentPane().setLayout(null);

		JLabel Version = new JLabel("" + common.version_A());
		Version.setForeground(Color.WHITE);
		Version.setBackground(Color.WHITE);
		Version.setFont(new Font("Tahoma", Font.BOLD, 12));
		Version.setBounds(185, 296, 102, 31);
		getContentPane().add(Version);

		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(150, 280, 160, 17);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/Image/Splash.jpg")));
		lblNewLabel_1.setBounds(0, 0, 458, 330);
		getContentPane().add(lblNewLabel_1);

	}

	private String getString(String dD) {
		return null;
	}

	public void iterate() throws ParseException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		FileInputStream file = new FileInputStream(path + "/Index_No.txt");

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(file))) {
			String Indexnumber = reader.readLine();
			DecIndex = AESCipher.aesDecryptString(Indexnumber, Key);
		}
		Login_Model model=new Login_Model();
		model.Index_No=DecIndex;
		
		Gson gson = new Gson();
		String json = gson.toJson(model);
		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json")
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 4)) + "getservertime"))
				.build();

		while (i <= 500) {
			Progressbar.setValue(i);
			i = i + 10;
			
			/*
			 * String month = "3"; String year = "2024";
			 */
			

			try {
				HttpResponse<String> respons = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
				Response_Model userObject = gson.fromJson(respons.body(), Response_Model.class);
				
				lblNewLabel_2.setText(userObject.Responce.DD + "/" + userObject.Responce.MM + "/"
						+ userObject.Responce.YYYY + " " + userObject.Responce.HR + ":" + userObject.Responce.MIN + ":"
						+ userObject.Responce.SEC + "" + " " + userObject.Responce.AMPM);
				Thread.sleep(5);
				String exam_date=(userObject.Responce.DD+userObject.Responce.MM+userObject.Responce.YYYY);
				
				if (i == 500) {
					
					if (userObject.Result.equals("Success")) {
							int Day = 0;
						
							if (!userObject.Responce.DD.equals(Common.Dry_Run_Day())
									&& !userObject.Responce.DD .equals( Common.Exam_Day1())
									&& !userObject.Responce.DD .equals( Common.Exam_Day2())
									&& !userObject.Responce.DD .equals( Common.Exam_Day3())
									&& !userObject.Responce.DD .equals( Common.Exam_Day4())) 
							{

								common.ShowMessage(main, "This is not the Correct date to start Exam.");
								System.exit(0);
							}

							if (userObject.Responce.DD.equals(Common.Exam_Day1())) {
								Day = 1;
							}
							if (userObject.Responce.DD .equals(Common.Exam_Day2())) {
								Day = 2;
							}
							if (userObject.Responce.DD .equals( Common.Exam_Day3())) {
								Day = 3;
							}
							if (userObject.Responce.DD .equals( Common.Exam_Day4())) {
								Day = 4;
							}
							if (Day == 1 || Day == 2 || Day == 3 || Day == 4) {
								common.ShowMessage(main, "Exam Day " + Day);
								Check_Login_Time(userObject.Responce, common.Get_Index_No());
							}
							if (userObject.Responce.DD.equals(Common.Dry_Run_Day())) {
								common.ShowMessage(main, "Dry Run");
								Check_Login_Time(userObject.Responce, common.Get_Index_No());
							}

						} else {

							common.ShowMessage(main, "This is not the Correct date to start Exam.");
							System.exit(0);
						}
					}

				}

			

			catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	public void Check_Login_Time(DateTime_Model datetime_model, String Index_No) {
		int HOUR = 0, MINUTE = 0, SECONDS = 0;

		String sysUIFormat = datetime_model.AMPM;
		MINUTE = Integer.parseInt(datetime_model.MIN);
		HOUR = Integer.parseInt(datetime_model.HR);
		if (sysUIFormat.equals("PM")) {
			if (HOUR >= 12) {

			} else {
				HOUR = HOUR + 12;
			}
		}
		LocalDateTime machine_Time_l = LocalDateTime.now();
		LocalDateTime Server_Time_l = LocalDateTime.of(Integer.parseInt(datetime_model.YYYY),
				Integer.parseInt(datetime_model.MM), Integer.parseInt(datetime_model.DD),
				Integer.parseInt(datetime_model.HR), Integer.parseInt(datetime_model.MIN),
				Integer.parseInt(datetime_model.SEC));

		long machine_Time = machine_Time_l.atZone(ZoneOffset.UTC).toInstant().toEpochMilli();
		;
		long Server_Time = Server_Time_l.atZone(ZoneOffset.UTC).toInstant().toEpochMilli();
		;
		long Differece = Server_Time - machine_Time;
		// 5 Min
		if (common.Testing_Status()) {
			if (-300000 > Differece || Differece > 300000) {
				common.ShowMessage(main, "Please Set Date Time and Relogin System");
				System.exit(0);
			}

			else {

			}
		}

		if (HOUR >= Common.Morning_Batch_Start_Hour() && HOUR <= Common.Morning_Batch_End_Hour()) // Morning Batch
		{
			if (HOUR == Common.Morning_Batch_Start_Hour()) {
				if (MINUTE >= Common.Morning_Batch_Start_From_Minute()
						&& MINUTE <= Common.Morning_Batch_Start_To_Minute()) {
					// LOGIN
					Call_LoginPage(datetime_model);
				} else {
					common.ShowMessage(main, "This Is Not The Right Time");
					System.exit(0);
				}
			} else if (HOUR == Common.Morning_Batch_End_Hour()) {
				if (MINUTE >= Common.Morning_Batch_End_From_Minute()
						&& MINUTE <= Common.Morning_Batch_End_To_Minute()) {
					// LOGIN
					Call_LoginPage(datetime_model);
				} else {
					common.ShowMessage(main, "Time Over For Login");
					System.exit(0);
				}

			} else {
				// LOGIN
				Call_LoginPage(datetime_model);
			}

		} else if (HOUR >= Common.Afternoon_Batch_Start_Hour() && HOUR <= Common.Afternoon_Batch_End_Hour()) // Afternoon
																												// Batch
		{
			if (HOUR == Common.Afternoon_Batch_Start_Hour()) {

				if (MINUTE >= Common.Afternoon_Batch_Start_From_Minute()
						&& MINUTE <= Common.Afternoon_Batch_Start_To_Minute()) {
					Call_LoginPage(datetime_model);
				} else {
					common.ShowMessage(main, "This Is Not The Right Time");
					System.exit(0);
				}
			} else if (HOUR == Common.Afternoon_Batch_End_Hour()) {
				if (MINUTE >= Common.Afternoon_Batch_End_From_Minute()
						&& MINUTE <= Common.Afternoon_Batch_End_To_Minute()) {
					// LOGIN
					Call_LoginPage(datetime_model);
				} else {
					common.ShowMessage(main, "Time Over For Login");
					System.exit(0);
				}

			} else {
				// LOGIN
				Call_LoginPage(datetime_model);
			}

		} else {
			common.ShowMessage(main, "This Is Not The Right Time");
			System.exit(0);

		}

	}

	public void Call_LoginPage(DateTime_Model model) {
		dispose();

		try {
			LoginPage LP = new LoginPage(model);
			LP.show();
			LP.setLocationRelativeTo(null);
			LP.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ALT) {

			ProgressBarExample main = null;
			try {
				main = new ProgressBarExample();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			common.ShowMessage(main, "ALT key detected!! System automatically Closed!!");
			System.exit(0);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * public static class Passing_Value implements Runnable {
	 * 
	 * private int num;
	 * 
	 * public Passing_Value(int i) {
	 * 
	 * this.num = i;
	 * 
	 * }
	 * 
	 * @Override public void run() {
	 * 
	 * }
	 * 
	 * }
	 */
}
