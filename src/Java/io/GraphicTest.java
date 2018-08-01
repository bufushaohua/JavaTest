package Java.io;

import java.awt.*;
import javax.swing.*;

/**
 * 一般的绘图程序要继承JFrame，定义一个JFrame窗口子类，还要继承JPanel，定义一个JPanel子类。
 * 在JPanel子类 中重定义方法paintComponent()，在这个方法中调用绘图方法,绘制各种图形。
 * */

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GraphicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicDemo gp = new GraphicDemo();
	}
}

class shapePanel extends JPanel{
	shapePanel(){
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.pink);
		g.fill3DRect(20, 40, 20, 30, false);
		g.setColor(Color.ORANGE);
		g.fillArc(20,90,110,60,0,-270);
	}
}

class GraphicDemo extends JFrame{
	public GraphicDemo(){
		setTitle("基本绘图方法演示");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//setResizable(false); //设置窗口大小的可调性，默认为true：可调
		this.getContentPane().add(new shapePanel());
	} 
}