package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main (String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
       Random X = new Random();
       int boi = X.nextInt(100);
	// 3. Print out this variable
       System.out.println(boi);
	// 4. Get the user to enter something that they think is awesome
       JOptionPane.showInputDialog("What is something awesome in your mind");
	// 5. If the random number is 0
       if (boi==0) {
    	   JOptionPane.showMessageDialog(null, "A awesome choice");
       }
	// -- tell the user whatever they entered is awesome!
   
	// 6. If the random number is 1
       else if (boi==1) {
    	   JOptionPane.showMessageDialog(null, "An ok choice I guess");
       }
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
       else if (boi==2) {
    	   JOptionPane.showMessageDialog(null, "What a boring choice");
       }
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
       else if (boi==3) {
    	   JOptionPane.showInputDialog("What do you think about it");
       }
	// -- write your own answer
       else {
    	   JOptionPane.showMessageDialog(null,"boi good job");
       }



} 
	

}


