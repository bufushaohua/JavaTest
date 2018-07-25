package Java.swing;

import java.awt.*;
import javax.swing.*;

public class GridLayoutPosition extends JFrame {
	public GridLayoutPosition(){
		setTitle("这是一个使用网格布局编辑器的窗体");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(600,300,300,300);
		Container C = getContentPane();
		setLayout(new GridLayout(7,3,5,5));
		for(int i=1;i<=20;i++){
			C.add(new JButton("Button"+i));
		}
		
	}
	public static void main(String[] args){
		new GridLayoutPosition();
	} 
}
