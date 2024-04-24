package Helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Common {

	public static final String version = "";
	public static String Key = "ONLINEEXAM_M2022";
	public static String FolderName = "March_2024";
	static Timer timer = new Timer();

	public void ShowMessage(JFrame f, String MSG) {

		JFrame f1 = new JFrame();
		JOptionPane.showMessageDialog(f, "" + MSG);
	}

	public String version_A() {
		String version = "VERSION 23.2";
		return version;
	}

	public static String Exam_Day1() {
		return "26";
	}

	public static String Exam_Day2() {
		return "21";
	}

	public static String Exam_Day3() {
		return "22";
	}

	public static String Exam_Day4() {
		return "23";
	}

	public static String Exam_Day5() {
		return "00";
	}

	public static String Dry_Run_Day() {
		return "18";
	}

	public static int Morning_Batch_Start_Hour() {
		return 10;
	}

	public static int Morning_Batch_End_Hour() {
		return 13;
	}

	// ---------------------------------------------------------------
	public static int Morning_Batch_Start_From_Minute() {
		return 30;// 30
	}

	public static int Morning_Batch_Start_To_Minute() {
		return 59;// 59
	}

	// ---------------------------------------------------------------
	public static int Morning_Batch_End_From_Minute() {
		return 0;// 0
	}

	public static int Morning_Batch_End_To_Minute() {
		return 30;// 30
	}

	// ------Instruction Page
	public static int Morning_Batch_Start_Button_From_Minute() {
		return 59;// 50 //59
	}

	public static int Morning_Batch_Start_Button_To_Minute() {
		return 59;// 59
	}

	// ----------Main Screen
	public static int Morning_Exam_Screen_Start_Hour() {
		return 10;
	}

	public static int Morning_Exam_Screen_End_Hour() {
		return 13;
	}

	// ---------------------------------------------------------------
	public static int Morning_Batch_Exam_Screen_Start_From_Minute() {
		return 30;
	}

	public static int Morning_Batch_Exam_Screen_Start_To_Minute() {
		return 59;
	}

	public static int Morning_Batch_Exam_Screen_End_From_Minute() {
		return 0;
	}

	public static int Morning_Batch_Exam_Screen_End_To_Minute() {
		return 30;
	}

	public static int Afternoon_Batch_Start_Hour() {
		return 14;
	}

	public static int Afternoon_Batch_End_Hour() {
		return 17;// 17
	}

	// ---------------------------------------------------------------
	public static int Afternoon_Batch_Start_From_Minute() {
		return 30;// 30
	}

	public static int Afternoon_Batch_Start_To_Minute() {
		return 59;// 59
	}

	// ---------------------------------------------------------------
	public static int Afternoon_Batch_End_From_Minute() {
		return 00;// 0
	}

	public static int Afternoon_Batch_End_To_Minute() {
		return 30;// 30
	}

	// ------Instruction Page
	public static int Afternoon_Batch_Start_Button_From_Minute() {
		return 30;// 50
	}

	public static int Afternoon_Batch_Start_Button_To_Minute() {
		return 59;// 59
	}

	// ----------Main Screen
	public static int Afternoon_Exam_Screen_Start_Hour() {
		return 14;
	}

	public static int Afternoon_Exam_Screen_End_Hour() {
		return 17;// 17
	}

	// ---------------------------------------------------------------
	public static int Afternoon_Batch_Exam_Screen_Start_From_Minute() {
		return 50;// 50
	}

	public static int Afternoon_Batch_Exam_Screen_Start_To_Minute() {
		return 59;// 59
	}

	// ---------------------------------------------------------------
	public static int Afternoon_Batch_Exam_Screen_End_From_Minute() {
		return 50;// 50
	}

	public static int Afternoon_Batch_Exam_Screen_End_To_Minute() {
		return 59;// 59
	}

	public static String GetServer_URL_By_Cindex(String DID, String TID) {
		String URL = "";
		return URL = "http://it.mh-hsc.ac.in/Exam/"; /* "http://115.124.105.27/Exam/";*/

		/*if (DID == "16") {
			return URL = "http://115.124.96.33/Exam/";
		} else if (DID == "31" || DID == "32") {
			return URL = "http://115.124.96.33/Exam/";
		} else if (DID == "18" || DID == "33") {
			return URL = "http://115.124.96.33/Exam/";
		} else if (DID == "12" || DID == "24") {
			return URL = "http://115.124.96.33/Exam/";
		} else if (DID == "11") {
			if (TID == "16") {
				return URL = "http://115.124.96.33/Exam/";
			}
			return URL = "http://115.124.96.33/Exam/";
		} else if (DID == "17" || DID == "25" || DID == "26") {
			return URL = "http://115.124.96.33/Exam/";
		} else if (DID == "21" || DID == "22" || DID == "23" || DID == "13" || DID == "14" || DID == "15"
				|| DID == "19") {
			return URL = "http://115.124.96.33/Exam/";
		} else if (DID == "58" || DID == "59" || DID == "62" || DID == "03" || DID == "05" || DID == "06" || DID == "07"
				|| DID == "09" || DID == "29" || DID == "01" || DID == "02" || DID == "04" || DID == "08" || DID == "10"
				|| DID == "56" || DID == "57" || DID == "60" || DID == "61" || DID == "66") {
			return URL = "http://115.124.96.33/Exam/";
		} else {
			return URL = "http://115.124.96.33/Exam/";
		}*/

	}

	public static String AnsFileSize(String SeatNo) {

		String path = System.getProperty("user.home") + File.separator + FolderName + "/" + SeatNo + ".ans";
		File f = new File(path);
		long length = f.length();
		return Long.toString(length);
	}

	public static String GetAnsFilePath(String SeatNo) {
		return System.getProperty("user.home") + File.separator + FolderName + "/" + SeatNo + ".ans";

	}

	public static String Get_IP() {
		return "";

	}

	public void WriteAnsFile(String SeatNo, String Contain) {
		String path = GetAnsFilePath(SeatNo);
		try {

			File file = new File(path);

			FileWriter fw = new FileWriter(file, Charset.forName("UTF8"), true);
			fw.write(encryption(Contain));
			fw.write(System.lineSeparator());
			fw.close();
		} catch (Exception ex) {
			System.out.print(ex.toString());
		}
	}

	public String encryption(String s) {
		String ss = "";
		ss = s.toUpperCase();
		String s1 = "", s2 = "", s3;
		int l, a;
		char[] thech = ss.toCharArray();
		for (char ch : thech) {
			l = (int) ((char) ch);
			a = l ^ 255;
			char b = (char) a;
			ss = String.valueOf(b);
			s1 = s1 + ss;
		}
		return s1;
	}

	public static String Get_Index_No() {
		try {
			String path = System.getProperty("user.home") + File.separator + FolderName;
			FileInputStream file = new FileInputStream(path + "/Index_No.txt");
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(file))) {

				String Indexnumber = reader.readLine();
				return AESCipher.aesDecryptString(Indexnumber, Key);
			} catch (Exception ex) {
				return "";
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Inspection Not DOne!!");
		}

		return "1111222";
		/*
		 * try { String path = System.getProperty("user.home")+File.separator +
		 * FolderName; FileInputStream file = new FileInputStream(path+
		 * "/Index_No.txt"); try (BufferedReader reader = new BufferedReader(new
		 * InputStreamReader(file))) {
		 * 
		 * String Indexnumber = reader.readLine(); return
		 * AESCipher.aesDecryptString(Indexnumber, Key); } catch(Exception ex) {
		 * return""; }
		 * 
		 * } catch(Exception ex) { return""; }
		 */

	}

	public boolean Testing_Status() {
		return false;
	}
}
