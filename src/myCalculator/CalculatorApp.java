// This is just a demo to understand some of java.swing and java.awt classes and behaviors.
// It's not a bug-free application.

package myCalculator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CalculatorApp extends JFrame implements ActionListener {

	static JFrame myJFrame;
	static JTextField lcdText;
	String s0, s1, s2;
	
	CalculatorApp() {
		s0 = s1 = s2 = "";
	}
	
	String calcMe(String s0, String s1, String s2) {
		double x = Double.parseDouble(s0);
		double y = Double.parseDouble(s2);
		double result = 0;
		switch (s1) {
			case "+": 
				result = x + y;
			break;
			case "-": 
				result = x - y;
			break;
			case "*": 
				result = x * y;
			break;
			case "/": 
				result = x / y;
			break;
		}
		return Double.toString(result);		
	}
	
	public static void main(String[] args) {
		
		myJFrame = new JFrame("My Calculator");
		
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        CalculatorApp calc = new CalculatorApp();
        lcdText = new JTextField(16);
        lcdText.setFont(new Font("Ariel", Font.BOLD, 20));
        lcdText.setEditable(false);

        
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
        JButton	bPlus, bMinus, bDevide, bMultiple, bDecimal, bClear, bEqual;

        b0 = new JButton("0"); 			b0.setPreferredSize(new Dimension(150, 50));
        b1 = new JButton("1");			b1.setPreferredSize(new Dimension(50, 50));
        b2 = new JButton("2");			b2.setPreferredSize(new Dimension(50, 50));
        b3 = new JButton("3");			b3.setPreferredSize(new Dimension(50, 50));
        b4 = new JButton("4");			b4.setPreferredSize(new Dimension(50, 50));
        b5 = new JButton("5");			b5.setPreferredSize(new Dimension(50, 50));
        b6 = new JButton("6");			b6.setPreferredSize(new Dimension(50, 50));
        b7 = new JButton("7");			b7.setPreferredSize(new Dimension(50, 50));
        b8 = new JButton("8");			b8.setPreferredSize(new Dimension(50, 50));
        b9 = new JButton("9");			b9.setPreferredSize(new Dimension(50, 50));
        bPlus = new JButton("+");		bPlus.setPreferredSize(new Dimension(50, 50));
        bMinus = new JButton("-");		bMinus.setPreferredSize(new Dimension(50, 50));
        bDevide = new JButton("/");		bDevide.setPreferredSize(new Dimension(50, 50));
        bMultiple = new JButton("*");	bMultiple.setPreferredSize(new Dimension(50, 50));
        bDecimal = new JButton(".");	bDecimal.setPreferredSize(new Dimension(50, 50));
        bClear = new JButton("C");		bClear.setPreferredSize(new Dimension(100, 50));
        bEqual = new JButton("=");		bEqual.setPreferredSize(new Dimension(50, 50));   
  
        b0.addActionListener(calc);
        b1.addActionListener(calc);
        b2.addActionListener(calc);
        b3.addActionListener(calc);
        b4.addActionListener(calc);
        b5.addActionListener(calc);
        b6.addActionListener(calc);
        b7.addActionListener(calc);
        b8.addActionListener(calc);
        b9.addActionListener(calc);
        bPlus.addActionListener(calc);
        bMinus.addActionListener(calc);
        bDevide.addActionListener(calc);
        bMultiple.addActionListener(calc);
        bDecimal.addActionListener(calc);
        bClear.addActionListener(calc);
        bEqual.addActionListener(calc);     
        
        JPanel panel = new JPanel();

        panel.add(lcdText);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bPlus);
        panel.add(bMinus);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);        
        panel.add(bDevide);
        panel.add(bMultiple);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);       
        panel.add(bDecimal);
        panel.add(bEqual);
        panel.add(b0);
        panel.add(bClear);
        
        myJFrame.add(panel);
        myJFrame.setSize(300, 300);
        myJFrame.setBounds(400, 100, 300, 300);
        myJFrame.setVisible(true);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.charAt(0)>='0' && cmd.charAt(0) <='9' || cmd.charAt(0) =='.') {
			if (s1 != "") {
				s2 = s2 + cmd;
			} else {
				s0 = s0 + cmd;
			}
			lcdText.setText(s0 + s1 + s2);
		} else if (cmd.charAt(0) == '+' || cmd.charAt(0) == '-' || cmd.charAt(0) == '/' || cmd.charAt(0) == '*') {
			if (s1 != "") {
				s0 = (calcMe(s0, s1, s2));
				s2 = "";
				s1 = cmd;
				lcdText.setText(s0 + s1 + s2);
			} else {
				s1 = cmd;
				lcdText.setText(s0 + s1 + s2);
			}
		} else if (cmd.charAt(0) == '=') {
			s0 = (calcMe(s0, s1, s2));
			s1 = "";
			s2 = "";
			lcdText.setText(s0 + s1 + s2);			
		} else if (cmd.charAt(0) == 'C') {
			s0 = "";
			s1 = "";
			s2 = "";			
			lcdText.setText("");
		}
		
	}

}
