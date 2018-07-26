package Java.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.*;

import javax.swing.*;

public class JTextFieldTest extends JFrame {
	public JTextFieldTest(){
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100,100,300,100);
		setTitle("这是一个文本组件");
		Container C = getContentPane();
		C.setLayout(new GridLayout(2,1,10,10));
		JTextField jt = new JTextField("aaa");
		jt.setColumns(20);
		jt.setFont(new Font("宋体", Font.PLAIN, 20));
		JButton jb = new JButton("清除");
		JPasswordField pw = new JPasswordField();
		pw.setEchoChar('●');
		pw.setSize(300,20);
		// 为按钮添加事件
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					jt.setText("触发事件");
					char[] ch = pw.getPassword();
					String s = new String(ch);
					System.out.println(s);
			}
		});
		// 为文本框添加回车事件
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(jt.getText());
				jt.setText("");
				jt.requestFocusInWindow();
			}
		});
		
		C.add(jt);  C.add(jb);   C.add(pw);
	}
	public static void main(String[] args){
		new JTextFieldTest();
	}
	
}
