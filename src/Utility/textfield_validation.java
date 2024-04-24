package Utility;
import javax.swing.*;
import java.awt.event.*;

public class textfield_validation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField Validation Example");
        JTextField textField = new JTextField(10);

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = textField.getText();

                // Validate input: one character followed by six digits
                if (!(text.length() == 0 && Character.isLetter(c)) && 
                    !(text.length() >= 1 && text.length() <= 7 && Character.isDigit(c))) {
                    e.consume(); // Discard the key event
                    showMessage("Invalid input. Please enter one character followed by six digits.");
                }
            }
        });

        frame.getContentPane().add(textField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
