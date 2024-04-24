package Utility;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AltTab2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Alt Key Disable Example");
        //JTextField textField = new JTextField();

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Handle key typed event if needed
            }

            @Override
            public void keyPressed(KeyEvent e) 
            { 
            	// Called when a key is typed
                char keyChar = e.getKeyChar();
                int asciiValue = (int) keyChar;
                System.out.println("Key typed: " + keyChar + ", ASCII value: " + asciiValue);

                // Check if the ASCII value matches a specific value (e.g., Enter key)
                if (asciiValue == 27) 
                {
                    System.out.println("esc key pressed!");
                    e.consume();
                }
                
             }

            @Override
            public void keyReleased(KeyEvent e) {
                // Handle key released event if needed
            }
        });

        //frame.getContentPane().add(textField);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
