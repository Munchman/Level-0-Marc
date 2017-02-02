import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
public static void main(String[] args) {
 String cool= "";
 while (!cool.equalsIgnoreCase("stop")) {
	
	

	cool = JOptionPane.showInputDialog("What do you think is awesome?");
	if (cool.equalsIgnoreCase("brocolli")) {
		JOptionPane.showMessageDialog(null, cool+" is NOT awesome.");
	}
	else {
		
	
	JOptionPane.showMessageDialog(null, cool+" is AWESOME!!!!!!!!!!");
}
}
}
}