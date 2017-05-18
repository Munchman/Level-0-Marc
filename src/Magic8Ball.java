import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {

		int r1 = new Random().nextInt(3);
		// 3. Print out this variable
		System.out.println(r1);

		JOptionPane.showInputDialog("Enter a yes or no question for the magic 8 ball");

		if (r1 == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}

		if (r1 == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}

		if (r1 == 2) {
			JOptionPane.showMessageDialog(null, "Maybey you should ask google?");
		}

		// 8. If the random number is 3
		if (r1 == 3) {
			JOptionPane.showMessageDialog(null, "ask yo mum");
		}

	}
}
