


	

	import java.io.IOException;

import javax.swing.JOptionPane;

	public class StephenHawking {

		
		
	 
		public static void main(String[] args) {
			String type ="";
			
	while (!type.equals("stop")) {
		
	
		
	
		type =	JOptionPane.showInputDialog("Type a sentence.");
	    // 3. call the speak method below and send it the sentence
		speak(type);
	}
	    
		}
	/* Don’t change this…. */
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

	

	// Copyright Wintriss Technical Schools 2014

}







