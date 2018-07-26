package Java.swing;

import javax.swing.*;
import java.awt.*;

public class MyImageIcon extends JFrame{
	public static void main(String[] args) {
		new MyImageIcon();
	}
	public MyImageIcon(){
		setVisible(true);
		setBounds(300,60,800,640);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container C = getContentPane();
		JLabel j1 = new JLabel("这是一个JFrame窗体",JLabel.CENTER);
		Icon icon = new ImageIcon("1E0746CD2A4449D7A07690F425187728.jpg");
		j1.setIcon(icon); //为标签设置图片
		j1.setHorizontalAlignment(SwingConstants.CENTER); //设置文字放置在标签中间
		j1.setOpaque(true); //设置标签为不透明状态
		C.add(j1);
	} 
}
