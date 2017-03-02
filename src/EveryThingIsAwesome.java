import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
public static void main(String[] args) {
 String cool= "";
 String me="";
 String sup="";
 String we="";
 String butt="";
 while (!cool.equalsIgnoreCase("stop")) {
	
	

	
	me = JOptionPane.showInputDialog("favorite food?");
	JOptionPane.showMessageDialog(null, me+" is AWESOME!!!!!!!!!!");
	sup=JOptionPane.showInputDialog("best friend?");
	JOptionPane.showMessageDialog(null, sup+" is AWESOME!!!!!!!!!!");
	we=JOptionPane.showInputDialog("favorite book?");
	JOptionPane.showMessageDialog(null, we+" is AWESOME!!!!!!!!!!");
	butt=JOptionPane.showInputDialog("favorite movie?");
	JOptionPane.showMessageDialog(null, butt+" is AWESOME!!!!!!!!!!");
	cool = JOptionPane.showInputDialog("What do you think is awesome?");
	if (!cool.equalsIgnoreCase("stop")){
	
	
	JOptionPane.showMessageDialog(null, cool+" is AWESOME!!!!!!!!!!");
	}
	if (cool.equalsIgnoreCase("brocolli")) {
		JOptionPane.showMessageDialog(null, "cool+ is NOT awesome.");
	}
	
}
}
}