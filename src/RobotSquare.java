

	import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

	public class RobotSquare {
		public static void main(String[] args) throws Exception {
			
Robot bob=new Robot("batman");
			
bob.penDown();
			
bob.setSpeed(10);
			
bob.setPenColor(Color.cyan);
			
bob.move(200);
	bob.setPenColor(Color.MAGENTA);	
bob.turn(90);

bob.move(200);
bob.setPenColor(Color.GREEN);
bob.turn(90);

bob.move(200);
bob.setPenColor(Color.orange);
bob.turn(90);

bob.move(200);



		}
	}



