import java.util.Random;
import javax.swing.*;

public class NumberGuessGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // 1 to 100
        int attempts = 0;
        int guess = 0;

        while (guess != number) {

            String input = JOptionPane.showInputDialog("Guess a number between 1 and 100:");

            // If user presses Cancel
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Game Cancelled!");
                System.exit(0);
            }

            guess = Integer.parseInt(input);
            attempts++;

            if (guess < number) {
                JOptionPane.showMessageDialog(null, "Too Low! Try Again.");
            } else if (guess > number) {
                JOptionPane.showMessageDialog(null, "Too High! Try Again.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "🎉 Correct! You guessed it in " + attempts + " attempts.");
            }
        }
    }
}