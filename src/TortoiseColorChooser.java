
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
String color="";
Random random=new Random();
Tortoise.setSpeed(7);
for (int i = 0; i < 10; i++) {
	

		//3. ask the user what color they would like the tortoise to draw
		color=JOptionPane.showInputDialog("what color do you want your house to be out of red green or blue?");
		//4. use an if/else statement to set the pen color that the user requested
if(color.equalsIgnoreCase("red")){
	Tortoise.setPenColor(Color.red);
}
else if(color.equalsIgnoreCase("green")){
	Tortoise.setPenColor(Color.GREEN);
	
}else if(color.equalsIgnoreCase("blue")){
	Tortoise.setPenColor(Color.CYAN);
}

//5. if the user doesn’t enter anything, choose a random color
else{
	Tortoise.setPenColor(
new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
	
}
//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		Tortoise.setPenWidth(5);
	//1. make the tortoise draw a shape (this will take more than one line of code)

Tortoise.turn(60);
Tortoise.move(50);
Tortoise.turn(60);
Tortoise.move(50);
Tortoise.turn(60);
Tortoise.move(50);
Tortoise.turn(90);
Tortoise.move(90);
Tortoise.turn(90);
Tortoise.move(50);


	}
}}

