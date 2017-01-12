import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquareLoop {
	public static void main(String[] args) throws Exception {
		int lengthOfSide = 20;
		int degrees = 360;
Robot bob=new Robot("batman");
		
bob.penDown();
		
bob.setSpeed(10);
		
for (int i=0;i<360/degrees;i++){
		
bob.move(lengthOfSide);
	
bob.turn(degrees);
}
	}



}
