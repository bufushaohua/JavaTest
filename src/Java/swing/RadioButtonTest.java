package Java.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RadioButtonTest extends JFrame {
	public RadioButtonTest(){
		setVisible(true);
		//setBounds(20,30,75,22);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("单选按钮模拟选择邮件的发送方式");
		JRadioButton rbtnNormal = new JRadioButton("普通发送");
		rbtnNormal.setSelected(true);
		rbtnNormal.setFont(new Font("宋体",Font.PLAIN,12)); //其他可用样式为:BOLD :粗体样式常量 ,ITALIC: 斜体样式常量.
		rbtnNormal.setBounds(20,30,75,22);
		rbtnNormal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rbtnNormal.isSelected())
					JOptionPane.showMessageDialog(null, "你选择的是"+rbtnNormal.getText(),
							"提醒",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		getContentPane().add(rbtnNormal);
		JRadioButton rbtnpwd = new JRadioButton("普通发送");
		rbtnpwd.setSelected(true);
		rbtnpwd.setFont(new Font("宋体",Font.PLAIN,12)); //其他可用样式为:BOLD :粗体样式常量 ,ITALIC: 斜体样式常量.
		rbtnpwd.setBounds(100,30,75,22);
		rbtnpwd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rbtnpwd.isSelected())
					JOptionPane.showMessageDialog(null, "你选择的是"+rbtnpwd.getText(),
							"提醒",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		getContentPane().add(rbtnpwd);
		ButtonGroup group = new ButtonGroup();
		group.add(rbtnNormal);
		group.add(rbtnpwd);
	}
	public static void main(){
		new RadioButtonTest();
	}
}