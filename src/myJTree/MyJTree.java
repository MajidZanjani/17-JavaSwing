package myJTree;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class MyJTree extends JFrame{

	JFrame jFrame;
	
	public MyJTree() {
		jFrame = new JFrame();
		
		DefaultMutableTreeNode myStyle = new DefaultMutableTreeNode("Style");
		DefaultMutableTreeNode myColor = new DefaultMutableTreeNode("Color");
		DefaultMutableTreeNode myFont = new DefaultMutableTreeNode("Font");
		DefaultMutableTreeNode redColor = new DefaultMutableTreeNode("Red");
		DefaultMutableTreeNode blueColor = new DefaultMutableTreeNode("Blue");
		DefaultMutableTreeNode yellowColor = new DefaultMutableTreeNode("Yellow");
		DefaultMutableTreeNode greenColor = new DefaultMutableTreeNode("Green");

		myStyle.add(myColor);
		myStyle.add(myFont);
		
		myColor.add(redColor);
		myColor.add(blueColor);
		myColor.add(yellowColor);
		myColor.add(greenColor);
		
		JTree myJTree = new JTree(myStyle);
		jFrame.add(myJTree);
		jFrame.setSize(300,300);
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyJTree();		

	}

}
