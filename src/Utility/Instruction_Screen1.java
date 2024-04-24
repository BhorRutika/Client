package Utility;
import java.awt.EventQueue;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.JLabel;
import Model.*;
import Helper.*;

public class Instruction_Screen1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static JButton Start_Btn1 = new JButton("New button");
	
	public String seatno;
	public String Time;
	Common common = new Common();
	Login_Model login = new Login_Model();
	 JLabel Time_label =  new JLabel("New label");;
	 
		public static void main(String[] args) throws IOException, ParseException {

			
			Instruction_Screen1	main = new Instruction_Screen1();
			main.setUndecorated(true);
			main.setSize(450, 330);
			main.setLocationRelativeTo(null);
			main.setDefaultCloseOperation(EXIT_ON_CLOSE);
			main.setVisible(true);
			

		}
	 Instruction_Screen1() {
		
		
		System_Time_Thread ctt = new System_Time_Thread();
		new Thread(ctt).start();
		
		Call_Start_Button csb = new Call_Start_Button();
		new Thread(csb).start();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton Start_Btn = new JButton("New button");
		Start_Btn.setVisible(false);
		Start_Btn.setBounds(167, 150, 89, 23);
		contentPane.add(Start_Btn);
		Start_Btn1.setVisible(false);
		
		Time_label.setBounds(123, 25, 245, 14);
		contentPane.add(Time_label);
		 Start_Btn1 = Start_Btn;
		 
		
				
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
			//
			
			Start_Btn1.setVisible(false);
			System.out.println("In");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Start_Btn1.setVisible(true);			
			/*
			 * while (true) {
			 * 
			 * LocalDateTime machine_Time_time = LocalDateTime.now(); int HOUR =
			 * mac hine_Time_time.getHour(), MINUTE = machine_Time_time.getMinute(), SECONDS
			 * = machine_Time_time.getSecond(); if (HOUR >=
			 * Common.Morning_Batch_Start_Hour() && HOUR <= Common.Morning_Batch_End_Hour())
			 * // Morning // Batch { if (HOUR == Common.Morning_Batch_Start_Hour()) { if
			 * (MINUTE >= Common.Morning_Batch_Start_Button_From_Minute() && MINUTE <=
			 * Common.Morning_Batch_Start_Button_To_Minute()) { // LOGIN
			 * //Start_Btn.setVisible(true); Start_Btn.setVisible(true); break; }
			 * 
			 * } else { System.out.println("In");
			 * 
			 * break; }
			 * 
			 * } else if (HOUR >= Common.Afternoon_Batch_Start_Hour() && HOUR <=
			 * Common.Afternoon_Batch_End_Hour()) // Afternoon { if (HOUR ==
			 * Common.Afternoon_Batch_Start_Hour()) { if (MINUTE >=
			 * Common.Afternoon_Batch_Start_Button_From_Minute() && MINUTE <=
			 * Common.Afternoon_Batch_Start_Button_To_Minute()) {
			 * Start_Btn.setVisible(true); break; }
			 * 
			 * } else { Start_Btn.setVisible(true); break; }
			 * 
			 * }
			 * 
			 * 
			 * 
			 * }
			 */		}
	}
}

			
		
	

