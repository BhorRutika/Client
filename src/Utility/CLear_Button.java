package Utility;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class CLear_Button {
	/*
	 * 
	 * JButton btnNewButton = new JButton("CLEAR"); btnNewButton.setForeground(new
	 * Color(0, 0, 0)); btnNewButton.setBackground(new Color(0, 128, 255));
	 * btnNewButton.setVisible(false); btnNewButton.addActionListener(new
	 * ActionListener() { public void actionPerformed(ActionEvent e) {
	 * 
	 * // Question Paper 1 ans_Q1Question1.setText("");
	 * btn_Q1Question1.setBackground(Color.red);
	 * 
	 * ans_Q1Question2.setText(""); btn_Q1Question2.setBackground(Color.red);
	 * 
	 * ans_Q1Question3.setText(""); btn_Q1Question3.setBackground(Color.red);
	 * 
	 * ans_Q1Question4.setText(""); btn_Q1Question4.setBackground(Color.red);
	 * 
	 * ans_Q1Question5.setText(""); btn_Q1Question5.setBackground(Color.red);
	 * 
	 * ans_Q1Question6.setText(""); btn_Q1Question6.setBackground(Color.red);
	 * 
	 * ans_Q1Question7.setText(""); btn_Q1Question7.setBackground(Color.red);
	 * 
	 * ans_Q1Question8.setText(""); btn_Q1Question8.setBackground(Color.red);
	 * 
	 * ans_Q1Question9.setText(""); btn_Q1Question9.setBackground(Color.red);
	 * 
	 * ans_Q1Question10.setText(""); btn_Q1Question10.setBackground(Color.red);
	 * 
	 * // Question paper 2 ButtonGroup btn1 = new ButtonGroup();
	 * btn1.add(ans_Q2Question1_radio1); btn1.add(ans_Q2Question1_radio2); if
	 * (ans_Q2Question1_radio1.isSelected()) { btn1.clearSelection();
	 * 
	 * } else if (ans_Q2Question1_radio2.isSelected()) { btn1.clearSelection();
	 * 
	 * } btn_Q2Question1.setBackground(Color.red);
	 * 
	 * ButtonGroup btn2 = new ButtonGroup(); btn2.add(ans_Q2Question2_radio1);
	 * btn2.add(ans_Q2Question2_radio2);
	 * 
	 * if (ans_Q2Question2_radio1.isSelected()) { btn2.clearSelection(); } else if
	 * (ans_Q2Question2_radio2.isSelected()) { btn2.clearSelection(); }
	 * btn_Q2Question2.setBackground(Color.red);
	 * 
	 * ButtonGroup btn3 = new ButtonGroup(); btn3.add(ans_Q2Question3_radio1);
	 * btn3.add(ans_Q2Question3_radio2);
	 * 
	 * if (ans_Q2Question3_radio1.isSelected()) { btn3.clearSelection(); } else if
	 * (ans_Q2Question3_radio2.isSelected()) { btn3.clearSelection(); }
	 * btn_Q2Question3.setBackground(Color.red);
	 * 
	 * ButtonGroup btn4 = new ButtonGroup(); btn4.add(ans_Q2Question4_radio1);
	 * btn4.add(ans_Q2Question4_radio2);
	 * 
	 * if (ans_Q2Question4_radio1.isSelected()) { btn4.clearSelection(); } else if
	 * (ans_Q2Question4_radio2.isSelected()) { btn4.clearSelection(); }
	 * btn_Q2Question4.setBackground(Color.red);
	 * 
	 * ButtonGroup btn5 = new ButtonGroup(); btn5.add(ans_Q2Question5_radio1);
	 * btn5.add(ans_Q2Question5_radio2);
	 * 
	 * if (ans_Q2Question5_radio1.isSelected()) { btn5.clearSelection(); } else if
	 * (ans_Q2Question5_radio2.isSelected()) { btn5.clearSelection(); }
	 * btn_Q2Question5.setBackground(Color.red);
	 * 
	 * ButtonGroup btn6 = new ButtonGroup(); btn6.add(ans_Q2Question6_radio1);
	 * btn6.add(ans_Q2Question6_radio2);
	 * 
	 * if (ans_Q2Question6_radio1.isSelected()) { btn6.clearSelection(); } else if
	 * (ans_Q2Question6_radio2.isSelected()) { btn6.clearSelection(); }
	 * btn_Q2Question6.setBackground(Color.red);
	 * 
	 * ButtonGroup btn7 = new ButtonGroup(); btn7.add(ans_Q2Question7_radio1);
	 * btn7.add(ans_Q2Question7_radio2);
	 * 
	 * if (ans_Q2Question7_radio1.isSelected()) { btn7.clearSelection(); } else if
	 * (ans_Q2Question7_radio2.isSelected()) { btn7.clearSelection(); }
	 * btn_Q2Question7.setBackground(Color.red);
	 * 
	 * ButtonGroup btn8 = new ButtonGroup(); btn8.add(ans_Q2Question8_radio1);
	 * btn8.add(ans_Q2Question8_radio2);
	 * 
	 * if (ans_Q2Question8_radio1.isSelected()) { btn8.clearSelection(); } else if
	 * (ans_Q2Question8_radio2.isSelected()) { btn8.clearSelection(); }
	 * btn_Q2Question8.setBackground(Color.red);
	 * 
	 * ButtonGroup btn9 = new ButtonGroup(); btn9.add(ans_Q2Question9_radio1);
	 * btn9.add(ans_Q2Question9_radio2);
	 * 
	 * if (ans_Q2Question9_radio1.isSelected()) { btn9.clearSelection(); } else if
	 * (ans_Q2Question9_radio2.isSelected()) { btn9.clearSelection(); }
	 * btn_Q2Question9.setBackground(Color.red);
	 * 
	 * ButtonGroup btn10 = new ButtonGroup(); btn10.add(ans_Q2Question10_radio1);
	 * btn10.add(ans_Q2Question10_radio2);
	 * 
	 * if (ans_Q2Question10_radio1.isSelected()) { btn10.clearSelection(); } else if
	 * (ans_Q2Question10_radio2.isSelected()) { btn10.clearSelection();
	 * 
	 * } btn_Q2Question10.setBackground(Color.red);
	 * 
	 * // Question papaer 3
	 * 
	 * ButtonGroup B1 = new ButtonGroup(); B1.add(Q3Question1_Option1);
	 * B1.add(Q3Question1_Option2); B1.add(Q3Question1_Option3);
	 * B1.add(Q3Question1_Option4);
	 * 
	 * if (Q3Question1_Option1.isSelected()) { B1.clearSelection(); } else if
	 * (Q3Question1_Option2.isSelected()) { B1.clearSelection();
	 * 
	 * } else if (Q3Question1_Option3.isSelected()) { B1.clearSelection();
	 * 
	 * } else if (Q3Question1_Option4.isSelected()) { B1.clearSelection();
	 * 
	 * } btn_Q3Question1.setBackground(Color.red);
	 * 
	 * ButtonGroup B2 = new ButtonGroup(); B2.add(Q3Question2_Option1);
	 * B2.add(Q3Question2_Option2); B2.add(Q3Question2_Option3);
	 * B2.add(Q3Question2_Option4);
	 * 
	 * if (Q3Question2_Option1.isSelected()) { B2.clearSelection(); } else if
	 * (Q3Question2_Option2.isSelected()) { B2.clearSelection();
	 * 
	 * } else if (Q3Question2_Option3.isSelected()) { B2.clearSelection();
	 * 
	 * } else if (Q3Question2_Option4.isSelected()) { B2.clearSelection();
	 * 
	 * } btn_Q3Question2.setBackground(Color.red);
	 * 
	 * ButtonGroup B3 = new ButtonGroup(); B3.add(Q3Question3_Option1);
	 * B3.add(Q3Question3_Option2); B3.add(Q3Question3_Option3);
	 * B3.add(Q3Question3_Option4);
	 * 
	 * if (Q3Question3_Option1.isSelected()) { B3.clearSelection(); } else if
	 * (Q3Question3_Option2.isSelected()) { B3.clearSelection();
	 * 
	 * } else if (Q3Question3_Option3.isSelected()) { B3.clearSelection();
	 * 
	 * } else if (Q3Question3_Option4.isSelected()) { B3.clearSelection();
	 * 
	 * } btn_Q3Question3.setBackground(Color.red);
	 * 
	 * ButtonGroup B4 = new ButtonGroup(); B4.add(Q3Question4_Option1);
	 * B4.add(Q3Question4_Option2); B4.add(Q3Question4_Option3);
	 * B4.add(Q3Question4_Option4);
	 * 
	 * if (Q3Question4_Option1.isSelected()) { B4.clearSelection(); } else if
	 * (Q3Question4_Option2.isSelected()) { B4.clearSelection();
	 * 
	 * } else if (Q3Question4_Option3.isSelected()) { B4.clearSelection();
	 * 
	 * } else if (Q3Question4_Option4.isSelected()) { B4.clearSelection();
	 * 
	 * } btn_Q3Question4.setBackground(Color.red);
	 * 
	 * ButtonGroup B5 = new ButtonGroup(); B5.add(Q3Question5_Option1);
	 * B5.add(Q3Question5_Option2); B5.add(Q3Question5_Option3);
	 * B5.add(Q3Question5_Option4);
	 * 
	 * if (Q3Question5_Option1.isSelected()) { B5.clearSelection(); } else if
	 * (Q3Question5_Option2.isSelected()) { B5.clearSelection();
	 * 
	 * } else if (Q3Question5_Option3.isSelected()) { B5.clearSelection();
	 * 
	 * } else if (Q3Question5_Option4.isSelected()) { B5.clearSelection();
	 * 
	 * } btn_Q3Question5.setBackground(Color.red);
	 * 
	 * ButtonGroup B6 = new ButtonGroup(); B6.add(Q3Question6_Option1);
	 * B6.add(Q3Question6_Option2); B6.add(Q3Question6_Option3);
	 * B6.add(Q3Question6_Option4);
	 * 
	 * if (Q3Question6_Option1.isSelected()) { B6.clearSelection(); } else if
	 * (Q3Question6_Option2.isSelected()) { B6.clearSelection();
	 * 
	 * } else if (Q3Question6_Option3.isSelected()) { B6.clearSelection();
	 * 
	 * } else if (Q3Question6_Option4.isSelected()) { B6.clearSelection();
	 * 
	 * } btn_Q3Question6.setBackground(Color.red);
	 * 
	 * ButtonGroup B7 = new ButtonGroup(); B7.add(Q3Question7_Option1);
	 * B7.add(Q3Question7_Option2); B7.add(Q3Question7_Option3);
	 * B7.add(Q3Question7_Option4);
	 * 
	 * if (Q3Question7_Option1.isSelected()) { B7.clearSelection(); } else if
	 * (Q3Question7_Option2.isSelected()) { B7.clearSelection();
	 * 
	 * } else if (Q3Question7_Option3.isSelected()) { B7.clearSelection();
	 * 
	 * } else if (Q3Question7_Option4.isSelected()) { B7.clearSelection();
	 * 
	 * } btn_Q3Question7.setBackground(Color.red);
	 * 
	 * ButtonGroup B8 = new ButtonGroup(); B8.add(Q3Question8_Option1);
	 * B8.add(Q3Question8_Option2); B8.add(Q3Question8_Option3);
	 * B8.add(Q3Question8_Option4);
	 * 
	 * if (Q3Question8_Option1.isSelected()) { B8.clearSelection(); } else if
	 * (Q3Question8_Option2.isSelected()) { B8.clearSelection();
	 * 
	 * } else if (Q3Question8_Option3.isSelected()) { B8.clearSelection();
	 * 
	 * } else if (Q3Question8_Option4.isSelected()) { B8.clearSelection();
	 * 
	 * } btn_Q3Question8.setBackground(Color.red);
	 * 
	 * ButtonGroup B9 = new ButtonGroup(); B9.add(Q3Question9_Option1);
	 * B9.add(Q3Question9_Option2); B9.add(Q3Question9_Option3);
	 * B9.add(Q3Question9_Option4);
	 * 
	 * if (Q3Question9_Option1.isSelected()) { B9.clearSelection(); } else if
	 * (Q3Question9_Option2.isSelected()) { B9.clearSelection();
	 * 
	 * } else if (Q3Question9_Option3.isSelected()) { B9.clearSelection();
	 * 
	 * } else if (Q3Question9_Option4.isSelected()) { B9.clearSelection();
	 * 
	 * } btn_Q3Question9.setBackground(Color.red);
	 * 
	 * ButtonGroup B10 = new ButtonGroup(); B10.add(Q3Question10_Option1);
	 * B10.add(Q3Question10_Option2); B10.add(Q3Question10_Option3);
	 * B10.add(Q3Question10_Option4);
	 * 
	 * if (Q3Question10_Option1.isSelected()) { B10.clearSelection(); } else if
	 * (Q3Question10_Option2.isSelected()) { B10.clearSelection();
	 * 
	 * } else if (Q3Question10_Option3.isSelected()) { B10.clearSelection();
	 * 
	 * } else if (Q3Question10_Option4.isSelected()) { B10.clearSelection();
	 * 
	 * } btn_Q3Question10.setBackground(Color.red);
	 * 
	 * // Question papaer 4
	 * 
	 * Q4Question1_Option1.setSelected(false);
	 * Q4Question1_Option2.setSelected(false);
	 * Q4Question1_Option3.setSelected(false);
	 * Q4Question1_Option4.setSelected(false);
	 * Q4Question1_Option5.setSelected(false);
	 * btn_Q4Question1.setBackground(Color.red);
	 * 
	 * Q4Question2_Option1.setSelected(false);
	 * Q4Question2_Option2.setSelected(false);
	 * Q4Question2_Option3.setSelected(false);
	 * Q4Question2_Option4.setSelected(false);
	 * Q4Question2_Option5.setSelected(false);
	 * btn_Q4Question2.setBackground(Color.red);
	 * 
	 * Q4Question3_Option1.setSelected(false);
	 * Q4Question3_Option2.setSelected(false);
	 * Q4Question3_Option3.setSelected(false);
	 * Q4Question3_Option4.setSelected(false);
	 * Q4Question3_Option5.setSelected(false);
	 * btn_Q4Question3.setBackground(Color.red);
	 * 
	 * Q4Question4_Option1.setSelected(false);
	 * Q4Question4_Option2.setSelected(false);
	 * Q4Question4_Option3.setSelected(false);
	 * Q4Question4_Option4.setSelected(false);
	 * Q4Question4_Option5.setSelected(false);
	 * btn_Q4Question4.setBackground(Color.red);
	 * 
	 * Q4Question5_Option1.setSelected(false);
	 * Q4Question5_Option2.setSelected(false);
	 * Q4Question5_Option3.setSelected(false);
	 * Q4Question5_Option4.setSelected(false);
	 * Q4Question5_Option5.setSelected(false);
	 * btn_Q4Question5.setBackground(Color.red);
	 * 
	 * Q4Question6_Option1.setSelected(false);
	 * Q4Question6_Option2.setSelected(false);
	 * Q4Question6_Option3.setSelected(false);
	 * Q4Question6_Option4.setSelected(false);
	 * Q4Question6_Option5.setSelected(false);
	 * btn_Q4Question6.setBackground(Color.red);
	 * 
	 * Q4Question7_Option1.setSelected(false);
	 * Q4Question7_Option2.setSelected(false);
	 * Q4Question7_Option3.setSelected(false);
	 * Q4Question7_Option4.setSelected(false);
	 * Q4Question7_Option5.setSelected(false);
	 * btn_Q4Question7.setBackground(Color.red);
	 * 
	 * Q4Question8_Option1.setSelected(false);
	 * Q4Question8_Option2.setSelected(false);
	 * Q4Question8_Option3.setSelected(false);
	 * Q4Question8_Option4.setSelected(false);
	 * Q4Question8_Option5.setSelected(false);
	 * btn_Q4Question8.setBackground(Color.red);
	 * 
	 * Q4Question9_Option1.setSelected(false);
	 * Q4Question9_Option2.setSelected(false);
	 * Q4Question9_Option3.setSelected(false);
	 * Q4Question9_Option4.setSelected(false);
	 * Q4Question9_Option5.setSelected(false);
	 * btn_Q4Question9.setBackground(Color.red);
	 * 
	 * Q4Question10_Option1.setSelected(false);
	 * Q4Question10_Option2.setSelected(false);
	 * Q4Question10_Option3.setSelected(false);
	 * Q4Question10_Option4.setSelected(false);
	 * Q4Question10_Option5.setSelected(false);
	 * btn_Q4Question10.setBackground(Color.red);
	 * 
	 * // Question paper 5 // Q5Question1_Option1
	 * Q5Question1_Option1.setSelected(false);
	 * Q5Question1_Option2.setSelected(false);
	 * Q5Question1_Option3.setSelected(false);
	 * Q5Question1_Option4.setSelected(false);
	 * Q5Question1_Option5.setSelected(false);
	 * btn_Q5Question1.setBackground(Color.red);
	 * 
	 * Q5Question2_Option1.setSelected(false);
	 * Q5Question2_Option2.setSelected(false);
	 * Q5Question2_Option3.setSelected(false);
	 * Q5Question2_Option4.setSelected(false);
	 * Q5Question2_Option5.setSelected(false);
	 * btn_Q5Question2.setBackground(Color.red);
	 * 
	 * // Question paper 6 txt_Q6Option1.setText(""); txt_Q6Option2.setText("");
	 * txt_Q6Option3.setText(""); txt_Q6Option4.setText("");
	 * 
	 * // Question paper 7 // ans_Q1Question1 ans_Q7Question1.setText("");
	 * btn_Q7Question1.setBackground(Color.red); ans_Q7Question2.setText("");
	 * btn_Q7Question2.setBackground(Color.red); ans_Q7Question3.setText("");
	 * btn_Q7Question3.setBackground(Color.red); ans_Q7Question4.setText("");
	 * btn_Q7Question4.setBackground(Color.red); ans_Q7Question5.setText("");
	 * btn_Q7Question5.setBackground(Color.red); ans_Q7Question6.setText("");
	 * btn_Q7Question6.setBackground(Color.red); ans_Q7Question7.setText("");
	 * btn_Q7Question7.setBackground(Color.red); ans_Q7Question8.setText("");
	 * btn_Q7Question8.setBackground(Color.red);
	 * 
	 * // Question paper 8 ans_Q8Question1.setText("");
	 * btn_Q8Question1.setBackground(Color.red);
	 * 
	 * ans_Q8Question2.setText(""); btn_Q8Question2.setBackground(Color.red);
	 * 
	 * ans_Q8Question3.setText(""); btn_Q8Question3.setBackground(Color.red);
	 * 
	 * ans_Q8Question4.setText(""); btn_Q8Question4.setBackground(Color.red);
	 * 
	 * } });
	 * 
	 */}
