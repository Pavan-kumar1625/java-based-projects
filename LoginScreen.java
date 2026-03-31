import java.awt.event.*;// import swing package
import javax.swing.*;  // import awt package

public class LoginScreen {  // login screen class

    public static void main(String[] args) {  // main function

        JFrame frame = new JFrame("Login Form");  // Frame creation with name
        frame.setSize(300, 200);           // set size of frame
        frame.setLayout(null);                   // set layout of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // exit out of application

        JLabel userl = new JLabel("Username:"); // user Label creation
        userl.setBounds(30, 30, 80, 25);
        frame.add(userl);

        JTextField usert = new JTextField();   // user textfield creation
        usert.setBounds(120, 30, 120, 25);    // set bounds of user textfield
        frame.add(usert);               // add user textfield in frame

        JLabel passl = new JLabel("Password:");  // password level creation
        passl.setBounds(30, 70, 80, 25);        // set bounds of password level
        frame.add(passl);           // add password level on frame

        JPasswordField passt = new JPasswordField();  // password field creation
        passt.setBounds(120, 70, 120, 25);     // set bounds of password field
        frame.add(passt);                        // add password field on frame

        JButton loginb = new JButton("Login");  // login button creation
        loginb.setBounds(90, 110, 100, 30);    // setbounds of button
        frame.add(loginb);                        // add login button on frame

        loginb.addActionListener(new ActionListener() { // login button action
            public void actionPerformed(ActionEvent e) {    // fuction to perform action

                String username = usert.getText();  // getText() method will take username from user textfield
                String password = new String(passt.getPassword());  // getPassword() method will take password from password textfield
  
                if (username.equals("admin") && password.equals("1234")) {    // match user name and password
                    JOptionPane.showMessageDialog(frame, "Login Successful!");  // dialog to show message after match username and password
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password!"); // dialog to show message after does not match username and password
                }
            }
        });

        frame.setVisible(true);  // use to make frame visible
    }
} 