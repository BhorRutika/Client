
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.*;
import java.text.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Cursor;
import java.awt.Dialog;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimerTask;
import java.util.Calendar;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import javax.swing.event.ChangeListener;

import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import Model.*;
import Helper.*;

public class Mainframe extends JFrame implements ActionListener, ChangeListener, KeyListener {
	private static final String counter = null;

	public static Mainframe frame;
	public static Timer t1;
	public static String seatnoo;
	public JScrollPane Q2scroll;

	JLabel lblNewLabel_3 = new JLabel("New label");

	Answer_Submit AS = new Answer_Submit();
	Common common = new Common();
	LocalDateTime myDateObj = LocalDateTime.now();
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	Question_Ans_Model model_1 = new Question_Ans_Model();
	Question_Ans_Model_2 model_2 = new Question_Ans_Model_2();
	Answer_Model Answer_Model = new Answer_Model();
	FileUpload_Model fu = new FileUpload_Model();
	String SeatNumber;

	Gson gson = new Gson();
	HttpClient httpClient = HttpClient.newBuilder().build();

	public static JLabel lblNewLabel_14 = new JLabel();
	public static String Time;
	Color Colour_Green = new Color(0, 204, 0);

	ButtonGroup bg, bg1, bg2, bg3, bg4, bg5, bg6, bg7, bg8, bg9, bg10;
	JTextArea ans_Q7Question1, ans_Q7Question2, ans_Q7Question3, ans_Q7Question4, ans_Q7Question5, ans_Q7Question6,
			ans_Q7Question7, ans_Q7Question8, ans_Q8Question1, ans_Q8Question2, ans_Q8Question3, ans_Q8Question4;
	JLabel lbl_Question_Name;
	JTabbedPane QuetabbedPane;

	JPanel panelA4_1, panelA4_2, panelA4_3, panelA4_4, panelA4_5, panelA4_6, panelA4_7, panelA4_8, panelA4_9,
			panelA4_10, panelA5_1, panelA5_2;

	JButton FinshexamButton, btn_Q1_submit, btn_Q2_submit, btn_Q3_submit, btn_Q4_submit, btn_Q5_submit, btn_Q6_submit,
			btn_Q7_submit, btn_Q8_submit, btn_Question1, btn_Question2, btn_Question3, btn_Question4, btn_Question5,
			btn_Question6, btn_Question7, btn_Question8,

			btn_Q1Question1, btn_Q1Question2, btn_Q1Question3, btn_Q1Question4, btn_Q1Question5, btn_Q1Question6,
			btn_Q1Question7, btn_Q1Question8, btn_Q1Question9, btn_Q1Question10,

			btn_Q2Question1, btn_Q2Question2, btn_Q2Question3, btn_Q2Question4, btn_Q2Question5, btn_Q2Question6,
			btn_Q2Question7, btn_Q2Question8, btn_Q2Question9, btn_Q2Question10,

			btn_Q3Question1, btn_Q3Question2, btn_Q3Question3, btn_Q3Question4, btn_Q3Question5, btn_Q3Question6,
			btn_Q3Question7, btn_Q3Question8, btn_Q3Question9, btn_Q3Question10,

			btn_Q4Question1, btn_Q4Question2, btn_Q4Question3, btn_Q4Question4, btn_Q4Question5, btn_Q4Question6,
			btn_Q4Question7, btn_Q4Question8, btn_Q4Question9, btn_Q4Question10,

			btn_Q5Question1, btn_Q5Question2,

			btn_Q6Question1,

			btn_Q7Question1, btn_Q7Question2, btn_Q7Question3, btn_Q7Question4, btn_Q7Question5, btn_Q7Question6,
			btn_Q7Question7, btn_Q7Question8,

			btn_Q8Question1, btn_Q8Question2, btn_Q8Question3, btn_Q8Question4;

	JPanel Q1statuspanel_1, Q1statuspanel, Q1statuspanel_3, panel_11;
	JScrollPane Q1scroll;
	JTextField txt_Q6Option2, txt_Q6Option3, txt_Q6Option4, ans_Q1Question1, ans_Q1Question2, ans_Q1Question3,
			ans_Q1Question4, ans_Q1Question5, ans_Q1Question6, ans_Q1Question7, ans_Q1Question8, ans_Q1Question9,
			ans_Q1Question10, txt_Q6Option1;
	JCheckBox Q4Question1_Option1, Q4Question1_Option2, Q4Question1_Option3, Q4Question1_Option4, Q4Question1_Option5,
			Q4Question2_Option1, Q4Question2_Option2, Q4Question2_Option3, Q4Question2_Option4, Q4Question2_Option5,
			Q4Question3_Option1, Q4Question3_Option2, Q4Question3_Option3, Q4Question3_Option4, Q4Question3_Option5,
			Q4Question4_Option1, Q4Question4_Option2, Q4Question4_Option3, Q4Question4_Option4, Q4Question4_Option5,
			Q4Question5_Option1, Q4Question5_Option2, Q4Question5_Option3, Q4Question5_Option4, Q4Question5_Option5,
			Q4Question6_Option1, Q4Question6_Option2, Q4Question6_Option3, Q4Question6_Option4, Q4Question6_Option5,
			Q4Question7_Option1, Q4Question7_Option2, Q4Question7_Option3, Q4Question7_Option4, Q4Question7_Option5,
			Q4Question8_Option1, Q4Question8_Option2, Q4Question8_Option3, Q4Question8_Option4, Q4Question8_Option5,
			Q4Question9_Option1, Q4Question9_Option2, Q4Question9_Option3, Q4Question9_Option4, Q4Question9_Option5,
			Q4Question10_Option1, Q4Question10_Option2, Q4Question10_Option3, Q4Question10_Option4,
			Q4Question10_Option5, Q5Question1_Option1, Q5Question1_Option2, Q5Question1_Option3, Q5Question1_Option4,
			Q5Question1_Option5, Q5Question1_Option6, Q5Question2_Option1, Q5Question2_Option2, Q5Question2_Option3,
			Q5Question2_Option4, Q5Question2_Option5, Q5Question2_Option6;
	JRadioButton Q3Question1_Option2, Q3Question1_Option3, Q3Question1_Option4, Q3Question1_Option1,
			Q3Question2_Option1, Q3Question2_Option2, Q3Question2_Option3, Q3Question2_Option4, Q3Question3_Option1,
			Q3Question3_Option2, Q3Question3_Option3, Q3Question3_Option4, Q3Question4_Option1, Q3Question4_Option2,
			Q3Question4_Option3, Q3Question4_Option4, Q3Question5_Option1, Q3Question5_Option2, Q3Question5_Option3,
			Q3Question5_Option4, Q3Question6_Option1, Q3Question6_Option2, Q3Question6_Option3, Q3Question6_Option4,
			Q3Question7_Option1, Q3Question7_Option2, Q3Question7_Option3, Q3Question7_Option4, Q3Question8_Option1,
			Q3Question8_Option2, Q3Question8_Option3, Q3Question8_Option4, Q3Question9_Option1, Q3Question9_Option2,
			Q3Question9_Option3, Q3Question9_Option4, Q3Question10_Option1, Q3Question10_Option2, Q3Question10_Option3,
			Q3Question10_Option4, ans_Q2Question1_radio1, ans_Q2Question7_radio1, ans_Q2Question7_radio2,
			ans_Q2Question8_radio1, ans_Q2Question8_radio2, ans_Q2Question9_radio1, ans_Q2Question9_radio2,
			ans_Q2Question10_radio1, ans_Q2Question10_radio2, ans_Q2Question1_radio2, ans_Q2Question2_radio1,
			ans_Q2Question2_radio2, ans_Q2Question3_radio1, ans_Q2Question3_radio2, ans_Q2Question4_radio1,
			ans_Q2Question4_radio2, ans_Q2Question5_radio1, ans_Q2Question5_radio2, ans_Q2Question6_radio1,
			ans_Q2Question6_radio2;

	JLabel txt_Q1Question1, txt_Q1Question2, txt_Q1Question3, txt_Q1Question4, txt_Q1Question5, txt_Q1Question6,
			txt_Q1Question7, txt_Q1Question8, txt_Q1Question9, txt_Q1Question10, txt_Q2Question1, txt_Q2Question2,
			txt_Q2Question3, txt_Q2Question4, txt_Q2Question5, txt_Q2Question6, txt_Q2Question7, txt_Q2Question8,
			txt_Q2Question9, txt_Q2Question10, txt_Q3Question1, txt_Q3Question2, txt_Q3Question3, txt_Q3Question4,
			txt_Q3Question5, txt_Q3Question6, txt_Q3Question7, txt_Q3Question8, txt_Q3Question9, txt_Q3Question10,
			Q4Question1, Q4Question2, Q4Question3, Q4Question4, Q4Question5, Q4Question6, Q4Question7, Q4Question8,
			Q4Question9, Q4Question10, Q5Question1, Q5Question2, Q6Question1, Q6Question1_OptionA, Q6Question1_OptionB,
			Q6Question1_OptionC, Q6Question1_OptionD, Q6Question1_Option1, Q6Question1_Option2, Q6Question1_Option3,
			Q6Question1_Option4, txt_Q7Question1, txt_Q7Question2, txt_Q7Question3, txt_Q7Question4, txt_Q7Question5,
			txt_Q7Question6, txt_Q7Question7, txt_Q7Question8, txt_Q8Question1, txt_Q8Question2, txt_Q8Question3,
			txt_Q8Question4, lbl_filesize;

	static Login_Model login_details;

	Thread t = new Thread();
	/**
	 * @wbp.nonvisual location=321,-31
	 */
	private final JLabel label = new JLabel("New label");
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel txt_Q1Question2_1;
	// private JPanel contentPane;

	// mainframe
	public Mainframe(Login_Model model) {

		// Set the size of the frame to the size of the screen
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		login_details = model;
		Get_Server_Time(model);
		// Shut down when alt key pressed
		addKeyListener(this);
		setFocusable(true);

		System_Time System = new System_Time();
		new Thread(System).start();

		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Image/ssc-pune-logo.png"));
		setIconImage(icon.getImage());
		setAutoRequestFocus(true);
		setUndecorated(true);
		setSize(1024, 768);
		setResizable(false);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

		addWindowListener(getWindowAdapter());
		JPanel Headerpanel = new JPanel();
		Headerpanel.setBounds(0, 0, 1024, 90);
		Headerpanel.setBackground(new Color(0, 51, 102));
		Headerpanel.setLayout(null);

		JPanel timepanel = new JPanel();
		timepanel.setBorder(null);
		timepanel.setBackground(new Color(0, 51, 102));
		timepanel.setBounds(682, 0, 353, 90);
		Headerpanel.add(timepanel);
		timepanel.setLayout(null);

		JLabel currenttimeLabel = new JLabel("Current Time:");
		currenttimeLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		currenttimeLabel.setForeground(Color.ORANGE);
		currenttimeLabel.setBackground(new Color(255, 255, 255));
		currenttimeLabel.setBounds(10, 11, 89, 20);
		timepanel.add(currenttimeLabel);

		JLabel timeleftLabel = new JLabel("Time Left:");
		timeleftLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		timeleftLabel.setForeground(Color.ORANGE);
		timeleftLabel.setBackground(Color.ORANGE);
		timeleftLabel.setBounds(10, 42, 69, 20);
		timepanel.add(timeleftLabel);

		JLabel hcLabel = new JLabel("HC:");
		hcLabel.setFont(new Font("Tahoma", Font.ITALIC, 12));
		hcLabel.setForeground(Color.ORANGE);
		hcLabel.setBackground(Color.ORANGE);
		hcLabel.setBounds(210, 42, 26, 20);
		timepanel.add(hcLabel);
		lblNewLabel_14.setBackground(new Color(255, 255, 255));

		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setForeground(Color.WHITE);
		lblNewLabel_14.setBounds(70, 45, 138, 17);
		timepanel.add(lblNewLabel_14);

		JLabel lbl_hc_code = new JLabel("hclabel");
		lbl_hc_code.setForeground(Color.WHITE);
		lbl_hc_code.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_hc_code.setBounds(245, 45, 69, 14);
		lbl_hc_code.setText(login_details.Hand);
		timepanel.add(lbl_hc_code);

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(81, 45, 119, 17);
		timepanel.add(lblNewLabel_1);

		lblNewLabel_3.setBounds(109, 14, 99, 17);
		timepanel.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_3.setFont(UIManager.getFont("Label.font").deriveFont(Font.BOLD, 12f));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));

		// add(lblNewLabel_3);
		timepanel.add(lblNewLabel_3, BorderLayout.CENTER);

		JLabel titleimgLabel = new JLabel("");
		titleimgLabel.setIcon(new ImageIcon(getClass().getResource("/Image/Header.jpg")));
		titleimgLabel.setBounds(0, 0, 684, 90);
		Headerpanel.add(titleimgLabel);

		JPanel infopanel = new JPanel();
		infopanel.setBounds(0, 89, 1035, 100);
		infopanel.setBackground(new Color(255, 255, 255));
		infopanel.setLayout(null);

		JLabel seatnoLabel = new JLabel("Seat No:");
		seatnoLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		seatnoLabel.setSize(new Dimension(12, 11));
		seatnoLabel.setBounds(10, 11, 76, 14);
		infopanel.add(seatnoLabel);

		JLabel indexnoLabel = new JLabel("Index No:");
		indexnoLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		indexnoLabel.setBounds(431, 11, 85, 14);
		infopanel.add(indexnoLabel);

		JLabel papernoLabel = new JLabel("Paper No:");
		papernoLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		papernoLabel.setBounds(765, 11, 80, 14);
		infopanel.add(papernoLabel);

		JLabel subcodeLabel = new JLabel("Subject Code:");
		subcodeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		subcodeLabel.setSize(new Dimension(12, 11));
		subcodeLabel.setBounds(10, 48, 98, 14);
		infopanel.add(subcodeLabel);

		JLabel batchLabel = new JLabel("Batch:");
		batchLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		batchLabel.setSize(new Dimension(12, 11));
		batchLabel.setBounds(431, 48, 51, 14);
		infopanel.add(batchLabel);

		lbl_Question_Name = new JLabel("Question name................................");
		lbl_Question_Name.setBounds(336, 75, 390, 14);
		infopanel.add(lbl_Question_Name);

		JPanel Statuspanel = new JPanel();
		Statuspanel.setBounds(0, 188, 197, 580);
		Statuspanel.setToolTipText("");
		Statuspanel.setLayout(null);

		JLabel statusLabel = new JLabel("Status");
		statusLabel.setBounds(10, 11, 51, 24);
		Statuspanel.add(statusLabel);

		Q1statuspanel = new JPanel();
		Q1statuspanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		Q1statuspanel.setBounds(10, 36, 178, 46);
		Statuspanel.add(Q1statuspanel);
		Q1statuspanel.setLayout(null);

		btn_Q1Question1 = new JButton("");
		btn_Q1Question1.setForeground(Color.BLACK);
		btn_Q1Question1.setBounds(50, 5, 21, 15);
		btn_Q1Question1.setBackground(new Color(255, 0, 0));
		Q1statuspanel.add(btn_Q1Question1);

		btn_Q1Question2 = new JButton("");
		btn_Q1Question2.setBackground(Color.RED);
		btn_Q1Question2.setBounds(75, 5, 21, 15);
		Q1statuspanel.add(btn_Q1Question2);

		btn_Q1Question3 = new JButton("");
		btn_Q1Question3.setBackground(Color.RED);
		btn_Q1Question3.setBounds(100, 5, 21, 15);
		Q1statuspanel.add(btn_Q1Question3);

		btn_Q1Question4 = new JButton("");
		btn_Q1Question4.setBackground(Color.RED);
		btn_Q1Question4.setBounds(125, 5, 21, 15);
		Q1statuspanel.add(btn_Q1Question4);

		btn_Q1Question5 = new JButton("");
		btn_Q1Question5.setBackground(Color.RED);
		btn_Q1Question5.setBounds(150, 5, 21, 15);
		Q1statuspanel.add(btn_Q1Question5);

		btn_Q1Question6 = new JButton("");
		btn_Q1Question6.setBackground(Color.RED);
		btn_Q1Question6.setBounds(50, 25, 21, 15);
		Q1statuspanel.add(btn_Q1Question6);

		btn_Q1Question7 = new JButton("");
		btn_Q1Question7.setBackground(Color.RED);
		btn_Q1Question7.setBounds(75, 25, 21, 15);
		Q1statuspanel.add(btn_Q1Question7);

		btn_Q1Question8 = new JButton("");
		btn_Q1Question8.setBackground(Color.RED);
		btn_Q1Question8.setBounds(100, 25, 21, 15);
		Q1statuspanel.add(btn_Q1Question8);

		btn_Q1Question9 = new JButton("");
		btn_Q1Question9.setBackground(Color.RED);
		btn_Q1Question9.setBounds(125, 25, 21, 15);
		Q1statuspanel.add(btn_Q1Question9);

		btn_Q1Question10 = new JButton("");
		btn_Q1Question10.setBackground(Color.RED);
		btn_Q1Question10.setBounds(150, 25, 21, 15);
		Q1statuspanel.add(btn_Q1Question10);

		btn_Question1 = new JButton("Q1");
		btn_Question1.addActionListener(this);
		btn_Question1.setVerticalTextPosition(SwingConstants.CENTER);
		btn_Question1.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Question1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn_Question1.setBounds(5, 5, 40, 35);
		Q1statuspanel.add(btn_Question1);

		FinshexamButton = new JButton("Finish Exam");
		FinshexamButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		FinshexamButton.setForeground(new Color(0, 0, 0));
		FinshexamButton.setBackground(new Color(0, 128, 255));
		FinshexamButton.addActionListener(this);
		FinshexamButton.setBounds(65, 455, 122, 37);
		Statuspanel.add(FinshexamButton);

		QuetabbedPane = new JTabbedPane(JTabbedPane.TOP);
		QuetabbedPane.addChangeListener(this);
		QuetabbedPane.setBounds(195, 190, 829, 578);
		//// Q1 panel start
		JPanel Q1panel = new JPanel();
		Q1panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		Q1scroll = new JScrollPane(Q1panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		///
		JPanel panelQ01 = new JPanel();
		panelQ01.setLayout(null);
		panelQ01.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5 = new JLabel("Q 1");
		LabelQ1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5.setBounds(10, 11, 35, 62);
		panelQ01.add(LabelQ1_1_5);

		txt_Q1Question1 = new JLabel();
		txt_Q1Question1.setBounds(41, -1, 516, 86);
		panelQ01.add(txt_Q1Question1);

		ans_Q1Question1 = new JTextField();
		ans_Q1Question1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ans_Q1Question1.setBounds(577, 24, 194, 37);
		panelQ01.add(ans_Q1Question1);
		ans_Q1Question1.setColumns(10);
		////
		JPanel panelQ02 = new JPanel();
		panelQ02.setLayout(null);
		panelQ02.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_1 = new JLabel("Q 2");
		LabelQ1_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_1.setBounds(10, 11, 35, 62);
		panelQ02.add(LabelQ1_1_5_1);

		txt_Q1Question2 = new JLabel("New label");
		txt_Q1Question2.setBounds(50, 0, 518, 86);
		panelQ02.add(txt_Q1Question2);

		ans_Q1Question2 = new JTextField();
		ans_Q1Question2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ans_Q1Question2.setColumns(10);
		ans_Q1Question2.setBounds(578, 24, 193, 36);
		panelQ02.add(ans_Q1Question2);
		////
		JPanel panelQ03 = new JPanel();
		panelQ03.setLayout(null);
		panelQ03.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_2 = new JLabel("Q 3");
		LabelQ1_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_2.setBounds(10, 11, 33, 62);
		panelQ03.add(LabelQ1_1_5_2);

		txt_Q1Question3 = new JLabel("New label");
		txt_Q1Question3.setBounds(50, 0, 518, 86);
		panelQ03.add(txt_Q1Question3);

		ans_Q1Question3 = new JTextField();
		ans_Q1Question3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ans_Q1Question3.setColumns(10);
		ans_Q1Question3.setBounds(581, 24, 190, 36);
		panelQ03.add(ans_Q1Question3);
		////
		JPanel panelQ04 = new JPanel();
		panelQ04.setLayout(null);
		panelQ04.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_3 = new JLabel("Q 4");
		LabelQ1_1_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_3.setBounds(10, 11, 34, 62);
		panelQ04.add(LabelQ1_1_5_3);

		txt_Q1Question4 = new JLabel("New label");
		txt_Q1Question4.setBounds(46, 0, 531, 86);
		panelQ04.add(txt_Q1Question4);

		ans_Q1Question4 = new JTextField();
		ans_Q1Question4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ans_Q1Question4.setColumns(10);
		ans_Q1Question4.setBounds(583, 24, 188, 36);
		panelQ04.add(ans_Q1Question4);
		/////
		JPanel panelQ05 = new JPanel();
		panelQ05.setLayout(null);
		panelQ05.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_4 = new JLabel("Q 5");
		LabelQ1_1_5_4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_4.setBounds(10, 11, 31, 62);
		panelQ05.add(LabelQ1_1_5_4);

		txt_Q1Question5 = new JLabel("New label");
		txt_Q1Question5.setBounds(44, 0, 527, 86);
		panelQ05.add(txt_Q1Question5);

		ans_Q1Question5 = new JTextField();
		ans_Q1Question5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ans_Q1Question5.setColumns(10);
		ans_Q1Question5.setBounds(582, 24, 189, 36);
		panelQ05.add(ans_Q1Question5);
		///
		JPanel panelQ06 = new JPanel();
		panelQ06.setLayout(null);
		panelQ06.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_5 = new JLabel("Q 6");
		LabelQ1_1_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_5.setBounds(10, 11, 32, 62);
		panelQ06.add(LabelQ1_1_5_5);

		txt_Q1Question6 = new JLabel("New label");
		txt_Q1Question6.setBounds(45, 0, 524, 73);
		panelQ06.add(txt_Q1Question6);

		ans_Q1Question6 = new JTextField();
		ans_Q1Question6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ans_Q1Question6.setColumns(10);
		ans_Q1Question6.setBounds(581, 24, 190, 36);
		panelQ06.add(ans_Q1Question6);
		///

		JPanel panelQ07 = new JPanel();
		panelQ07.setLayout(null);
		panelQ07.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_71 = new JLabel("Q 7");
		LabelQ1_1_5_71.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_71.setBounds(10, 11, 29, 62);
		panelQ07.add(LabelQ1_1_5_71);

		txt_Q1Question7 = new JLabel("New label");
		txt_Q1Question7.setBounds(49, 11, 537, 62);
		panelQ07.add(txt_Q1Question7);

		ans_Q1Question7 = new JTextField();
		ans_Q1Question7.setColumns(10);
		ans_Q1Question7.setBounds(582, 24, 189, 36);
		panelQ07.add(ans_Q1Question7);
		////
		JPanel panelQ08 = new JPanel();
		panelQ08.setLayout(null);
		panelQ08.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_81 = new JLabel("Q 8");
		LabelQ1_1_5_81.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_81.setBounds(10, 11, 34, 62);
		panelQ08.add(LabelQ1_1_5_81);

		txt_Q1Question8 = new JLabel("New label");
		txt_Q1Question8.setBounds(56, 11, 521, 75);
		panelQ08.add(txt_Q1Question8);

		ans_Q1Question8 = new JTextField();
		ans_Q1Question8.setColumns(10);
		ans_Q1Question8.setBounds(582, 24, 189, 36);
		panelQ08.add(ans_Q1Question8);
		/////
		JPanel panelQ09 = new JPanel();
		panelQ09.setLayout(null);
		panelQ09.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_91 = new JLabel("Q 9");
		LabelQ1_1_5_91.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_91.setBounds(10, 11, 37, 62);
		panelQ09.add(LabelQ1_1_5_91);

		txt_Q1Question9 = new JLabel("New label");
		txt_Q1Question9.setBounds(50, 0, 532, 73);
		panelQ09.add(txt_Q1Question9);

		ans_Q1Question9 = new JTextField();
		ans_Q1Question9.setColumns(10);
		ans_Q1Question9.setBounds(592, 24, 179, 36);
		panelQ09.add(ans_Q1Question9);
		///
		JPanel panelQ010 = new JPanel();
		panelQ010.setLayout(null);
		panelQ010.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_5_10 = new JLabel("Q 10");
		LabelQ1_1_5_10.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_5_10.setBounds(10, 11, 36, 62);
		panelQ010.add(LabelQ1_1_5_10);

		txt_Q1Question10 = new JLabel("New label");
		txt_Q1Question10.setBounds(56, 11, 532, 62);
		panelQ010.add(txt_Q1Question10);

		ans_Q1Question10 = new JTextField();
		ans_Q1Question10.setColumns(10);
		ans_Q1Question10.setBounds(584, 24, 187, 36);
		panelQ010.add(ans_Q1Question10);
		////

		btn_Q1_submit = new JButton("Submit");
		btn_Q1_submit.addActionListener(this);
		btn_Q1_submit.setBounds(51, 455, 89, 23);

		GroupLayout gl_Q1panel = new GroupLayout(Q1panel);
		gl_Q1panel.setHorizontalGroup(gl_Q1panel.createParallelGroup(Alignment.LEADING).addGroup(gl_Q1panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_Q1panel.createParallelGroup(Alignment.LEADING, false)

						.addComponent(panelQ01, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
						.addComponent(panelQ02, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelQ03, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelQ04, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelQ05, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelQ06, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelQ07, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelQ08, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelQ09, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addComponent(panelQ010, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_Q1_submit, Alignment.CENTER))
				.addContainerGap(49, Short.MAX_VALUE)));
		gl_Q1panel.setVerticalGroup(gl_Q1panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q1panel.createSequentialGroup().addContainerGap()
						.addComponent(panelQ01, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ02, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ03, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ04, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ05, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ06, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ07, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ08, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ09, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ010, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_Q1_submit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, Short.MAX_VALUE)));

		Q1panel.setLayout(gl_Q1panel);
		Q1scroll.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		QuetabbedPane.add(Q1scroll, "Question 1");
		QuetabbedPane.setEnabledAt(0, true);
		///// Q2 Panel start
		JPanel Q2panel = new JPanel();
		Q2panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JScrollPane Q2scroll = new JScrollPane(Q2panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_1 = new JLabel("Q 2");
		LabelQ1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_1.setBounds(10, 11, 42, 62);
		panel_2.add(LabelQ1_1_1);

		txt_Q2Question2 = new JLabel("New label");
		txt_Q2Question2.setBounds(63, 11, 543, 62);
		panel_2.add(txt_Q2Question2);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(616, 11, 155, 62);
		panel_2.add(panel_1_1);

		ans_Q2Question2_radio1 = new JRadioButton("True");
		ans_Q2Question2_radio1.setBounds(20, 7, 109, 23);
		panel_1_1.add(ans_Q2Question2_radio1);

		ans_Q2Question2_radio2 = new JRadioButton("False");
		ans_Q2Question2_radio2.setBounds(20, 33, 109, 23);
		panel_1_1.add(ans_Q2Question2_radio2);

		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(ans_Q2Question2_radio1);
		bg1.add(ans_Q2Question2_radio2);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_2 = new JLabel("Q 3");
		LabelQ1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_2.setBounds(10, 11, 42, 62);
		panel_3.add(LabelQ1_1_2);

		txt_Q2Question3 = new JLabel("New label");
		txt_Q2Question3.setBounds(63, 11, 543, 62);
		panel_3.add(txt_Q2Question3);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_2.setBounds(616, 11, 155, 62);
		panel_3.add(panel_1_2);

		ans_Q2Question3_radio1 = new JRadioButton("True");
		ans_Q2Question3_radio1.setBounds(20, 7, 109, 23);
		panel_1_2.add(ans_Q2Question3_radio1);

		ans_Q2Question3_radio2 = new JRadioButton("False");
		ans_Q2Question3_radio2.setBounds(20, 33, 109, 23);
		panel_1_2.add(ans_Q2Question3_radio2);

		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(ans_Q2Question3_radio1);
		bg3.add(ans_Q2Question3_radio2);
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_3 = new JLabel("Q 4");
		LabelQ1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_3.setBounds(10, 11, 42, 62);
		panel_4.add(LabelQ1_1_3);

		txt_Q2Question4 = new JLabel("New label");
		txt_Q2Question4.setBounds(63, 11, 543, 62);
		panel_4.add(txt_Q2Question4);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_3.setBounds(616, 11, 155, 62);
		panel_4.add(panel_1_3);

		ans_Q2Question4_radio1 = new JRadioButton("True");
		ans_Q2Question4_radio1.setBounds(20, 7, 109, 23);
		panel_1_3.add(ans_Q2Question4_radio1);

		ans_Q2Question4_radio2 = new JRadioButton("False");
		ans_Q2Question4_radio2.setBounds(20, 33, 109, 23);
		panel_1_3.add(ans_Q2Question4_radio2);

		ButtonGroup bg4 = new ButtonGroup();
		bg4.add(ans_Q2Question4_radio1);
		bg4.add(ans_Q2Question4_radio2);
		//// panel 5 start q2
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_4 = new JLabel("Q 5");
		LabelQ1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_4.setBounds(10, 11, 42, 62);
		panel_5.add(LabelQ1_1_4);

		txt_Q2Question5 = new JLabel("New label");
		txt_Q2Question5.setBounds(63, 11, 543, 62);
		panel_5.add(txt_Q2Question5);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_4.setBounds(616, 11, 155, 62);
		panel_5.add(panel_1_4);

		ans_Q2Question5_radio1 = new JRadioButton("True");
		ans_Q2Question5_radio1.setBounds(20, 7, 109, 23);
		panel_1_4.add(ans_Q2Question5_radio1);

		ans_Q2Question5_radio2 = new JRadioButton("False");
		ans_Q2Question5_radio2.setBounds(20, 33, 109, 23);
		panel_1_4.add(ans_Q2Question5_radio2);
		ButtonGroup bg5 = new ButtonGroup();
		bg5.add(ans_Q2Question5_radio1);
		bg5.add(ans_Q2Question5_radio2);
		////
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_6 = new JLabel("Q 6");
		LabelQ1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_6.setBounds(10, 11, 42, 62);
		panel_6.add(LabelQ1_1_6);

		txt_Q2Question6 = new JLabel("New label");
		txt_Q2Question6.setBounds(63, 11, 543, 62);
		panel_6.add(txt_Q2Question6);

		JPanel panel_1_5 = new JPanel();
		panel_1_5.setLayout(null);
		panel_1_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_5.setBounds(616, 11, 155, 62);
		panel_6.add(panel_1_5);

		ans_Q2Question6_radio1 = new JRadioButton("True");
		ans_Q2Question6_radio1.setBounds(20, 7, 109, 23);
		panel_1_5.add(ans_Q2Question6_radio1);

		ans_Q2Question6_radio2 = new JRadioButton("False");
		ans_Q2Question6_radio2.setBounds(20, 33, 109, 23);
		panel_1_5.add(ans_Q2Question6_radio2);

		ButtonGroup bg6 = new ButtonGroup();
		bg6.add(ans_Q2Question6_radio1);
		bg6.add(ans_Q2Question6_radio2);
		/////
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_7 = new JLabel("Q 7");
		LabelQ1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_7.setBounds(10, 11, 42, 62);
		panel_7.add(LabelQ1_1_7);

		txt_Q2Question7 = new JLabel("New label");
		txt_Q2Question7.setBounds(63, 11, 522, 62);
		panel_7.add(txt_Q2Question7);

		JPanel panel_1_71 = new JPanel();
		panel_1_71.setLayout(null);
		panel_1_71.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_71.setBounds(616, 11, 155, 62);
		panel_7.add(panel_1_71);

		ans_Q2Question7_radio1 = new JRadioButton("True");
		ans_Q2Question7_radio1.setBounds(20, 7, 109, 23);
		panel_1_71.add(ans_Q2Question7_radio1);

		ans_Q2Question7_radio2 = new JRadioButton("False");
		ans_Q2Question7_radio2.setBounds(20, 33, 109, 23);
		panel_1_71.add(ans_Q2Question7_radio2);
		ButtonGroup bg7 = new ButtonGroup();
		bg7.add(ans_Q2Question7_radio1);
		bg7.add(ans_Q2Question7_radio2);
		////
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_81 = new JLabel("Q 8");
		LabelQ1_1_81.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_81.setBounds(10, 11, 42, 62);
		panel_8.add(LabelQ1_1_81);

		txt_Q2Question8 = new JLabel("New label");
		txt_Q2Question8.setBounds(63, 11, 522, 62);
		panel_8.add(txt_Q2Question8);

		JPanel panel_1_81 = new JPanel();
		panel_1_81.setLayout(null);
		panel_1_81.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_81.setBounds(616, 11, 155, 62);
		panel_8.add(panel_1_81);

		ans_Q2Question8_radio1 = new JRadioButton("True");
		ans_Q2Question8_radio1.setBounds(20, 7, 109, 23);
		panel_1_81.add(ans_Q2Question8_radio1);

		ans_Q2Question8_radio2 = new JRadioButton("False");
		ans_Q2Question8_radio2.setBounds(20, 33, 109, 23);
		panel_1_81.add(ans_Q2Question8_radio2);

		ButtonGroup bg8 = new ButtonGroup();
		bg8.add(ans_Q2Question8_radio1);
		bg8.add(ans_Q2Question8_radio2);
		/////
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_91 = new JLabel("Q 9");
		LabelQ1_1_91.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_91.setBounds(10, 11, 42, 62);
		panel_9.add(LabelQ1_1_91);

		txt_Q2Question9 = new JLabel("New label");
		txt_Q2Question9.setBounds(63, 11, 522, 62);
		panel_9.add(txt_Q2Question9);

		JPanel panel_1_91 = new JPanel();
		panel_1_91.setLayout(null);
		panel_1_91.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_91.setBounds(616, 11, 155, 62);
		panel_9.add(panel_1_91);

		ans_Q2Question9_radio1 = new JRadioButton("True");
		ans_Q2Question9_radio1.setBounds(20, 7, 109, 23);
		panel_1_91.add(ans_Q2Question9_radio1);

		ans_Q2Question9_radio2 = new JRadioButton("False");
		ans_Q2Question9_radio2.setBounds(20, 33, 109, 23);
		panel_1_91.add(ans_Q2Question9_radio2);

		ButtonGroup bg9 = new ButtonGroup();
		bg9.add(ans_Q2Question9_radio1);
		bg9.add(ans_Q2Question9_radio2);
		////
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ1_1_10 = new JLabel("Q 10");
		LabelQ1_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1_10.setBounds(10, 11, 42, 62);
		panel_10.add(LabelQ1_1_10);

		txt_Q2Question10 = new JLabel("New label");
		txt_Q2Question10.setBounds(63, 11, 522, 62);
		panel_10.add(txt_Q2Question10);

		JPanel panel_1_10 = new JPanel();
		panel_1_10.setLayout(null);
		panel_1_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_10.setBounds(616, 11, 155, 62);
		panel_10.add(panel_1_10);

		ans_Q2Question10_radio1 = new JRadioButton("True");
		ans_Q2Question10_radio1.setBounds(20, 7, 109, 23);
		panel_1_10.add(ans_Q2Question10_radio1);

		ans_Q2Question10_radio2 = new JRadioButton("False");
		ans_Q2Question10_radio2.setBounds(20, 33, 109, 23);
		panel_1_10.add(ans_Q2Question10_radio2);

		ButtonGroup bg10 = new ButtonGroup();
		bg10.add(ans_Q2Question10_radio1);
		bg10.add(ans_Q2Question10_radio2);
		/////
		btn_Q2_submit = new JButton("Submit");
		btn_Q2_submit.addActionListener(this);
		btn_Q2_submit.setBounds(51, 455, 89, 23);

		GroupLayout gl_Q2panel = new GroupLayout(Q2panel);
		gl_Q2panel.setHorizontalGroup(gl_Q2panel.createParallelGroup(Alignment.LEADING).addGroup(gl_Q2panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_Q2panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_Q2_submit, Alignment.CENTER))
				.addContainerGap(49, Short.MAX_VALUE)));
		gl_Q2panel.setVerticalGroup(gl_Q2panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q2panel.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_Q2_submit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, Short.MAX_VALUE)));
		panel.setLayout(null);

		JLabel LabelQ1_1 = new JLabel("Q 1");
		LabelQ1_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1_1.setBounds(10, 11, 42, 62);
		panel.add(LabelQ1_1);
		String myString = "sangram mahsjdghk hdhdhagf hsdgsadfjhb dhghdsgjj hdsgafbdsafhg sdhhgjnhsdaf hgsdfghjgsdh hgsdhjgasdf hjghjgasdf sgahdghghgdh hsfahkghasdfghgahgsdhkl dsfjhjkhdSFJKHj dsjhdfjshjkdsbfbhsdagb dfashhd fdhsds asdbvashvbnsdavbn vmds fvgdsamvgbvadsgv hagdhhjadg";
		txt_Q2Question1 = new JLabel();
		txt_Q2Question1.setText("<html>" + myString + "</html>");
		txt_Q2Question1.setBounds(63, 11, 543, 62);
		panel.add(txt_Q2Question1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(616, 11, 155, 62);
		panel.add(panel_1);
		panel_1.setLayout(null);

		ans_Q2Question1_radio1 = new JRadioButton("True");
		ans_Q2Question1_radio1.setBounds(20, 7, 109, 23);
		panel_1.add(ans_Q2Question1_radio1);

		ans_Q2Question1_radio2 = new JRadioButton("False");
		ans_Q2Question1_radio2.setBounds(20, 33, 109, 23);
		panel_1.add(ans_Q2Question1_radio2);

		ButtonGroup bg = new ButtonGroup();
		bg.add(ans_Q2Question1_radio1);
		bg.add(ans_Q2Question1_radio2);

		Q2panel.setLayout(gl_Q2panel);
		QuetabbedPane.addTab("Question 2", null, Q2scroll, null);
		////// Q3 panel start
		JPanel Q3panel = new JPanel();
		Q3panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JScrollPane Q3scroll = new JScrollPane(Q3panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//////
		JPanel panelQ1 = new JPanel();
		panelQ1.setLayout(null);

		JLabel LabelQ1 = new JLabel("Q 1");
		LabelQ1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ1.setBounds(10, 21, 42, 62);
		panelQ1.add(LabelQ1);

		txt_Q3Question1 = new JLabel("New label");
		txt_Q3Question1.setBounds(62, 21, 693, 62);
		panelQ1.add(txt_Q3Question1);
		panelQ1.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelA1 = new JPanel();

		Q3Question1_Option1 = new JRadioButton("");
		Q3Question1_Option1.setBounds(69, 7, 706, 23);
		panelA1.add(Q3Question1_Option1);

		Q3Question1_Option2 = new JRadioButton("");
		Q3Question1_Option2.setBounds(69, 33, 706, 23);
		panelA1.add(Q3Question1_Option2);

		Q3Question1_Option3 = new JRadioButton("");
		Q3Question1_Option3.setBounds(69, 62, 706, 23);
		panelA1.add(Q3Question1_Option3);

		Q3Question1_Option4 = new JRadioButton("");
		Q3Question1_Option4.setBounds(69, 88, 706, 23);
		panelA1.add(Q3Question1_Option4);

		ButtonGroup bgA1 = new ButtonGroup();
		bgA1.add(Q3Question1_Option1);
		bgA1.add(Q3Question1_Option2);
		bgA1.add(Q3Question1_Option3);
		bgA1.add(Q3Question1_Option4);

		panelA1.setLayout(null);
		panelA1.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelQ2 = new JPanel();

		JLabel LabelQ2 = new JLabel("Q 2");
		LabelQ2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ2.setBounds(10, 21, 42, 62);
		panelQ2.add(LabelQ2);

		txt_Q3Question2 = new JLabel("New label");
		txt_Q3Question2.setBounds(62, 21, 693, 62);
		panelQ2.add(txt_Q3Question2);

		panelQ2.setLayout(null);
		panelQ2.setBorder(new LineBorder(new Color(0, 0, 0)));
		/////
		JPanel panelA2 = new JPanel();
		panelA2.setLayout(null);
		panelA2.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question2_Option1 = new JRadioButton("");
		Q3Question2_Option1.setBounds(69, 7, 706, 23);
		panelA2.add(Q3Question2_Option1);

		Q3Question2_Option2 = new JRadioButton("");
		Q3Question2_Option2.setBounds(69, 33, 706, 23);
		panelA2.add(Q3Question2_Option2);

		Q3Question2_Option3 = new JRadioButton("");
		Q3Question2_Option3.setBounds(69, 62, 706, 23);
		panelA2.add(Q3Question2_Option3);

		Q3Question2_Option4 = new JRadioButton("");
		Q3Question2_Option4.setBounds(69, 88, 706, 23);
		panelA2.add(Q3Question2_Option4);

		ButtonGroup bgA2 = new ButtonGroup();
		bgA2.add(Q3Question2_Option1);
		bgA2.add(Q3Question2_Option2);
		bgA2.add(Q3Question2_Option3);
		bgA2.add(Q3Question2_Option4);
		/////
		JPanel panelQ3 = new JPanel();
		JLabel LabelQ3 = new JLabel("Q 3");
		LabelQ3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ3.setBounds(10, 21, 42, 62);
		panelQ3.add(LabelQ3);

		txt_Q3Question3 = new JLabel("New label");
		txt_Q3Question3.setBounds(62, 21, 693, 62);
		panelQ3.add(txt_Q3Question3);
		panelQ3.setLayout(null);
		panelQ3.setBorder(new LineBorder(new Color(0, 0, 0)));
		/////
		JPanel panelA3 = new JPanel();
		panelA3.setLayout(null);
		panelA3.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question3_Option1 = new JRadioButton("");
		Q3Question3_Option1.setBounds(69, 7, 706, 23);
		panelA3.add(Q3Question3_Option1);

		Q3Question3_Option2 = new JRadioButton("");
		Q3Question3_Option2.setBounds(69, 33, 706, 23);
		panelA3.add(Q3Question3_Option2);

		Q3Question3_Option3 = new JRadioButton("");
		Q3Question3_Option3.setBounds(69, 62, 706, 23);
		panelA3.add(Q3Question3_Option3);

		Q3Question3_Option4 = new JRadioButton("");
		Q3Question3_Option4.setBounds(69, 88, 706, 23);
		panelA3.add(Q3Question3_Option4);

		ButtonGroup bgA3 = new ButtonGroup();
		bgA3.add(Q3Question3_Option1);
		bgA3.add(Q3Question3_Option2);
		bgA3.add(Q3Question3_Option3);
		bgA3.add(Q3Question3_Option4);
		////
		JPanel panelQ4 = new JPanel();
		JLabel LabelQ4 = new JLabel("Q 4");
		LabelQ4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4.setBounds(10, 21, 42, 62);
		panelQ4.add(LabelQ4);

		txt_Q3Question4 = new JLabel("New label");
		txt_Q3Question4.setBounds(62, 21, 693, 62);
		panelQ4.add(txt_Q3Question4);
		panelQ4.setLayout(null);
		panelQ4.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelA4 = new JPanel();
		panelA4.setLayout(null);
		panelA4.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question4_Option1 = new JRadioButton("");
		Q3Question4_Option1.setBounds(69, 7, 706, 23);
		panelA4.add(Q3Question4_Option1);

		Q3Question4_Option2 = new JRadioButton("");
		Q3Question4_Option2.setBounds(69, 33, 706, 23);
		panelA4.add(Q3Question4_Option2);

		Q3Question4_Option3 = new JRadioButton("");
		Q3Question4_Option3.setBounds(69, 62, 706, 23);
		panelA4.add(Q3Question4_Option3);

		Q3Question4_Option4 = new JRadioButton("");
		Q3Question4_Option4.setBounds(69, 88, 706, 23);
		panelA4.add(Q3Question4_Option4);

		ButtonGroup bgA4 = new ButtonGroup();
		bgA4.add(Q3Question4_Option1);
		bgA4.add(Q3Question4_Option2);
		bgA4.add(Q3Question4_Option3);
		bgA4.add(Q3Question4_Option4);
		///
		JPanel panelQ5 = new JPanel();
		JLabel LabelQ5 = new JLabel("Q 5");
		LabelQ5.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ5.setBounds(10, 21, 42, 62);
		panelQ5.add(LabelQ5);

		txt_Q3Question5 = new JLabel("New label");
		txt_Q3Question5.setBounds(62, 21, 693, 62);
		panelQ5.add(txt_Q3Question5);
		panelQ5.setLayout(null);
		panelQ5.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelA5 = new JPanel();
		panelA5.setLayout(null);
		panelA5.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question5_Option1 = new JRadioButton("");
		Q3Question5_Option1.setBounds(69, 7, 706, 23);
		panelA5.add(Q3Question5_Option1);

		Q3Question5_Option2 = new JRadioButton("");
		Q3Question5_Option2.setBounds(69, 33, 706, 23);
		panelA5.add(Q3Question5_Option2);

		Q3Question5_Option3 = new JRadioButton("");
		Q3Question5_Option3.setBounds(69, 62, 706, 23);
		panelA5.add(Q3Question5_Option3);

		Q3Question5_Option4 = new JRadioButton("");
		Q3Question5_Option4.setBounds(69, 88, 706, 23);
		panelA5.add(Q3Question5_Option4);

		ButtonGroup bgA5 = new ButtonGroup();
		bgA5.add(Q3Question5_Option1);
		bgA5.add(Q3Question5_Option2);
		bgA5.add(Q3Question5_Option3);
		bgA5.add(Q3Question5_Option4);
		///
		JPanel panelQ6 = new JPanel();
		JLabel LabelQ6 = new JLabel("Q 6");
		LabelQ6.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ6.setBounds(10, 21, 42, 62);
		panelQ6.add(LabelQ6);

		txt_Q3Question6 = new JLabel("New label");
		txt_Q3Question6.setBounds(62, 21, 693, 62);
		panelQ6.add(txt_Q3Question6);
		panelQ6.setLayout(null);
		panelQ6.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelA6 = new JPanel();
		panelA6.setLayout(null);
		panelA6.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question6_Option1 = new JRadioButton("");
		Q3Question6_Option1.setBounds(69, 7, 706, 23);
		panelA6.add(Q3Question6_Option1);

		Q3Question6_Option2 = new JRadioButton("");
		Q3Question6_Option2.setBounds(69, 33, 706, 23);
		panelA6.add(Q3Question6_Option2);

		Q3Question6_Option3 = new JRadioButton("");
		Q3Question6_Option3.setBounds(69, 62, 706, 23);
		panelA6.add(Q3Question6_Option3);

		Q3Question6_Option4 = new JRadioButton("");
		Q3Question6_Option4.setBounds(69, 88, 706, 23);
		panelA6.add(Q3Question6_Option4);

		ButtonGroup bgA6 = new ButtonGroup();
		bgA6.add(Q3Question6_Option1);
		bgA6.add(Q3Question6_Option2);
		bgA6.add(Q3Question6_Option3);
		bgA6.add(Q3Question6_Option4);
		///
		JPanel panelQ7 = new JPanel();
		JLabel LabelQ7 = new JLabel("Q 7");
		LabelQ7.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7.setBounds(10, 21, 42, 62);
		panelQ7.add(LabelQ7);

		txt_Q3Question7 = new JLabel("New label");
		txt_Q3Question7.setBounds(62, 21, 693, 62);
		panelQ7.add(txt_Q3Question7);
		panelQ7.setLayout(null);
		panelQ7.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelA7 = new JPanel();
		panelA7.setLayout(null);
		panelA7.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question7_Option1 = new JRadioButton("");
		Q3Question7_Option1.setBounds(69, 7, 706, 23);
		panelA7.add(Q3Question7_Option1);

		Q3Question7_Option2 = new JRadioButton("");
		Q3Question7_Option2.setBounds(69, 33, 706, 23);
		panelA7.add(Q3Question7_Option2);

		Q3Question7_Option3 = new JRadioButton("");
		Q3Question7_Option3.setBounds(69, 62, 706, 23);
		panelA7.add(Q3Question7_Option3);

		Q3Question7_Option4 = new JRadioButton("");
		Q3Question7_Option4.setBounds(69, 88, 706, 23);
		panelA7.add(Q3Question7_Option4);

		ButtonGroup bgA7 = new ButtonGroup();
		bgA7.add(Q3Question7_Option1);
		bgA7.add(Q3Question7_Option2);
		bgA7.add(Q3Question7_Option3);
		bgA7.add(Q3Question7_Option4);
		///
		JPanel panelQ8 = new JPanel();
		JLabel LabelQ8 = new JLabel("Q 8");
		LabelQ8.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ8.setBounds(10, 21, 42, 62);
		panelQ8.add(LabelQ8);

		txt_Q3Question8 = new JLabel("New label");
		txt_Q3Question8.setBounds(62, 21, 693, 62);
		panelQ8.add(txt_Q3Question8);
		panelQ8.setLayout(null);
		panelQ8.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelA8 = new JPanel();
		panelA8.setLayout(null);
		panelA8.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question8_Option1 = new JRadioButton("");
		Q3Question8_Option1.setBounds(69, 7, 706, 23);
		panelA8.add(Q3Question8_Option1);

		Q3Question8_Option2 = new JRadioButton("");
		Q3Question8_Option2.setBounds(69, 33, 706, 23);
		panelA8.add(Q3Question8_Option2);

		Q3Question8_Option3 = new JRadioButton("");
		Q3Question8_Option3.setBounds(69, 62, 706, 23);
		panelA8.add(Q3Question8_Option3);

		Q3Question8_Option4 = new JRadioButton("");
		Q3Question8_Option4.setBounds(69, 88, 706, 23);
		panelA8.add(Q3Question8_Option4);

		ButtonGroup bgA8 = new ButtonGroup();
		bgA8.add(Q3Question8_Option1);
		bgA8.add(Q3Question8_Option2);
		bgA8.add(Q3Question8_Option3);
		bgA8.add(Q3Question8_Option4);

		///
		JPanel panelQ9 = new JPanel();
		JLabel LabelQ9 = new JLabel("Q 9");
		LabelQ9.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ9.setBounds(10, 21, 42, 62);
		panelQ9.add(LabelQ9);

		txt_Q3Question9 = new JLabel("New label");
		txt_Q3Question9.setBounds(62, 21, 693, 62);
		panelQ9.add(txt_Q3Question9);
		panelQ9.setLayout(null);
		panelQ9.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelA9 = new JPanel();
		panelA9.setLayout(null);
		panelA9.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question9_Option1 = new JRadioButton("");
		Q3Question9_Option1.setBounds(69, 7, 706, 23);
		panelA9.add(Q3Question9_Option1);

		Q3Question9_Option2 = new JRadioButton("");
		Q3Question9_Option2.setBounds(69, 33, 706, 23);
		panelA9.add(Q3Question9_Option2);

		Q3Question9_Option3 = new JRadioButton("");
		Q3Question9_Option3.setBounds(69, 62, 706, 23);
		panelA9.add(Q3Question9_Option3);

		Q3Question9_Option4 = new JRadioButton("");
		Q3Question9_Option4.setBounds(69, 88, 706, 23);
		panelA9.add(Q3Question9_Option4);

		ButtonGroup bgA9 = new ButtonGroup();
		bgA9.add(Q3Question9_Option1);
		bgA9.add(Q3Question9_Option2);
		bgA9.add(Q3Question9_Option3);
		bgA9.add(Q3Question9_Option4);

		///
		JPanel panelQ10 = new JPanel();
		JLabel LabelQ10 = new JLabel("Q 10");
		LabelQ10.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ10.setBounds(10, 21, 42, 62);
		panelQ10.add(LabelQ10);

		txt_Q3Question10 = new JLabel("New label");
		txt_Q3Question10.setBounds(62, 21, 693, 62);
		panelQ10.add(txt_Q3Question10);
		panelQ10.setLayout(null);
		panelQ10.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		JPanel panelA10 = new JPanel();
		panelA10.setLayout(null);
		panelA10.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q3Question10_Option1 = new JRadioButton("");
		Q3Question10_Option1.setBounds(69, 7, 706, 23);
		panelA10.add(Q3Question10_Option1);

		Q3Question10_Option2 = new JRadioButton("");
		Q3Question10_Option2.setBounds(69, 33, 706, 23);
		panelA10.add(Q3Question10_Option2);

		Q3Question10_Option3 = new JRadioButton("");
		Q3Question10_Option3.setBounds(69, 62, 706, 23);
		panelA10.add(Q3Question10_Option3);

		Q3Question10_Option4 = new JRadioButton("");
		Q3Question10_Option4.setBounds(69, 88, 706, 23);
		panelA10.add(Q3Question10_Option4);
		ButtonGroup bgA10 = new ButtonGroup();
		bgA10.add(Q3Question10_Option1);
		bgA10.add(Q3Question10_Option2);
		bgA10.add(Q3Question10_Option3);
		bgA10.add(Q3Question10_Option4);
		///
		btn_Q3_submit = new JButton("Submit");
		btn_Q3_submit.addActionListener(this);
		btn_Q3_submit.setBounds(51, 455, 89, 23);

		GroupLayout gl_Q3panel = new GroupLayout(Q3panel);
		gl_Q3panel.setHorizontalGroup(gl_Q3panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q3panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_Q3panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panelQ1, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
								.addComponent(panelA1, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
								.addComponent(panelQ2, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
								.addComponent(panelA2, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
								.addComponent(panelQ3, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
								.addComponent(panelA3, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ4, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ5, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA5, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ6, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA6, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ7, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA7, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ8, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA8, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ9, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA9, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ10, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA10, GroupLayout.PREFERRED_SIZE, 781, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_Q3_submit, Alignment.CENTER))
						.addContainerGap()));
		gl_Q3panel.setVerticalGroup(gl_Q3panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q3panel.createSequentialGroup().addContainerGap()
						.addComponent(panelQ1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panelA1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panelQ2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA3, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ5, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA5, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA6, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ7, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA7, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA8, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ9, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA9, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ10, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA10, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_Q3_submit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, Short.MAX_VALUE)));

		Q3panel.setLayout(gl_Q3panel);
		QuetabbedPane.addTab("Question 3", null, Q3scroll, null);
		///// Q4 panel start
		JPanel Q4panel = new JPanel();
		Q4panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JScrollPane Q4scroll = new JScrollPane(Q4panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		////

		JPanel panelQ4_1 = new JPanel();
		panelQ4_1.setLayout(null);
		panelQ4_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_1 = new JLabel("Q 1");
		LabelQ4_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_1.setBounds(10, 21, 42, 62);
		panelQ4_1.add(LabelQ4_1);

		Q4Question1 = new JLabel("New label");
		Q4Question1.setBounds(62, 21, 713, 62);
		panelQ4_1.add(Q4Question1);

		panelA4_1 = new JPanel();
		panelA4_1.setLayout(null);
		panelA4_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question1_Option1 = new JCheckBox("New check box");
		Q4Question1_Option1.setBounds(69, 7, 690, 23);
		Q4Question1_Option1.addActionListener(this);
		panelA4_1.add(Q4Question1_Option1);

		Q4Question1_Option2 = new JCheckBox("New check box");
		Q4Question1_Option2.setBounds(69, 33, 690, 23);
		Q4Question1_Option2.addActionListener(this);
		panelA4_1.add(Q4Question1_Option2);

		Q4Question1_Option3 = new JCheckBox("New check box");
		Q4Question1_Option3.setBounds(69, 59, 690, 23);
		Q4Question1_Option3.addActionListener(this);
		panelA4_1.add(Q4Question1_Option3);

		Q4Question1_Option4 = new JCheckBox("New check box");
		Q4Question1_Option4.setBounds(69, 85, 690, 23);
		Q4Question1_Option4.addActionListener(this);
		panelA4_1.add(Q4Question1_Option4);

		Q4Question1_Option5 = new JCheckBox("New check box");
		Q4Question1_Option5.setBounds(69, 111, 690, 23);
		Q4Question1_Option5.addActionListener(this);
		panelA4_1.add(Q4Question1_Option5);

		///
		JPanel panelQ4_2 = new JPanel();
		panelQ4_2.setLayout(null);
		panelQ4_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_2 = new JLabel("Q 2");
		LabelQ4_2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_2.setBounds(10, 21, 42, 62);
		panelQ4_2.add(LabelQ4_2);

		Q4Question2 = new JLabel("New label");
		Q4Question2.setBounds(62, 21, 713, 62);
		panelQ4_2.add(Q4Question2);

		panelA4_2 = new JPanel();
		panelA4_2.setLayout(null);
		panelA4_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question2_Option1 = new JCheckBox("New check box");
		Q4Question2_Option1.setBounds(69, 7, 690, 23);
		Q4Question2_Option1.addActionListener(this);
		panelA4_2.add(Q4Question2_Option1);

		Q4Question2_Option2 = new JCheckBox("New check box");
		Q4Question2_Option2.setBounds(69, 33, 690, 23);
		Q4Question2_Option2.addActionListener(this);
		panelA4_2.add(Q4Question2_Option2);

		Q4Question2_Option3 = new JCheckBox("New check box");
		Q4Question2_Option3.setBounds(69, 59, 690, 23);
		Q4Question2_Option3.addActionListener(this);
		panelA4_2.add(Q4Question2_Option3);

		Q4Question2_Option4 = new JCheckBox("New check box");
		Q4Question2_Option4.setBounds(69, 85, 690, 23);
		Q4Question2_Option4.addActionListener(this);
		panelA4_2.add(Q4Question2_Option4);

		Q4Question2_Option5 = new JCheckBox("New check box");
		Q4Question2_Option5.setBounds(69, 111, 690, 23);
		Q4Question2_Option5.addActionListener(this);
		panelA4_2.add(Q4Question2_Option5);
		///
		JPanel panelQ4_3 = new JPanel();
		panelQ4_3.setLayout(null);
		panelQ4_3.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_3 = new JLabel("Q 3");
		LabelQ4_3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_3.setBounds(10, 21, 42, 62);
		panelQ4_3.add(LabelQ4_3);

		Q4Question3 = new JLabel("New label");
		Q4Question3.setBounds(62, 21, 713, 62);
		panelQ4_3.add(Q4Question3);

		panelA4_3 = new JPanel();
		panelA4_3.setLayout(null);
		panelA4_3.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question3_Option1 = new JCheckBox("New check box");
		Q4Question3_Option1.setBounds(69, 7, 690, 23);
		Q4Question3_Option1.addActionListener(this);
		panelA4_3.add(Q4Question3_Option1);

		Q4Question3_Option2 = new JCheckBox("New check box");
		Q4Question3_Option2.setBounds(69, 33, 690, 23);
		Q4Question3_Option2.addActionListener(this);
		panelA4_3.add(Q4Question3_Option2);

		Q4Question3_Option3 = new JCheckBox("New check box");
		Q4Question3_Option3.setBounds(69, 59, 690, 23);
		Q4Question3_Option3.addActionListener(this);
		panelA4_3.add(Q4Question3_Option3);

		Q4Question3_Option4 = new JCheckBox("New check box");
		Q4Question3_Option4.setBounds(69, 85, 690, 23);
		Q4Question3_Option4.addActionListener(this);
		panelA4_3.add(Q4Question3_Option4);

		Q4Question3_Option5 = new JCheckBox("New check box");
		Q4Question3_Option5.setBounds(69, 111, 690, 23);
		Q4Question3_Option5.addActionListener(this);
		panelA4_3.add(Q4Question3_Option5);

		///
		JPanel panelQ4_4 = new JPanel();
		panelQ4_4.setLayout(null);
		panelQ4_4.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_4 = new JLabel("Q 4");
		LabelQ4_4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_4.setBounds(10, 21, 42, 62);
		panelQ4_4.add(LabelQ4_4);

		Q4Question4 = new JLabel("New label");
		Q4Question4.setBounds(62, 21, 713, 62);
		panelQ4_4.add(Q4Question4);

		panelA4_4 = new JPanel();
		panelA4_4.setLayout(null);
		panelA4_4.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question4_Option1 = new JCheckBox("New check box");
		Q4Question4_Option1.setBounds(69, 7, 690, 23);
		Q4Question4_Option1.addActionListener(this);
		panelA4_4.add(Q4Question4_Option1);

		Q4Question4_Option2 = new JCheckBox("New check box");
		Q4Question4_Option2.setBounds(69, 33, 690, 23);
		Q4Question4_Option2.addActionListener(this);
		panelA4_4.add(Q4Question4_Option2);

		Q4Question4_Option3 = new JCheckBox("New check box");
		Q4Question4_Option3.setBounds(69, 59, 690, 23);
		Q4Question4_Option3.addActionListener(this);
		panelA4_4.add(Q4Question4_Option3);

		Q4Question4_Option4 = new JCheckBox("New check box");
		Q4Question4_Option4.setBounds(69, 85, 690, 23);
		Q4Question4_Option4.addActionListener(this);
		panelA4_4.add(Q4Question4_Option4);

		Q4Question4_Option5 = new JCheckBox("New check box");
		Q4Question4_Option5.setBounds(69, 111, 690, 23);
		panelA4_4.add(Q4Question4_Option5);
		///

		////
		JPanel panelQ4_5 = new JPanel();
		panelQ4_5.setLayout(null);
		panelQ4_5.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_5 = new JLabel("Q 5");
		LabelQ4_5.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_5.setBounds(10, 21, 42, 62);
		panelQ4_5.add(LabelQ4_5);

		Q4Question5 = new JLabel("New label");
		Q4Question5.setBounds(62, 21, 713, 62);
		panelQ4_5.add(Q4Question5);

		panelA4_5 = new JPanel();
		panelA4_5.setLayout(null);
		panelA4_5.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question5_Option1 = new JCheckBox("New check box");
		Q4Question5_Option1.setBounds(69, 7, 690, 23);
		Q4Question5_Option1.addActionListener(this);
		panelA4_5.add(Q4Question5_Option1);

		Q4Question5_Option2 = new JCheckBox("New check box");
		Q4Question5_Option2.setBounds(69, 33, 690, 23);
		Q4Question5_Option2.addActionListener(this);
		panelA4_5.add(Q4Question5_Option2);

		Q4Question5_Option3 = new JCheckBox("New check box");
		Q4Question5_Option3.setBounds(69, 59, 690, 23);
		Q4Question5_Option3.addActionListener(this);
		panelA4_5.add(Q4Question5_Option3);

		Q4Question5_Option4 = new JCheckBox("New check box");
		Q4Question5_Option4.setBounds(69, 85, 690, 23);
		Q4Question5_Option4.addActionListener(this);
		panelA4_5.add(Q4Question5_Option4);

		Q4Question5_Option5 = new JCheckBox("New check box");
		Q4Question5_Option5.setBounds(69, 111, 690, 23);
		Q4Question5_Option5.addActionListener(this);
		panelA4_5.add(Q4Question5_Option5);

		///
		JPanel panelQ4_6 = new JPanel();
		panelQ4_6.setLayout(null);
		panelQ4_6.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_6 = new JLabel("Q 6");
		LabelQ4_6.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_6.setBounds(10, 21, 42, 62);
		panelQ4_6.add(LabelQ4_6);

		Q4Question6 = new JLabel("New label");
		Q4Question6.setBounds(62, 21, 713, 62);
		panelQ4_6.add(Q4Question6);

		panelA4_6 = new JPanel();
		panelA4_6.setLayout(null);
		panelA4_6.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question6_Option1 = new JCheckBox("New check box");
		Q4Question6_Option1.setBounds(69, 7, 690, 23);
		Q4Question6_Option1.addActionListener(this);
		panelA4_6.add(Q4Question6_Option1);

		Q4Question6_Option2 = new JCheckBox("New check box");
		Q4Question6_Option2.setBounds(69, 33, 690, 23);
		Q4Question6_Option2.addActionListener(this);
		panelA4_6.add(Q4Question6_Option2);

		Q4Question6_Option3 = new JCheckBox("New check box");
		Q4Question6_Option3.setBounds(69, 59, 690, 23);
		Q4Question6_Option3.addActionListener(this);
		panelA4_6.add(Q4Question6_Option3);

		Q4Question6_Option4 = new JCheckBox("New check box");
		Q4Question6_Option4.setBounds(69, 85, 690, 23);
		Q4Question6_Option4.addActionListener(this);
		panelA4_6.add(Q4Question6_Option4);

		Q4Question6_Option5 = new JCheckBox("New check box");
		Q4Question6_Option5.setBounds(69, 111, 690, 23);
		Q4Question6_Option5.addActionListener(this);
		panelA4_6.add(Q4Question6_Option5);
		///
		JPanel panelQ4_7 = new JPanel();
		panelQ4_7.setLayout(null);
		panelQ4_7.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_7 = new JLabel("Q 7");
		LabelQ4_7.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_7.setBounds(10, 21, 42, 62);
		panelQ4_7.add(LabelQ4_7);

		Q4Question7 = new JLabel("New label");
		Q4Question7.setBounds(62, 21, 713, 62);
		panelQ4_7.add(Q4Question7);

		panelA4_7 = new JPanel();
		panelA4_7.setLayout(null);
		panelA4_7.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question7_Option1 = new JCheckBox("New check box");
		Q4Question7_Option1.setBounds(69, 7, 690, 23);
		Q4Question7_Option1.addActionListener(this);
		panelA4_7.add(Q4Question7_Option1);

		Q4Question7_Option2 = new JCheckBox("New check box");
		Q4Question7_Option2.setBounds(69, 33, 690, 23);
		Q4Question7_Option2.addActionListener(this);
		panelA4_7.add(Q4Question7_Option2);

		Q4Question7_Option3 = new JCheckBox("New check box");
		Q4Question7_Option3.setBounds(69, 59, 690, 23);
		Q4Question7_Option3.addActionListener(this);
		panelA4_7.add(Q4Question7_Option3);

		Q4Question7_Option4 = new JCheckBox("New check box");
		Q4Question7_Option4.setBounds(69, 85, 690, 23);
		Q4Question7_Option4.addActionListener(this);
		panelA4_7.add(Q4Question7_Option4);

		Q4Question7_Option5 = new JCheckBox("New check box");
		Q4Question7_Option5.setBounds(69, 111, 690, 23);
		Q4Question7_Option5.addActionListener(this);
		panelA4_7.add(Q4Question7_Option5);

		///
		JPanel panelQ4_8 = new JPanel();
		panelQ4_8.setLayout(null);
		panelQ4_8.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_8 = new JLabel("Q 8");
		LabelQ4_8.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_8.setBounds(10, 21, 42, 62);
		panelQ4_8.add(LabelQ4_8);

		Q4Question8 = new JLabel("New label");
		Q4Question8.setBounds(62, 21, 713, 62);
		panelQ4_8.add(Q4Question8);

		panelA4_8 = new JPanel();
		panelA4_8.setLayout(null);
		panelA4_8.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question8_Option1 = new JCheckBox("New check box");
		Q4Question8_Option1.setBounds(69, 7, 690, 23);
		Q4Question8_Option1.addActionListener(this);
		panelA4_8.add(Q4Question8_Option1);

		Q4Question8_Option2 = new JCheckBox("New check box");
		Q4Question8_Option2.setBounds(69, 33, 690, 23);
		Q4Question8_Option2.addActionListener(this);
		panelA4_8.add(Q4Question8_Option2);

		Q4Question8_Option3 = new JCheckBox("New check box");
		Q4Question8_Option3.setBounds(69, 59, 690, 23);
		Q4Question8_Option3.addActionListener(this);
		panelA4_8.add(Q4Question8_Option3);

		Q4Question8_Option4 = new JCheckBox("New check box");
		Q4Question8_Option4.setBounds(69, 85, 690, 23);
		Q4Question8_Option4.addActionListener(this);
		panelA4_8.add(Q4Question8_Option4);

		Q4Question8_Option5 = new JCheckBox("New check box");
		Q4Question8_Option5.setBounds(69, 111, 690, 23);
		Q4Question8_Option5.addActionListener(this);
		panelA4_8.add(Q4Question8_Option5);
		///
		JPanel panelQ4_9 = new JPanel();
		panelQ4_9.setLayout(null);
		panelQ4_9.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_9 = new JLabel("Q 9");
		LabelQ4_9.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_9.setBounds(10, 21, 42, 62);
		panelQ4_9.add(LabelQ4_9);

		Q4Question9 = new JLabel("New label");
		Q4Question9.setBounds(62, 21, 713, 62);
		panelQ4_9.add(Q4Question9);

		panelA4_9 = new JPanel();
		panelA4_9.setLayout(null);
		panelA4_9.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question9_Option1 = new JCheckBox("New check box");
		Q4Question9_Option1.setBounds(69, 7, 690, 23);
		Q4Question9_Option1.addActionListener(this);
		panelA4_9.add(Q4Question9_Option1);

		Q4Question9_Option2 = new JCheckBox("New check box");
		Q4Question9_Option2.setBounds(69, 33, 690, 23);
		Q4Question9_Option2.addActionListener(this);
		panelA4_9.add(Q4Question9_Option2);

		Q4Question9_Option3 = new JCheckBox("New check box");
		Q4Question9_Option3.setBounds(69, 59, 690, 23);
		Q4Question9_Option3.addActionListener(this);
		panelA4_9.add(Q4Question9_Option3);

		Q4Question9_Option4 = new JCheckBox("New check box");
		Q4Question9_Option4.setBounds(69, 85, 690, 23);
		Q4Question9_Option4.addActionListener(this);
		panelA4_9.add(Q4Question9_Option4);

		Q4Question9_Option5 = new JCheckBox("New check box");
		Q4Question9_Option5.setBounds(69, 111, 690, 23);
		Q4Question9_Option5.addActionListener(this);
		panelA4_9.add(Q4Question9_Option5);

		///
		JPanel panelQ4_10 = new JPanel();
		panelQ4_10.setLayout(null);
		panelQ4_10.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_10 = new JLabel("Q 10");
		LabelQ4_10.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_10.setBounds(10, 21, 42, 62);
		panelQ4_10.add(LabelQ4_10);

		Q4Question10 = new JLabel("New label");
		Q4Question10.setBounds(62, 21, 713, 62);
		panelQ4_10.add(Q4Question10);

		panelA4_10 = new JPanel();
		panelA4_10.setLayout(null);
		panelA4_10.setBorder(new LineBorder(new Color(0, 0, 0)));

		Q4Question10_Option1 = new JCheckBox("New check box");
		Q4Question10_Option1.setBounds(69, 7, 690, 23);
		Q4Question10_Option1.addActionListener(this);
		panelA4_10.add(Q4Question10_Option1);

		Q4Question10_Option2 = new JCheckBox("New check box");
		Q4Question10_Option2.setBounds(69, 33, 690, 23);
		Q4Question10_Option2.addActionListener(this);
		panelA4_10.add(Q4Question10_Option2);

		Q4Question10_Option3 = new JCheckBox("New check box");
		Q4Question10_Option3.setBounds(69, 59, 690, 23);
		Q4Question10_Option3.addActionListener(this);
		panelA4_10.add(Q4Question10_Option3);

		Q4Question10_Option4 = new JCheckBox("New check box");
		Q4Question10_Option4.setBounds(69, 85, 690, 23);
		Q4Question10_Option4.addActionListener(this);
		panelA4_10.add(Q4Question10_Option4);

		Q4Question10_Option5 = new JCheckBox("New check box");
		Q4Question10_Option5.setBounds(69, 111, 690, 23);
		Q4Question10_Option5.addActionListener(this);
		panelA4_10.add(Q4Question10_Option5);
		///
		btn_Q4_submit = new JButton("Submit");
		btn_Q4_submit.addActionListener(this);
		btn_Q4_submit.setBounds(51, 455, 89, 23);

		GroupLayout gl_Q4panel = new GroupLayout(Q4panel);
		gl_Q4panel.setHorizontalGroup(gl_Q4panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_Q4panel.createSequentialGroup().addContainerGap().addGroup(gl_Q4panel
						.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelA4_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
						.addComponent(panelQ4_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
						.addComponent(panelA4_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
						.addComponent(panelQ4_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_Q4panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panelQ4_3, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4_3, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ4_4, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4_4, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ4_5, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4_5, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ4_6, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4_6, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ4_7, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4_7, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ4_8, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4_8, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ4_9, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4_9, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ4_10, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA4_10, GroupLayout.PREFERRED_SIZE, 785, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_Q4_submit, Alignment.CENTER)))
						.addContainerGap()));
		gl_Q4panel.setVerticalGroup(gl_Q4panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q4panel.createSequentialGroup().addContainerGap()
						.addComponent(panelQ4_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_2, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_3, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_4, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_5, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_5, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_6, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_7, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_7, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_8, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_9, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_9, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ4_10, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA4_10, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_Q4_submit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, Short.MAX_VALUE)));

		Q4panel.setLayout(gl_Q4panel);
		QuetabbedPane.addTab("Question 4", null, Q4scroll, null);
		getContentPane().setLayout(null);
		getContentPane().add(Headerpanel);
		getContentPane().add(infopanel);
		getContentPane().add(Statuspanel);

		JLabel lbl_seat_no = new JLabel(seatnoo);
		lbl_seat_no.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_seat_no.setBounds(102, 12, 189, 14);
		infopanel.add(lbl_seat_no);
		lbl_seat_no.setText(login_details.Seat_No);

		JLabel lbl_index_no = new JLabel(model.Index_No);
		lbl_index_no.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_index_no.setBounds(503, 11, 147, 14);
		infopanel.add(lbl_index_no);
		lbl_index_no.setText(login_details.Index_No);

		JLabel lbl_paper_id = new JLabel("Paper no Label");
		lbl_paper_id.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_paper_id.setBounds(853, 11, 135, 14);
		infopanel.add(lbl_paper_id);
		lbl_paper_id.setText(login_details.Paper_ID);

		JLabel lbl_subject_code = new JLabel("Subject code Label");
		lbl_subject_code.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_subject_code.setBounds(112, 48, 147, 14);
		infopanel.add(lbl_subject_code);
		lbl_subject_code.setText(login_details.Stream);

		JLabel lbl_batch = new JLabel("Batch no Label");
		lbl_batch.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_batch.setBounds(503, 48, 111, 14);
		infopanel.add(lbl_batch);
		lbl_batch.setText(login_details.Batch);

		lbl_filesize = new JLabel("File Size :");
		lbl_filesize.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_filesize.setBounds(853, 42, 135, 28);
		infopanel.add(lbl_filesize);
		getContentPane().add(Statuspanel);

		Q1statuspanel_1 = new JPanel();
		Q1statuspanel_1.setLayout(null);
		Q1statuspanel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		Q1statuspanel_1.setBounds(10, 87, 178, 46);
		Statuspanel.add(Q1statuspanel_1);

		btn_Q2Question1 = new JButton("");
		btn_Q2Question1.setBackground(Color.RED);
		btn_Q2Question1.setBounds(50, 5, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question1);

		btn_Q2Question2 = new JButton("");
		btn_Q2Question2.setBackground(Color.RED);
		btn_Q2Question2.setBounds(75, 5, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question2);

		btn_Q2Question3 = new JButton("");
		btn_Q2Question3.setBackground(Color.RED);
		btn_Q2Question3.setBounds(100, 5, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question3);

		btn_Q2Question4 = new JButton("");
		btn_Q2Question4.setBackground(Color.RED);
		btn_Q2Question4.setBounds(125, 5, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question4);

		btn_Q2Question5 = new JButton("");
		btn_Q2Question5.setBackground(Color.RED);
		btn_Q2Question5.setBounds(150, 5, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question5);

		btn_Q2Question6 = new JButton("");
		btn_Q2Question6.setBackground(Color.RED);
		btn_Q2Question6.setBounds(50, 25, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question6);

		btn_Q2Question7 = new JButton("");
		btn_Q2Question7.setBackground(Color.RED);
		btn_Q2Question7.setBounds(75, 25, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question7);

		btn_Q2Question8 = new JButton("");
		btn_Q2Question8.setBackground(Color.RED);
		btn_Q2Question8.setBounds(100, 25, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question8);

		btn_Q2Question9 = new JButton("");
		btn_Q2Question9.setBackground(Color.RED);
		btn_Q2Question9.setBounds(125, 25, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question9);

		btn_Q2Question10 = new JButton("");
		btn_Q2Question10.setBackground(Color.RED);
		btn_Q2Question10.setBounds(150, 25, 21, 15);
		Q1statuspanel_1.add(btn_Q2Question10);

		btn_Question2 = new JButton("Q2");
		btn_Question2.addActionListener(this);
		btn_Question2.setVerticalTextPosition(SwingConstants.CENTER);
		btn_Question2.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Question2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn_Question2.setBounds(5, 5, 40, 35);
		Q1statuspanel_1.add(btn_Question2);

		JPanel Q1statuspanel_2 = new JPanel();
		Q1statuspanel_2.setLayout(null);
		Q1statuspanel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		Q1statuspanel_2.setBounds(10, 138, 178, 46);
		Statuspanel.add(Q1statuspanel_2);

		btn_Q3Question1 = new JButton("");
		btn_Q3Question1.setBackground(Color.RED);
		btn_Q3Question1.setBounds(50, 5, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question1);

		btn_Q3Question2 = new JButton("");
		btn_Q3Question2.setBackground(Color.RED);
		btn_Q3Question2.setBounds(75, 5, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question2);

		btn_Q3Question3 = new JButton("");
		btn_Q3Question3.setBackground(Color.RED);
		btn_Q3Question3.setBounds(100, 5, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question3);

		btn_Q3Question4 = new JButton("");
		btn_Q3Question4.setBackground(Color.RED);
		btn_Q3Question4.setBounds(125, 5, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question4);

		btn_Q3Question5 = new JButton("");
		btn_Q3Question5.setBackground(Color.RED);
		btn_Q3Question5.setBounds(150, 5, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question5);

		btn_Q3Question6 = new JButton("");
		btn_Q3Question6.setBackground(Color.RED);
		btn_Q3Question6.setBounds(50, 25, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question6);

		btn_Q3Question7 = new JButton("");
		btn_Q3Question7.setBackground(Color.RED);
		btn_Q3Question7.setBounds(75, 25, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question7);

		btn_Q3Question8 = new JButton("");
		btn_Q3Question8.setBackground(Color.RED);
		btn_Q3Question8.setBounds(100, 25, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question8);

		btn_Q3Question9 = new JButton("");
		btn_Q3Question9.setBackground(Color.RED);
		btn_Q3Question9.setBounds(125, 25, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question9);

		btn_Q3Question10 = new JButton("");
		btn_Q3Question10.setBackground(Color.RED);
		btn_Q3Question10.setBounds(150, 25, 21, 15);
		Q1statuspanel_2.add(btn_Q3Question10);

		btn_Question3 = new JButton("Q3");
		btn_Question3.addActionListener(this);
		btn_Question3.setVerticalTextPosition(SwingConstants.CENTER);
		btn_Question3.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Question3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn_Question3.setBounds(5, 5, 40, 35);
		Q1statuspanel_2.add(btn_Question3);

		Q1statuspanel_3 = new JPanel();
		Q1statuspanel_3.setLayout(null);
		Q1statuspanel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		Q1statuspanel_3.setBounds(10, 189, 178, 46);
		Statuspanel.add(Q1statuspanel_3);

		btn_Q4Question1 = new JButton("");
		btn_Q4Question1.setBackground(Color.RED);
		btn_Q4Question1.setBounds(50, 5, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question1);

		btn_Q4Question2 = new JButton("");
		btn_Q4Question2.setBackground(Color.RED);
		btn_Q4Question2.setBounds(75, 5, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question2);

		btn_Q4Question3 = new JButton("");
		btn_Q4Question3.setBackground(Color.RED);
		btn_Q4Question3.setBounds(100, 5, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question3);

		btn_Q4Question4 = new JButton("");
		btn_Q4Question4.setBackground(Color.RED);
		btn_Q4Question4.setBounds(125, 5, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question4);

		btn_Q4Question5 = new JButton("");
		btn_Q4Question5.setBackground(Color.RED);
		btn_Q4Question5.setBounds(150, 5, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question5);

		btn_Q4Question6 = new JButton("");
		btn_Q4Question6.setBackground(Color.RED);
		btn_Q4Question6.setBounds(50, 25, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question6);

		btn_Q4Question7 = new JButton("");
		btn_Q4Question7.setBackground(Color.RED);
		btn_Q4Question7.setBounds(75, 25, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question7);

		btn_Q4Question8 = new JButton("");
		btn_Q4Question8.setBackground(Color.RED);
		btn_Q4Question8.setBounds(100, 25, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question8);

		btn_Q4Question9 = new JButton("");
		btn_Q4Question9.setBackground(Color.RED);
		btn_Q4Question9.setBounds(125, 25, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question9);

		btn_Q4Question10 = new JButton("");
		btn_Q4Question10.setBackground(Color.RED);
		btn_Q4Question10.setBounds(150, 25, 21, 15);
		Q1statuspanel_3.add(btn_Q4Question10);

		btn_Question4 = new JButton("Q4");
		btn_Question4.addActionListener(this);
		btn_Question4.setVerticalTextPosition(SwingConstants.CENTER);
		btn_Question4.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Question4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn_Question4.setBounds(5, 5, 40, 35);
		Q1statuspanel_3.add(btn_Question4);

		JPanel Q1statuspanel_5 = new JPanel();
		Q1statuspanel_5.setLayout(null);
		Q1statuspanel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		Q1statuspanel_5.setBounds(10, 241, 178, 46);
		Statuspanel.add(Q1statuspanel_5);

		btn_Q5Question1 = new JButton("");
		btn_Q5Question1.setBackground(Color.RED);
		btn_Q5Question1.setBounds(50, 5, 21, 15);
		Q1statuspanel_5.add(btn_Q5Question1);

		btn_Q5Question2 = new JButton("");
		btn_Q5Question2.setBackground(Color.RED);
		btn_Q5Question2.setBounds(50, 25, 21, 15);
		Q1statuspanel_5.add(btn_Q5Question2);

		btn_Question5 = new JButton("Q5");
		btn_Question5.addActionListener(this);
		btn_Question5.setVerticalTextPosition(SwingConstants.CENTER);
		btn_Question5.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Question5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn_Question5.setBounds(5, 5, 40, 35);
		Q1statuspanel_5.add(btn_Question5);

		JPanel Q1statuspanel_6 = new JPanel();
		Q1statuspanel_6.setLayout(null);
		Q1statuspanel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		Q1statuspanel_6.setBounds(10, 293, 178, 46);
		Statuspanel.add(Q1statuspanel_6);

		btn_Q6Question1 = new JButton("");
		btn_Q6Question1.setBackground(Color.RED);
		btn_Q6Question1.setBounds(50, 5, 21, 15);
		Q1statuspanel_6.add(btn_Q6Question1);

		btn_Question6 = new JButton("Q6");
		btn_Question6.addActionListener(this);
		btn_Question6.setVerticalTextPosition(SwingConstants.CENTER);
		btn_Question6.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Question6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn_Question6.setBounds(5, 5, 40, 35);
		Q1statuspanel_6.add(btn_Question6);

		JPanel Q1statuspanel_4 = new JPanel();
		Q1statuspanel_4.setLayout(null);
		Q1statuspanel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		Q1statuspanel_4.setBounds(10, 345, 178, 46);
		Statuspanel.add(Q1statuspanel_4);

		btn_Q7Question1 = new JButton("");
		btn_Q7Question1.setBackground(Color.RED);
		btn_Q7Question1.setBounds(50, 5, 21, 15);
		Q1statuspanel_4.add(btn_Q7Question1);

		btn_Q7Question2 = new JButton("");
		btn_Q7Question2.setBackground(Color.RED);
		btn_Q7Question2.setBounds(75, 5, 21, 15);
		Q1statuspanel_4.add(btn_Q7Question2);

		btn_Q7Question3 = new JButton("");
		btn_Q7Question3.setBackground(Color.RED);
		btn_Q7Question3.setBounds(100, 5, 21, 15);
		Q1statuspanel_4.add(btn_Q7Question3);

		btn_Q7Question4 = new JButton("");
		btn_Q7Question4.setBackground(Color.RED);
		btn_Q7Question4.setBounds(125, 5, 21, 15);
		Q1statuspanel_4.add(btn_Q7Question4);

		btn_Q7Question5 = new JButton("");
		btn_Q7Question5.setBackground(Color.RED);
		btn_Q7Question5.setBounds(50, 25, 21, 15);
		Q1statuspanel_4.add(btn_Q7Question5);

		btn_Q7Question6 = new JButton("");
		btn_Q7Question6.setBackground(Color.RED);
		btn_Q7Question6.setBounds(75, 25, 21, 15);
		Q1statuspanel_4.add(btn_Q7Question6);

		btn_Q7Question7 = new JButton("");
		btn_Q7Question7.setBackground(Color.RED);
		btn_Q7Question7.setBounds(100, 25, 21, 15);
		Q1statuspanel_4.add(btn_Q7Question7);

		btn_Q7Question8 = new JButton("");
		btn_Q7Question8.setBackground(Color.RED);
		btn_Q7Question8.setBounds(125, 25, 21, 15);
		Q1statuspanel_4.add(btn_Q7Question8);

		btn_Question7 = new JButton("Q7");
		btn_Question7.addActionListener(this);
		btn_Question7.setVerticalTextPosition(SwingConstants.CENTER);
		btn_Question7.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Question7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn_Question7.setBounds(5, 5, 40, 35);
		Q1statuspanel_4.add(btn_Question7);

		JPanel Q1statuspanel_7 = new JPanel();
		Q1statuspanel_7.setLayout(null);
		Q1statuspanel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		Q1statuspanel_7.setBounds(10, 398, 178, 46);
		Statuspanel.add(Q1statuspanel_7);

		btn_Q8Question1 = new JButton("");
		btn_Q8Question1.setBackground(Color.RED);
		btn_Q8Question1.setBounds(50, 5, 21, 15);
		Q1statuspanel_7.add(btn_Q8Question1);

		btn_Q8Question2 = new JButton("");
		btn_Q8Question2.setBackground(Color.RED);
		btn_Q8Question2.setBounds(75, 5, 21, 15);
		Q1statuspanel_7.add(btn_Q8Question2);

		btn_Q8Question3 = new JButton("");
		btn_Q8Question3.setBackground(Color.RED);
		btn_Q8Question3.setBounds(50, 25, 21, 15);
		Q1statuspanel_7.add(btn_Q8Question3);

		btn_Q8Question4 = new JButton("");
		btn_Q8Question4.setBounds(75, 25, 21, 15);
		btn_Q8Question4.setBackground(Color.RED);
		Q1statuspanel_7.add(btn_Q8Question4);

		btn_Question8 = new JButton("Q8");
		btn_Question8.addActionListener(this);
		btn_Question8.setVerticalTextPosition(SwingConstants.CENTER);
		btn_Question8.setHorizontalTextPosition(SwingConstants.CENTER);
		btn_Question8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btn_Question8.setBounds(5, 5, 40, 35);
		Q1statuspanel_7.add(btn_Question8);

		getContentPane().add(QuetabbedPane);

		////// Q5 panel start
		JPanel Q5panel = new JPanel();
		Q5panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JScrollPane Q5scroll = new JScrollPane(Q5panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JPanel panelQ5_1 = new JPanel();
		panelQ5_1.setLayout(null);
		panelQ5_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_1_1 = new JLabel("Q 1");
		LabelQ4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_1_1.setBounds(10, 21, 42, 62);
		panelQ5_1.add(LabelQ4_1_1);

		Q5Question1 = new JLabel("New label");
		Q5Question1.setBounds(62, 21, 709, 62);
		panelQ5_1.add(Q5Question1);

		panelA5_1 = new JPanel();
		panelA5_1.setLayout(null);
		panelA5_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JPanel panelQ5_2 = new JPanel();
		panelQ5_2.setLayout(null);
		panelQ5_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ4_1_1_1 = new JLabel("Q 2");
		LabelQ4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ4_1_1_1.setBounds(10, 21, 42, 62);
		panelQ5_2.add(LabelQ4_1_1_1);

		Q5Question2 = new JLabel("New label");
		Q5Question2.setBounds(62, 21, 709, 62);
		panelQ5_2.add(Q5Question2);

		panelA5_2 = new JPanel();
		panelA5_2.setLayout(null);
		panelA5_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		////
		btn_Q5_submit = new JButton("Submit");
		btn_Q5_submit.addActionListener(this);
		btn_Q5_submit.setBounds(51, 455, 89, 23);

		////

		GroupLayout gl_Q5panel = new GroupLayout(Q5panel);
		gl_Q5panel.setHorizontalGroup(gl_Q5panel.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				gl_Q5panel.createSequentialGroup().addContainerGap().addGroup(gl_Q5panel
						.createParallelGroup(Alignment.LEADING).addComponent(btn_Q5_submit, Alignment.CENTER)
						.addGroup(Alignment.TRAILING, gl_Q5panel.createSequentialGroup()
								.addGroup(gl_Q5panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(panelA5_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 781,
												Short.MAX_VALUE)
										.addComponent(panelQ5_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 781,
												Short.MAX_VALUE)
										.addComponent(panelA5_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 781,
												Short.MAX_VALUE)
										.addComponent(panelQ5_1, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE))
								.addContainerGap()))));
		gl_Q5panel.setVerticalGroup(gl_Q5panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Q5panel.createSequentialGroup().addContainerGap()
						.addComponent(panelQ5_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA5_1, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ5_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA5_2, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_Q5_submit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, Short.MAX_VALUE)));

		Q5Question2_Option1 = new JCheckBox("New check box");
		Q5Question2_Option1.setBounds(62, 7, 697, 23);
		Q5Question2_Option1.addActionListener(this);
		panelA5_2.add(Q5Question2_Option1);

		Q5Question2_Option2 = new JCheckBox("New check box");
		Q5Question2_Option2.setBounds(62, 33, 697, 23);
		Q5Question2_Option2.addActionListener(this);
		panelA5_2.add(Q5Question2_Option2);

		Q5Question2_Option3 = new JCheckBox("New check box");
		Q5Question2_Option3.setBounds(62, 59, 697, 23);
		Q5Question2_Option3.addActionListener(this);
		panelA5_2.add(Q5Question2_Option3);

		Q5Question2_Option4 = new JCheckBox("New check box");
		Q5Question2_Option4.setBounds(62, 85, 697, 23);
		Q5Question2_Option4.addActionListener(this);
		panelA5_2.add(Q5Question2_Option4);

		Q5Question2_Option5 = new JCheckBox("New check box");
		Q5Question2_Option5.setBounds(62, 111, 697, 23);
		Q5Question2_Option5.addActionListener(this);
		panelA5_2.add(Q5Question2_Option5);

		Q5Question2_Option6 = new JCheckBox("New check box");
		Q5Question2_Option6.setBounds(62, 137, 697, 23);
		Q5Question2_Option6.addActionListener(this);
		panelA5_2.add(Q5Question2_Option6);

		Q5Question1_Option1 = new JCheckBox("New check box");
		Q5Question1_Option1.setBounds(62, 7, 697, 23);
		Q5Question1_Option1.addActionListener(this);
		panelA5_1.add(Q5Question1_Option1);

		Q5Question1_Option2 = new JCheckBox("New check box");
		Q5Question1_Option2.setBounds(62, 33, 697, 23);
		Q5Question1_Option2.addActionListener(this);
		panelA5_1.add(Q5Question1_Option2);

		Q5Question1_Option3 = new JCheckBox("New check box");
		Q5Question1_Option3.setBounds(62, 59, 697, 23);
		Q5Question1_Option3.addActionListener(this);
		panelA5_1.add(Q5Question1_Option3);

		Q5Question1_Option4 = new JCheckBox("New check box");
		Q5Question1_Option4.setBounds(62, 85, 697, 23);
		Q5Question1_Option4.addActionListener(this);
		panelA5_1.add(Q5Question1_Option4);

		Q5Question1_Option5 = new JCheckBox("New check box");
		Q5Question1_Option5.setBounds(62, 111, 697, 23);
		Q5Question1_Option5.addActionListener(this);
		panelA5_1.add(Q5Question1_Option5);

		Q5Question1_Option6 = new JCheckBox("New check box");
		Q5Question1_Option6.setBounds(62, 137, 697, 23);
		Q5Question1_Option6.addActionListener(this);
		panelA5_1.add(Q5Question1_Option6);
		Q5panel.setLayout(gl_Q5panel);
		QuetabbedPane.addTab("Question 5", null, Q5scroll, null);
		//// Q6 panel start

		JPanel Q6panel = new JPanel();
		JScrollPane Q6scroll = new JScrollPane(Q6panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		panel_11 = new JPanel();
		panel_11.setBackground(new Color(240, 240, 240));

		JPanel panel_12 = new JPanel();
		///
		btn_Q6_submit = new JButton("Submit");
		btn_Q6_submit.addActionListener(this);
		btn_Q6_submit.setBounds(51, 455, 89, 23);
		////
		GroupLayout gl_Q6panel = new GroupLayout(Q6panel);
		gl_Q6panel.setHorizontalGroup(gl_Q6panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q6panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_Q6panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_11, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
								.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
								.addGroup(gl_Q6panel.createSequentialGroup().addGap(351).addComponent(btn_Q6_submit,
										GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		gl_Q6panel.setVerticalGroup(gl_Q6panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q6panel.createSequentialGroup().addContainerGap()
						.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(panel_12, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_Q6_submit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGap(30)));
		panel_12.setLayout(null);

		JLabel lblNewLabel_12 = new JLabel("Answer :-");
		lblNewLabel_12.setBounds(10, 22, 86, 14);
		panel_12.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("A:-");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(33, 65, 46, 14);
		panel_12.add(lblNewLabel_13);

		JLabel lblNewLabel_13_1 = new JLabel("B:-");
		lblNewLabel_13_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_1.setBounds(33, 96, 46, 14);
		panel_12.add(lblNewLabel_13_1);

		JLabel lblNewLabel_13_2 = new JLabel("C:-");
		lblNewLabel_13_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_2.setBounds(33, 130, 46, 14);
		panel_12.add(lblNewLabel_13_2);

		JLabel lblNewLabel_13_3 = new JLabel("D:-");
		lblNewLabel_13_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13_3.setBounds(33, 167, 46, 14);
		panel_12.add(lblNewLabel_13_3);

		txt_Q6Option1 = new JTextField();
		txt_Q6Option1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_Q6Option1.setDocument(new JTextFieldLimit(1));
		txt_Q6Option1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String text = txt_Q6Option1.getText();
				if (text.length() == 1) {
					txt_Q6Option2.requestFocus();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					Toolkit.getDefaultToolkit().beep();
					e.consume();
				}

			}
		});

		txt_Q6Option1.setBounds(81, 62, 86, 20);
		panel_12.add(txt_Q6Option1);
		txt_Q6Option1.setColumns(10);

		txt_Q6Option2 = new JTextField();
		txt_Q6Option2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_Q6Option2.setDocument(new JTextFieldLimit(1));
		txt_Q6Option2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String text = txt_Q6Option2.getText();
				if (text.length() == 1) {
					txt_Q6Option3.requestFocus();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					Toolkit.getDefaultToolkit().beep();
					e.consume();
				}
			}
		});
		txt_Q6Option2.setBounds(81, 93, 86, 20);
		panel_12.add(txt_Q6Option2);
		txt_Q6Option2.setColumns(10);

		txt_Q6Option3 = new JTextField();
		txt_Q6Option3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_Q6Option3.setDocument(new JTextFieldLimit(1));
		txt_Q6Option3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e1) {
				String text3 = txt_Q6Option3.getText();
				if (text3.length() == 1) {
					txt_Q6Option4.requestFocus();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					Toolkit.getDefaultToolkit().beep();
					e.consume();
				}
			}
		});
		txt_Q6Option3.setBounds(81, 127, 86, 20);
		panel_12.add(txt_Q6Option3);
		txt_Q6Option3.setColumns(10);

		txt_Q6Option4 = new JTextField();
		txt_Q6Option4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_Q6Option4.setDocument(new JTextFieldLimit(1));
		txt_Q6Option4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e1) {
				String text4 = txt_Q6Option4.getText();
				if (text4.length() == 1) {

				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
					Toolkit.getDefaultToolkit().beep();
					e.consume();
				}
			}
		});
		txt_Q6Option4.setBounds(81, 164, 86, 20);
		panel_12.add(txt_Q6Option4);
		txt_Q6Option4.setColumns(10);
		panel_11.setLayout(null);

		Q6Question1 = new JLabel();
		Q6Question1.setBounds(10, 11, 387, 14);
		panel_11.add(Q6Question1);

		Q6Question1_OptionA = new JLabel();
		Q6Question1_OptionA.setBounds(33, 51, 264, 35);
		panel_11.add(Q6Question1_OptionA);

		Q6Question1_OptionB = new JLabel();
		Q6Question1_OptionB.setBounds(33, 88, 264, 35);
		panel_11.add(Q6Question1_OptionB);

		Q6Question1_OptionC = new JLabel();
		Q6Question1_OptionC.setBounds(33, 128, 264, 35);
		panel_11.add(Q6Question1_OptionC);

		Q6Question1_OptionD = new JLabel();
		Q6Question1_OptionD.setBounds(33, 164, 264, 43);
		panel_11.add(Q6Question1_OptionD);

		Q6Question1_Option1 = new JLabel();
		Q6Question1_Option1.setBounds(307, 51, 332, 35);
		panel_11.add(Q6Question1_Option1);

		Q6Question1_Option2 = new JLabel();
		Q6Question1_Option2.setBounds(307, 88, 332, 35);
		panel_11.add(Q6Question1_Option2);

		Q6Question1_Option3 = new JLabel();
		Q6Question1_Option3.setBounds(307, 128, 332, 35);
		panel_11.add(Q6Question1_Option3);

		Q6Question1_Option4 = new JLabel();
		Q6Question1_Option4.setBounds(307, 164, 332, 43);
		panel_11.add(Q6Question1_Option4);
		Q6panel.setLayout(gl_Q6panel);
		QuetabbedPane.addTab("Question 6", null, Q6scroll, null);

		//// Q7 panel start

		JPanel Q7panel = new JPanel();
		Q7panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JScrollPane Q7scroll = new JScrollPane(Q7panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JPanel panelQ7_1 = new JPanel();
		panelQ7_1.setLayout(null);
		panelQ7_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ7_1 = new JLabel("Q 1");
		LabelQ7_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7_1.setBounds(10, 21, 42, 62);
		panelQ7_1.add(LabelQ7_1);

		txt_Q7Question1 = new JLabel("New label");
		txt_Q7Question1.setBounds(45, 0, 732, 102);
		panelQ7_1.add(txt_Q7Question1);
		///// Answer1
		JPanel panelA7_1 = new JPanel();
		ans_Q7Question1 = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(ans_Q7Question1);
		scrollPane.setBounds(57, 11, 712, 183);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelA7_1.add(scrollPane);

		panelA7_1.setLayout(null);
		panelA7_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelA7_1 = new JLabel("Ans:-");
		LabelA7_1.setBounds(11, 71, 42, 62);
		LabelA7_1.setHorizontalAlignment(SwingConstants.CENTER);
		panelA7_1.add(LabelA7_1);
		////

		JPanel panelQ7_2 = new JPanel();
		panelQ7_2.setLayout(null);
		panelQ7_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ7_2 = new JLabel("Q 2");
		LabelQ7_2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7_2.setBounds(10, 21, 42, 62);
		panelQ7_2.add(LabelQ7_2);

		txt_Q7Question2 = new JLabel("New label");
		txt_Q7Question2.setBounds(41, 0, 736, 102);
		panelQ7_2.add(txt_Q7Question2);
		////
		JPanel panelA1_2 = new JPanel();
		ans_Q7Question2 = new JTextArea();
		JScrollPane scrollPane1 = new JScrollPane(ans_Q7Question2);
		scrollPane1.setBounds(57, 11, 710, 183);
		scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelA1_2.add(scrollPane1);

		panelA1_2.setLayout(null);
		panelA1_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelA7_2 = new JLabel("Ans:-");
		LabelA7_2.setBounds(11, 71, 42, 62);
		LabelA7_2.setHorizontalAlignment(SwingConstants.CENTER);
		panelA1_2.add(LabelA7_2);
		////
		JPanel panelQ7_3 = new JPanel();
		panelQ7_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelQ7_3.setLayout(null);

		JLabel LabelQ7_3 = new JLabel("Q 3");
		LabelQ7_3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7_3.setBounds(10, 21, 42, 62);
		panelQ7_3.add(LabelQ7_3);

		txt_Q7Question3 = new JLabel("New label");
		txt_Q7Question3.setBounds(62, 21, 693, 62);
		panelQ7_3.add(txt_Q7Question3);
		////
		JPanel panelA1_3 = new JPanel();
		ans_Q7Question3 = new JTextArea();
		JScrollPane scrollPane2 = new JScrollPane(ans_Q7Question3);
		scrollPane2.setBounds(57, 11, 697, 183);
		scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelA1_3.add(scrollPane2);

		panelA1_3.setLayout(null);
		panelA1_3.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelA7_3 = new JLabel("Ans:-");
		LabelA7_3.setBounds(11, 71, 42, 62);
		LabelA7_3.setHorizontalAlignment(SwingConstants.CENTER);
		panelA1_3.add(LabelA7_3);
		////

		JPanel panelQ7_4 = new JPanel();
		panelQ7_4.setLayout(null);
		panelQ7_4.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ7_4 = new JLabel("Q 4");
		LabelQ7_4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7_4.setBounds(10, 21, 42, 62);
		panelQ7_4.add(LabelQ7_4);

		txt_Q7Question4 = new JLabel("New label");
		txt_Q7Question4.setBounds(62, 21, 693, 62);
		panelQ7_4.add(txt_Q7Question4);
		////
		JPanel panelA1_4 = new JPanel();
		ans_Q7Question4 = new JTextArea();
		JScrollPane scrollPane3 = new JScrollPane(ans_Q7Question4);
		scrollPane3.setBounds(57, 11, 697, 183);
		scrollPane3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelA1_4.add(scrollPane3);

		panelA1_4.setLayout(null);
		panelA1_4.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelA7_4 = new JLabel("Ans:-");
		LabelA7_4.setBounds(11, 71, 42, 62);
		LabelA7_4.setHorizontalAlignment(SwingConstants.CENTER);
		panelA1_4.add(LabelA7_4);
		////
		JPanel panelQ7_5 = new JPanel();
		panelQ7_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelQ7_5.setLayout(null);

		JLabel LabelQ7_5 = new JLabel("Q 5");
		LabelQ7_5.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7_5.setBounds(10, 21, 42, 62);
		panelQ7_5.add(LabelQ7_5);

		txt_Q7Question5 = new JLabel("New label");
		txt_Q7Question5.setBounds(62, 21, 693, 62);
		panelQ7_5.add(txt_Q7Question5);
		////
		JPanel panelA1_5 = new JPanel();
		ans_Q7Question5 = new JTextArea();
		JScrollPane scrollPane4 = new JScrollPane(ans_Q7Question5);
		scrollPane4.setBounds(57, 11, 697, 183);
		scrollPane4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelA1_5.add(scrollPane4);

		panelA1_5.setLayout(null);
		panelA1_5.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelA7_5 = new JLabel("Ans:-");
		LabelA7_5.setBounds(11, 71, 42, 62);
		LabelA7_5.setHorizontalAlignment(SwingConstants.CENTER);
		panelA1_5.add(LabelA7_5);
		////
		JPanel panelQ7_6 = new JPanel();
		panelQ7_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelQ7_6.setLayout(null);

		JLabel LabelQ7_6 = new JLabel("Q 6");
		LabelQ7_6.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7_6.setBounds(10, 21, 42, 62);
		panelQ7_6.add(LabelQ7_6);

		txt_Q7Question6 = new JLabel("New label");
		txt_Q7Question6.setBounds(62, 21, 693, 62);
		panelQ7_6.add(txt_Q7Question6);
		////
		JPanel panelA1_6 = new JPanel();
		ans_Q7Question6 = new JTextArea();
		JScrollPane scrollPane5 = new JScrollPane(ans_Q7Question6);
		scrollPane5.setBounds(57, 11, 697, 183);
		scrollPane5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelA1_6.add(scrollPane5);

		panelA1_6.setLayout(null);
		panelA1_6.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelA7_6 = new JLabel("Ans:-");
		LabelA7_6.setBounds(11, 71, 42, 62);
		LabelA7_6.setHorizontalAlignment(SwingConstants.CENTER);
		panelA1_6.add(LabelA7_6);
		////

		JPanel panelQ7_7 = new JPanel();
		panelQ7_7.setLayout(null);
		panelQ7_7.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ7_7 = new JLabel("Q 7");
		LabelQ7_7.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7_7.setBounds(10, 21, 42, 62);
		panelQ7_7.add(LabelQ7_7);

		txt_Q7Question7 = new JLabel("New label");
		txt_Q7Question7.setBounds(62, 21, 693, 62);
		panelQ7_7.add(txt_Q7Question7);
		////
		JPanel panelA1_7 = new JPanel();
		ans_Q7Question7 = new JTextArea();
		JScrollPane scrollPane6 = new JScrollPane(ans_Q7Question7);
		scrollPane6.setBounds(57, 11, 697, 183);
		scrollPane6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelA1_7.add(scrollPane6);

		panelA1_7.setLayout(null);
		panelA1_7.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelA7_7 = new JLabel("Ans:-");
		LabelA7_7.setBounds(11, 71, 42, 62);
		LabelA7_7.setHorizontalAlignment(SwingConstants.CENTER);
		panelA1_7.add(LabelA7_7);
		////
		JPanel panelQ7_8 = new JPanel();
		panelQ7_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelQ7_8.setLayout(null);

		JLabel LabelQ7_8 = new JLabel("Q 8");
		LabelQ7_8.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ7_8.setBounds(10, 21, 42, 62);
		panelQ7_8.add(LabelQ7_8);

		txt_Q7Question8 = new JLabel("New label");
		txt_Q7Question8.setBounds(62, 21, 693, 62);
		panelQ7_8.add(txt_Q7Question8);
		////
		JPanel panelA1_8 = new JPanel();
		ans_Q7Question8 = new JTextArea();
		JScrollPane scrollPane7 = new JScrollPane(ans_Q7Question8);
		scrollPane7.setBounds(57, 11, 697, 183);
		scrollPane7.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelA1_8.add(scrollPane7);

		panelA1_8.setLayout(null);
		panelA1_8.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelA7_8 = new JLabel("Ans:-");
		LabelA7_8.setBounds(11, 71, 42, 62);
		LabelA7_8.setHorizontalAlignment(SwingConstants.CENTER);
		panelA1_8.add(LabelA7_8);
		////
		btn_Q7_submit = new JButton("Submit");
		btn_Q7_submit.addActionListener(this);
		btn_Q7_submit.setBounds(51, 455, 89, 23);

		GroupLayout gl_Q7panel = new GroupLayout(Q7panel);
		gl_Q7panel.setHorizontalGroup(gl_Q7panel.createParallelGroup(Alignment.LEADING).addGroup(gl_Q7panel
				.createSequentialGroup()
				.addGroup(gl_Q7panel.createParallelGroup(Alignment.LEADING).addGroup(gl_Q7panel.createSequentialGroup()
						.addGap(8)
						.addGroup(gl_Q7panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panelQ7_1, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA7_1, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ7_2, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA1_2, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ7_3, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA1_3, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ7_4, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA1_4, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ7_5, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA1_5, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ7_6, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA1_6, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ7_7, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA1_7, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ7_8, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA1_8, GroupLayout.PREFERRED_SIZE, 777, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_Q7_submit, Alignment.CENTER)

						))).addGap(64)));
		gl_Q7panel.setVerticalGroup(gl_Q7panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q7panel.createSequentialGroup().addGap(9)
						.addComponent(panelQ7_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE).addGap(11)
						.addComponent(panelA7_1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ7_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA1_2, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ7_3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA1_3, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ7_4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA1_4, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ7_5, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA1_5, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ7_6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA1_6, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ7_7, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA1_7, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ7_8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA1_8, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_Q7_submit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, Short.MAX_VALUE)));

		Q7panel.setLayout(gl_Q7panel);
		QuetabbedPane.addTab("Question 7", null, Q7scroll, null);
		// Q8 panel start

		JPanel Q8panel = new JPanel();
		Q8panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		JScrollPane Q8scroll = new JScrollPane(Q8panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		////
		JPanel panelQ8_1 = new JPanel();
		panelQ8_1.setLayout(null);
		panelQ8_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ8_1 = new JLabel("Q8-A");
		LabelQ8_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ8_1.setBounds(10, 21, 42, 62);
		panelQ8_1.add(LabelQ8_1);

		txt_Q8Question1 = new JLabel("New label");
		txt_Q8Question1.setBounds(62, 21, 693, 62);
		panelQ8_1.add(txt_Q8Question1);
		///
		JPanel panelA8_1 = new JPanel();
		panelA8_1.setLayout(null);
		panelA8_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		ans_Q8Question1 = new JTextArea();
		JScrollPane scrollPane_1 = new JScrollPane(ans_Q8Question1);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(57, 11, 697, 203);
		panelA8_1.add(scrollPane_1);

		JLabel LabelA8_1 = new JLabel("Ans:-");
		LabelA8_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelA8_1.setBounds(11, 71, 42, 62);
		panelA8_1.add(LabelA8_1);
		////
		JPanel panelQ8_2 = new JPanel();
		panelQ8_2.setLayout(null);
		panelQ8_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ8_1_1 = new JLabel("Q8-A");
		LabelQ8_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ8_1_1.setBounds(10, 21, 42, 62);
		panelQ8_2.add(LabelQ8_1_1);

		txt_Q8Question2 = new JLabel("New label");
		txt_Q8Question2.setBounds(62, 21, 693, 62);
		panelQ8_2.add(txt_Q8Question2);
		///
		JPanel panelA8_2 = new JPanel();
		panelA8_2.setLayout(null);
		panelA8_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		ans_Q8Question2 = new JTextArea();
		JScrollPane scrollPane_2 = new JScrollPane(ans_Q8Question2);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(57, 11, 697, 203);
		panelA8_2.add(scrollPane_2);

		JLabel LabelA8_2 = new JLabel("Ans:-");
		LabelA8_2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelA8_2.setBounds(11, 71, 42, 62);
		panelA8_2.add(LabelA8_2);
		////
		////
		JPanel panelQ8_3 = new JPanel();
		panelQ8_3.setLayout(null);
		panelQ8_3.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ8_3 = new JLabel("Q8-B");
		LabelQ8_3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ8_3.setBounds(10, 21, 42, 62);
		panelQ8_3.add(LabelQ8_3);

		txt_Q8Question3 = new JLabel("New label");
		txt_Q8Question3.setBounds(62, 21, 693, 62);
		panelQ8_3.add(txt_Q8Question3);
		///
		JPanel panelA8_3 = new JPanel();
		panelA8_3.setLayout(null);
		panelA8_3.setBorder(new LineBorder(new Color(0, 0, 0)));

		ans_Q8Question3 = new JTextArea();
		JScrollPane scrollPane_3 = new JScrollPane(ans_Q8Question3);
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setBounds(57, 11, 697, 203);
		panelA8_3.add(scrollPane_3);

		JLabel LabelA8_3 = new JLabel("Ans:-");
		LabelA8_3.setHorizontalAlignment(SwingConstants.CENTER);
		LabelA8_3.setBounds(11, 71, 42, 62);
		panelA8_3.add(LabelA8_3);
		////
		JPanel panelQ8_4 = new JPanel();
		panelQ8_4.setLayout(null);
		panelQ8_4.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel LabelQ8_1_4 = new JLabel("Q8-B");
		LabelQ8_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelQ8_1_4.setBounds(10, 21, 42, 62);
		panelQ8_4.add(LabelQ8_1_4);

		txt_Q8Question4 = new JLabel("New label");
		txt_Q8Question4.setBounds(62, 21, 693, 62);
		panelQ8_4.add(txt_Q8Question4);
		///
		JPanel panelA8_4 = new JPanel();
		panelA8_4.setLayout(null);
		panelA8_4.setBorder(new LineBorder(new Color(0, 0, 0)));

		ans_Q8Question4 = new JTextArea();
		JScrollPane scrollPane_4 = new JScrollPane(ans_Q8Question4);
		scrollPane_4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_4.setBounds(57, 11, 697, 203);
		panelA8_4.add(scrollPane_4);

		JLabel LabelA8_4 = new JLabel("Ans:-");
		LabelA8_4.setHorizontalAlignment(SwingConstants.CENTER);
		LabelA8_4.setBounds(11, 71, 42, 62);
		panelA8_4.add(LabelA8_4);
		////
		btn_Q8_submit = new JButton("Submit");
		btn_Q8_submit.addActionListener(this);
		btn_Q8_submit.setBounds(51, 455, 89, 23);

		GroupLayout gl_Q8panel = new GroupLayout(Q8panel);
		gl_Q8panel.setHorizontalGroup(gl_Q8panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q8panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_Q8panel.createParallelGroup(Alignment.LEADING)
								.addComponent(panelA8_1, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ8_1, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ8_2, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA8_2, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA8_3, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ8_3, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelQ8_4, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
								.addComponent(panelA8_4, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_Q8_submit, Alignment.CENTER))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_Q8panel.setVerticalGroup(gl_Q8panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Q8panel.createSequentialGroup().addContainerGap()
						.addComponent(panelQ8_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA8_1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ8_2, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelA8_2, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ8_3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelA8_3, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panelQ8_4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelA8_4, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btn_Q8_submit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, Short.MAX_VALUE)));
		Q8panel.setLayout(gl_Q8panel);
		QuetabbedPane.addTab("Question 8", null, Q8scroll, null);

		// setting question paper
		try {
			StringBuilder content = new StringBuilder();
			// paper
			
			String URL = common
					.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
							common.Get_Index_No().toString().substring(2, 4))
					.replace("Exam/", "") + "TXT/" + login_details.Paper_ID + ".txt";
			
			URL url = new URL(URL);
			URLConnection urlConnection = url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;
			// reading from the urlconnection using the bufferedreader
			while ((line = bufferedReader.readLine()) != null) {
				content.append(line.replace("ï»¿", ""));
			}
			bufferedReader.close();
			// System.out.println(content);
			LoadQuestionPaper(content.toString());
			// Disable_Controller();
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");

			JLabel lblNewLabel = new JLabel("Ans File Size");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(765, 48, 80, 14);
			infopanel.add(lblNewLabel);

		} catch (MalformedURLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	public void Get_Server_Time(Login_Model model) {

		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(""))
				.header("Content-Type", "application/json")
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 4)) + "getservertime"))
				.build();

		HttpResponse<String> respons;
		try {
			respons = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			Response_Model datetime_model = gson.fromJson(respons.body(), Response_Model.class);

			if (datetime_model.Result.equals("Success")) {
				int HOUR = Integer.parseInt(datetime_model.Responce.HR),
						MINUTE = Integer.parseInt(datetime_model.Responce.MIN),
						SECOND = Integer.parseInt(datetime_model.Responce.SEC);
				String sysUIFormat = datetime_model.Responce.AMPM;

				if (sysUIFormat.equals("PM")) {
					if (HOUR >= 12) {

					} else {
						HOUR = HOUR + 12;
					}
				}

				LocalTime Exam_Time = LocalTime.now();
				LocalTime Server_Time = LocalTime.of(HOUR, MINUTE, SECOND);

				if (login_details.Session.equals("Morning")) {
					Exam_Time = LocalTime.of(13, 40, 00);

				} else if (login_details.Session.equals("Afternoon")) {
					Exam_Time = LocalTime.of(17, 40, 00);
				}
				/*
				 * if (!login_details.Hand.trim().equals("00") || login_details.Hand.trim() !=
				 * null) { //TimeLeft = TimeLeft + TimeSpan.Parse("00:50:00"); } int
				 * i=Server_Time.getMinute(); System.out.println(i); Exam_Time.plusMinutes(50);
				 * }
				 */
			
				long hours = ChronoUnit.HOURS.between(Server_Time, Exam_Time);
				long minutes = ChronoUnit.MINUTES.between(Server_Time, Exam_Time) % 60;
				long seconds = ChronoUnit.SECONDS.between(Server_Time, Exam_Time) % 60;
				Exam_Time = LocalTime.of((int) hours, (int) minutes, (int) seconds);

				Exam_Time System = new Exam_Time(Exam_Time);
				new Thread(System).start();

			} else {
				common.ShowMessage(null, "Unable To Connect Server Retry !!!");
				System.exit(0);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Relogin(Login_Model login) {
		System.out.println("Relogin");
		Gson gson = new Gson();
		String json = gson.toJson(login);
				HttpClient httpclient = HttpClient.newBuilder().build();
		HttpRequest httprequest = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "Application/json")
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 4)) + "Relogin"))
				.build();

		try {
			HttpResponse<String> respons = httpClient.send(httprequest, HttpResponse.BodyHandlers.ofString());
			// System.out.println(respons.body());
			
			Answer_Model answer_model = gson.fromJson(respons.body(), Answer_Model.class);
			System.out.println(respons.body());
			// Question1
			if (answer_model.Answer1 != null) {
				//
				ans_Q1Question1.setText(answer_model.Answer1.Q1Ans1);
				if (!ans_Q1Question1.getText().isEmpty()) {
					btn_Q1Question1.setBackground(Colour_Green);
				} else {
					btn_Q1Question1.setBackground(Color.red);
				}

				//
				ans_Q1Question2.setText(answer_model.Answer1.Q1Ans2);
				if (!ans_Q1Question2.getText().isEmpty()) {
					btn_Q1Question2.setBackground(Colour_Green);
				} else {
					btn_Q1Question2.setBackground(Color.red);
				}

				//
				ans_Q1Question3.setText(answer_model.Answer1.Q1Ans3);
				if (!ans_Q1Question3.getText().isEmpty()) {
					btn_Q1Question3.setBackground(Colour_Green);
				} else {
					btn_Q1Question3.setBackground(Color.red);
				}

				//
				ans_Q1Question4.setText(answer_model.Answer1.Q1Ans4);
				if (!ans_Q1Question4.getText().isEmpty()) {
					btn_Q1Question4.setBackground(Colour_Green);
				} else {
					btn_Q1Question4.setBackground(Color.red);
				}

				//
				ans_Q1Question5.setText(answer_model.Answer1.Q1Ans5);
				if (!ans_Q1Question5.getText().isEmpty()) {
					btn_Q1Question5.setBackground(Colour_Green);
				} else {
					btn_Q1Question5.setBackground(Color.red);
				}

				//
				ans_Q1Question6.setText(answer_model.Answer1.Q1Ans6);
				if (!ans_Q1Question6.getText().isEmpty()) {
					btn_Q1Question6.setBackground(Colour_Green);
				} else {
					btn_Q1Question6.setBackground(Color.red);
				}

				//
				ans_Q1Question7.setText(answer_model.Answer1.Q1Ans7);
				if (!ans_Q1Question7.getText().isEmpty()) {
					btn_Q1Question7.setBackground(Colour_Green);
				} else {
					btn_Q1Question7.setBackground(Color.red);
				}

				//
				ans_Q1Question8.setText(answer_model.Answer1.Q1Ans8);
				if (!ans_Q1Question8.getText().isEmpty()) {
					btn_Q1Question8.setBackground(Colour_Green);
				} else {
					btn_Q1Question8.setBackground(Color.red);
				}

				//
				ans_Q1Question9.setText(answer_model.Answer1.Q1Ans9);
				if (!ans_Q1Question9.getText().isEmpty()) {
					btn_Q1Question9.setBackground(Colour_Green);
				} else {
					btn_Q1Question9.setBackground(Color.red);
				}

				//
				ans_Q1Question10.setText(answer_model.Answer1.Q1Ans10);
				if (!ans_Q1Question10.getText().isEmpty()) {
					btn_Q1Question10.setBackground(Colour_Green);
				} else {
					btn_Q1Question10.setBackground(Color.red);
				}
			}

			// Question2
			if (answer_model.Answer2 != null) {
				//
				if (answer_model.Answer2.Q2Ans1.equals("True")) {
					ans_Q2Question1_radio1.setSelected(true);
					ans_Q2Question1_radio2.setSelected(false);
					btn_Q2Question1.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans1.equals("False")) {
					ans_Q2Question1_radio1.setSelected(false);
					ans_Q2Question1_radio2.setSelected(true);
					btn_Q2Question1.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans2.equals("True")) {
					ans_Q2Question2_radio1.setSelected(true);
					ans_Q2Question2_radio2.setSelected(false);
					btn_Q2Question2.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans2.equals("False")) {
					ans_Q2Question2_radio1.setSelected(false);
					ans_Q2Question2_radio2.setSelected(true);
					btn_Q2Question2.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans3.equals("True")) {
					ans_Q2Question3_radio1.setSelected(true);
					ans_Q2Question3_radio2.setSelected(false);
					btn_Q2Question3.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans3.equals("False")) {
					ans_Q2Question3_radio1.setSelected(false);
					ans_Q2Question3_radio2.setSelected(true);
					btn_Q2Question3.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans4.equals("True")) {
					ans_Q2Question4_radio1.setSelected(true);
					ans_Q2Question4_radio2.setSelected(false);
					btn_Q2Question4.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans4.equals("False")) {
					ans_Q2Question4_radio1.setSelected(false);
					ans_Q2Question4_radio2.setSelected(true);
					btn_Q2Question4.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans5.equals("True")) {
					ans_Q2Question5_radio1.setSelected(true);
					ans_Q2Question5_radio2.setSelected(false);
					btn_Q2Question5.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans5.equals("False")) {
					ans_Q2Question5_radio1.setSelected(false);
					ans_Q2Question5_radio2.setSelected(true);
					btn_Q2Question5.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans6.equals("True")) {
					ans_Q2Question6_radio1.setSelected(true);
					ans_Q2Question6_radio2.setSelected(false);
					btn_Q2Question6.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans6.equals("False")) {
					ans_Q2Question6_radio1.setSelected(false);
					ans_Q2Question6_radio2.setSelected(true);
					btn_Q2Question6.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans7.equals("True")) {
					ans_Q2Question7_radio1.setSelected(true);
					ans_Q2Question7_radio2.setSelected(false);
					btn_Q2Question7.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans7.equals("False")) {
					ans_Q2Question7_radio1.setSelected(false);
					ans_Q2Question7_radio2.setSelected(true);
					btn_Q2Question7.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans8.equals("True")) {
					ans_Q2Question8_radio1.setSelected(true);
					ans_Q2Question8_radio2.setSelected(false);
					btn_Q2Question8.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans8.equals("False")) {
					ans_Q2Question8_radio1.setSelected(false);
					ans_Q2Question8_radio2.setSelected(true);
					btn_Q2Question8.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans9.equals("True")) {
					ans_Q2Question9_radio1.setSelected(true);
					ans_Q2Question9_radio2.setSelected(false);
					btn_Q2Question9.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans9.equals("False")) {
					ans_Q2Question9_radio1.setSelected(false);
					ans_Q2Question9_radio2.setSelected(true);
					btn_Q2Question9.setBackground(Colour_Green);
				}

				//
				if (answer_model.Answer2.Q2Ans10.equals("True")) {
					ans_Q2Question10_radio1.setSelected(true);
					ans_Q2Question10_radio2.setSelected(false);
					btn_Q2Question10.setBackground(Colour_Green);
				} else if (answer_model.Answer2.Q2Ans10.equals("False")) {
					ans_Q2Question10_radio1.setSelected(false);
					ans_Q2Question10_radio2.setSelected(true);
					btn_Q2Question10.setBackground(Colour_Green);
				}

			}

			// Question3
			if (answer_model.Answer3 != null) {
				//
				char[] characters1 = answer_model.Answer3.Q3Ans1 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans1.toCharArray();
				if (characters1.length == 4) {
					Q3Question1_Option1.setSelected((characters1[0] == '1') ? true : false);
					Q3Question1_Option2.setSelected((characters1[1] == '1') ? true : false);
					Q3Question1_Option3.setSelected((characters1[2] == '1') ? true : false);
					Q3Question1_Option4.setSelected((characters1[3] == '1') ? true : false);
					btn_Q3Question1.setBackground(Colour_Green);
				}

				//
				char[] characters2 = answer_model.Answer3.Q3Ans2 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans2.toCharArray();
				if (characters2.length == 4) {
					Q3Question2_Option1.setSelected((characters2[0] == '1') ? true : false);
					Q3Question2_Option2.setSelected((characters2[1] == '1') ? true : false);
					Q3Question2_Option3.setSelected((characters2[2] == '1') ? true : false);
					Q3Question2_Option4.setSelected((characters2[3] == '1') ? true : false);
					btn_Q3Question2.setBackground(Colour_Green);
				}

				//
				char[] characters3 = answer_model.Answer3.Q3Ans3 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans3.toCharArray();
				if (characters3.length == 4) {
					Q3Question3_Option1.setSelected((characters3[0] == '1') ? true : false);
					Q3Question3_Option2.setSelected((characters3[1] == '1') ? true : false);
					Q3Question3_Option3.setSelected((characters3[2] == '1') ? true : false);
					Q3Question3_Option4.setSelected((characters3[3] == '1') ? true : false);
					btn_Q3Question3.setBackground(Colour_Green);
				}

				//
				char[] characters4 = answer_model.Answer3.Q3Ans4 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans4.toCharArray();
				if (characters4.length == 4) {
					Q3Question4_Option1.setSelected((characters4[0] == '1') ? true : false);
					Q3Question4_Option2.setSelected((characters4[1] == '1') ? true : false);
					Q3Question4_Option3.setSelected((characters4[2] == '1') ? true : false);
					Q3Question4_Option4.setSelected((characters4[3] == '1') ? true : false);
					btn_Q3Question4.setBackground(Colour_Green);
				}

				//
				char[] characters5 = answer_model.Answer3.Q3Ans5 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans5.toCharArray();
				if (characters5.length == 4) {
					Q3Question5_Option1.setSelected((characters4[0] == '1') ? true : false);
					Q3Question5_Option2.setSelected((characters4[1] == '1') ? true : false);
					Q3Question5_Option3.setSelected((characters4[2] == '1') ? true : false);
					Q3Question5_Option4.setSelected((characters4[3] == '1') ? true : false);
					btn_Q3Question5.setBackground(Colour_Green);
				}

				//
				char[] characters6 = answer_model.Answer3.Q3Ans6 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans6.toCharArray();
				if (characters6.length == 4) {
					Q3Question6_Option1.setSelected((characters4[0] == '1') ? true : false);
					Q3Question6_Option2.setSelected((characters4[1] == '1') ? true : false);
					Q3Question6_Option3.setSelected((characters4[2] == '1') ? true : false);
					Q3Question6_Option4.setSelected((characters4[3] == '1') ? true : false);
					btn_Q3Question6.setBackground(Colour_Green);
				}

				//
				char[] characters7 = answer_model.Answer3.Q3Ans7 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans7.toCharArray();
				if (characters7.length == 4) {
					Q3Question7_Option1.setSelected((characters4[0] == '1') ? true : false);
					Q3Question7_Option2.setSelected((characters4[1] == '1') ? true : false);
					Q3Question7_Option3.setSelected((characters4[2] == '1') ? true : false);
					Q3Question7_Option4.setSelected((characters4[3] == '1') ? true : false);
					btn_Q3Question7.setBackground(Colour_Green);
				}

				//
				char[] characters8 = answer_model.Answer3.Q3Ans8 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans8.toCharArray();
				if (characters8.length == 4) {
					Q3Question8_Option1.setSelected((characters4[0] == '1') ? true : false);
					Q3Question8_Option2.setSelected((characters4[1] == '1') ? true : false);
					Q3Question8_Option3.setSelected((characters4[2] == '1') ? true : false);
					Q3Question8_Option4.setSelected((characters4[3] == '1') ? true : false);
					btn_Q3Question8.setBackground(Colour_Green);
				}

				//
				char[] characters9 = answer_model.Answer3.Q3Ans9 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans9.toCharArray();
				if (characters9.length == 4) {
					Q3Question9_Option1.setSelected((characters4[0] == '1') ? true : false);
					Q3Question9_Option2.setSelected((characters4[1] == '1') ? true : false);
					Q3Question9_Option3.setSelected((characters4[2] == '1') ? true : false);
					Q3Question9_Option4.setSelected((characters4[3] == '1') ? true : false);
					btn_Q3Question9.setBackground(Colour_Green);
				}

				//
				char[] characters10 = answer_model.Answer3.Q3Ans10 == null ? ("").toCharArray()
						: answer_model.Answer3.Q3Ans10.toCharArray();
				if (characters10.length == 4) {
					Q3Question10_Option1.setSelected((characters4[0] == '1') ? true : false);
					Q3Question10_Option2.setSelected((characters4[1] == '1') ? true : false);
					Q3Question10_Option3.setSelected((characters4[2] == '1') ? true : false);
					Q3Question10_Option4.setSelected((characters4[3] == '1') ? true : false);
					btn_Q3Question10.setBackground(Colour_Green);
				}
			}

			// Question4
			if (answer_model.Answer4 != null) {
				//
				char[] characters1 = answer_model.Answer4.Q4Ans1 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans1.toCharArray();
				if (characters1.length == 5) {
					Q4Question1_Option1.setSelected((characters1[0] == '1') ? true : false);
					Q4Question1_Option2.setSelected((characters1[1] == '1') ? true : false);
					Q4Question1_Option3.setSelected((characters1[2] == '1') ? true : false);
					Q4Question1_Option4.setSelected((characters1[3] == '1') ? true : false);
					Q4Question1_Option5.setSelected((characters1[4] == '1') ? true : false);
					btn_Q4Question1.setBackground(Colour_Green);
				}else {
					btn_Q4Question1.setBackground(Color.red);
				}
				
				//
				char[] characters2 = answer_model.Answer4.Q4Ans2 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans2.toCharArray();
				if (characters2.length == 5) {
					Q4Question2_Option1.setSelected((characters2[0] == '1') ? true : false);
					Q4Question2_Option2.setSelected((characters2[1] == '1') ? true : false);
					Q4Question2_Option3.setSelected((characters2[2] == '1') ? true : false);
					Q4Question2_Option4.setSelected((characters2[3] == '1') ? true : false);
					Q4Question2_Option5.setSelected((characters2[4] == '1') ? true : false);
					btn_Q4Question2.setBackground(Colour_Green);
				}
				

				//
				char[] characters3 = answer_model.Answer4.Q4Ans3 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans3.toCharArray();
				if (characters3.length == 5) {
					Q4Question3_Option1.setSelected((characters3[0] == '1') ? true : false);
					Q4Question3_Option2.setSelected((characters3[1] == '1') ? true : false);
					Q4Question3_Option3.setSelected((characters3[2] == '1') ? true : false);
					Q4Question3_Option4.setSelected((characters3[3] == '1') ? true : false);
					Q4Question3_Option5.setSelected((characters3[4] == '1') ? true : false);
					btn_Q4Question3.setBackground(Colour_Green);
				}
				

				//
				char[] characters4 = answer_model.Answer4.Q4Ans4 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans4.toCharArray();
				if (characters4.length == 5) {
					Q4Question4_Option1.setSelected((characters4[0] == '1') ? true : false);
					Q4Question4_Option2.setSelected((characters4[1] == '1') ? true : false);
					Q4Question4_Option3.setSelected((characters4[2] == '1') ? true : false);
					Q4Question4_Option4.setSelected((characters4[3] == '1') ? true : false);
					Q4Question4_Option5.setSelected((characters4[4] == '1') ? true : false);
					btn_Q4Question4.setBackground(Colour_Green);
				}
				

				//
				char[] characters5 = answer_model.Answer4.Q4Ans5 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans5.toCharArray();
				if (characters5.length == 5) {
					Q4Question5_Option1.setSelected((characters5[0] == '1') ? true : false);
					Q4Question5_Option2.setSelected((characters5[1] == '1') ? true : false);
					Q4Question5_Option3.setSelected((characters5[2] == '1') ? true : false);
					Q4Question5_Option4.setSelected((characters5[3] == '1') ? true : false);
					Q4Question5_Option5.setSelected((characters5[4] == '1') ? true : false);
					btn_Q4Question5.setBackground(Colour_Green);
				}
				

				//
				char[] characters6 = answer_model.Answer4.Q4Ans6 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans6.toCharArray();
				if (characters6.length == 5) {
					Q4Question6_Option1.setSelected((characters6[0] == '1') ? true : false);
					Q4Question6_Option2.setSelected((characters6[1] == '1') ? true : false);
					Q4Question6_Option3.setSelected((characters6[2] == '1') ? true : false);
					Q4Question6_Option4.setSelected((characters6[3] == '1') ? true : false);
					Q4Question6_Option5.setSelected((characters6[4] == '1') ? true : false);
					btn_Q4Question6.setBackground(Colour_Green);
				}
				

				//
				char[] characters7 = answer_model.Answer4.Q4Ans7 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans7.toCharArray();
				if (characters7.length == 5) {
					Q4Question7_Option1.setSelected((characters7[0] == '1') ? true : false);
					Q4Question7_Option2.setSelected((characters7[1] == '1') ? true : false);
					Q4Question7_Option3.setSelected((characters7[2] == '1') ? true : false);
					Q4Question7_Option4.setSelected((characters7[3] == '1') ? true : false);
					Q4Question7_Option5.setSelected((characters7[4] == '1') ? true : false);
					btn_Q4Question7.setBackground(Colour_Green);
				}
				

				//
				char[] characters8 = answer_model.Answer4.Q4Ans8 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans8.toCharArray();
				if (characters8.length == 5) {
					Q4Question8_Option1.setSelected((characters8[0] == '1') ? true : false);
					Q4Question8_Option2.setSelected((characters8[1] == '1') ? true : false);
					Q4Question8_Option3.setSelected((characters8[2] == '1') ? true : false);
					Q4Question8_Option4.setSelected((characters8[3] == '1') ? true : false);
					Q4Question8_Option5.setSelected((characters8[4] == '1') ? true : false);
					btn_Q4Question8.setBackground(Colour_Green);
				}
				

				//
				char[] characters9 = answer_model.Answer4.Q4Ans9 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans9.toCharArray();
				if (characters9.length == 5) {
					Q4Question9_Option1.setSelected((characters9[0] == '1') ? true : false);
					Q4Question9_Option2.setSelected((characters9[1] == '1') ? true : false);
					Q4Question9_Option3.setSelected((characters9[2] == '1') ? true : false);
					Q4Question9_Option4.setSelected((characters9[3] == '1') ? true : false);
					Q4Question9_Option5.setSelected((characters9[4] == '1') ? true : false);
					btn_Q4Question9.setBackground(Colour_Green);
				}
				

				//
				char[] characters10 = answer_model.Answer4.Q4Ans10 == null ? ("").toCharArray()
						: answer_model.Answer4.Q4Ans10.toCharArray();
				if (characters10.length == 5) {
					Q4Question10_Option1.setSelected((characters10[0] == '1') ? true : false);
					Q4Question10_Option2.setSelected((characters10[1] == '1') ? true : false);
					Q4Question10_Option3.setSelected((characters10[2] == '1') ? true : false);
					Q4Question10_Option4.setSelected((characters10[3] == '1') ? true : false);
					Q4Question10_Option5.setSelected((characters10[4] == '1') ? true : false);
					btn_Q4Question10.setBackground(Colour_Green);
				}
				

			}

			// Question5
			if (answer_model.Answer5 != null) {
				char[] characters1 = answer_model.Answer5.Q5Ans1 == null ? ("").toCharArray()
						: answer_model.Answer5.Q5Ans1.toCharArray();
				if (characters1.length == 6) {
					Q5Question1_Option1.setSelected((characters1[0] == '1') ? true : false);
					Q5Question1_Option2.setSelected((characters1[1] == '1') ? true : false);
					Q5Question1_Option3.setSelected((characters1[2] == '1') ? true : false);
					Q5Question1_Option4.setSelected((characters1[3] == '1') ? true : false);
					Q5Question1_Option5.setSelected((characters1[4] == '1') ? true : false);
					Q5Question1_Option6.setSelected((characters1[5] == '1') ? true : false);
					btn_Q5Question1.setBackground(Colour_Green);
				}

				char[] characters2 = answer_model.Answer5.Q5Ans1 == null ? ("").toCharArray()
						: answer_model.Answer5.Q5Ans1.toCharArray();
				if (characters2.length == 6) {
					Q5Question2_Option1.setSelected((characters2[0] == '1') ? true : false);
					Q5Question2_Option2.setSelected((characters2[1] == '1') ? true : false);
					Q5Question2_Option3.setSelected((characters2[2] == '1') ? true : false);
					Q5Question2_Option4.setSelected((characters2[3] == '1') ? true : false);
					Q5Question2_Option5.setSelected((characters2[4] == '1') ? true : false);
					Q5Question2_Option6.setSelected((characters2[5] == '1') ? true : false);
					btn_Q5Question2.setBackground(Colour_Green);
				}
			}

			// Question6
			
			String[] parts = answer_model.Answer6.Q6Ans1.split("");
			// Check if there are enough parts to set to all text boxes
			if (parts.length >= 4) {
			    // Set each part to the text property of the respective text boxes
			    txt_Q6Option1.setText(parts[0]);
			    txt_Q6Option2.setText(parts[1]);
			    txt_Q6Option3.setText(parts[2]);
			    txt_Q6Option4.setText(parts[3]);
			}
			
			/*
			 * txt_Q6Option1.setText(answer_model.Answer6.Q6Ans1);
			 * txt_Q6Option2.setText(answer_model.Answer6.Q6Ans1);
			 * txt_Q6Option3.setText(answer_model.Answer6.Q6Ans1);
			 * txt_Q6Option4.setText(answer_model.Answer6.Q6Ans1);
			 */

			if (!txt_Q6Option1.getText().isEmpty() || !txt_Q6Option2.getText().isEmpty()
					|| !txt_Q6Option3.getText().isEmpty() || !txt_Q6Option4.getText().isEmpty()) {
				btn_Q6Question1.setBackground(Colour_Green);
			} else {
				btn_Q6Question1.setBackground(Color.red);
			}

			// Question7
			ans_Q7Question1.setText(answer_model.Answer7.Q7Ans1);
			if (!ans_Q7Question1.getText().isEmpty()) {
				btn_Q7Question1.setBackground(Colour_Green);
			} else {
				btn_Q7Question1.setBackground(Color.red);
			}

			//
			ans_Q7Question2.setText(answer_model.Answer7.Q7Ans2);
			if (!ans_Q7Question2.getText().isEmpty()) {
				btn_Q7Question2.setBackground(Colour_Green);
			} else {
				btn_Q7Question2.setBackground(Color.red);
			}

			//
			ans_Q7Question3.setText(answer_model.Answer7.Q7Ans3);
			if (!ans_Q7Question3.getText().isEmpty()) {
				btn_Q7Question3.setBackground(Colour_Green);
			} else {
				btn_Q7Question3.setBackground(Color.red);
			}

			//
			ans_Q7Question4.setText(answer_model.Answer7.Q7Ans4);
			if (!ans_Q7Question4.getText().isEmpty()) {
				btn_Q7Question4.setBackground(Colour_Green);
			} else {
				btn_Q7Question4.setBackground(Color.red);
			}

			//
			ans_Q7Question5.setText(answer_model.Answer7.Q7Ans5);
			if (!ans_Q7Question5.getText().isEmpty()) {
				btn_Q7Question5.setBackground(Colour_Green);
			} else {
				btn_Q7Question5.setBackground(Color.red);
			}

			//
			ans_Q7Question6.setText(answer_model.Answer7.Q7Ans6);
			if (!ans_Q7Question6.getText().isEmpty()) {
				btn_Q7Question6.setBackground(Colour_Green);
			} else {
				btn_Q7Question6.setBackground(Color.red);
			}

			//
			ans_Q7Question7.setText(answer_model.Answer7.Q7Ans7);
			if (!ans_Q7Question7.getText().isEmpty()) {
				btn_Q7Question7.setBackground(Colour_Green);
			} else {
				btn_Q7Question7.setBackground(Color.red);
			}

			//
			ans_Q7Question8.setText(answer_model.Answer7.Q7Ans8);
			if (!ans_Q7Question8.getText().isEmpty()) {
				btn_Q7Question8.setBackground(Colour_Green);
			} else {
				btn_Q7Question8.setBackground(Color.red);
			}

			// Question8
			ans_Q8Question1.setText(answer_model.Answer8.Q8Ans1);
			if (!ans_Q8Question1.getText().isEmpty()) {
				btn_Q8Question1.setBackground(Colour_Green);
			} else {
				btn_Q8Question1.setBackground(Color.red);
			}

			//
			ans_Q8Question2.setText(answer_model.Answer8.Q8Ans2);
			if (!ans_Q8Question2.getText().isEmpty()) {
				btn_Q8Question2.setBackground(Colour_Green);
			} else {
				btn_Q8Question2.setBackground(Color.red);
			}

			//
			ans_Q8Question3.setText(answer_model.Answer8.Q8Ans3);
			if (!ans_Q8Question3.getText().isEmpty()) {
				btn_Q8Question3.setBackground(Colour_Green);
			} else {
				btn_Q8Question3.setBackground(Color.red);
			}

			//
			ans_Q8Question4.setText(answer_model.Answer8.Q8Ans4);
			if (!ans_Q8Question4.getText().isEmpty()) {
				btn_Q8Question4.setBackground(Colour_Green);
			} else {
				btn_Q8Question4.setBackground(Color.red);
			}

		} catch (Exception ex) {

		}

	}

	// window closing
	private WindowAdapter getWindowAdapter() {
		return new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				super.windowClosing(we);

			}

			@Override
			public void windowIconified(WindowEvent we) {
				// frame.
				setState(JFrame.NORMAL);
			}
		};
	}

	// region Load Question Paper
	public void LoadQuestionPaper(String Paper_Text)

	{
		try {

			txt_Q1Question1.setUI(MultiLineLabelUI.labelUI);

			QuestionPaper_Model questionpaper_model = gson.fromJson(Paper_Text, QuestionPaper_Model.class);
			txt_Q1Question1.setText(questionpaper_model.Question1.Q1Question1);
			txt_Q1Question2.setText(questionpaper_model.Question1.Q1Question2);
			txt_Q1Question3.setText(questionpaper_model.Question1.Q1Question3);
			txt_Q1Question4.setText(questionpaper_model.Question1.Q1Question4);
			txt_Q1Question5.setText(questionpaper_model.Question1.Q1Question5);
			txt_Q1Question6.setText(questionpaper_model.Question1.Q1Question6);
			txt_Q1Question7.setText(questionpaper_model.Question1.Q1Question7);
			txt_Q1Question8.setText(questionpaper_model.Question1.Q1Question8);
			txt_Q1Question9.setText(questionpaper_model.Question1.Q1Question9);
			txt_Q1Question10.setText(questionpaper_model.Question1.Q1Question10);

			// **********assign the question -tf***************************
			txt_Q2Question1.setText(questionpaper_model.Question2.Q2Question1);
			txt_Q2Question2.setText(questionpaper_model.Question2.Q2Question2);
			txt_Q2Question3.setText(questionpaper_model.Question2.Q2Question3);
			txt_Q2Question4.setText(questionpaper_model.Question2.Q2Question4);
			txt_Q2Question5.setText(questionpaper_model.Question2.Q2Question5);
			txt_Q2Question6.setText(questionpaper_model.Question2.Q2Question6);
			txt_Q2Question7.setText(questionpaper_model.Question2.Q2Question7);
			txt_Q2Question8.setText(questionpaper_model.Question2.Q2Question8);
			txt_Q2Question9.setText(questionpaper_model.Question2.Q2Question9);
			txt_Q2Question10.setText(questionpaper_model.Question2.Q2Question10);

			// **********assign the question -mcq1***************************
			txt_Q3Question1.setText(questionpaper_model.Question3.Q3Question1);
			Q3Question1_Option1.setText(questionpaper_model.Question3.Q3Question1_Option1);
			Q3Question1_Option2.setText(questionpaper_model.Question3.Q3Question1_Option2);
			Q3Question1_Option3.setText(questionpaper_model.Question3.Q3Question1_Option3);
			Q3Question1_Option4.setText(questionpaper_model.Question3.Q3Question1_Option4);

			txt_Q3Question2.setText(questionpaper_model.Question3.Q3Question2);
			Q3Question2_Option1.setText(questionpaper_model.Question3.Q3Question2_Option1);
			Q3Question2_Option2.setText(questionpaper_model.Question3.Q3Question2_Option2);
			Q3Question2_Option3.setText(questionpaper_model.Question3.Q3Question2_Option3);
			Q3Question2_Option4.setText(questionpaper_model.Question3.Q3Question2_Option4);

			txt_Q3Question3.setText(questionpaper_model.Question3.Q3Question3);
			Q3Question3_Option1.setText(questionpaper_model.Question3.Q3Question3_Option1);
			Q3Question3_Option2.setText(questionpaper_model.Question3.Q3Question3_Option2);
			Q3Question3_Option3.setText(questionpaper_model.Question3.Q3Question3_Option3);
			Q3Question3_Option4.setText(questionpaper_model.Question3.Q3Question3_Option4);

			txt_Q3Question4.setText(questionpaper_model.Question3.Q3Question4);
			Q3Question4_Option1.setText(questionpaper_model.Question3.Q3Question4_Option1);
			Q3Question4_Option2.setText(questionpaper_model.Question3.Q3Question4_Option2);
			Q3Question4_Option3.setText(questionpaper_model.Question3.Q3Question4_Option3);
			Q3Question4_Option4.setText(questionpaper_model.Question3.Q3Question4_Option4);

			txt_Q3Question5.setText(questionpaper_model.Question3.Q3Question5);
			Q3Question5_Option1.setText(questionpaper_model.Question3.Q3Question5_Option1);
			Q3Question5_Option2.setText(questionpaper_model.Question3.Q3Question5_Option2);
			Q3Question5_Option3.setText(questionpaper_model.Question3.Q3Question5_Option3);
			Q3Question5_Option4.setText(questionpaper_model.Question3.Q3Question5_Option4);

			txt_Q3Question6.setText(questionpaper_model.Question3.Q3Question6);
			Q3Question6_Option1.setText(questionpaper_model.Question3.Q3Question6_Option1);
			Q3Question6_Option2.setText(questionpaper_model.Question3.Q3Question6_Option2);
			Q3Question6_Option3.setText(questionpaper_model.Question3.Q3Question6_Option3);
			Q3Question6_Option4.setText(questionpaper_model.Question3.Q3Question6_Option4);

			txt_Q3Question7.setText(questionpaper_model.Question3.Q3Question7);
			Q3Question7_Option1.setText(questionpaper_model.Question3.Q3Question7_Option1);
			Q3Question7_Option2.setText(questionpaper_model.Question3.Q3Question7_Option2);
			Q3Question7_Option3.setText(questionpaper_model.Question3.Q3Question7_Option3);
			Q3Question7_Option4.setText(questionpaper_model.Question3.Q3Question7_Option4);

			txt_Q3Question8.setText(questionpaper_model.Question3.Q3Question8);
			Q3Question8_Option1.setText(questionpaper_model.Question3.Q3Question8_Option1);
			Q3Question8_Option2.setText(questionpaper_model.Question3.Q3Question8_Option2);
			Q3Question8_Option3.setText(questionpaper_model.Question3.Q3Question8_Option3);
			Q3Question8_Option4.setText(questionpaper_model.Question3.Q3Question8_Option4);

			txt_Q3Question9.setText(questionpaper_model.Question3.Q3Question9);
			Q3Question9_Option1.setText(questionpaper_model.Question3.Q3Question9_Option1);
			Q3Question9_Option2.setText(questionpaper_model.Question3.Q3Question9_Option2);
			Q3Question9_Option3.setText(questionpaper_model.Question3.Q3Question9_Option3);
			Q3Question9_Option4.setText(questionpaper_model.Question3.Q3Question9_Option4);

			txt_Q3Question10.setText(questionpaper_model.Question3.Q3Question10);
			Q3Question10_Option1.setText(questionpaper_model.Question3.Q3Question10_Option1);
			Q3Question10_Option2.setText(questionpaper_model.Question3.Q3Question10_Option2);
			Q3Question10_Option3.setText(questionpaper_model.Question3.Q3Question10_Option3);
			Q3Question10_Option4.setText(questionpaper_model.Question3.Q3Question10_Option4);

			// **********assign the question -mcq4***************************
			Q4Question1.setText(questionpaper_model.Question4.Q4Question1);
			Q4Question1_Option1.setText(questionpaper_model.Question4.Q4Question1_Option1);
			Q4Question1_Option2.setText(questionpaper_model.Question4.Q4Question1_Option2);
			Q4Question1_Option3.setText(questionpaper_model.Question4.Q4Question1_Option3);
			Q4Question1_Option4.setText(questionpaper_model.Question4.Q4Question1_Option4);
			Q4Question1_Option5.setText(questionpaper_model.Question4.Q4Question1_Option5);

			Q4Question2.setText(questionpaper_model.Question4.Q4Question2);
			Q4Question2_Option1.setText(questionpaper_model.Question4.Q4Question2_Option1);
			Q4Question2_Option2.setText(questionpaper_model.Question4.Q4Question2_Option2);
			Q4Question2_Option3.setText(questionpaper_model.Question4.Q4Question2_Option3);
			Q4Question2_Option4.setText(questionpaper_model.Question4.Q4Question2_Option4);
			Q4Question2_Option5.setText(questionpaper_model.Question4.Q4Question2_Option5);

			Q4Question3.setText(questionpaper_model.Question4.Q4Question3);
			Q4Question3_Option1.setText(questionpaper_model.Question4.Q4Question3_Option1);
			Q4Question3_Option2.setText(questionpaper_model.Question4.Q4Question3_Option2);
			Q4Question3_Option3.setText(questionpaper_model.Question4.Q4Question3_Option3);
			Q4Question3_Option4.setText(questionpaper_model.Question4.Q4Question3_Option4);
			Q4Question3_Option5.setText(questionpaper_model.Question4.Q4Question3_Option5);

			Q4Question4.setText(questionpaper_model.Question4.Q4Question4);
			Q4Question4_Option1.setText(questionpaper_model.Question4.Q4Question4_Option1);
			Q4Question4_Option2.setText(questionpaper_model.Question4.Q4Question4_Option2);
			Q4Question4_Option3.setText(questionpaper_model.Question4.Q4Question4_Option3);
			Q4Question4_Option4.setText(questionpaper_model.Question4.Q4Question4_Option4);
			Q4Question4_Option5.setText(questionpaper_model.Question4.Q4Question4_Option5);

			Q4Question5.setText(questionpaper_model.Question4.Q4Question5);
			Q4Question5_Option1.setText(questionpaper_model.Question4.Q4Question5_Option1);
			Q4Question5_Option2.setText(questionpaper_model.Question4.Q4Question5_Option2);
			Q4Question5_Option3.setText(questionpaper_model.Question4.Q4Question5_Option3);
			Q4Question5_Option4.setText(questionpaper_model.Question4.Q4Question5_Option4);
			Q4Question5_Option5.setText(questionpaper_model.Question4.Q4Question5_Option5);

			Q4Question6.setText(questionpaper_model.Question4.Q4Question6);
			Q4Question6_Option1.setText(questionpaper_model.Question4.Q4Question6_Option1);
			Q4Question6_Option2.setText(questionpaper_model.Question4.Q4Question6_Option2);
			Q4Question6_Option3.setText(questionpaper_model.Question4.Q4Question6_Option3);
			Q4Question6_Option4.setText(questionpaper_model.Question4.Q4Question6_Option4);
			Q4Question6_Option5.setText(questionpaper_model.Question4.Q4Question6_Option5);

			Q4Question7.setText(questionpaper_model.Question4.Q4Question7);
			Q4Question7_Option1.setText(questionpaper_model.Question4.Q4Question7_Option1);
			Q4Question7_Option2.setText(questionpaper_model.Question4.Q4Question7_Option2);
			Q4Question7_Option3.setText(questionpaper_model.Question4.Q4Question7_Option3);
			Q4Question7_Option4.setText(questionpaper_model.Question4.Q4Question7_Option4);
			Q4Question7_Option5.setText(questionpaper_model.Question4.Q4Question7_Option5);

			Q4Question8.setText(questionpaper_model.Question4.Q4Question8);
			Q4Question8_Option1.setText(questionpaper_model.Question4.Q4Question8_Option1);
			Q4Question8_Option2.setText(questionpaper_model.Question4.Q4Question8_Option2);
			Q4Question8_Option3.setText(questionpaper_model.Question4.Q4Question8_Option3);
			Q4Question8_Option4.setText(questionpaper_model.Question4.Q4Question8_Option4);
			Q4Question8_Option5.setText(questionpaper_model.Question4.Q4Question8_Option5);

			Q4Question9.setText(questionpaper_model.Question4.Q4Question9);
			Q4Question9_Option1.setText(questionpaper_model.Question4.Q4Question9_Option1);
			Q4Question9_Option2.setText(questionpaper_model.Question4.Q4Question9_Option2);
			Q4Question9_Option3.setText(questionpaper_model.Question4.Q4Question9_Option3);
			Q4Question9_Option4.setText(questionpaper_model.Question4.Q4Question9_Option4);
			Q4Question9_Option5.setText(questionpaper_model.Question4.Q4Question9_Option5);

			Q4Question10.setText(questionpaper_model.Question4.Q4Question10);
			Q4Question10_Option1.setText(questionpaper_model.Question4.Q4Question10_Option1);
			Q4Question10_Option2.setText(questionpaper_model.Question4.Q4Question10_Option2);
			Q4Question10_Option3.setText(questionpaper_model.Question4.Q4Question10_Option3);
			Q4Question10_Option4.setText(questionpaper_model.Question4.Q4Question10_Option4);
			Q4Question10_Option5.setText(questionpaper_model.Question4.Q4Question10_Option5);

			// **********assign the question -mcq4***************************
			Q5Question1.setText(questionpaper_model.Question5.Q5Question1);
			Q5Question1_Option1.setText(questionpaper_model.Question5.Q5Question1_Option1);
			Q5Question1_Option2.setText(questionpaper_model.Question5.Q5Question1_Option2);
			Q5Question1_Option3.setText(questionpaper_model.Question5.Q5Question1_Option3);
			Q5Question1_Option4.setText(questionpaper_model.Question5.Q5Question1_Option4);
			Q5Question1_Option5.setText(questionpaper_model.Question5.Q5Question1_Option5);
			Q5Question1_Option6.setText(questionpaper_model.Question5.Q5Question1_Option6);

			Q5Question2.setText(questionpaper_model.Question5.Q5Question2);
			Q5Question2_Option1.setText(questionpaper_model.Question5.Q5Question2_Option1);
			Q5Question2_Option2.setText(questionpaper_model.Question5.Q5Question2_Option2);
			Q5Question2_Option3.setText(questionpaper_model.Question5.Q5Question2_Option3);
			Q5Question2_Option4.setText(questionpaper_model.Question5.Q5Question2_Option4);
			Q5Question2_Option5.setText(questionpaper_model.Question5.Q5Question2_Option5);
			Q5Question2_Option6.setText(questionpaper_model.Question5.Q5Question2_Option6);

			// **********assign the question -mcq4***************************
			Q6Question1.setText(questionpaper_model.Question6.Q6Question1);
			Q6Question1_Option1.setText("1) " + questionpaper_model.Question6.Q6Question1_Option1);
			Q6Question1_Option2.setText("2) " + questionpaper_model.Question6.Q6Question1_Option2);
			Q6Question1_Option3.setText("3) " + questionpaper_model.Question6.Q6Question1_Option3);
			Q6Question1_Option4.setText("4) " + questionpaper_model.Question6.Q6Question1_Option4);
			Q6Question1_OptionA.setText("A) " + questionpaper_model.Question6.Q6Question1_OptionA);
			Q6Question1_OptionB.setText("B) " + questionpaper_model.Question6.Q6Question1_OptionB);
			Q6Question1_OptionC.setText("C) " + questionpaper_model.Question6.Q6Question1_OptionC);
			Q6Question1_OptionD.setText("D) " + questionpaper_model.Question6.Q6Question1_OptionD);

			// lbl_regop_28.setText( qarray[186].ToString());

			//// **********assign the question -q7***************************

			txt_Q7Question1.setText(questionpaper_model.Question7.Q7Question1);
			txt_Q7Question2.setText(questionpaper_model.Question7.Q7Question2);
			txt_Q7Question3.setText(questionpaper_model.Question7.Q7Question3);
			txt_Q7Question4.setText(questionpaper_model.Question7.Q7Question4);
			txt_Q7Question5.setText(questionpaper_model.Question7.Q7Question5);
			txt_Q7Question6.setText(questionpaper_model.Question7.Q7Question6);
			txt_Q7Question7.setText(questionpaper_model.Question7.Q7Question7);
			txt_Q7Question8.setText(questionpaper_model.Question7.Q7Question8);

			//// **********assign the question -q8***************************
			txt_Q8Question1.setText(questionpaper_model.Question8.Q8Question1);
			txt_Q8Question2.setText(questionpaper_model.Question8.Q8Question2);
			txt_Q8Question3.setText(questionpaper_model.Question8.Q8Question3);
			txt_Q8Question4.setText(questionpaper_model.Question8.Q8Question4);

			// ____________Set Wrap Text
			txt_Q1Question1.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question2.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question3.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question4.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question5.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question6.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question7.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question8.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question9.setUI(MultiLineLabelUI.labelUI);
			txt_Q1Question10.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question1.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question2.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question3.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question4.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question5.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question6.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question7.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question8.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question9.setUI(MultiLineLabelUI.labelUI);
			txt_Q2Question10.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question1.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question2.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question3.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question4.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question5.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question6.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question7.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question8.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question9.setUI(MultiLineLabelUI.labelUI);
			txt_Q3Question10.setText(questionpaper_model.Question3.Q3Question10);
			Q4Question1.setUI(MultiLineLabelUI.labelUI);
			Q4Question2.setUI(MultiLineLabelUI.labelUI);
			Q4Question3.setUI(MultiLineLabelUI.labelUI);
			Q4Question4.setUI(MultiLineLabelUI.labelUI);
			Q4Question5.setUI(MultiLineLabelUI.labelUI);
			Q4Question6.setUI(MultiLineLabelUI.labelUI);
			Q4Question7.setUI(MultiLineLabelUI.labelUI);
			Q4Question8.setUI(MultiLineLabelUI.labelUI);
			Q4Question9.setUI(MultiLineLabelUI.labelUI);
			Q4Question10.setUI(MultiLineLabelUI.labelUI);
			Q5Question1.setUI(MultiLineLabelUI.labelUI);
			Q5Question2.setUI(MultiLineLabelUI.labelUI);
			Q6Question1.setUI(MultiLineLabelUI.labelUI);
			Q6Question1_OptionA.setUI(MultiLineLabelUI.labelUI);
			Q6Question1_OptionB.setUI(MultiLineLabelUI.labelUI);
			Q6Question1_OptionC.setUI(MultiLineLabelUI.labelUI);
			Q6Question1_OptionD.setUI(MultiLineLabelUI.labelUI);
			Q6Question1_Option1.setUI(MultiLineLabelUI.labelUI);
			Q6Question1_Option2.setUI(MultiLineLabelUI.labelUI);
			Q6Question1_Option3.setUI(MultiLineLabelUI.labelUI);
			Q6Question1_Option4.setUI(MultiLineLabelUI.labelUI);
			txt_Q7Question1.setUI(MultiLineLabelUI.labelUI);
			txt_Q7Question2.setUI(MultiLineLabelUI.labelUI);
			txt_Q7Question3.setUI(MultiLineLabelUI.labelUI);
			txt_Q7Question4.setUI(MultiLineLabelUI.labelUI);
			txt_Q7Question5.setUI(MultiLineLabelUI.labelUI);
			txt_Q7Question6.setUI(MultiLineLabelUI.labelUI);
			txt_Q7Question7.setUI(MultiLineLabelUI.labelUI);
			txt_Q7Question8.setUI(MultiLineLabelUI.labelUI);
			txt_Q8Question1.setUI(MultiLineLabelUI.labelUI);
			txt_Q8Question2.setUI(MultiLineLabelUI.labelUI);
			txt_Q8Question3.setUI(MultiLineLabelUI.labelUI);
			txt_Q8Question4.setUI(MultiLineLabelUI.labelUI);

		} catch (Exception exe) {
			System.out.println(exe.toString());
		}
	}

	public int getCount() {
		return 0;
	}

	public void Give_Up() {
		Response_Model responce = new Response_Model();
		JPasswordField passwordField = new JPasswordField();
		passwordField.requestFocusInWindow();
		int option = JOptionPane.showConfirmDialog(null, passwordField, "Enter Password", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.PLAIN_MESSAGE);

		char[] password = passwordField.getPassword();
		String passwordString = new String(password);

		responce.Index_No = "" + login_details.Index_No;
		responce.Seat_No = "" + login_details.Seat_No;
		responce.Batch = "" + login_details.Batch;
		responce.Stream = "" + login_details.Stream;
		responce.Password = passwordString;

		Gson gson = new Gson();
		String json = gson.toJson(responce);
		HttpClient httpClient = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder().POST(HttpRequest.BodyPublishers.ofString(json))
				.header("Content-Type", "application/json")
				.uri(URI.create(common.GetServer_URL_By_Cindex(common.Get_Index_No().toString().substring(0, 2),
						common.Get_Index_No().toString().substring(2, 5)) + "Login"))
				.build();
		try {
			HttpResponse<String> respons = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(respons.body());
			System.out.println(json);
			Response_Model userObject = gson.fromJson(respons.body(), Response_Model.class);
			userObject.Index_No = "" + login_details.Index_No;
			userObject.Seat_No = "" + seatnoo;
			userObject.Batch = "" + login_details.Batch;
			userObject.Stream = "" + login_details.Stream;
			userObject.Password = passwordString;

			if (userObject.Result.trim().equalsIgnoreCase("SUCCESS")) {
				String seat_No = login_details.Seat_No;
				String ss = System.getProperty("user.home") + File.separator + common.FolderName + seat_No + ".ans";

				try {
					AS.FileUpload(seat_No);
				} catch (InvalidKeyException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoSuchPaddingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InvalidAlgorithmParameterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalBlockSizeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (BadPaddingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(frame, "Submitted!!");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(frame, "Wrong Password");
				Give_Up();
			}

		} catch (IOException e1) {
			JFrame f = new JFrame();
			JOptionPane.showMessageDialog(f, "Error:" + e1);
		} catch (InterruptedException e1) {
			JFrame f = new JFrame();
			JOptionPane.showMessageDialog(f, "Error:" + e1);
		}

	}

	// ActionListener for Buttons
	@Override
	public void actionPerformed(ActionEvent e) {

		// for button tabbed
		if (e.getSource() == btn_Question1) {
			QuetabbedPane.setSelectedIndex(0);
		} else if (e.getSource() == btn_Question2) {
			QuetabbedPane.setSelectedIndex(1);
		} else if (e.getSource() == btn_Question3) {
			QuetabbedPane.setSelectedIndex(2);
		} else if (e.getSource() == btn_Question4) {
			QuetabbedPane.setSelectedIndex(3);
		} else if (e.getSource() == btn_Question5) {
			QuetabbedPane.setSelectedIndex(4);
		} else if (e.getSource() == btn_Question6) {
			QuetabbedPane.setSelectedIndex(5);
		} else if (e.getSource() == btn_Question7) {
			QuetabbedPane.setSelectedIndex(6);
		} else if (e.getSource() == btn_Question8) {
			QuetabbedPane.setSelectedIndex(7);
		}

		// finish button
		if (e.getSource() == FinshexamButton) {
			Set_Common_Model();
			Write_Question1();
			Write_Question2();
			Write_Question3();
			Write_Question4();
			Write_Question5();
			Write_Question6();
			Write_Question7();
			Write_Question8();
			AS.All_Ans(Answer_Model);
			Give_Up();
		}

		// Que 1
		if (e.getSource() == btn_Q1_submit) {
			Set_Common_Model();
			Write_Question1();
			AS.Question1(Answer_Model.Answer1);
			if (!Answer_Model.Answer1.Q1Ans1.equals("")) {
				btn_Q1Question1.setBackground(Colour_Green);
			} else {
				btn_Q1Question1.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans2.equals("")) {
				btn_Q1Question2.setBackground(Colour_Green);
			} else {
				btn_Q1Question2.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans3.equals("")) {
				btn_Q1Question3.setBackground(Colour_Green);
			} else {
				btn_Q1Question3.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans4.equals("")) {
				btn_Q1Question4.setBackground(Colour_Green);
			} else {
				btn_Q1Question4.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans5.equals("")) {
				btn_Q1Question5.setBackground(Colour_Green);
			} else {
				btn_Q1Question5.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans6.equals("")) {
				btn_Q1Question6.setBackground(Colour_Green);
			} else {
				btn_Q1Question6.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans7.equals("")) {
				btn_Q1Question7.setBackground(Colour_Green);
			} else {
				btn_Q1Question7.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans8.equals("")) {
				btn_Q1Question8.setBackground(Colour_Green);
			} else {
				btn_Q1Question8.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans9.equals("")) {
				btn_Q1Question9.setBackground(Colour_Green);
			} else {
				btn_Q1Question9.setBackground(Color.red);
			}
			if (!Answer_Model.Answer1.Q1Ans10.equals("")) {
				btn_Q1Question10.setBackground(Colour_Green);
			} else {
				btn_Q1Question10.setBackground(Color.red);
			}
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");

		}
		// Que 2
		if (e.getSource() == btn_Q2_submit) {
			Set_Common_Model();
			Write_Question2();
			AS.Question2(Answer_Model.Answer2);

			if (!Answer_Model.Answer2.Q2Ans1.equals("")) {
				btn_Q2Question1.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans2.equals("")) {
				btn_Q2Question2.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans3.equals("")) {
				btn_Q2Question3.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans4.equals("")) {
				btn_Q2Question4.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans5.equals("")) {
				btn_Q2Question5.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans6.equals("")) {
				btn_Q2Question6.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans7.equals("")) {
				btn_Q2Question7.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans8.equals("")) {
				btn_Q2Question8.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans9.equals("")) {
				btn_Q2Question9.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer2.Q2Ans10.equals("")) {
				btn_Q2Question10.setBackground(Colour_Green);
			}
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");
		}

		// Que 3
		if (e.getSource() == btn_Q3_submit) {
			Set_Common_Model();
			Write_Question3();
			AS.Question3(Answer_Model.Answer3);

			if (!Answer_Model.Answer3.Q3Ans1.equals("~~~~")) {
				btn_Q3Question1.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans2.equals("~~~~")) {
				btn_Q3Question2.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans3.equals("~~~~")) {
				btn_Q3Question3.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans4.equals("~~~~")) {
				btn_Q3Question4.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans5.equals("~~~~")) {
				btn_Q3Question5.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans6.equals("~~~~")) {
				btn_Q3Question6.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans7.equals("~~~~")) {
				btn_Q3Question7.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans8.equals("~~~~")) {
				btn_Q3Question8.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans9.equals("~~~~")) {
				btn_Q3Question9.setBackground(Colour_Green);
			}
			if (!Answer_Model.Answer3.Q3Ans10.equals("~~~~")) {
				btn_Q3Question10.setBackground(Colour_Green);
			}
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");
		}

		// Que 4
		if (e.getSource() == btn_Q4_submit) {
			Set_Common_Model();
			Write_Question4();
			AS.Question4(Answer_Model.Answer4);

			if (!Answer_Model.Answer4.Q4Ans1.equals("~~~~~")) {
				btn_Q4Question1.setBackground(Colour_Green);
			}
			
			if (!Answer_Model.Answer4.Q4Ans2.equals("~~~~~")) {
				btn_Q4Question2.setBackground(Colour_Green);
			}
			else {btn_Q4Question2.setBackground(Color.red);}
			
			if (!Answer_Model.Answer4.Q4Ans3.equals("~~~~~")) {
				btn_Q4Question3.setBackground(Colour_Green);
			}
			else {btn_Q4Question3.setBackground(Color.red);}
			
			if (!Answer_Model.Answer4.Q4Ans4.equals("~~~~~")) {
				btn_Q4Question4.setBackground(Colour_Green);
			}
			else {btn_Q4Question4.setBackground(Color.red);}
			
			if (!Answer_Model.Answer4.Q4Ans5.equals("~~~~~")) {
				btn_Q4Question5.setBackground(Colour_Green);
			}
			else {btn_Q4Question5.setBackground(Color.red);}
			
			if (!Answer_Model.Answer4.Q4Ans6.equals("~~~~~")) {
				btn_Q4Question6.setBackground(Colour_Green);
			}
			else {btn_Q4Question6.setBackground(Color.red);}
			
			if (!Answer_Model.Answer4.Q4Ans7.equals("~~~~~")) {
				btn_Q4Question7.setBackground(Colour_Green);
			}
			else {btn_Q4Question7.setBackground(Color.red);}
			
			if (!Answer_Model.Answer4.Q4Ans8.equals("~~~~~")) {
				btn_Q4Question8.setBackground(Colour_Green);
			}
			else {btn_Q4Question8.setBackground(Color.red);}
			
			if (!Answer_Model.Answer4.Q4Ans9.equals("~~~~~")) {
				btn_Q4Question9.setBackground(Colour_Green);
			}
			else {btn_Q4Question9.setBackground(Color.red);}
			
			if (!Answer_Model.Answer4.Q4Ans10.equals("~~~~~")) {
				btn_Q4Question10.setBackground(Colour_Green);
			}
			else {btn_Q4Question10.setBackground(Color.red);}
			
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");
		}

		// Que 5
		if (e.getSource() == btn_Q5_submit) {
			Set_Common_Model();
			Write_Question5();
			AS.Question5(Answer_Model.Answer5);

			if (!Answer_Model.Answer5.Q5Ans1.equals("~~~~~~")) {
				btn_Q5Question1.setBackground(Colour_Green);
			}else {
				btn_Q5Question1.setBackground(Color.red);
			}
			if (!Answer_Model.Answer5.Q5Ans2.equals("~~~~~~")) {
				btn_Q5Question2.setBackground(Colour_Green);
			}else {
				btn_Q5Question2.setBackground(Color.red);
			}
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");
		}

		// Que 6
		if (e.getSource() == btn_Q6_submit) {
			Set_Common_Model();
			Write_Question6();
			AS.Question6(Answer_Model.Answer6);

			if (!Answer_Model.Answer6.Q6Ans1.equals("~~~~")) {
				btn_Q6Question1.setBackground(Colour_Green);
			}else {
				btn_Q6Question1.setBackground(Color.red);
			}
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");
		}

		// Que 7
		if (e.getSource() == btn_Q7_submit) {
			Set_Common_Model();
			Write_Question7();
			AS.Question7(Answer_Model.Answer7);
			
			if (!Answer_Model.Answer7.Q7Ans1.equals("")) {
				btn_Q7Question1.setBackground(Colour_Green);
			}else {
				btn_Q7Question1.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer7.Q7Ans2.equals("")) {
				btn_Q7Question2.setBackground(Colour_Green);
			}else {
				btn_Q7Question2.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer7.Q7Ans3.equals("")) {
				btn_Q7Question3.setBackground(Colour_Green);
			}else {
				btn_Q7Question3.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer7.Q7Ans4.equals("")) {
				btn_Q7Question4.setBackground(Colour_Green);
			}else {
				btn_Q7Question4.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer7.Q7Ans5.equals("")) {
				btn_Q7Question5.setBackground(Colour_Green);
			}else {
				btn_Q7Question5.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer7.Q7Ans6.equals("")) {
				btn_Q7Question6.setBackground(Colour_Green);
			}else {
				btn_Q7Question6.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer7.Q7Ans7.equals("")) {
				btn_Q7Question7.setBackground(Colour_Green);
			}else {
				btn_Q7Question7.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer7.Q7Ans8.equals("")) {
				btn_Q7Question8.setBackground(Colour_Green);
			}else {
				btn_Q7Question8.setBackground(Color.red);
			}
			
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");
		}

		// Que 8
		if (e.getSource() == btn_Q8_submit) {
			Set_Common_Model();
			Write_Question8();
			AS.Question8(Answer_Model.Answer8);

			if (!Answer_Model.Answer8.Q8Ans1.equals("")) {
				btn_Q8Question1.setBackground(Colour_Green);
			}else {
				btn_Q8Question1.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer8.Q8Ans2.equals("")) {
				btn_Q8Question2.setBackground(Colour_Green);
			}else {
				btn_Q8Question2.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer8.Q8Ans3.equals("")) {
				btn_Q8Question3.setBackground(Colour_Green);
			}else {
				btn_Q8Question3.setBackground(Color.red);
			}
			
			if (!Answer_Model.Answer8.Q8Ans4.equals("")) {
				btn_Q8Question4.setBackground(Colour_Green);
			}else {
				btn_Q8Question4.setBackground(Color.red);
			}
			
			lbl_filesize.setText(Common.AnsFileSize(login_details.Seat_No) + " Bytes");
		}

		// for selecting two and Three checkbox
		if (e.getSource() == Q4Question1_Option1) {
			ManageCheckGroupBox_Two(Q4Question1_Option1, panelA4_1);
		}
		if (e.getSource() == Q4Question1_Option2) {
			ManageCheckGroupBox_Two(Q4Question1_Option2, panelA4_1);
		}
		if (e.getSource() == Q4Question1_Option3) {
			ManageCheckGroupBox_Two(Q4Question1_Option3, panelA4_1);
		}
		if (e.getSource() == Q4Question1_Option4) {
			ManageCheckGroupBox_Two(Q4Question1_Option4, panelA4_1);
		}
		if (e.getSource() == Q4Question1_Option5) {
			ManageCheckGroupBox_Two(Q4Question1_Option5, panelA4_1);
		}
		if (e.getSource() == Q4Question2_Option1) {
			ManageCheckGroupBox_Two(Q4Question2_Option1, panelA4_2);
		}
		if (e.getSource() == Q4Question2_Option2) {
			ManageCheckGroupBox_Two(Q4Question2_Option2, panelA4_2);
		}
		if (e.getSource() == Q4Question2_Option3) {
			ManageCheckGroupBox_Two(Q4Question2_Option3, panelA4_2);
		}
		if (e.getSource() == Q4Question2_Option4) {
			ManageCheckGroupBox_Two(Q4Question2_Option4, panelA4_2);
		}
		if (e.getSource() == Q4Question2_Option5) {
			ManageCheckGroupBox_Two(Q4Question2_Option5, panelA4_2);
		}
		if (e.getSource() == Q4Question3_Option1) {
			ManageCheckGroupBox_Two(Q4Question3_Option1, panelA4_3);
		}
		if (e.getSource() == Q4Question3_Option2) {
			ManageCheckGroupBox_Two(Q4Question3_Option2, panelA4_3);
		}
		if (e.getSource() == Q4Question3_Option3) {
			ManageCheckGroupBox_Two(Q4Question3_Option3, panelA4_3);
		}
		if (e.getSource() == Q4Question3_Option4) {
			ManageCheckGroupBox_Two(Q4Question3_Option4, panelA4_3);
		}
		if (e.getSource() == Q4Question3_Option5) {
			ManageCheckGroupBox_Two(Q4Question3_Option5, panelA4_3);
		}
		if (e.getSource() == Q4Question4_Option1) {
			ManageCheckGroupBox_Two(Q4Question4_Option1, panelA4_4);
		}
		if (e.getSource() == Q4Question4_Option2) {
			ManageCheckGroupBox_Two(Q4Question4_Option2, panelA4_4);
		}
		if (e.getSource() == Q4Question4_Option3) {
			ManageCheckGroupBox_Two(Q4Question4_Option3, panelA4_4);
		}
		if (e.getSource() == Q4Question4_Option4) {
			ManageCheckGroupBox_Two(Q4Question4_Option4, panelA4_4);
		}
		if (e.getSource() == Q4Question4_Option5) {
			ManageCheckGroupBox_Two(Q4Question4_Option5, panelA4_4);
		}
		if (e.getSource() == Q4Question5_Option1) {
			ManageCheckGroupBox_Two(Q4Question5_Option1, panelA4_5);
		}
		if (e.getSource() == Q4Question5_Option2) {
			ManageCheckGroupBox_Two(Q4Question5_Option2, panelA4_5);
		}
		if (e.getSource() == Q4Question5_Option3) {
			ManageCheckGroupBox_Two(Q4Question5_Option3, panelA4_5);
		}
		if (e.getSource() == Q4Question5_Option4) {
			ManageCheckGroupBox_Two(Q4Question5_Option4, panelA4_5);
		}
		if (e.getSource() == Q4Question5_Option5) {
			ManageCheckGroupBox_Two(Q4Question5_Option5, panelA4_5);
		}
		if (e.getSource() == Q4Question6_Option1) {
			ManageCheckGroupBox_Two(Q4Question6_Option1, panelA4_6);
		}
		if (e.getSource() == Q4Question6_Option2) {
			ManageCheckGroupBox_Two(Q4Question6_Option2, panelA4_6);
		}
		if (e.getSource() == Q4Question6_Option3) {
			ManageCheckGroupBox_Two(Q4Question6_Option3, panelA4_6);
		}
		if (e.getSource() == Q4Question6_Option4) {
			ManageCheckGroupBox_Two(Q4Question6_Option4, panelA4_6);
		}
		if (e.getSource() == Q4Question6_Option5) {
			ManageCheckGroupBox_Two(Q4Question6_Option5, panelA4_6);
		}
		if (e.getSource() == Q4Question7_Option1) {
			ManageCheckGroupBox_Two(Q4Question7_Option1, panelA4_7);
		}
		if (e.getSource() == Q4Question7_Option2) {
			ManageCheckGroupBox_Two(Q4Question7_Option2, panelA4_7);
		}
		if (e.getSource() == Q4Question7_Option3) {
			ManageCheckGroupBox_Two(Q4Question7_Option3, panelA4_7);
		}
		if (e.getSource() == Q4Question7_Option4) {
			ManageCheckGroupBox_Two(Q4Question7_Option4, panelA4_7);
		}
		if (e.getSource() == Q4Question7_Option5) {
			ManageCheckGroupBox_Two(Q4Question7_Option5, panelA4_7);
		}
		if (e.getSource() == Q4Question8_Option1) {
			ManageCheckGroupBox_Two(Q4Question8_Option1, panelA4_8);
		}
		if (e.getSource() == Q4Question8_Option2) {
			ManageCheckGroupBox_Two(Q4Question8_Option2, panelA4_8);
		}
		if (e.getSource() == Q4Question8_Option3) {
			ManageCheckGroupBox_Two(Q4Question8_Option3, panelA4_8);
		}
		if (e.getSource() == Q4Question8_Option4) {
			ManageCheckGroupBox_Two(Q4Question8_Option4, panelA4_8);
		}
		if (e.getSource() == Q4Question8_Option5) {
			ManageCheckGroupBox_Two(Q4Question8_Option5, panelA4_8);
		}
		if (e.getSource() == Q4Question9_Option1) {
			ManageCheckGroupBox_Two(Q4Question9_Option1, panelA4_9);
		}
		if (e.getSource() == Q4Question9_Option2) {
			ManageCheckGroupBox_Two(Q4Question9_Option2, panelA4_9);
		}
		if (e.getSource() == Q4Question9_Option3) {
			ManageCheckGroupBox_Two(Q4Question9_Option3, panelA4_9);
		}
		if (e.getSource() == Q4Question9_Option4) {
			ManageCheckGroupBox_Two(Q4Question9_Option4, panelA4_9);
		}
		if (e.getSource() == Q4Question9_Option5) {
			ManageCheckGroupBox_Two(Q4Question9_Option5, panelA4_9);
		}
		if (e.getSource() == Q4Question10_Option1) {
			ManageCheckGroupBox_Two(Q4Question10_Option1, panelA4_10);
		}
		if (e.getSource() == Q4Question10_Option2) {
			ManageCheckGroupBox_Two(Q4Question10_Option2, panelA4_10);
		}
		if (e.getSource() == Q4Question10_Option3) {
			ManageCheckGroupBox_Two(Q4Question10_Option3, panelA4_10);
		}
		if (e.getSource() == Q4Question10_Option4) {
			ManageCheckGroupBox_Two(Q4Question10_Option4, panelA4_10);
		}
		if (e.getSource() == Q4Question10_Option5) {
			ManageCheckGroupBox_Two(Q4Question10_Option5, panelA4_10);
		}
		if (e.getSource() == Q5Question1_Option1) {
			ManageCheckGroupBox_Three(Q5Question1_Option1, panelA5_1);
		}
		if (e.getSource() == Q5Question1_Option2) {
			ManageCheckGroupBox_Three(Q5Question1_Option2, panelA5_1);
		}
		if (e.getSource() == Q5Question1_Option3) {
			ManageCheckGroupBox_Three(Q5Question1_Option3, panelA5_1);
		}
		if (e.getSource() == Q5Question1_Option4) {
			ManageCheckGroupBox_Three(Q5Question1_Option4, panelA5_1);
		}
		if (e.getSource() == Q5Question1_Option5) {
			ManageCheckGroupBox_Three(Q5Question1_Option5, panelA5_1);
		}
		if (e.getSource() == Q5Question1_Option6) {
			ManageCheckGroupBox_Three(Q5Question1_Option6, panelA5_1);
		}
		if (e.getSource() == Q5Question2_Option1) {
			ManageCheckGroupBox_Three(Q5Question2_Option1, panelA5_2);
		}
		if (e.getSource() == Q5Question2_Option2) {
			ManageCheckGroupBox_Three(Q5Question2_Option2, panelA5_2);
		}
		if (e.getSource() == Q5Question2_Option3) {
			ManageCheckGroupBox_Three(Q5Question2_Option3, panelA5_2);
		}
		if (e.getSource() == Q5Question2_Option4) {
			ManageCheckGroupBox_Three(Q5Question2_Option4, panelA5_2);
		}
		if (e.getSource() == Q5Question2_Option5) {
			ManageCheckGroupBox_Three(Q5Question2_Option5, panelA5_2);
		}
		if (e.getSource() == Q5Question2_Option6) {
			ManageCheckGroupBox_Three(Q5Question2_Option6, panelA5_2);
		}
	}

	void Set_Common_Model() {
		Answer_Model.Index_No = login_details.Index_No;
		Answer_Model.Paper_ID = login_details.Paper_ID;
		Answer_Model.Seat_No = login_details.Seat_No;
		Answer_Model.Batch = login_details.Batch;
		Answer_Model.OS = System.getProperty("os.name");;
		Answer_Model.IP = Common.Get_IP();
		Answer_Model.Answer1 = new Answer1_Model();
		Answer_Model.Answer1.Index_No = login_details.Index_No;
		Answer_Model.Answer1.Paper_ID = login_details.Paper_ID;
		Answer_Model.Answer1.Seat_No = login_details.Seat_No;
		Answer_Model.Answer1.Batch = login_details.Batch;
		Answer_Model.Answer1.IP = Common.Get_IP();
		Answer_Model.Answer1.OS = System.getProperty("os.name");;
		Answer_Model.Answer2 = new Answer2_Model();
		Answer_Model.Answer2.Index_No = login_details.Index_No;
		Answer_Model.Answer2.Paper_ID = login_details.Paper_ID;
		Answer_Model.Answer2.Seat_No = login_details.Seat_No;
		Answer_Model.Answer2.Batch = login_details.Batch;
		Answer_Model.Answer2.IP = Common.Get_IP();
		Answer_Model.Answer2.OS = System.getProperty("os.name");;
		Answer_Model.Answer3 = new Answer3_Model();
		Answer_Model.Answer3.Index_No = login_details.Index_No;
		Answer_Model.Answer3.Paper_ID = login_details.Paper_ID;
		Answer_Model.Answer3.Seat_No = login_details.Seat_No;
		Answer_Model.Answer3.Batch = login_details.Batch;
		Answer_Model.Answer3.IP = Common.Get_IP();
		Answer_Model.Answer3.OS = System.getProperty("os.name");;
		Answer_Model.Answer4 = new Answer4_Model();
		Answer_Model.Answer4.Index_No = login_details.Index_No;
		Answer_Model.Answer4.Paper_ID = login_details.Paper_ID;
		Answer_Model.Answer4.Seat_No = login_details.Seat_No;
		Answer_Model.Answer4.Batch = login_details.Batch;
		Answer_Model.Answer4.IP = Common.Get_IP();
		Answer_Model.Answer4.OS = System.getProperty("os.name");;
		Answer_Model.Answer5 = new Answer5_Model();
		Answer_Model.Answer5.Index_No = login_details.Index_No;
		Answer_Model.Answer5.Paper_ID = login_details.Paper_ID;
		Answer_Model.Answer5.Seat_No = login_details.Seat_No;
		Answer_Model.Answer5.Batch = login_details.Batch;
		Answer_Model.Answer5.IP = Common.Get_IP();
		Answer_Model.Answer5.OS = System.getProperty("os.name");;
		Answer_Model.Answer6 = new Answer6_Model();
		Answer_Model.Answer6.Index_No = login_details.Index_No;
		Answer_Model.Answer6.Paper_ID = login_details.Paper_ID;
		Answer_Model.Answer6.Seat_No = login_details.Seat_No;
		Answer_Model.Answer6.Batch = login_details.Batch;
		Answer_Model.Answer6.IP = Common.Get_IP();
		Answer_Model.Answer6.OS = System.getProperty("os.name");;
		Answer_Model.Answer7 = new Answer7_Model();
		Answer_Model.Answer7.Index_No = login_details.Index_No;
		Answer_Model.Answer7.Paper_ID = login_details.Paper_ID;
		Answer_Model.Answer7.Seat_No = login_details.Seat_No;
		Answer_Model.Answer7.Batch = login_details.Batch;
		Answer_Model.Answer7.IP = Common.Get_IP();
		Answer_Model.Answer7.OS = System.getProperty("os.name");;
		Answer_Model.Answer8 = new Answer8_Model();
		Answer_Model.Answer8.Index_No = login_details.Index_No;
		Answer_Model.Answer8.Paper_ID = login_details.Paper_ID;
		Answer_Model.Answer8.Seat_No = login_details.Seat_No;
		Answer_Model.Answer8.Batch = login_details.Batch;
		Answer_Model.Answer8.IP = Common.Get_IP();
		Answer_Model.Answer8.OS = System.getProperty("os.name");;
	}

	// Checkbox for selecting two options
	private void ManageCheckGroupBox_Two(JCheckBox chk, JPanel panel) {
		int tempCheck = 0;
		for (Component c : panel.getComponents()) {
			if (c instanceof JCheckBox) {
				if (((AbstractButton) c).isSelected() == true) {
					tempCheck = tempCheck + 1;
				}
				if (tempCheck > 2) {
					chk.setSelected(false);
				}

			}
		}

	}

	// Checkbox for selecting three options
	private void ManageCheckGroupBox_Three(JCheckBox chk, JPanel panel) {
		int tempCheck = 0;
		for (Component c : panel.getComponents()) {
			if (c instanceof JCheckBox) {
				if (((AbstractButton) c).isSelected() == true) {
					tempCheck = tempCheck + 1;
				}
				if (tempCheck > 3) {
					chk.setSelected(false);
				}

			}
		}

	}

	// Change color of question button
	@Override
	public void stateChanged(ChangeEvent e) {

		if (QuetabbedPane.getSelectedIndex() == 0) {

			try {
				lbl_Question_Name.setText("Question No 1. FILL IN THE BLANKS");
				btn_Question1.setBackground(Color.orange);
				btn_Question2.setBackground(Color.white);
				btn_Question3.setBackground(Color.white);
				btn_Question4.setBackground(Color.white);
				btn_Question5.setBackground(Color.white);
				btn_Question6.setBackground(Color.white);
				btn_Question7.setBackground(Color.white);
				btn_Question8.setBackground(Color.white);
			} catch (Exception exe) {

			}
		}
		if (QuetabbedPane.getSelectedIndex() == 1) {

			try {
				lbl_Question_Name.setText("Question No 2. TRUE/FALSE");
				btn_Question2.setBackground(Color.orange);
				btn_Question1.setBackground(Color.white);
				btn_Question3.setBackground(Color.white);
				btn_Question4.setBackground(Color.white);
				btn_Question5.setBackground(Color.white);
				btn_Question6.setBackground(Color.white);
				btn_Question7.setBackground(Color.white);
				btn_Question8.setBackground(Color.white);
			} catch (Exception exe) {

			}
		}
		if (QuetabbedPane.getSelectedIndex() == 2) {
			lbl_Question_Name.setText("Question No 3 (MCQ1)SINGLE CORRECT ANS");
			btn_Question3.setBackground(Color.orange);
			btn_Question1.setBackground(Color.white);
			btn_Question2.setBackground(Color.white);
			btn_Question4.setBackground(Color.white);
			btn_Question5.setBackground(Color.white);
			btn_Question6.setBackground(Color.white);
			btn_Question7.setBackground(Color.white);
			btn_Question8.setBackground(Color.white);
		}
		if (QuetabbedPane.getSelectedIndex() == 3) {
			lbl_Question_Name.setText("Question No 4. (MCQ2)TWO CORRECT ANS");
			btn_Question4.setBackground(Color.orange);
			btn_Question3.setBackground(Color.white);
			btn_Question1.setBackground(Color.white);
			btn_Question2.setBackground(Color.white);
			btn_Question5.setBackground(Color.white);
			btn_Question6.setBackground(Color.white);
			btn_Question7.setBackground(Color.white);
			btn_Question8.setBackground(Color.white);
		}
		if (QuetabbedPane.getSelectedIndex() == 4) {
			lbl_Question_Name.setText("Question No 5. (MCQ3)THREE CORRECT ANS");
			btn_Question5.setBackground(Color.orange);
			btn_Question3.setBackground(Color.white);
			btn_Question1.setBackground(Color.white);
			btn_Question2.setBackground(Color.white);
			btn_Question4.setBackground(Color.white);
			btn_Question6.setBackground(Color.white);
			btn_Question7.setBackground(Color.white);
			btn_Question8.setBackground(Color.white);
		}
		if (QuetabbedPane.getSelectedIndex() == 5) {
			lbl_Question_Name.setText("Question No 6. Match The Following ");
			btn_Question6.setBackground(Color.orange);
			btn_Question1.setBackground(Color.white);
			btn_Question2.setBackground(Color.white);
			btn_Question4.setBackground(Color.white);
			btn_Question5.setBackground(Color.white);
			btn_Question7.setBackground(Color.white);
			btn_Question8.setBackground(Color.white);
		}
		if (QuetabbedPane.getSelectedIndex() == 6) {
			lbl_Question_Name.setText("Question No 7.SHORT ANSWER (Any 5)");
			btn_Question7.setBackground(Color.orange);
			btn_Question3.setBackground(Color.white);
			btn_Question1.setBackground(Color.white);
			btn_Question2.setBackground(Color.white);
			btn_Question4.setBackground(Color.white);
			btn_Question5.setBackground(Color.white);
			btn_Question6.setBackground(Color.white);

			btn_Question8.setBackground(Color.white);
		}
		if (QuetabbedPane.getSelectedIndex() == 7) {
			lbl_Question_Name.setText("Write any one from Q.NO. 8A and any one from Q.NO. 8B");
			btn_Question8.setBackground(Color.orange);
			btn_Question3.setBackground(Color.white);
			btn_Question1.setBackground(Color.white);
			btn_Question2.setBackground(Color.white);
			btn_Question4.setBackground(Color.white);
			btn_Question5.setBackground(Color.white);
			btn_Question6.setBackground(Color.white);
			btn_Question7.setBackground(Color.white);

		}

	}

	public void Enable_Controller() {
		ans_Q1Question1.setEnabled(true);
		ans_Q1Question2.setEnabled(true);
		ans_Q1Question3.setEnabled(true);
		ans_Q1Question4.setEnabled(true);
		ans_Q1Question5.setEnabled(true);
		ans_Q1Question6.setEnabled(true);
		ans_Q1Question7.setEnabled(true);
		ans_Q1Question8.setEnabled(true);
		ans_Q1Question9.setEnabled(true);
		ans_Q1Question1.setEnabled(true);
		btn_Q1_submit.setEnabled(true);
		ans_Q2Question1_radio1.setEnabled(true);
		ans_Q2Question7_radio1.setEnabled(true);
		ans_Q2Question7_radio2.setEnabled(true);
		ans_Q2Question8_radio1.setEnabled(true);
		ans_Q2Question8_radio2.setEnabled(true);
		ans_Q2Question9_radio1.setEnabled(true);
		ans_Q2Question9_radio2.setEnabled(true);
		ans_Q2Question10_radio1.setEnabled(true);
		ans_Q2Question10_radio2.setEnabled(true);
		ans_Q2Question1_radio2.setEnabled(true);
		ans_Q2Question2_radio1.setEnabled(true);
		ans_Q2Question2_radio2.setEnabled(true);
		ans_Q2Question3_radio1.setEnabled(true);
		ans_Q2Question3_radio2.setEnabled(true);
		ans_Q2Question4_radio1.setEnabled(true);
		ans_Q2Question4_radio2.setEnabled(true);
		ans_Q2Question5_radio1.setEnabled(true);
		ans_Q2Question5_radio2.setEnabled(true);
		ans_Q2Question6_radio1.setEnabled(true);
		ans_Q2Question6_radio2.setEnabled(true);
		btn_Q2_submit.setEnabled(true);
		Q3Question1_Option1.setEnabled(true);
		Q3Question1_Option2.setEnabled(true);
		Q3Question1_Option3.setEnabled(true);
		Q3Question1_Option4.setEnabled(true);
		Q3Question2_Option1.setEnabled(true);
		Q3Question2_Option2.setEnabled(true);
		Q3Question2_Option3.setEnabled(true);
		Q3Question2_Option4.setEnabled(true);
		Q3Question3_Option1.setEnabled(true);
		Q3Question3_Option2.setEnabled(true);
		Q3Question3_Option3.setEnabled(true);
		Q3Question3_Option4.setEnabled(true);
		Q3Question4_Option1.setEnabled(true);
		Q3Question4_Option2.setEnabled(true);
		Q3Question4_Option3.setEnabled(true);
		Q3Question4_Option4.setEnabled(true);
		Q3Question5_Option1.setEnabled(true);
		Q3Question5_Option2.setEnabled(true);
		Q3Question5_Option3.setEnabled(true);
		Q3Question5_Option4.setEnabled(true);
		Q3Question6_Option1.setEnabled(true);
		Q3Question6_Option2.setEnabled(true);
		Q3Question6_Option3.setEnabled(true);
		Q3Question6_Option4.setEnabled(true);
		Q3Question7_Option1.setEnabled(true);
		Q3Question7_Option2.setEnabled(true);
		Q3Question7_Option3.setEnabled(true);
		Q3Question7_Option4.setEnabled(true);
		Q3Question8_Option1.setEnabled(true);
		Q3Question8_Option2.setEnabled(true);
		Q3Question8_Option3.setEnabled(true);
		Q3Question8_Option4.setEnabled(true);
		Q3Question9_Option1.setEnabled(true);
		Q3Question9_Option2.setEnabled(true);
		Q3Question9_Option3.setEnabled(true);
		Q3Question9_Option4.setEnabled(true);
		Q3Question10_Option1.setEnabled(true);
		Q3Question10_Option2.setEnabled(true);
		Q3Question10_Option3.setEnabled(true);
		Q3Question10_Option4.setEnabled(true);
		Q4Question1_Option1.setEnabled(true);
		Q4Question1_Option2.setEnabled(true);
		Q4Question1_Option3.setEnabled(true);
		Q4Question1_Option4.setEnabled(true);
		Q4Question1_Option5.setEnabled(true);
		Q4Question2_Option1.setEnabled(true);
		Q4Question2_Option2.setEnabled(true);
		Q4Question2_Option3.setEnabled(true);
		Q4Question2_Option4.setEnabled(true);
		Q4Question2_Option5.setEnabled(true);
		Q4Question3_Option1.setEnabled(true);
		Q4Question3_Option2.setEnabled(true);
		Q4Question3_Option3.setEnabled(true);
		Q4Question3_Option4.setEnabled(true);
		Q4Question3_Option5.setEnabled(true);
		Q4Question4_Option1.setEnabled(true);
		Q4Question4_Option2.setEnabled(true);
		Q4Question4_Option3.setEnabled(true);
		Q4Question4_Option4.setEnabled(true);
		Q4Question4_Option5.setEnabled(true);
		Q4Question5_Option1.setEnabled(true);
		Q4Question5_Option2.setEnabled(true);
		Q4Question5_Option3.setEnabled(true);
		Q4Question5_Option4.setEnabled(true);
		Q4Question5_Option5.setEnabled(true);
		Q4Question6_Option1.setEnabled(true);
		Q4Question6_Option2.setEnabled(true);
		Q4Question6_Option3.setEnabled(true);
		Q4Question6_Option4.setEnabled(true);
		Q4Question6_Option5.setEnabled(true);
		Q4Question7_Option1.setEnabled(true);
		Q4Question7_Option2.setEnabled(true);
		Q4Question7_Option3.setEnabled(true);
		Q4Question7_Option4.setEnabled(true);
		Q4Question7_Option5.setEnabled(true);
		Q4Question8_Option1.setEnabled(true);
		Q4Question8_Option2.setEnabled(true);
		Q4Question8_Option3.setEnabled(true);
		Q4Question8_Option4.setEnabled(true);
		Q4Question8_Option5.setEnabled(true);
		Q4Question9_Option1.setEnabled(true);
		Q4Question9_Option2.setEnabled(true);
		Q4Question9_Option3.setEnabled(true);
		Q4Question9_Option4.setEnabled(true);
		Q4Question9_Option5.setEnabled(true);
		Q4Question10_Option1.setEnabled(true);
		Q4Question10_Option2.setEnabled(true);
		Q4Question10_Option3.setEnabled(true);
		Q4Question10_Option4.setEnabled(true);
		Q4Question10_Option5.setEnabled(true);
		Q5Question1_Option1.setEnabled(true);
		Q5Question1_Option2.setEnabled(true);
		Q5Question1_Option3.setEnabled(true);
		Q5Question1_Option4.setEnabled(true);
		Q5Question1_Option5.setEnabled(true);
		Q5Question1_Option6.setEnabled(true);
		Q5Question2_Option1.setEnabled(true);
		Q5Question2_Option2.setEnabled(true);
		Q5Question2_Option3.setEnabled(true);
		Q5Question2_Option4.setEnabled(true);
		Q5Question2_Option5.setEnabled(true);
		Q5Question2_Option6.setEnabled(true);
		Q6Question1.setEnabled(true);
		Q6Question1_OptionA.setEnabled(true);
		Q6Question1_OptionB.setEnabled(true);
		Q6Question1_OptionC.setEnabled(true);
		Q6Question1_OptionD.setEnabled(true);
		Q6Question1_Option1.setEnabled(true);
		Q6Question1_Option2.setEnabled(true);
		Q6Question1_Option3.setEnabled(true);
		Q6Question1_Option4.setEnabled(true);
		txt_Q7Question1.setEnabled(true);
		txt_Q7Question2.setEnabled(true);
		txt_Q7Question3.setEnabled(true);
		txt_Q7Question4.setEnabled(true);
		txt_Q7Question5.setEnabled(true);
		txt_Q7Question6.setEnabled(true);
		txt_Q7Question7.setEnabled(true);
		txt_Q7Question8.setEnabled(true);
		txt_Q8Question1.setEnabled(true);
		txt_Q8Question2.setEnabled(true);
		txt_Q8Question3.setEnabled(true);
		txt_Q8Question4.setEnabled(true);
		btn_Q3_submit.setEnabled(true);
		btn_Q4_submit.setEnabled(true);
		btn_Q5_submit.setEnabled(true);
		btn_Q6_submit.setEnabled(true);
		btn_Q7_submit.setEnabled(true);
		btn_Q8_submit.setEnabled(true);
	}

	public void Disable_Controller() {
		ans_Q1Question1.setEnabled(false);
		ans_Q1Question2.setEnabled(false);
		ans_Q1Question3.setEnabled(false);
		ans_Q1Question4.setEnabled(false);
		ans_Q1Question5.setEnabled(false);
		ans_Q1Question6.setEnabled(false);
		ans_Q1Question7.setEnabled(false);
		ans_Q1Question8.setEnabled(false);
		ans_Q1Question9.setEnabled(false);
		ans_Q1Question10.setEnabled(false);
		btn_Q1_submit.setEnabled(false);
		ans_Q2Question1_radio1.setEnabled(false);
		ans_Q2Question7_radio1.setEnabled(false);
		ans_Q2Question7_radio2.setEnabled(false);
		ans_Q2Question8_radio1.setEnabled(false);
		ans_Q2Question8_radio2.setEnabled(false);
		ans_Q2Question9_radio1.setEnabled(false);
		ans_Q2Question9_radio2.setEnabled(false);
		ans_Q2Question10_radio1.setEnabled(false);
		ans_Q2Question10_radio2.setEnabled(false);
		ans_Q2Question1_radio2.setEnabled(false);
		ans_Q2Question2_radio1.setEnabled(false);
		ans_Q2Question2_radio2.setEnabled(false);
		ans_Q2Question3_radio1.setEnabled(false);
		ans_Q2Question3_radio2.setEnabled(false);
		ans_Q2Question4_radio1.setEnabled(false);
		ans_Q2Question4_radio2.setEnabled(false);
		ans_Q2Question5_radio1.setEnabled(false);
		ans_Q2Question5_radio2.setEnabled(false);
		ans_Q2Question6_radio1.setEnabled(false);
		ans_Q2Question6_radio2.setEnabled(false);
		btn_Q2_submit.setEnabled(false);
		Q3Question1_Option1.setEnabled(false);
		Q3Question1_Option2.setEnabled(false);
		Q3Question1_Option3.setEnabled(false);
		Q3Question1_Option4.setEnabled(false);
		Q3Question2_Option1.setEnabled(false);
		Q3Question2_Option2.setEnabled(false);
		Q3Question2_Option3.setEnabled(false);
		Q3Question2_Option4.setEnabled(false);
		Q3Question3_Option1.setEnabled(false);
		Q3Question3_Option2.setEnabled(false);
		Q3Question3_Option3.setEnabled(false);
		Q3Question3_Option4.setEnabled(false);
		Q3Question4_Option1.setEnabled(false);
		Q3Question4_Option2.setEnabled(false);
		Q3Question4_Option3.setEnabled(false);
		Q3Question4_Option4.setEnabled(false);
		Q3Question5_Option1.setEnabled(false);
		Q3Question5_Option2.setEnabled(false);
		Q3Question5_Option3.setEnabled(false);
		Q3Question5_Option4.setEnabled(false);
		Q3Question6_Option1.setEnabled(false);
		Q3Question6_Option2.setEnabled(false);
		Q3Question6_Option3.setEnabled(false);
		Q3Question6_Option4.setEnabled(false);
		Q3Question7_Option1.setEnabled(false);
		Q3Question7_Option2.setEnabled(false);
		Q3Question7_Option3.setEnabled(false);
		Q3Question7_Option4.setEnabled(false);
		Q3Question8_Option1.setEnabled(false);
		Q3Question8_Option2.setEnabled(false);
		Q3Question8_Option3.setEnabled(false);
		Q3Question8_Option4.setEnabled(false);
		Q3Question9_Option1.setEnabled(false);
		Q3Question9_Option2.setEnabled(false);
		Q3Question9_Option3.setEnabled(false);
		Q3Question9_Option4.setEnabled(false);
		Q3Question10_Option1.setEnabled(false);
		Q3Question10_Option2.setEnabled(false);
		Q3Question10_Option3.setEnabled(false);
		Q3Question10_Option4.setEnabled(false);
		Q4Question1_Option1.setEnabled(false);
		Q4Question1_Option2.setEnabled(false);
		Q4Question1_Option3.setEnabled(false);
		Q4Question1_Option4.setEnabled(false);
		Q4Question1_Option5.setEnabled(false);
		Q4Question2_Option1.setEnabled(false);

		Q4Question2_Option2.setEnabled(false);
		Q4Question2_Option3.setEnabled(false);
		Q4Question2_Option4.setEnabled(false);
		Q4Question2_Option5.setEnabled(false);
		Q4Question3_Option1.setEnabled(false);
		Q4Question3_Option2.setEnabled(false);
		Q4Question3_Option3.setEnabled(false);
		Q4Question3_Option4.setEnabled(false);
		Q4Question3_Option5.setEnabled(false);
		Q4Question4_Option1.setEnabled(false);
		Q4Question4_Option2.setEnabled(false);
		Q4Question4_Option3.setEnabled(false);
		Q4Question4_Option4.setEnabled(false);
		Q4Question4_Option5.setEnabled(false);
		Q4Question5_Option1.setEnabled(false);
		Q4Question5_Option2.setEnabled(false);
		Q4Question5_Option3.setEnabled(false);
		Q4Question5_Option4.setEnabled(false);
		Q4Question5_Option5.setEnabled(false);
		Q4Question6_Option1.setEnabled(false);
		Q4Question6_Option2.setEnabled(false);
		Q4Question6_Option3.setEnabled(false);
		Q4Question6_Option4.setEnabled(false);
		Q4Question6_Option5.setEnabled(false);
		Q4Question7_Option1.setEnabled(false);
		Q4Question7_Option2.setEnabled(false);
		Q4Question7_Option3.setEnabled(false);
		Q4Question7_Option4.setEnabled(false);
		Q4Question7_Option5.setEnabled(false);
		Q4Question8_Option1.setEnabled(false);
		Q4Question8_Option2.setEnabled(false);
		Q4Question8_Option3.setEnabled(false);
		Q4Question8_Option4.setEnabled(false);
		Q4Question8_Option5.setEnabled(false);
		Q4Question9_Option1.setEnabled(false);
		Q4Question9_Option2.setEnabled(false);
		Q4Question9_Option3.setEnabled(false);
		Q4Question9_Option4.setEnabled(false);
		Q4Question9_Option5.setEnabled(false);
		Q4Question10_Option1.setEnabled(false);
		Q4Question10_Option2.setEnabled(false);
		Q4Question10_Option3.setEnabled(false);
		Q4Question10_Option4.setEnabled(false);
		Q4Question10_Option5.setEnabled(false);
		Q5Question1_Option1.setEnabled(false);
		Q5Question1_Option2.setEnabled(false);
		Q5Question1_Option3.setEnabled(false);
		Q5Question1_Option4.setEnabled(false);
		Q5Question1_Option5.setEnabled(false);
		Q5Question1_Option6.setEnabled(false);
		Q5Question2_Option1.setEnabled(false);
		Q5Question2_Option2.setEnabled(false);
		Q5Question2_Option3.setEnabled(false);
		Q5Question2_Option4.setEnabled(false);
		Q5Question2_Option5.setEnabled(false);
		Q5Question2_Option6.setEnabled(false);
		txt_Q6Option1.setEnabled(false);
		txt_Q6Option2.setEnabled(false);
		txt_Q6Option3.setEnabled(false);
		txt_Q6Option4.setEnabled(false);
		ans_Q7Question1.setEnabled(false);
		ans_Q7Question2.setEnabled(false);
		ans_Q8Question1.setEnabled(false);
		ans_Q8Question2.setEnabled(false);
		btn_Q3_submit.setEnabled(false);
		btn_Q4_submit.setEnabled(false);
		btn_Q5_submit.setEnabled(false);
		btn_Q6_submit.setEnabled(false);
		btn_Q7_submit.setEnabled(false);
		btn_Q8_submit.setEnabled(false);
	}

	void Write_Question1() {

		Answer_Model.Answer1.Q1Ans1 = ans_Q1Question1.getText();
		Answer_Model.Answer1.Q1Ans2 = ans_Q1Question2.getText();
		Answer_Model.Answer1.Q1Ans3 = ans_Q1Question3.getText();
		Answer_Model.Answer1.Q1Ans4 = ans_Q1Question4.getText();
		Answer_Model.Answer1.Q1Ans5 = ans_Q1Question5.getText();
		Answer_Model.Answer1.Q1Ans6 = ans_Q1Question6.getText();
		Answer_Model.Answer1.Q1Ans7 = ans_Q1Question7.getText();
		Answer_Model.Answer1.Q1Ans8 = ans_Q1Question8.getText();
		Answer_Model.Answer1.Q1Ans9 = ans_Q1Question9.getText();
		Answer_Model.Answer1.Q1Ans10 = ans_Q1Question10.getText();

		common.WriteAnsFile(login_details.Seat_No, "¶Q1Answer£" + myDateObj.format(myFormatObj));
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans1£" + Answer_Model.Answer1.Q1Ans1);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans2£" + Answer_Model.Answer1.Q1Ans2);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans3£" + Answer_Model.Answer1.Q1Ans3);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans4£" + Answer_Model.Answer1.Q1Ans4);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans5£" + Answer_Model.Answer1.Q1Ans5);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans6£" + Answer_Model.Answer1.Q1Ans6);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans7£" + Answer_Model.Answer1.Q1Ans7);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans8£" + Answer_Model.Answer1.Q1Ans8);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans9£" + Answer_Model.Answer1.Q1Ans9);
		common.WriteAnsFile(login_details.Seat_No, "¶Q1Ans10£" + Answer_Model.Answer1.Q1Ans10);

	}

	// get text for question set 2
	private void Write_Question2() {
		if (ans_Q2Question1_radio1.isSelected()) {
			Answer_Model.Answer2.Q2Ans1 = "True";
		} else if (ans_Q2Question1_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans1 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans1 = "";
		}

		if (ans_Q2Question2_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans2 = "True";
		} else if (ans_Q2Question2_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans2 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans2 = "";
		}

		if (ans_Q2Question3_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans3 = "True";
		} else if (ans_Q2Question3_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans3 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans3 = "";
		}

		if (ans_Q2Question4_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans4 = "True";
		} else if (ans_Q2Question4_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans4 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans4 = "";
		}

		if (ans_Q2Question5_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans5 = "True";
		} else if (ans_Q2Question5_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans5 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans5 = "";
		}

		if (ans_Q2Question6_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans6 = "True";
		} else if (ans_Q2Question6_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans6 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans6 = "";
		}

		if (ans_Q2Question7_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans7 = "True";
		} else if (ans_Q2Question7_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans7 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans7 = "";
		}

		if (ans_Q2Question8_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans8 = "True";
		} else if (ans_Q2Question8_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans8 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans8 = "";
		}

		if (ans_Q2Question9_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans9 = "True";
		} else if (ans_Q2Question9_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans9 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans9 = "";
		}

		if (ans_Q2Question10_radio1.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans10 = "True";
		} else if (ans_Q2Question10_radio2.isSelected() == true) {
			Answer_Model.Answer2.Q2Ans10 = "False";
		} else {
			Answer_Model.Answer2.Q2Ans10 = "";
		}

		common.WriteAnsFile(login_details.Seat_No, "¶Q2Answer£" + myDateObj.format(myFormatObj));
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans1£" + Answer_Model.Answer2.Q2Ans1);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans2£" + Answer_Model.Answer2.Q2Ans2);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans3£" + Answer_Model.Answer2.Q2Ans3);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans4£" + Answer_Model.Answer2.Q2Ans4);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans5£" + Answer_Model.Answer2.Q2Ans5);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans6£" + Answer_Model.Answer2.Q2Ans6);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans7£" + Answer_Model.Answer2.Q2Ans7);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans8£" + Answer_Model.Answer2.Q2Ans8);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans9£" + Answer_Model.Answer2.Q2Ans9);
		common.WriteAnsFile(login_details.Seat_No, "¶Q2Ans10£" + Answer_Model.Answer2.Q2Ans10);
	}

	// get text for question set3
	private void Write_Question3() {
		// 1
		if (Q3Question1_Option1.isSelected() || Q3Question1_Option2.isSelected() || Q3Question1_Option3.isSelected()
				|| Q3Question1_Option4.isSelected()) {

			Answer_Model.Answer3.Q3Ans1 = "";
			Answer_Model.Answer3.Q3Ans1 += Q3Question1_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans1 += Q3Question1_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans1 += Q3Question1_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans1 += Q3Question1_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans1 = "~~~~";
		}
		// 2
		if (Q3Question2_Option1.isSelected() || Q3Question2_Option2.isSelected() || Q3Question2_Option3.isSelected()
				|| Q3Question2_Option4.isSelected()) {

			Answer_Model.Answer3.Q3Ans2 = "";
			Answer_Model.Answer3.Q3Ans2 += Q3Question2_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans2 += Q3Question2_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans2 += Q3Question2_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans2 += Q3Question2_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans2 = "~~~~";
		}
		// 3
		if (Q3Question3_Option1.isSelected() || Q3Question3_Option2.isSelected() || Q3Question3_Option3.isSelected()
				|| Q3Question3_Option4.isSelected()) {

			Answer_Model.Answer3.Q3Ans3 = "";
			Answer_Model.Answer3.Q3Ans3 += Q3Question3_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans3 += Q3Question3_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans3 += Q3Question3_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans3 += Q3Question3_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans3 = "~~~~";
		}
		// 4
		if (Q3Question4_Option1.isSelected() || Q3Question4_Option2.isSelected() || Q3Question4_Option3.isSelected()
				|| Q3Question4_Option4.isSelected()) {

			Answer_Model.Answer3.Q3Ans4 = "";
			Answer_Model.Answer3.Q3Ans4 += Q3Question4_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans4 += Q3Question4_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans4 += Q3Question4_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans4 += Q3Question4_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans4 = "~~~~";
		}
		// 5
		if (Q3Question5_Option1.isSelected() || Q3Question5_Option2.isSelected() || Q3Question5_Option3.isSelected()
				|| Q3Question5_Option4.isSelected()) {
			Answer_Model.Answer3.Q3Ans5 = "";
			Answer_Model.Answer3.Q3Ans5 += Q3Question5_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans5 += Q3Question5_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans5 += Q3Question5_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans5 += Q3Question5_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans5 = "~~~~";
		}
		// 6
		if (Q3Question6_Option1.isSelected() || Q3Question6_Option2.isSelected() || Q3Question6_Option3.isSelected()
				|| Q3Question6_Option4.isSelected()) {
			Answer_Model.Answer3.Q3Ans6 = "";
			Answer_Model.Answer3.Q3Ans6 += Q3Question6_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans6 += Q3Question6_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans6 += Q3Question6_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans6 += Q3Question6_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans6 = "~~~~";
		}
		// 7
		if (Q3Question7_Option1.isSelected() || Q3Question7_Option2.isSelected() || Q3Question7_Option3.isSelected()
				|| Q3Question7_Option4.isSelected()) {
			Answer_Model.Answer3.Q3Ans7 = "";
			Answer_Model.Answer3.Q3Ans7 += Q3Question7_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans7 += Q3Question7_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans7 += Q3Question7_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans7 += Q3Question7_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans7 = "~~~~";
		}
		// 8
		if (Q3Question8_Option1.isSelected() || Q3Question8_Option2.isSelected() || Q3Question8_Option3.isSelected()
				|| Q3Question8_Option4.isSelected()) {
			Answer_Model.Answer3.Q3Ans8 = "";
			Answer_Model.Answer3.Q3Ans8 += Q3Question8_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans8 += Q3Question8_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans8 += Q3Question8_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans8 += Q3Question8_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans8 = "~~~~";
		}
		// 9
		if (Q3Question9_Option1.isSelected() || Q3Question9_Option2.isSelected() || Q3Question9_Option3.isSelected()
				|| Q3Question9_Option4.isSelected()) {
			Answer_Model.Answer3.Q3Ans9 = "";
			Answer_Model.Answer3.Q3Ans9 += Q3Question9_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans9 += Q3Question9_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans9 += Q3Question9_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans9 += Q3Question9_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans9 = "~~~~";
		}
		// 10
		if (Q3Question10_Option1.isSelected() || Q3Question10_Option2.isSelected() || Q3Question10_Option3.isSelected()
				|| Q3Question10_Option4.isSelected()) {
			Answer_Model.Answer3.Q3Ans10 = "";
			Answer_Model.Answer3.Q3Ans10 += Q3Question10_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans10 += Q3Question10_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans10 += Q3Question10_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer3.Q3Ans10 += Q3Question10_Option4.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer3.Q3Ans10 = "~~~~";
		}

		common.WriteAnsFile(login_details.Seat_No, "¶Q3Answer£" + myDateObj.format(myFormatObj));
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans1£" + Answer_Model.Answer3.Q3Ans1);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans2£" + Answer_Model.Answer3.Q3Ans2);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans3£" + Answer_Model.Answer3.Q3Ans3);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans4£" + Answer_Model.Answer3.Q3Ans4);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans5£" + Answer_Model.Answer3.Q3Ans5);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans6£" + Answer_Model.Answer3.Q3Ans6);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans7£" + Answer_Model.Answer3.Q3Ans7);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans8£" + Answer_Model.Answer3.Q3Ans8);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans9£" + Answer_Model.Answer3.Q3Ans9);
		common.WriteAnsFile(login_details.Seat_No, "¶Q3Ans10£" + Answer_Model.Answer3.Q3Ans10);
	}

	// get text for question set 4
	private void Write_Question4() {

		// 1
		if (Q4Question1_Option1.isSelected() || Q4Question1_Option2.isSelected() || Q4Question1_Option3.isSelected()
				|| Q4Question1_Option4.isSelected() || Q4Question1_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans1 = "";
			Answer_Model.Answer4.Q4Ans1 += Q4Question1_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans1 += Q4Question1_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans1 += Q4Question1_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans1 += Q4Question1_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans1 += Q4Question1_Option5.isSelected() ? "1" : "~";

		} else {
			Answer_Model.Answer4.Q4Ans1 = "~~~~~";
		}
		// 2
		if (Q4Question2_Option1.isSelected() || Q4Question2_Option2.isSelected() || Q4Question2_Option3.isSelected()
				|| Q4Question2_Option4.isSelected() || Q4Question2_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans2 = "";
			Answer_Model.Answer4.Q4Ans2 += Q4Question2_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans2 += Q4Question2_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans2 += Q4Question2_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans2 += Q4Question2_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans2 += Q4Question2_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans2 = "~~~~~";
		}
		// 3
		if (Q4Question3_Option1.isSelected() || Q4Question3_Option2.isSelected() || Q4Question3_Option3.isSelected()
				|| Q4Question3_Option4.isSelected() || Q4Question3_Option5.isSelected()) {

			Answer_Model.Answer4.Q4Ans3 = "";
			Answer_Model.Answer4.Q4Ans3 += Q4Question3_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans3 += Q4Question3_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans3 += Q4Question3_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans3 += Q4Question3_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans3 += Q4Question3_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans3 = "~~~~~";
		}
		// 4
		if (Q4Question4_Option1.isSelected() || Q4Question4_Option2.isSelected() || Q4Question4_Option3.isSelected()
				|| Q4Question4_Option4.isSelected() || Q4Question4_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans4 = "";
			Answer_Model.Answer4.Q4Ans4 += Q4Question4_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans4 += Q4Question4_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans4 += Q4Question4_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans4 += Q4Question4_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans4 += Q4Question4_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans4 = "~~~~~";
		}
		// 5
		if (Q4Question5_Option1.isSelected() || Q4Question5_Option2.isSelected() || Q4Question5_Option3.isSelected()
				|| Q4Question5_Option4.isSelected() || Q4Question5_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans5 = "";
			Answer_Model.Answer4.Q4Ans5 += Q4Question5_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans5 += Q4Question5_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans5 += Q4Question5_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans5 += Q4Question5_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans5 += Q4Question5_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans5 = "~~~~~";
		}
		// 6
		if (Q4Question6_Option1.isSelected() || Q4Question6_Option2.isSelected() || Q4Question6_Option3.isSelected()
				|| Q4Question6_Option4.isSelected() || Q4Question6_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans6 = "";
			Answer_Model.Answer4.Q4Ans6 += Q4Question6_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans6 += Q4Question6_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans6 += Q4Question6_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans6 += Q4Question6_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans6 += Q4Question6_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans6 = "~~~~~";
		}
		// 7
		if (Q4Question7_Option1.isSelected() || Q4Question7_Option2.isSelected() || Q4Question7_Option3.isSelected()
				|| Q4Question7_Option4.isSelected() || Q4Question7_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans7 = "";
			Answer_Model.Answer4.Q4Ans7 += Q4Question7_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans7 += Q4Question7_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans7 += Q4Question7_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans7 += Q4Question7_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans7 += Q4Question7_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans7 = "~~~~~";
		}
		// 8
		if (Q4Question8_Option1.isSelected() || Q4Question8_Option2.isSelected() || Q4Question8_Option3.isSelected()
				|| Q4Question8_Option4.isSelected() || Q4Question8_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans8 = "";
			Answer_Model.Answer4.Q4Ans8 += Q4Question8_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans8 += Q4Question8_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans8 += Q4Question8_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans8 += Q4Question8_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans8 += Q4Question8_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans8 = "~~~~~";
		}
		// 9
		if (Q4Question9_Option1.isSelected() || Q4Question9_Option2.isSelected() || Q4Question9_Option3.isSelected()
				|| Q4Question9_Option4.isSelected() || Q4Question9_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans9 = "";
			Answer_Model.Answer4.Q4Ans9 += Q4Question9_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans9 += Q4Question9_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans9 += Q4Question9_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans9 += Q4Question9_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans9 += Q4Question9_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans9 = "~~~~~";
		}
		// 10
		if (Q4Question10_Option1.isSelected() || Q4Question10_Option2.isSelected() || Q4Question10_Option3.isSelected()
				|| Q4Question10_Option4.isSelected() || Q4Question10_Option5.isSelected()) {
			Answer_Model.Answer4.Q4Ans10 = "";
			Answer_Model.Answer4.Q4Ans10 += Q4Question10_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans10 += Q4Question10_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans10 += Q4Question10_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans10 += Q4Question10_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer4.Q4Ans10 += Q4Question10_Option5.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer4.Q4Ans10 = "~~~~~";
		}

		common.WriteAnsFile(login_details.Seat_No, "¶Q4Answer£" + myDateObj.format(myFormatObj));
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans1£" + Answer_Model.Answer4.Q4Ans1);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans2£" + Answer_Model.Answer4.Q4Ans2);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans3£" + Answer_Model.Answer4.Q4Ans3);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans4£" + Answer_Model.Answer4.Q4Ans4);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans5£" + Answer_Model.Answer4.Q4Ans5);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans6£" + Answer_Model.Answer4.Q4Ans6);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans7£" + Answer_Model.Answer4.Q4Ans7);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans8£" + Answer_Model.Answer4.Q4Ans8);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans9£" + Answer_Model.Answer4.Q4Ans9);
		common.WriteAnsFile(login_details.Seat_No, "¶Q4Ans10£" + Answer_Model.Answer4.Q4Ans10);
	}

	// get text for question set 5
	private void Write_Question5() {
		if (Q5Question1_Option1.isSelected() || Q5Question1_Option2.isSelected() || Q5Question1_Option3.isSelected()
				|| Q5Question1_Option4.isSelected() || Q5Question1_Option5.isSelected()
				|| Q5Question1_Option6.isSelected()) {

			Answer_Model.Answer5.Q5Ans1 = "";
			Answer_Model.Answer5.Q5Ans1 += Q5Question1_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans1 += Q5Question1_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans1 += Q5Question1_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans1 += Q5Question1_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans1 += Q5Question1_Option5.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans1 += Q5Question1_Option6.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer5.Q5Ans1 = "~~~~~~";
		}

		// 2
		if (Q5Question2_Option1.isSelected() || Q5Question2_Option2.isSelected() || Q5Question2_Option3.isSelected()
				|| Q5Question2_Option4.isSelected() || Q5Question2_Option5.isSelected()
				|| Q5Question2_Option6.isSelected()) {

			Answer_Model.Answer5.Q5Ans2 = "";
			Answer_Model.Answer5.Q5Ans2 += Q5Question2_Option1.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans2 += Q5Question2_Option2.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans2 += Q5Question2_Option3.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans2 += Q5Question2_Option4.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans2 += Q5Question2_Option5.isSelected() ? "1" : "~";
			Answer_Model.Answer5.Q5Ans2 += Q5Question2_Option6.isSelected() ? "1" : "~";
		} else {
			Answer_Model.Answer5.Q5Ans2 = "~~~~~~";
		}

		common.WriteAnsFile(login_details.Seat_No, "¶Q5Answer£" + myDateObj.format(myFormatObj));
		common.WriteAnsFile(login_details.Seat_No, "¶Q5Ans1£" + Answer_Model.Answer5.Q5Ans1);
		common.WriteAnsFile(login_details.Seat_No, "¶Q5Ans2£" + Answer_Model.Answer5.Q5Ans2);
	}

	// get text for question set 6
	private void Write_Question6() {
		Answer_Model.Answer6.Q6Ans1 = txt_Q6Option1.getText() + txt_Q6Option2.getText()+ txt_Q6Option3.getText()+ txt_Q6Option4.getText();

		common.WriteAnsFile(login_details.Seat_No, "¶Q6Answer£" + myDateObj.format(myFormatObj));
		common.WriteAnsFile(login_details.Seat_No, "¶Q6Ans1£" + Answer_Model.Answer6.Q6Ans1);
	}

	// get text for question set 7
	private void Write_Question7() {
		Answer_Model.Answer7.Q7Ans1 = ans_Q7Question1.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer7.Q7Ans2 = ans_Q7Question2.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer7.Q7Ans3 = ans_Q7Question3.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer7.Q7Ans4 = ans_Q7Question4.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer7.Q7Ans5 = ans_Q7Question5.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer7.Q7Ans6 = ans_Q7Question6.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer7.Q7Ans7 = ans_Q7Question7.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer7.Q7Ans8 = ans_Q7Question8.getText().replaceAll("\r\n", "Ω");

		common.WriteAnsFile(login_details.Seat_No, "¶Q7Answer£" + myDateObj.format(myFormatObj));
		common.WriteAnsFile(login_details.Seat_No, "¶Q7Ans1£" + Answer_Model.Answer7.Q7Ans1);
		common.WriteAnsFile(login_details.Seat_No, "¶Q7Ans2£" + Answer_Model.Answer7.Q7Ans2);
		common.WriteAnsFile(login_details.Seat_No, "¶Q7Ans3£" + Answer_Model.Answer7.Q7Ans3);
		common.WriteAnsFile(login_details.Seat_No, "¶Q7Ans4£" + Answer_Model.Answer7.Q7Ans4);
		common.WriteAnsFile(login_details.Seat_No, "¶Q7Ans5£" + Answer_Model.Answer7.Q7Ans5);
		common.WriteAnsFile(login_details.Seat_No, "¶Q7Ans6£" + Answer_Model.Answer7.Q7Ans6);
		common.WriteAnsFile(login_details.Seat_No, "¶Q7Ans7£" + Answer_Model.Answer7.Q7Ans7);
		common.WriteAnsFile(login_details.Seat_No, "¶Q7Ans8£" + Answer_Model.Answer7.Q7Ans8);
	}

	// get text for question set 8
	private void Write_Question8() {
		Answer_Model.Answer8.Q8Ans1 = ans_Q8Question1.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer8.Q8Ans2 = ans_Q8Question2.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer8.Q8Ans3 = ans_Q8Question3.getText().replaceAll("\r\n", "Ω");
		Answer_Model.Answer8.Q8Ans4 = ans_Q8Question4.getText().replaceAll("\r\n", "Ω");

		common.WriteAnsFile(login_details.Seat_No, "¶Q8Answer£" + myDateObj.format(myFormatObj));
		common.WriteAnsFile(login_details.Seat_No, "¶Q8Ans1£" + Answer_Model.Answer8.Q8Ans1);
		common.WriteAnsFile(login_details.Seat_No, "¶Q8Ans2£" + Answer_Model.Answer8.Q8Ans2);
		common.WriteAnsFile(login_details.Seat_No, "¶Q8Ans3£" + Answer_Model.Answer8.Q8Ans3);
		common.WriteAnsFile(login_details.Seat_No, "¶Q8Ans4£" + Answer_Model.Answer8.Q8Ans4);
	}

	/*** ALT Key Listener ***/
	@Override
	public void keyTyped(KeyEvent e) {
		// Handle keyTyped event if needed
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ALT) {
			common.ShowMessage(frame, "Alt key Pressed!!");
			System.exit(0);
		}
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ALT) {
			common.ShowMessage(frame, "Alt key Pressed!!");
			System.exit(0);
		}
	}

	// Thread2
	public class System_Time implements Runnable {

		@Override
		public void run() {
			while (true) {
				lblNewLabel_3.setText(DateFormat.getTimeInstance().format(new Date()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	// Thread1
	public class Exam_Time implements Runnable {
		private LocalTime Exam_Time;

		public Exam_Time(LocalTime i) {
			this.Exam_Time = i;
			// this.Exam_Time=LocalTime.of(00,10,05);
		}

		@Override
		public void run() {
			while (true) {

				try {
					
					Exam_Time = Exam_Time.minusSeconds(1);
					if (!login_details.Hand.trim().equals("00")) 
					{
						
						LocalTime i=Exam_Time.plusMinutes(50);
						lblNewLabel_14.setText(i.toString());
					}
					else {lblNewLabel_14.setText(Exam_Time.toString());}
					Thread.sleep(1000);
					
					
					if (Exam_Time.compareTo(LocalTime.of(00, 00, 00)) == 0
							|| Exam_Time.compareTo(LocalTime.of(00, 00, 00)) < 0) {

						JOptionPane.showMessageDialog(frame, "time up!!");
						Give_Up();
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
}
