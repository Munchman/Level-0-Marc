import javax.swing.JOptionPane;

public class BananaSplit {
public static void main(String[] args) {
	String banana ="";
	for (int i = 1; i <= 3; i++) {
		banana = banana+ " ice cream\n";
	}
	banana = banana + " banana";
	JOptionPane.showMessageDialog(null, banana);
	
}
}
