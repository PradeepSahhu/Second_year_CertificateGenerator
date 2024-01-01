package Subjects;

import javax.swing.*;

import Main.AllSubject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPs extends JFrame implements ActionListener {
    AllSubject allSubject;

    JLabel lEXTERNAL_GP_MARKS;

    JButton calButton, submitButton;

    JLabel resultShow;

    JTextField EXTERNAL_GP_MARKS;

    // private JTextField[] fields;

    // public MarksInputFrame() {
    // initializeUI();
    // }

    public GPs(AllSubject allSubject) {
        this.allSubject = allSubject;
        setTitle("General Profeciency Marks");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1 + 2, 2));

        // for (int i = 0; i < labels.length; i++) {
        lEXTERNAL_GP_MARKS = new JLabel("Enter your GP EXTERNAL GP MARKS");
        EXTERNAL_GP_MARKS = new JTextField();

        resultShow = new JLabel();

        submitButton = new JButton("Submit");
        calButton = new JButton("Calculate SGPA");
        calButton.addActionListener(this);
        submitButton.addActionListener(this);

        panel.add(lEXTERNAL_GP_MARKS);
        panel.add(EXTERNAL_GP_MARKS);
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
            resultShow.setText("Your GP SGPA is " + _sgpa);

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

        _sgpa += Float.parseFloat(EXTERNAL_GP_MARKS.getText());

        _sgpa = (_sgpa / 80) * 100;

        return _sgpa;
    }

}
