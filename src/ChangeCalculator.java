import javax.swing.JOptionPane;

public class ChangeCalculator {
	public static void main(String[] args) {
		
	
	// Ask the user how many nickels they have
	String	n=JOptionPane.showInputDialog("how many nickles do you have?");

			// Convert their answer to an int using Integer.parseInt()

	int ni =Integer.parseInt(n);
			// Ask the user how many dimes they have, and convert their answer
	String d=JOptionPane.showInputDialog("how many dimes do you have?");
	int di =Integer.parseInt(d);
//			if (i >=10){
//				JOptionPane.showMessageDialog(null, "you have more than $1");
//			}
//			else {
//				JOptionPane.showMessageDialog(null, "You need more money");
//			}
			// Ask the user how many quarters they have, and convert their answer
	String q=JOptionPane.showInputDialog("how many quarters do you have?");
	int qu =Integer.parseInt(q);
			// Calculate how much money the user has and save it in a double variable 
double nic=ni*0.05;
double dim=di*0.10;
double qua=qu*0.25;
double money=nic+dim+qua;
			// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "you have"+money+"dollar(s)");

}}
