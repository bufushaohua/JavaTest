package Java.swing;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutPosition extends JFrame {
	public FlowLayoutPosition(){
		setTitle("本窗体使用流布局管理器");
		Container c = getContentPane();
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));  //右对齐方式
		for(int i =1;i<=10;i++){
			c.add(new JButton("Button"+i));
		}
		setSize(300,200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args){
		new FlowLayoutPosition();
	}
}
