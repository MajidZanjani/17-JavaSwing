package myProgressBar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyProgressBar extends JFrame {

	JProgressBar jBar;
	
	MyProgressBar() {
		jBar = new JProgressBar(0, 30000);
		jBar.setBounds(400, 300, 150, 50);
		jBar.setValue(0);
		add(jBar);
		
	}
	
	public static void main(String[] args) {
		
		JProgressBar jBar = new JProgressBar(0,4000);
		
		while (jBar.getValue() < 4000) {
			jBar.setValue(jBar.getValue() + 20);			
		}
		
		System.out.println("Proccess completed.");

	}

}
