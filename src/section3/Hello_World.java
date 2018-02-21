package section3;

import javax.swing.JOptionPane;

public class Hello_World {
public static void main(String[] args) {
	System.out.println("Hello World!");
	String XD = JOptionPane.showInputDialog("what's you name");
	
	JOptionPane.showMessageDialog(null,"Hello, you are under my control,"+XD+"!");
}
}
