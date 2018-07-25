package Java.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class JPanelTest extends JFrame {
	public JPanelTest(){
		setTitle("这个窗体中使用了面板");
		setVisible(true);
		setBounds(600,300,500,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container C = getContentPane();
		C.setLayout(new GridLayout(2, 1, 10, 10)); //必须先满足3行  1列可以不满足
		JPanel p1 = new JPanel(new GridLayout(1, 3,10,10)),
			   p2 = new JPanel(new BorderLayout()),
			   p3 = new JPanel(new GridLayout(1, 2,10,10)),
			   p4 = new JPanel(new GridLayout(2, 1,10,10)),
			   p5 = new JPanel(new GridLayout(2, 1,10,10));
		// 给每个面板都添加边框和标题，使用BorderFactory工厂类生成带标题的边框对象
		p1.setBorder(BorderFactory.createTitledBorder("面板1"));
		p2.setBorder(BorderFactory.createTitledBorder("面板2"));
		p3.setBorder(BorderFactory.createTitledBorder("面板3"));
		p4.setBorder(BorderFactory.createTitledBorder("面板4"));
		p5.setBorder(BorderFactory.createTitledBorder("面板5"));
		// 在面板中添加按钮
		for(int i =1;i<=4;i++){
			p1.add(new JButton("b1"));
		}
		for(int i =1;i<=2;i++){
			p3.add(new JButton("b3"));
		}
		for(int i =1;i<=2;i++){
			p4.add(new JButton("b4"));
		}
		for(int i =1;i<=2;i++){
			p5.add(new JButton("b5"));
		}
		p2.add(new JButton("b2"),BorderLayout.WEST);
		p2.add(new JButton("b2"),BorderLayout.EAST);
		p2.add(new JButton("b2"),BorderLayout.NORTH);
		p2.add(new JButton("b2"),BorderLayout.SOUTH);
		p2.add(new JButton("b2"),BorderLayout.CENTER);
		C.add(p1);  C.add(p2);  C.add(p3);  C.add(p4);  C.add(p5);
	}
	public static void main(String[] args){
		new JPanelTest();
	}
}
