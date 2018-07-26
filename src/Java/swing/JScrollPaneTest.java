package Java.swing;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {
	public JScrollPaneTest(){
		setTitle("带滚动条的文字编辑器");
		setVisible(true);
		setBounds(600,300,500,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container C = getContentPane();
		JTextArea ta = new JTextArea(20,50); // 文本域大小20行50列
		JScrollPane sp = new JScrollPane(ta);
		C.add(sp);
	}
	public static void main(String[] args){
		new JScrollPaneTest();
	}
}
