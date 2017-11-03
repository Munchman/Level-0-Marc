import javax.swing.JOptionPane;

public class MakeCookies {
public static void main(String[] args) {
	String w=JOptionPane.showInputDialog("How many cups of flour do you have?");
	int i= Integer.parseInt(w);
	if(i<=2){
		System.out.println("get more flour");
	}
	else{
		System.out.println("you are good");
	}
String f=JOptionPane.showInputDialog("how many people are going to eat your cookies?");
int l= Integer.parseInt(f);
if (l<=29){
	System.out.println("you need to make another batch");
}
else{
	System.out.println("you are good");
}
String a=JOptionPane.showInputDialog("How many batches did you make?");
int b =Integer.parseInt(a);
if(b>=2){
	System.out.println("you have lots of friends!");
}
else {
	System.out.println("you need more friends");
}
}
}
