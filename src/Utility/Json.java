package Utility;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.Gson;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;

public class Json extends JFrame implements ActionListener {
    private JLabel Question_Field;
    private JRadioButton Option_1;
    private JRadioButton Option_2;
    private JRadioButton Option_3;
    private JRadioButton Option_4;
    private ButtonGroup buttonGroup;
    private JSONArray questions;
    private int currentQuestionIndex = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Json frame = new Json();
                frame.setVisible(true);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setLocationRelativeTo(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Json() throws JSONException {
        setUndecorated(true);
        LoadQuestionPaper();
        initComponents();
        createUI();
    }

    private void LoadQuestionPaper() throws JSONException {
        try {
            String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\MSBSHSE-AIO\\Desktop\\JsonTxt.txt")));
            JSONObject jsonObject = new JSONObject(content);
            questions = jsonObject.getJSONArray("questions");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initComponents() {
        Question_Field = new JLabel();
        Option_1 = new JRadioButton();
        Option_2 = new JRadioButton();
        Option_3 = new JRadioButton();
        Option_4 = new JRadioButton();
        buttonGroup = new ButtonGroup();
        buttonGroup.add(Option_1);
        buttonGroup.add(Option_2);
        buttonGroup.add(Option_3);
        buttonGroup.add(Option_4);
    }

    private void createUI() throws JSONException {
        // Your UI initialization code goes here
        // Add Question_Field, Option_1, Option_2, Option_3, Option_4 to your JFrame
        // Set layouts, fonts, and positions for these components

        // Example:
        setLayout(new FlowLayout());
        add(Question_Field);
        add(Option_1);
        add(Option_2);
        add(Option_3);
        add(Option_4);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        add(nextButton);

        // Display the first question and options
        displayQuestion();
    }

    private void displayQuestion() throws JSONException {
        JSONObject currentQuestion = questions.getJSONObject(currentQuestionIndex);
        String questionText = currentQuestion.getString("question");
        Question_Field.setText(questionText);

        JSONArray options = currentQuestion.getJSONArray("options");
        Option_1.setText(options.getString(0));
        Option_2.setText(options.getString(1));
        Option_3.setText(options.getString(2));
        Option_4.setText(options.getString(3));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Next")) {
            if (currentQuestionIndex < questions.length() - 1) {
                currentQuestionIndex++;
                try {
					displayQuestion();
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                // Clear selection for radio buttons
                clearSelection(buttonGroup);
            } else {
                JOptionPane.showMessageDialog(this, "No more questions!");
            }
        }
    }

    private void clearSelection(ButtonGroup group) {
        group.clearSelection();
    }
}
