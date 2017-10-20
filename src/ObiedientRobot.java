import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObiedientRobot {
	static Robot joe = new Robot ("batman"); 
	//1. Make a new class, create a main method, and show the robot.
public static void main(String[] args) {
	joe.penDown();
	joe.setSpeed(99999);
	joe.setPenWidth(7);
	//2. Have the robot draw a square.



	//3. Extract this code into a drawSquare() method.

	//4. Have the robot draw a triangle.

	//5. Extract this code into a drawTriangle() method.

//	6. Have the robot draw a circle.

	//7. Extract this code into a drawCircle() method.

	//8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.
String h=JOptionPane.showInputDialog("what shape do you want out of a triangle square and circle or draw all three");
if (h.equalsIgnoreCase("square")){
	drawSquare();
}
else if (h.equalsIgnoreCase("triangle")) {
	drawTriangle();
}
else if(h.equalsIgnoreCase("circle")){
	drawCircle();
}
else if(h.equalsIgnoreCase("draw all three")){
	drawSquare();
	drawTriangle();
	drawCircle();
}
	//9. Ask the user which color they want. Color the the shape depending on their answer.

}
static void drawSquare(){
	
	
	for(int i=4;i>=0;i--){
		
joe.setRandomPenColor();
joe.move(200);
joe.turn(90);

	}
}
static void drawTriangle(){
	
	for(int q =3;q>=0;q--){
		joe.setRandomPenColor();
		joe.move(200);
		joe.turn(120);
	

	}
}
static void drawCircle(){
	
	for(int q =360;q>=0;q--){
		joe.setRandomPenColor();
		joe.move(1);
		joe.turn(1);
	

	}
}
}


