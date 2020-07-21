package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main (String [] args) {
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int number = ran.nextInt(4);
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		
		// 3. Print your variable to the console
		System.out.println(number);
		// 4. Get the user to enter something that they think is awesome
		String first = JOptionPane.showInputDialog("What is something that you think is awesome? ");
		// 5. If your variable is  0
		if(number == 0) {
			JOptionPane.showMessageDialog(null,"You're right, that is awesome!");
		} else {
			if(number == 1) {
				JOptionPane.showMessageDialog(null,"I guess that's okay...");
			} else {
				JOptionPane.showMessageDialog(null, "No, that's not awesome that's boring.");
			}
				
		}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	
			// -- invent your own message to give to the user (be nice).

}
	}
