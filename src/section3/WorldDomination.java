package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String y = "Hahahahahaha, you evil bad ass!";
		String X = JOptionPane.showInputDialog("Are you able to write a code boi?");
        if (X.equals("yes")) {
        	JOptionPane.showMessageDialog(null," Rule the world, " + X + "!");
        	String Z = JOptionPane.showInputDialog("What is your name, warrior ?");
        	switch(Z) {
        	case "Micky Mouse":{
         JOptionPane.showMessageDialog(null,"HAHAHAHA, WE SHALL RULE THE EARTH, EVIL " + Z);	
         speak(y);
       
        
        	break;
        	}
        	case "Donald Duck":{
        		JOptionPane.showMessageDialog(null,"Alright, fine");
        		break;
        	}
        	}
        		
        }
     
        	
        
        else {
        	JOptionPane.showMessageDialog(null, "Have fun washing dishes");
        }
	

	}

static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
}

}
