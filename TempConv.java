import java.awt.event.*;
import javax.swing.*;

public class TempConv {

    public static void main(String[] args) {

        JFrame f = new JFrame("Temprature Converter");

        JLabel l1 = new JLabel("Enter Value:");
        JLabel l2 = new JLabel("Result:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        JButton b1 = new JButton("C to F");
        JButton b2 = new JButton("F to C");

        l1.setBounds(30, 30, 100, 20);
        t1.setBounds(130, 30, 100, 20);

        b1.setBounds(30, 70, 90, 30);
        b2.setBounds(140, 70, 90, 30);

        l2.setBounds(30, 120, 100, 20);
        t2.setBounds(130, 120, 100, 20);

        f.add(l1); 
        f.add(t1);
        f.add(b1); 
        f.add(b2);
        f.add(l2);
        f.add(t2);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double c = Double.parseDouble(t1.getText());
                    double fvalue = (c * 9 / 5) + 32;
                    t2.setText("" + fvalue);
                } catch(Exception ex) {
                    t2.setText("error");
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double fval = Double.parseDouble(t1.getText());
                    double cvalue = (fval - 32) * 5 / 9;
                    t2.setText("" + cvalue);
                } catch(Exception ex) {
                    t2.setText("error");
                }
            }
        });

        f.setSize(300, 250);
        f.setLayout(null);   // simple layout
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}