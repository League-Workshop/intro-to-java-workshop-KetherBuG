package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a priranha-infested river, here's how to do it");
		// Get the user to enter an adjective
        String A = JOptionPane.showInputDialog("Enter an adjectibe");
		// Get the user to enter a type of liquid
        String B = JOptionPane.showInputDialog("Enter a type of liquid");
		// Get the user to enter a body part
        String C = JOptionPane.showInputDialog("Enter a body part");
       
		// Get the user to enter a verb
        String D = JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
        String E = JOptionPane.showInputDialog("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "Piranhas are more " + A + " during the day , so cross the river at night.\n Piranhas are attatached to fresh "+ B +" and will most likely take a bite out of your \n" + C + "if you" + D +". Whatever\n you do. If you have a open wound, try to find another way to get back to " + D +". Good Luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

