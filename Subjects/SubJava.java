package Subjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Main.AllSubject;

public class SubJava extends JFrame implements ActionListener {
    AllSubject allSubject;

    JLabel lmst1, lmst2, lev1, lev2, lev3, lev4, lsurTest, lAttendance, lquiz, lclassPerformance, lcourseProject,
            lassignment, lEndTermPra, lEndTermTheory;
    JTextField mst1, mst2, ev1, ev2, ev3, ev4, surTest, Attendance, quiz, classPerformance, courseProject,
            assignment, EndTermPra, EndTermTheory;
    JButton submit, calculate;

    JLabel showResult;

    // JLabel labelElements[] = { lmst1, lmst2, lev1, lev2, lev3, lev4, lsurTest,
    // lAttendance, lquiz, lclassPerformance,
    // lcourseProject,
    // lEndTermPra, lEndTermTheory };
    // JTextField textElements[] = { mst1, mst2, ev1, ev2, ev3, ev4, surTest,
    // Attendance, quiz, classPerformance,
    // courseProject,
    // EndTermPra, EndTermTheory };

    public SubJava(AllSubject allSubject) {
        this.allSubject = allSubject;

        setLayout(new GridLayout(17, 2));
        // setLayout(new FlowLayout());

        lmst1 = new JLabel("Enter MST-1 Marks");
        lmst2 = new JLabel("Enter MST-2 Marks");
        lev1 = new JLabel("Enter Experiment-1 Marks");
        lev2 = new JLabel("Enter Experiment-2 Marks");
        lev3 = new JLabel("Enter Experiment-3 Marks");
        lev4 = new JLabel("Enter Experiment-4 Marks");
        lclassPerformance = new JLabel("Enter class Performance Marks");
        lcourseProject = new JLabel("Enter Course Project Marks");
        lEndTermPra = new JLabel("Enter End Term Practical Marks");
        lEndTermTheory = new JLabel("Enter End Term Theory Marks");
        lsurTest = new JLabel("Enter Surprise Test Marks");
        lquiz = new JLabel("Enter Quiz Marks");
        lAttendance = new JLabel("Enter Attendance Marks");
        lassignment = new JLabel("Enter your Assignment Marks");

        showResult = new JLabel();

        // TextField

        mst1 = new JTextField();
        mst2 = new JTextField();
        ev1 = new JTextField();
        ev2 = new JTextField();
        ev3 = new JTextField();
        ev4 = new JTextField();
        classPerformance = new JTextField();
        courseProject = new JTextField();
        EndTermPra = new JTextField();
        EndTermTheory = new JTextField();
        surTest = new JTextField();
        quiz = new JTextField();
        Attendance = new JTextField();
        assignment = new JTextField();

        submit = new JButton("Submit");
        calculate = new JButton("Calculate");
        // setLayout(null);

        // int y_axis = 60;
        // labelElements[0].setBounds(100, y_axis, 200, 20);

        // for (int i = 0; i < labelElements.length; i++) {
        // labelElements[i].setBounds(100, y_axis, 200, 20);
        // y_axis += 40;
        // }

        // lmst1.setBounds(100, 60, 150, 20);
        // lmst2.setBounds(100, 80, 150, 20);
        // lev1.setBounds(100, 100, 150, 20);
        // lev2.setBounds(100, 120, 150, 20);
        // lev3.setBounds(100, 140, 150, 20);
        // lev4.setBounds(100, 160, 150, 20);
        // lclassPerformance.setBounds(100, 180, 150, 20);
        // lcourseProject.setBounds(100, 200, 150, 20);
        // lEndTermPra.setBounds(100, 220, 150, 20);
        // lEndTermTheory.setBounds(100, 240, 150, 20);

        // mst1.setBounds(220, 260, 150, 20);
        // mst2.setBounds(220, 280, 150, 20);
        // submit.setBounds(180, 330, 60, 20);

        add(lmst1);
        add(mst1);
        add(lmst2);
        add(mst2);
        add(lev1);
        add(ev1);
        add(lev2);
        add(ev2);
        add(lev3);
        add(ev3);
        add(lev4);
        add(ev4);
        add(lsurTest);
        add(surTest);
        add(lquiz);
        add(quiz);
        add(lAttendance);
        add(Attendance);
        add(lclassPerformance);
        add(classPerformance);
        add(lcourseProject);
        add(courseProject);
        add(lassignment);
        add(assignment);
        add(lEndTermPra);
        add(EndTermPra);
        add(lEndTermTheory);
        add(EndTermTheory);
        add(submit);
        add(calculate);
        add(showResult);

        setSize(600, 500);
        setVisible(true);
        setTitle("Java Subject");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        submit.addActionListener(this);
        calculate.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calculate) {
            calculate_SGPA();
        }
        if (e.getSource() == submit) {
            float java_sgpa = calculate_SGPA();
            allSubject.setData(String.valueOf(java_sgpa));
            setVisible(false);
            // DSASUBJECT dsa = new DSASUBJECT();
            // dsa.setVisible(true);

        }
    }

    private float calculate_SGPA() {
        float mst_1 = Float.parseFloat(mst1.getText());
        float mst_2 = Float.parseFloat(mst2.getText());
        float evaluation_1 = Float.parseFloat(ev1.getText());
        float evaluation_2 = Float.parseFloat(ev2.getText());
        float evaluation_3 = Float.parseFloat(ev3.getText());
        float evaluation_4 = Float.parseFloat(ev4.getText());
        float classPerformance_marks = Float.parseFloat(classPerformance.getText());
        float courseProject_marks = Float.parseFloat(courseProject.getText());
        float EndTermPra_marks = Float.parseFloat(EndTermPra.getText());
        float EndTermTheory_marks = Float.parseFloat(EndTermTheory.getText());
        float surTest_marks = Float.parseFloat(surTest.getText());
        float quiz_marks = Float.parseFloat(quiz.getText());
        float Attendance_marks = Float.parseFloat(Attendance.getText());
        float assignment_marks = Float.parseFloat(assignment.getText());

        System.out.println(mst_1);
        System.out.println(mst_2);
        System.out.println(evaluation_1);
        System.out.println(evaluation_2);
        System.out.println(evaluation_3);
        System.out.println(evaluation_4);
        System.out.println(classPerformance_marks);
        System.out.println(courseProject_marks);
        System.out.println(EndTermPra_marks);
        System.out.println(EndTermTheory_marks);
        System.out.println(surTest_marks);
        System.out.println(quiz_marks);
        System.out.println(Attendance_marks);
        System.out.println(assignment_marks);

        float total = mst_1 + mst_2 + evaluation_1 + evaluation_2 + evaluation_3 + evaluation_4
                + classPerformance_marks + courseProject_marks + EndTermPra_marks + EndTermTheory_marks
                + surTest_marks + quiz_marks + Attendance_marks + assignment_marks;
        System.out.println("Your JAVA Marks are out of 100 : " + total);

        float sub_sgpa = (total / 308) * 100;

        if (sub_sgpa == 100) {
            showResult.setText("Your Grade is : A+" + " with the SGPA of " + sub_sgpa);
        } else if (sub_sgpa >= 90) {
            showResult.setText("Your Grade is : A" + " with the SGPA of " + sub_sgpa);
        } else if (sub_sgpa >= 84) {
            showResult.setText("Your Grade is : B+" + " with the SGPA of " + sub_sgpa);
        } else if (sub_sgpa >= 75) {
            showResult.setText("Your Grade is : B" + " with the SGPA of " + sub_sgpa);
        } else if (sub_sgpa >= 70) {
            showResult.setText("Your Grade is : C+" + " with the SGPA of " + sub_sgpa);

        } else if (sub_sgpa >= 65) {
            showResult.setText("Your Grade is : C" + " with the SGPA of " + sub_sgpa);

        } else if (sub_sgpa >= 60) {
            showResult.setText("Your Grade is : D+" + " with the SGPA of " + sub_sgpa);
        } else if (sub_sgpa >= 50) {
            showResult.setText("Your Grade is : D" + " with the SGPA of " + sub_sgpa);
        } else {
            showResult.setText("Your Grade is : F" + " with the SGPA of " + sub_sgpa);
        }

        return sub_sgpa;
    }
}
