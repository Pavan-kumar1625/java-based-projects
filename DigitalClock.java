import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {  // DigitalClock class extends JFrame class

    private JLabel timel; // create timelable

    public DigitalClock() {  //constructor
      
        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       
        timel = new JLabel();
        timel.setFont(new Font("Arial", Font.BOLD, 30));
        timel.setHorizontalAlignment(JLabel.CENTER);

        add(timel);

        
        Timer tmr = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {  // action performed method for time updation
                updateTime();
            }
        });
        tmr.start();
    }

    private void updateTime() {   // time update private method
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(new Date());
        timel.setText(time);
    }

    public static void main(String[] args) {  // main fuction
        
        SwingUtilities.invokeLater(new Runnable() {  // runnable class obj
            public void run() {         // run method
                new DigitalClock().setVisible(true);
            }
        });
    }
}