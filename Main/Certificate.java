package Main;

import javax.swing.*;

// import Main.AllSubject;

import java.awt.*;

import java.util.ArrayList;

public class Certificate extends JFrame {
    ArrayList<Float> Marks = new ArrayList<>();
    String rname;
    String ruid;
    AllSubject allSubject;

    private String[] labels = {
            "JAVA PROGRAMMING ", "DATA STRUCTURES ", "MATHEMATICS ", "SOFT SKILLS ",
            "QUANTUM PHYSICS ",
            "UHV ", "GENERAL PROFECIENCY ", "SOCIAL INTERNSHIP ",
            "COMPUTER ORGANIZATION & ARCHITECTURE ",
    };

    JLabel resultShow;
    JLabel name, uid;

    private JLabel[] fields;

    // public MarksInputFrame() {
    // initializeUI();
    // }

    public void Cert() {
        // this.allSubject = allSubject;
        setTitle("CERTIFICATE");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(labels.length + 3, 2));
        name = new JLabel(rname);
        uid = new JLabel(ruid);
        panel.add(name);
        panel.add(uid);

        fields = new JLabel[labels.length];
        System.out.println("till here its wokring");

        for (int i = 0; i < (labels.length); i++) {
            JLabel label = new JLabel(labels[i] + ":");
            fields[i] = new JLabel(String.valueOf(Marks.get(i)));
            panel.add(label);
            panel.add(fields[i]);
        }
        resultShow = new JLabel();
        System.out.println("IS IT Working??");

        panel.add(resultShow);
        add(panel);
        setVisible(true);
    }

    // private void submitButtonClicked() {
    // // Retrieve the entered values
    // for (int i = 0; i < labels.length; i++) {
    // String label = labels[i];
    // int value = Integer.parseInt(fields[i].getText());
    // System.out.println(label + ": " + value);
    // }
    // }

    // public void actionPerformed(ActionEvent e) {

    // if (e.getSource() == calButton) {
    // float _sgpa = calSGPa();
    // System.out.println(_sgpa);
    // resultShow.setText("Your DSA SGPA is " + _sgpa);

    // }

    // if (e.getSource() == submitButton) {
    // float _sgpa = calSGPa();
    // System.out.println(_sgpa);
    // allSubject.setData(String.valueOf(_sgpa));
    // setVisible(false);
    // }
    // for (int i = 0; i < labels.length; i++) {
    // String label = labels[i];
    // int value = Integer.parseInt(fields[i].getText());
    // System.out.println(label + ": " + value);
    // }
    // }

    // private float calSGPa() {
    // float _sgpa = 0.0f;

    // for (int i = 0; i < fields.length; i++) {
    // _sgpa += Float.parseFloat(fields[i].getText());
    // }
    // _sgpa = (_sgpa / 308) * 10;

    // return _sgpa;
    // }

    public void sendData(ArrayList<Float> Marks) {
        this.Marks = Marks;
    }

    public void sendInfo(String name, String uid) {
        this.rname = name;
        this.ruid = uid;
    }

}
