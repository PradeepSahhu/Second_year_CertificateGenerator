package Subjects;

import javax.swing.*;

import Main.AllSubject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SOFT_SKILLS extends JFrame implements ActionListener {
    AllSubject allSubject;

    private String[] labels = {
            "WRITE X Marks: ", "LIVE ASSIGNMENT Marks: ", "Presentation Marks: ", "Attendance and Engagement Marks:",
            "QUIZ Marks: ", "Final Evaluation Marks(Expected): "
    };

    JButton calButton, submitButton;

    JLabel resultShow;

    private JTextField[] fields;

    // public MarksInputFrame() {
    // initializeUI();
    // }

    public SOFT_SKILLS(AllSubject allSubject) {
        this.allSubject = allSubject;
        setTitle("SOFT SKILLS");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(labels.length + 2, 2));

        fields = new JTextField[labels.length];

        for (int i = 0; i < labels.length; i++) {
            JLabel label = new JLabel(labels[i] + ":");
            fields[i] = new JTextField();
            panel.add(label);
            panel.add(fields[i]);
        }
        resultShow = new JLabel();

        submitButton = new JButton("Submit");
        calButton = new JButton("Calculate SGPA");
        calButton.addActionListener(this);
        submitButton.addActionListener(this);

        panel.add(submitButton);
        panel.add(calButton);
        panel.add(resultShow);
        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calButton) {
            float _sgpa = calSGPa();
            System.out.println(_sgpa);
            resultShow.setText("Your SOFT SKILLS SGPA is " + _sgpa);

        }
        if (e.getSource() == submitButton) {
            float _sgpa = calSGPa();
            System.out.println(_sgpa);
            allSubject.setData(String.valueOf(_sgpa));
            setVisible(false);
        }
        // for (int i = 0; i < labels.length; i++) {
        // String label = labels[i];
        // int value = Integer.parseInt(fields[i].getText());
        // System.out.println(label + ": " + value);
        // }
    }

    private float calSGPa() {
        float _sgpa = 0.0f;

        for (int i = 0; i < fields.length - 1; i++) {
            _sgpa += Float.parseFloat(fields[i].getText());
        }
        _sgpa = (_sgpa / 60) * 10;
        _sgpa += Float.parseFloat(fields[fields.length - 1].getText());

        return _sgpa;
    }

}
