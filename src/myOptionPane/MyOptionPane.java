package myOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyOptionPane extends JFrame{

		JFrame jFrame;
		String name;
		
		MyOptionPane() {
			jFrame = new JFrame();
			name = JOptionPane.showInputDialog(jFrame, "Enter your name");
		}
		
	public static void main(String[] args) {
		
		MyOptionPane myOptionPane = new MyOptionPane();
		System.out.println("Hello " + myOptionPane.name + "!");
		System.exit(EXIT_ON_CLOSE);
		
	}

}
