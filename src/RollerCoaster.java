import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String tall="";
	int i=0;
	tall=JOptionPane.showInputDialog(null, "How tall are you in inches?");
i=	Integer.parseInt(tall);
if (i >= 60) {
	JOptionPane.showMessageDialog(null, "you can ride! have fun!");
	
}
else if (i<=59) {
	JOptionPane.showMessageDialog(null, "You are too short!");
}
		
	}
}

