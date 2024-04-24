package Utility;

import javax.swing.*;
import java.awt.*;

public class FullScreenFrame extends JFrame {

    public FullScreenFrame() {
        super("Fullscreen JFrame");

        // Set the frame to be undecorated to remove borders
        //setUndecorated(true);

        // Set the size of the frame to the size of the screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Set a layout manager (optional, depends on your content)
        setLayout(new BorderLayout());

        // Create and add components
        JLabel label = new JLabel("Hello, World!");
        label.setHorizontalAlignment(SwingConstants.CENTER); // Center text
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Set font
        add(label, BorderLayout.CENTER); // Add label to the center of the frame

        // Exit the application when the frame is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(FullScreenFrame::new);
    }
}

