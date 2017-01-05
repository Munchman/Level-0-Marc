 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		
		String momsBirthday = "November 29th";
		String dadsBirthday = "August 1st";
		String myBirthday = "January 26th";
String me = "february 12th";
		
	String familymember=	JOptionPane.showInputDialog("Whose Birthday?");
		
		System.out.println(familymember);
		
		if(familymember.equals("mom")){
		JOptionPane.showMessageDialog(null, momsBirthday);
		}
		
		else if(familymember.equals("dad")){
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		
		else if(me.equals("lincon")){
			JOptionPane.showMessageDialog(null, me);
			
		}
		
		else if(familymember.equals("me")){
			JOptionPane.showMessageDialog(null, myBirthday);
		}

		
	else{ JOptionPane.showMessageDialog(null, "Who is that?");
		
	}
	} 
}

