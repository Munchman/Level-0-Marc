import javax.swing.JOptionPane;

public class YearsAlive {
public static void main(String[] args) {
	String allYears ="";
	
	String birthday = JOptionPane.showInputDialog("What year were you born?");
	
	int year = Integer.parseInt(birthday);
	
	
	for (int i = 2017; i >= year ; i--) {
		System.out.println(i);
		allYears = allYears+" " + String.valueOf(i);
	
	}
JOptionPane.showMessageDialog(null, allYears);
}
}
