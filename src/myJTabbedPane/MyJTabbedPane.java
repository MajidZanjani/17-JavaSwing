package myJTabbedPane;

import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MyJTabbedPane {

	JFrame myFrame;
	
	public MyJTabbedPane() {
		myFrame = new JFrame();
		JTextArea t1 = new JTextArea(200,200);
		JTextArea t2 = new JTextArea(200,200);
		JTextArea t3 = new JTextArea(200,200);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		t1.setText("first panel content");
		t2.setText("second panel content");
		t3.setText("third panel content");
		p1.add(t1);
		p2.add(t2);
		p3.add(t3);		
		
		JTabbedPane mPane = new JTabbedPane();
		mPane.setBounds(50,50,200,200);
		mPane.add("first",p1);
		mPane.add("second",p2);
		mPane.add("third",p3);
		
		myFrame.add(mPane);
		myFrame.setSize(400,400);
		myFrame.setLayout(null);
		myFrame.setVisible(true);
		

	}
	
	public static void main(String[] args) {
	
		new MyJTabbedPane();

	}

}
