package Java.swing;

/*import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
*/
import java.awt.*;
import javax.swing.*;

//JFrame对象创建一个窗体，并在其中添加一个组件

public class JFrameTest extends JFrame {

	public static void main(String[] args) {
		new JFrameTest().createJFrame("创建一个JFrame窗体");
	}

	public void createJFrame(String title){
		JFrame jf = new JFrame(title);											//创建一个JFrame对象
		Container container = jf.getContentPane();								//创建一个容器
		JLabel j1 = new JLabel("这是一个JFrame窗体");								//创建一个标签
		j1.setHorizontalAlignment(SwingConstants.CENTER);						//使标签上的文字居中
		container.add(j1);														//将标签插入到容器中
		container.setBackground(Color.BLUE);									//设置容器背景颜色
		jf.setVisible(true);													//设置JFrame窗体可见性
		jf.setSize(200, 150);													//设置窗体大小
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);				//设置窗体关闭方式
	}
}
