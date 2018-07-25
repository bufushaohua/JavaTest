package Java.swing;

import java.awt.*;
import javax.swing.*;

public class Absoluteposition extends JFrame {
	public static void main(String[] args) {
		new Absoluteposition ();
	}

	public Absoluteposition(){
		setTitle("本窗体使用绝对布局");
		setLayout(null);
		setBounds(600,300,200,150);//在桌面显示的坐标和大小
		Container c = getContentPane();
		JButton j1 = new JButton("按钮1");
		JButton j2 = new JButton("按钮2");
		j1.setBounds(10,30,80,30);
		j2.setBounds(90,60,80,30);
		c.add(j1);
		c.add(j2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
