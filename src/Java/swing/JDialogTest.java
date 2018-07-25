package Java.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//单击JFrame窗体中的按钮后，弹出一个对话框窗体

public class JDialogTest extends JFrame {
	public static void main(String[] args) {
		new JDialogTest();
	}
	public JDialogTest(){
		Container container = getContentPane();
		container.setLayout(null);
		JButton b1 = new JButton("弹出对话框");
		b1.setBounds(10,10,100,20);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//创建MyDialog对话框
				MyDialog myDialog = new MyDialog(JDialogTest.this);
				myDialog.setVisible(true);
			}
		});
		container.add(b1);
		container.setBackground(Color.WHITE);
		setBounds(300,300,100,100);
		setSize(200,200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

class MyDialog extends JDialog {
	public MyDialog (JDialogTest frame){
		super(frame,"第一个JDialog窗体",true);
		Container container = getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setSize(200,200);
		setForeground(Color.ORANGE);
	}
}
