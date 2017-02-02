

	import org.jointheleague.graphical.robot.Robot;
	import java.awt.Color;


	/*** Teacher's note ***/
	 /* Before beginning recipe: 
	 * 1. ask students to find and explain the variables in this recipe. 
	 * 2. ask students what robot commands they think they will use to make picture in the laminated hand-outs: http://bit.ly/ninja-star */

	public class FlamingNinjaStar {
		public static void main(String[] args) {

			int baseSize = 300;		//the size of the black part of the star
			int flameSize = 200;		//the length of the flaming arms

			
Robot bob = new Robot("vic");
bob.penDown();
			
			bob.setX(950);
			bob.setY(400);
			

			bob.setPenWidth(300);
bob.setSpeed(10);
			
for (int i = 0; i < 25; i++) {
	

				
			bob.turn(360/8);
				
			
bob.move(64);
				bob.setPenColor(Color.ORANGE);
				
				bob.turn(-40);
				
				bob.move(flameSize);
				
				bob.turn(170);
				
				bob.move(flameSize);
				bob.setRandomPenColor();
bob.turn(64);	

				bob.move(baseSize);
				
				
}	
bob.turn(50000);
		}

	}






