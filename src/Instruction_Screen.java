
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Robot;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.function.LongBinaryOperator;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import Model.Login_Model;
import Helper.*;

public class Instruction_Screen extends JFrame implements KeyListener {

	private JPanel contentPane;
	public String seatno, Time;
	Common common = new Common();
	Login_Model login = new Login_Model();
	Answer_Submit AS = new Answer_Submit();
	JLabel Time_label = new JLabel();
	JButton Start_Btn = new JButton("Start Exam");

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * 
	 * @param servertime
	 * @param seat_No
	 */

	public Instruction_Screen(Login_Model login_model) throws IOException {

		// Shut down when alt key pressed
		addKeyListener(this);
		setFocusable(true);
		
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/Image/ssc-pune-logo.png"));
		setIconImage(icon.getImage());

		setTitle("Instructions");

		System_Time_Thread ctt = new System_Time_Thread();
		new Thread(ctt).start();

		Call_Start_Button csb = new Call_Start_Button();
		new Thread(csb).start();

		setAutoRequestFocus(true);
		setUndecorated(true);
		setSize(851, 762);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(113, 0, 911, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/Image/Header.jpg")));

		lblNewLabel.setBounds(0, 0, 642, 110);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(-54, 110, 1024, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(Time_label, BorderLayout.CENTER);

		
		Time_label.setBounds(637, 11, 229, 24);
		panel_1.add(Time_label);

		JLabel lblNewLabel_1 = new JLabel("Seat no:");
		lblNewLabel_1.setBounds(139, 11, 78, 25);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Date time:");
		lblNewLabel_2.setBounds(569, 11, 91, 25);
		panel_1.add(lblNewLabel_2);

		JLabel Seatno_Label = new JLabel("" + login_model.Seat_No);
		Seatno_Label.setBounds(207, 11, 191, 24);
		panel_1.add(Seatno_Label);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(-71, 154, 922, 608);
		contentPane.add(panel_2);

		JLabel lblNewLabel_3 = new JLabel("Colors And Their Meaning");
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3.setForeground(new Color(72, 61, 139));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lblNewLabel_3_1 = new JLabel("Answer not Submitted.");
		lblNewLabel_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3_1.setForeground(new Color(72, 61, 139));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));

		JLabel lblNewLabel_3_2 = new JLabel("Answer Submitted.");
		lblNewLabel_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2.setForeground(new Color(72, 61, 139));

		JLabel lblNewLabel_3_2_1 = new JLabel("");
		String string1 = "Paper will display 10 mins before the exam but students cannot attempt it.";
		String string2 = "All the questions can be viewed by clicking on top or left panel buttons.";
		lblNewLabel_3_2_1.setText("<HTML>" + string1 + "<br>" + string2 + "</HTML>");
		lblNewLabel_3_2_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel lblNewLabel_3_2_1_1 = new JLabel(
				"<HTML>If you Submit your answers and Relogin the System automatically detect and restore answer automatically.</HTML>");
		lblNewLabel_3_2_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel lblNewLabel_3_2_1_1_1 = new JLabel(
				"<HTML>Handicaped Category Shown On The Top Right.<br>HC 0-No extra time.<br>HC 1,4-50 minutes extra time.<br>HC 2,3,8,9-30 minutes extra time.<br>HC 5-2 Hours extra time.<br>HC 6,7- 1Hours extra time.</HTML>");
		lblNewLabel_3_2_1_1_1.setForeground(new Color(72, 61, 139));
		lblNewLabel_3_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel lblNewLabel_3_2_1_2 = new JLabel(
				"<HTML>Submit Each and Every Question as you solve it.<br>Do Not Wait to submit till last Minuite.</HTML>");
		lblNewLabel_3_2_1_2.setForeground(Color.RED);
		lblNewLabel_3_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_2_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		JLabel lblNewLabel_3_2_2 = new JLabel("All The Best For Exam!!!!");
		lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_2.setForeground(new Color(72, 61, 139));
		lblNewLabel_3_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		Start_Btn.setVisible(false);
		Start_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();

				Mainframe frame = new Mainframe(login_model);
				int Count = Integer.parseInt(login_model.Relogin_Count);
				if (Count > 0) {
					frame.Relogin(login_model);
				}
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			}
		});
		contentPane.add(Start_Btn);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 0, 0));

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBackground(new Color(0, 100, 0));

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup().addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(79)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 46,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_3_2_2, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3_2_1_2, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3_2_1_1_1, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3_2_1_1, 0, 0, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3_2_1, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3_1, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3_2, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 740,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup().addGap(427).addComponent(Start_Btn,
								GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(141, Short.MAX_VALUE)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_2
				.createSequentialGroup().addContainerGap()
				.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(30).addComponent(btnNewButton_1_1,
								GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup().addGap(18).addComponent(lblNewLabel_3_2,
								GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(lblNewLabel_3_2_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblNewLabel_3_2_1_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblNewLabel_3_2_1_1_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblNewLabel_3_2_1_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblNewLabel_3_2_2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(Start_Btn).addContainerGap(26, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);

		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 851, 762);
		contentPane.add(label_1);

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_ALT) {
			Instruction_Screen frame = null;
			try {
				frame = new Instruction_Screen(login);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			common.ShowMessage(frame, "Alt key Pressed!!");
			System.exit(0);

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public class System_Time_Thread implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				Time_label.setText(DateFormat.getDateTimeInstance().format(new Date()));
			}
		}

	}

	public class Call_Start_Button implements Runnable {
		@Override
		public void run() {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (true) {

				LocalDateTime machine_Time_time = LocalDateTime.now();
				int HOUR = machine_Time_time.getHour(), MINUTE = machine_Time_time.getMinute(),
						SECONDS = machine_Time_time.getSecond();
				if (HOUR >= Common.Morning_Batch_Start_Hour() && HOUR <= Common.Morning_Batch_End_Hour()) // Morning
																											// Batch
				{
					if (HOUR == Common.Morning_Batch_Start_Hour()) {
						if (MINUTE >= Common.Morning_Batch_Start_Button_From_Minute()
								&& MINUTE <= Common.Morning_Batch_Start_Button_To_Minute()) {
							
							Start_Btn.setVisible(true);
							break;
						}

					} else {

						Start_Btn.setVisible(true);
						break;
					}

				} else if (HOUR >= Common.Afternoon_Batch_Start_Hour() && HOUR <= Common.Afternoon_Batch_End_Hour()) // Afternoon
				{
					if (HOUR == Common.Afternoon_Batch_Start_Hour()) {
						if (MINUTE >= Common.Afternoon_Batch_Start_Button_From_Minute()
								&& MINUTE <= Common.Afternoon_Batch_Start_Button_To_Minute()) {
							
							Start_Btn.setVisible(true);
							break;
						}

					} else {
						Start_Btn.setVisible(true);
						break;
					}

				}

			}
		}
	}

}
