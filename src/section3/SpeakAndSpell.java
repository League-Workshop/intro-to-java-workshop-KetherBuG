package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
        String X = "e.g. spell mandloebot";
		speak(X);
		// 2. Catch the user's answer in a String
        String A = JOptionPane.showInputDialog("What's your answer");
		// 3. If the user spelled the word correctly, speak "correct"
        if (A.equals("mandlebrot")) {
        	JOptionPane.showMessageDialog(null, "Awsome Job boi!");
        }
		// 4. Otherwise say "wrong"
        else {
        	JOptionPane.showMessageDialog(null, "You loser!");
        }
		// 5. repeat the process for other words
		
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


