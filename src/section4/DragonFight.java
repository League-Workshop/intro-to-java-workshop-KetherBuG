package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
	
	    int playerHealth = 100;
	
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int damage = 20;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragondamage = 30;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String y = JOptionPane.showInputDialog("Yell or Kick, my soldier(make sure you cap your first letter)");
		// 9. If they typed in "yell":
		if (y.equals("Yell")) {
			
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			Random x = new Random();
		int d = x.nextInt(10);
			//-- Subtract that number from the dragon's health variable 
			dragonHealth = dragonHealth - d;
		}
		// 10. If they typed in "kick":
		       if (y.equals("kick")) {
		    	   //-- Find a random number between 0 and 25 and store it in dragonDamage
			Random A = new Random();
	        int c = A.nextInt(50);
			//-- Subtract that number from the dragon's health variable
			dragonHealth = dragonHealth - c;
		       }
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		Random D = new Random();
		int s = D.nextInt(35);
		// 12. Subtract this number from the player's health
		playerHealth = playerHealth - s;
		
		
		// 13. If the user's health is less than or equal to 0
		if (playerHealth <= 0) {
			//-- Tell the user that they lost
		JOptionPane.showMessageDialog(null, "You are a loser in everything boi.");
		}
		else if(dragonHealth <= 0) {
			
			JOptionPane.showMessageDialog(null,"What a warrior! You GOT A TON OF GOLD!");
		}
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		else {
			JOptionPane.showMessageDialog(null,"YOUR HEALTH " + playerHealth +"DRANGON HEALTH " + dragonHealth);
		}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
}
