
import javax.swing.*;

import Main.AllSubject;

import java.awt.event.*;
// import Subjects.SubJava;

class HomePage extends JFrame implements ActionListener {

    JButton submit;
    JLabel lname, luid;
    JTextField name, uid;

    HomePage() {

        lname = new JLabel("Enter your Name : ");
        luid = new JLabel("Enter your Uid : ");
        submit = new JButton("Submit");
        name = new JTextField();

        uid = new JTextField();
        setLayout(null);

        lname.setBounds(100, 60, 120, 20);
        name.setBounds(250, 60, 120, 20);
        luid.setBounds(100, 80, 120, 20);
        uid.setBounds(250, 80, 120, 20);
        submit.setBounds(180, 120, 60, 20);

        add(submit);
        add(lname);
        add(luid);
        add(name);
        add(uid);

        setSize(500, 300);
        setVisible(true);
        setTitle("Home Page");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            AllSubject asub = new AllSubject();
            asub.sendData(name.getText());
            asub.sendData(uid.getText());
            asub.AllSub();
            asub.setVisible(true);
            setVisible(false);
            // Certificate ce = new Certificate();
            // ce.sendInfo(name.getText(), uid.getText());

            // SubJava java = new SubJava();
            // java.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new HomePage();
    }

}
