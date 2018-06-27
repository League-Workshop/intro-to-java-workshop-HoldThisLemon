package section3;

import javax.swing.JOptionPane;

public class Greeter {
	
	public static void main(String[] args) {
		
	String name = JOptionPane.showInputDialog("What is your Name?");
	System.out.println(name);
	JOptionPane.showMessageDialog(null, "Good afternoon, " + name);
	JOptionPane.showMessageDialog(null, "You look good today, " + name);
	}

}
