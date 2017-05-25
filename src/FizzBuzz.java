import javax.swing.JOptionPane;

public class FizzBuzz {
	public static void main(String[] args) {
		String l = JOptionPane.showInputDialog("enter a number");
	
		int w = Integer.parseInt(l);
		fizzBuzz(w);
	}

	

	private static void fizzBuzz(int end) {
		// TODO Auto-generated method stub
		for (int  i = 1; i < end; i++) {

			if (i % 15 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else {
				System.out.println(i);
			}
	}
}}
