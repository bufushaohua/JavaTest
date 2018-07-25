package Java.swing;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutPosition extends JFrame {
	public BorderLayoutPosition(){
		setTitle("这个窗体使用边界布局编辑器");
		Container c = getContentPane();
		setLayout(new BorderLayout());
		JButton C = new JButton("中"),
				N = new JButton("北"), 
				S = new JButton("南"),
				E = new JButton("东"),
				W = new JButton("西");
		c.add(C,BorderLayout.CENTER);
		c.add(N,BorderLayout.NORTH);
		c.add(S,BorderLayout.SOUTH);
		c.add(E,BorderLayout.EAST);
		c.add(W,BorderLayout.WEST);
		setBounds(600,300,400,200);
		//setSize(350,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new BorderLayoutPosition();
	}
}
