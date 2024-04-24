package Utility;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AltTab extends JFrame {
    public AltTab() {
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Handle keyTyped event if needed
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Check for Alt key
                /*if (e.isAltDown()) 
                {	
                    System.out.println("Alt key pressed");
                }*/
                
                /*if ((e.getModifiers() & KeyEvent.ALT_MASK) != 0)
                {
                	System.out.println(e.getModifiers() & KeyEvent.ALT_MASK);
                }*/
                
            	 if (e.getKeyCode() == KeyEvent.VK_ALT) 
            	 {
            		 System.out.println("ALT pressed");
            		 System.exit(0);
            		
                 } 
            	 
            	// Check for Tab key
            	 /*else if (e.getKeyCode() == KeyEvent.VK_TAB) 
            	 {
                     //Consume the Tab key event to disable it
            		setFocusTraversalKeysEnabled(false);
                 	System.out.println("tab");
                     //e.consume();
                 }
            	 
            	 else 
            	 {
                     //Handle other key events
                     System.out.println("Key pressed: " + e.getKeyChar());
                 }
            	 */
            	 /*if (e.isAltDown()) 
                 {
                     System.out.println("Alt key pressed along with " + e.getKeyChar());
                 }*/
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Handle keyReleased event if needed
            }
            
           
        });

        // Ensure the frame is focusable to receive key events
        setFocusable(true);
     
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AltTab frame = new AltTab();
            frame.setVisible(true);
            
        });
    }
}
