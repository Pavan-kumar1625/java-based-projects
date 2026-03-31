// Tic Tac Toe Game

import javax.swing.*;
import java.awt.event.*;

public class TicTacToe {

    JFrame f;
    JButton b[] = new JButton[9];
    JButton reset;
    int turn = 0;

    TicTacToe() {

        f = new JFrame("Tic Tac Toe");
        //button
        for(int i = 0; i < 9; i++) {
            b[i] = new JButton("");
            b[i].setBounds((i%3)*100, (i/3)*100, 100, 100);
            f.add(b[i]);

            int index = i;

            b[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    if(b[index].getText().equals("")) {

                        if(turn == 0) {
                            b[index].setText("X");
                            turn = 1;
                        } else {
                            b[index].setText("O");
                            turn = 0;
                        }

                        checkWin();
                    }
                }
            });
        }

        reset = new JButton("Reset");
        reset.setBounds(50, 320, 200, 30);
        f.add(reset);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < 9; i++) {
                    b[i].setText("");
                }
                turn = 0;
            }
        });

        f.setSize(320, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

  
    void checkWin() {

        String win[][] = {
            {"0","1","2"}, {"3","4","5"}, {"6","7","8"}, // rows
            {"0","3","6"}, {"1","4","7"}, {"2","5","8"}, // cols
            {"0","4","8"}, {"2","4","6"}                 // diagonals
        };

        for(int i = 0; i < 8; i++) {

            int a = Integer.parseInt(win[i][0]);
            int c = Integer.parseInt(win[i][1]);
            int d = Integer.parseInt(win[i][2]);

            if(!b[a].getText().equals("") &&
               b[a].getText().equals(b[c].getText()) &&
               b[a].getText().equals(b[d].getText())) {

                JOptionPane.showMessageDialog(f, b[a].getText() + " wins!");

             
                for(int j = 0; j < 9; j++) {
                    b[j].setEnabled(false);
                }
            }
        }
    }

    public static void main(String[] args) {
      TicTacToe t1 =  new TicTacToe();
    }
}