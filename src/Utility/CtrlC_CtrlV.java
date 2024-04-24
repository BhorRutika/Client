package Utility;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CtrlC_CtrlV extends JFrame {
    public CtrlC_CtrlV() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JTextArea textArea = new JTextArea();
        add(textArea);

        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Handle keyTyped event if needed
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Check for Ctrl+C and Ctrl+V combination
                if ((e.isControlDown() && e.getKeyCode() == KeyEvent.VK_C)
                        || (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_V) || (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_X)) {
                    // Handle Ctrl+C and Ctrl+V (prevent default behavior)
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Handle keyReleased event if needed
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CtrlC_CtrlV frame = new CtrlC_CtrlV();
            frame.setVisible(true);
        });
    }
}
