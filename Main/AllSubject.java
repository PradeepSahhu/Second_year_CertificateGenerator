package Main;

import javax.swing.*;
import java.util.*;

import Subjects.DSASUBJECT;
import Subjects.GPs;
import Subjects.MATHEMATICS;
import Subjects.SOFT_SKILLS;
import Subjects.SingleSubject;
import Subjects.SubJava;
import Subjects.UHV;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

//---------

public class AllSubject extends JFrame implements ActionListener {

    JButton JAVA, DSA, MATHEMATICS, SOFT_SKILLS, QUANTUM_PHYSICS, SOCIAL_INTERNSHIP, GP, UHV, COA, calFinalGrade,
            GenerateCertificate, Send_FeedBack;
    JLabel final_result;

    ArrayList<Float> Marks = new ArrayList<Float>();
    ArrayList<String> Info = new ArrayList<String>();

    public void AllSub() {

        JAVA = new JButton("JAVA Subject");
        DSA = new JButton("DSA Subject");
        MATHEMATICS = new JButton("MATHEMATICS Subject");
        SOFT_SKILLS = new JButton("SOFT_SKILLS Subject");
        QUANTUM_PHYSICS = new JButton("QUANTUM_PHYSICS");
        UHV = new JButton("UNIVERSAL HUMAN VALUES (UHV)");
        SOCIAL_INTERNSHIP = new JButton("SOCIAL_INTERNSHIP Subject");
        GP = new JButton("GP Subject");
        COA = new JButton("COMPUTER ORGANIZATION & ARCHITECTURE");
        calFinalGrade = new JButton("Calculate Final Grade");
        GenerateCertificate = new JButton("Generate Certificate");
        Send_FeedBack = new JButton("Send FeedBack");
        final_result = new JLabel();

        setLayout(new GridLayout(14, 1));
        add(JAVA);
        add(DSA);
        add(MATHEMATICS);
        add(SOFT_SKILLS);
        add(QUANTUM_PHYSICS);
        add(UHV);
        add(GP);
        add(SOCIAL_INTERNSHIP);
        add(COA);
        add(Send_FeedBack);
        // add(GenerateCertificate);
        // add(calFinalGrade);
        add(final_result);

        setSize(700, 500);
        setVisible(true);
        setTitle("Name : " + Info.get(0) + ", UID: " + Info.get(1) + " All Subjects (3rd Semester)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JAVA.addActionListener(this);
        DSA.addActionListener(this);
        MATHEMATICS.addActionListener(this);
        SOFT_SKILLS.addActionListener(this);
        QUANTUM_PHYSICS.addActionListener(this);
        UHV.addActionListener(this);
        GP.addActionListener(this);
        SOCIAL_INTERNSHIP.addActionListener(this);
        COA.addActionListener(this);
        GenerateCertificate.addActionListener(this);
        Send_FeedBack.addActionListener(this);
        calFinalGrade.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == JAVA) {
            SubJava java = new SubJava(this);
            java.setVisible(true);
            JAVA.setEnabled(false);
            // setVisible(false);

        } else if (e.getSource() == DSA) {
            DSASUBJECT dsa = new DSASUBJECT(this);
            dsa.setVisible(true);
            DSA.setEnabled(false);

        } else if (e.getSource() == MATHEMATICS) {
            MATHEMATICS maths = new MATHEMATICS(this);
            maths.setVisible(true);
            MATHEMATICS.setEnabled(false);

        } else if (e.getSource() == SOFT_SKILLS) {
            SOFT_SKILLS ss = new SOFT_SKILLS(this);
            ss.setVisible(true);
            SOFT_SKILLS.setEnabled(false);

        } else if (e.getSource() == QUANTUM_PHYSICS) {
            MATHEMATICS qp = new MATHEMATICS(this);
            qp.setTitle("Quantum Physics");
            qp.setVisible(true);
            QUANTUM_PHYSICS.setEnabled(false);

        } else if (e.getSource() == UHV) {
            UHV uhv = new UHV(this);
            uhv.setVisible(true);
            UHV.setEnabled(false);

        } else if (e.getSource() == GP) {
            GPs gp = new GPs(this);
            gp.setVisible(true);
            GP.setEnabled(false);

        } else if (e.getSource() == SOCIAL_INTERNSHIP) {
            SingleSubject singleSubject = new SingleSubject(this);
            singleSubject.setTitle("Social Internship");
            singleSubject.setVisible(true);
            SOCIAL_INTERNSHIP.setEnabled(false);

        } else if (e.getSource() == COA) {
            SingleSubject singleSubject = new SingleSubject(this);
            singleSubject.setTitle("COMPUTER ORGANIZATION & ARCHITECTURE");
            singleSubject.setVisible(true);
            COA.setEnabled(false);
        }

        else if (e.getSource() == calFinalGrade) {

            float final_sgpa = 0.0f;
            for (int i = 0; i < Marks.size(); i++) {
                final_sgpa += Marks.get(i);
            }
            final_sgpa = final_sgpa / Marks.size();
            final_result.setText("Your Final Result is : " + String.valueOf(final_sgpa));
            genCertificate();

        } else if (e.getSource() == GenerateCertificate) {
            if (Marks.size() >= 9) {
                Certificate ce = new Certificate();
                ce.sendData(Marks);
                ce.sendInfo(Info.get(0), Info.get(1));
                ce.Cert();
                ce.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Beautiful People, enter All Subject Marks to Generate Certificate 😂");
            }

        } else if (e.getSource() == Send_FeedBack) {
            try {
                URI mailToMe = new URI(
                        "mailto:official.pradeepsahu@gmail.com?subject=Feedback%20About%20Application&body=Hello%20there!");
                Desktop.getDesktop().mail(mailToMe);

            } catch (Exception f) {
                JOptionPane.showMessageDialog(this, "Sorry at this moment mail can't be delivered");
                System.out.println(f);
            }

        }
    }

    // public void personalInfo(String name, String uid) {

    // }

    public void sendData(String info) {
        Info.add(info);
    }

    public void setData(String sgpa) {
        float _sgpa_ = Float.parseFloat(sgpa);
        Marks.add(_sgpa_);
        checkAllSub();
    }

    public void checkAllSub() {
        System.out.println(Marks.size());
        if (Marks.size() > 1) {
            add(calFinalGrade);
            revalidate(); // Refresh the layout
            repaint(); // redraw the components
        }
    }

    public void genCertificate() {
        add(GenerateCertificate);
        revalidate();
        repaint();
    }

}
