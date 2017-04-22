
import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.

	

	public static void main(String[] args) {
		int exited = 0;
		// 1. Ask the user what kind of pet they want to buy, and store in
		// variable
		JOptionPane.showInputDialog("what kind of pet  do want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make
		// their pet happy

		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "how do you want to make your pet happy?", "happy", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Toys", "Cuddle", "Walk" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
happienessLevel(task);
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.

		// 4. Create methods to handle each of your user selections.
		// Each method should create a pop-up with the pet's response (eg. cat
		// might purr when pet),
		// and INCREMENT the pet's happiness Level.

	}

	static void happienessLevel(int task) {
		if (task == 0) {
			JOptionPane.showMessageDialog(null, "your pet chewed up the toy, he did'nt like it");
		}
		if (task == 1) {
			JOptionPane.showMessageDialog(null, "your pet licked you, he liked it");

		}
		if (task == 2) {
			JOptionPane.showMessageDialog(null, "your pet does'nt like walks");
		}
	}
}
