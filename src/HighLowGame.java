
import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int r = new Random().nextInt(100)+1;
			// 2. Print out the random variable above
			System.out.println(r);
			// 11. do the following 10 times
			for (int i = 10; i < args.length; i++) {
				
			}
				// 1. ask the user for a guess using a pop-up window, and save their response 
String guess=JOptionPane.showInputDialog("Guess a number number between 1 - 100!");
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
int g =Integer.parseInt(guess);
				// 5. if the guess is correct
if (g == r) {
	JOptionPane.showMessageDialog(null, "You win!");
}
					// 6. win
				// 7. if the guess is high
if (g>r) {
JOptionPane.showMessageDialog(null, "Too high!");	
	
}
					// 8. tell them it's too high
if (g<r) {
	JOptionPane.showMessageDialog(null, "Too low!");
}
				// 9. if the guess is low
					// 10. tell them it's too low

			// 12. tell them they lose

		}

}
