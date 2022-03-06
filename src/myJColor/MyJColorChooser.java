package myJColor;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyJColorChooser extends JFrame implements ActionListener {

	JButton myButton;
	Container myContainer;
	JTextArea myTextArea;
	
	public MyJColorChooser() {
		
		myContainer = getContentPane();
		myContainer.setLayout(new FlowLayout());
		myButton = new JButton("Color Chooser");
		myButton.addActionListener(this);
		myContainer.add(myButton);
		myTextArea = new JTextArea();
		//myTextArea.setBounds(10,10,200,200);
		myContainer.add(myTextArea);
		myTextArea.setText("This is an example for JColorChooser.");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Color initColor = Color.green;
		Color myColor = JColorChooser.showDialog(this, "Choose a color", initColor);
		//myContainer.setBackground(myColor);
		myTextArea.setBackground(myColor);
		
	}

	public static void main(String[] args) {
		
		MyJColorChooser myJColorChooser = new MyJColorChooser();
		myJColorChooser.setSize(300,300);
		myJColorChooser.setLocation(300, 200);
		myJColorChooser.setVisible(true);
		myJColorChooser.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
}
