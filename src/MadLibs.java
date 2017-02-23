import javax.swing.JOptionPane;

public class MadLibs {
public static void main(String[] args) {
	
	String adjective="";
	String verb="";
	String noun="";
	String adverb="";
	
	noun =JOptionPane.showInputDialog("enter a noun");
verb =	JOptionPane.showInputDialog( "enter a verb");
adjective =	 JOptionPane.showInputDialog( "enter an adjective");
	adverb=JOptionPane.showInputDialog("enter an adverb");
	JOptionPane.showMessageDialog(null, adjective + " "+noun+" "+ verb+" "+adverb );
	
}
}
