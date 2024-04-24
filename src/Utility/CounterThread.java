package Utility;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CounterThread extends JFrame implements Runnable
{
		
	private JPanel contentPane;
	public JLabel lblNewLabel = new JLabel();
	JLabel lblNewLabel_1 = new JLabel();
	JLabel lblNewLabel_2 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CounterThread frame = new CounterThread();
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
	public CounterThread() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setBackground(Color.PINK);
		
		
		
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(88, 110, 55, 44);
		contentPane.add(lblNewLabel);
		lblNewLabel_1.setBackground(Color.PINK);
		
		
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(172, 110, 55, 44);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_2.setBackground(Color.PINK);
		
		
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(252, 110, 55, 44);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Stop");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				countdown1Thread.stop();
				countdown2Thread.stop();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(172, 32, 89, 23);
		contentPane.add(btnNewButton);
	}
	 //Thread 1
	Thread countdown1Thread=new Thread(new Runnable() {
		public void run()
		{
			{
			int i;
	
			
			for (i=0;i<=10;i++)
			{
				lblNewLabel.setText(""+i);
				
				try 
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println("Error:"+e);
				}
			}
			System.out.print(i);
	
			//JOptionPane.showMessageDialog(frame,"time up!!");
			//dispose();
		}
		}
	});
	 {
			//countdown1Thread.start();
	}
	 
	 //Thread 2
	 Thread countdown2Thread=new Thread(new Runnable() {
			public void run()
			{
				{
				int i;
		
				
				for (i=0;i<=10;i++)
				{
					lblNewLabel_1.setText(""+i);
					
					try 
					{
						Thread.sleep(2000);
					}
					catch(Exception e)
					{
						System.out.println("Error:"+e);
					}
				}
				System.out.print(i);
		
				//JOptionPane.showMessageDialog(frame,"time up!!");
				//dispose();
			}
			}
		});
		 {
				//countdown2Thread.start();
		}
	 
		 
		//Thread 3
		 Thread countdown3Thread=new Thread(new Runnable() {
				public void run()
				{
					{
					int i;
			
					
					for (i=0;i<=10;i++)
					{
						lblNewLabel_2.setText(""+i);
						
						try 
						{
							Thread.sleep(3000);
						}
						catch(Exception e)
						{
							System.out.println("Error:"+e);
						}
					}
					System.out.print(i);
			
					//JOptionPane.showMessageDialog(frame,"time up!!");
					//dispose();
				}
				}
			});
			 {
					//countdown3Thread.start();
			}
			public void run() {
				// TODO Auto-generated method stub
				
			}
}
class Second implements Runnable 
{
	CounterThread Cc= new CounterThread();
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	
}
