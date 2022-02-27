package myProgressBar;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyProgressBar extends JFrame {

	JProgressBar jBar;
	int i = 0;
	
	MyProgressBar() {
		jBar = new JProgressBar(500, 3000);
		jBar.setBounds(10, 50, 450, 30);
		jBar.setValue(0);
		jBar.setStringPainted(true);
		add(jBar);
		setSize(500,200);
		setLayout(null);
	}
	
	public void iterate() {
		while (i < 3000) {
			jBar.setValue(i);
			i = i + 200;
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		MyProgressBar jBar = new MyProgressBar();
		jBar.setVisible(true);
		jBar.iterate();
		
		
		System.out.println("Proccess completed.");
		System.exit(ABORT);

	}

}
