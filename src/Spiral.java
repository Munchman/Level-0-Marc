import org.jointheleague.graphical.robot.Robot;

public class Spiral {

		public static void main(String[] args) {
			
			Robot bob = new Robot("mini");
			
bob.penDown();
			
bob.setSpeed(10);
			
for (int i = 0; i < 75; i++) {
	

		bob.setRandomPenColor();
				
		bob.move(5*i);
				
		bob.turn(360/4);
				
		
				// 9. Set the pen width to i
bob.setPenWidth(i);
		}
	}
}



