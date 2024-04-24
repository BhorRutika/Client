package Utility;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlinkingLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Blinking Label Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Blinking Label");
        frame.add(label);
        label.setForeground(Color.RED);
                
        Timer timer = new Timer(500, new ActionListener() {
            boolean visible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(visible);
                visible = !visible;
            }
        });
        timer.start();

        frame.setVisible(true);
    }
}
