

	import java.io.File;

	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;
	import javax.swing.JOptionPane;

	public class AnimalFarm {

		AnimalFarm() {
			String animal = "";
			while (!animal.equalsIgnoreCase("stop")) {
				
			
		animal =	JOptionPane.showInputDialog("What animal: Duck, Cow, Dog, llama or Cat.");
			if (animal.equalsIgnoreCase("duck")) {
				playQuack();
			}
			else if (animal.equalsIgnoreCase("cow")) {	
				playMoo();
			}
			else if (animal.equalsIgnoreCase("cat")) {
				playMeow();
			}
			else if (animal.equalsIgnoreCase("llama")) {
				playCoo();
			}
			else if (animal.equalsIgnoreCase("dog")) {
				playWoof();
			}
			
		}
		}
		void playMoo() {
			playNoise(cow);
		}

		void playQuack() {
			playNoise(duck);
		}

		void playWoof() {
			playNoise(dog);
		}
void playMeow(){
	playNoise(cat);
}
		void playCoo(){
			playNoise(llama);
		}
		  String duck = "/Users/League/Google Drive/league-sounds/quack.wav";
		String cow = "/Users/League/Google Drive/league-sounds/moo.wav";
		String dog = "/Users/League/Google Drive/league-sounds/woof.wav";
		String cat = "/Users/League/Google Drive/league-sounds/meow.wav";
		String llama = "/Users/League/Google Drive/league-sounds/llama.wav";


		/* Ignore this stuff */

		public void playNoise(String soundFile) {
	    	try {
	   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
	   		 Clip clip = AudioSystem.getClip();
	   		 clip.open(audioInputStream);
	   		 clip.start();
	   		 Thread.sleep(3400);
	    	} catch (Exception ex) {
	        	ex.printStackTrace();
	    	}
		}

		public static void main(String[] args) {
			new AnimalFarm();
		}

	}




