package Subjects;

import javax.swing.*;

import Main.AllSubject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UHV extends JFrame implements ActionListener {
    AllSubject allSubject;

    private String[] labels = {
            "Assignment Marks: ", "Attendance Marks: ", "Class Activity Mark: ", "Final Marks"
    };

    JButton calButton, submitButton;

    JLabel resultShow;

    private JTextField[] fields;

    // public MarksInputFrame() {
    // initializeUI();
    // }

    public UHV(AllSubject allSubject) {
        this.allSubject = allSubject;
        setTitle("Universal Human Values (UHV)");
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
            resultShow.setText("Your UHV Marks out of 100 are " + _sgpa);

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
        _sgpa = _sgpa + ((Float.parseFloat(fields[fields.length - 1].getText()) / 160) * 60);

        return _sgpa;
    }

}
