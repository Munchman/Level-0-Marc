import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String s=	JOptionPane.showInputDialog("what score did you get on your last test from 5-1");
	int i =Integer.parseInt(s);
if(i==5){
		JOptionPane.showMessageDialog(null, "yay! you got an A!");
}	
else if(i==4){
	JOptionPane.showMessageDialog(null, "nice, you got a B.");

}
else if(i==3){
	JOptionPane.showMessageDialog(null, "you got a C. thats not that good");
	
}
else if (i==2){
	JOptionPane.showMessageDialog(null, "eew, you got a D");
}
else (){
	
}
}
