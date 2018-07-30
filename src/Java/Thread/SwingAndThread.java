package Java.Thread;

import java.awt.*;
import javax.swing.*;

//Swing与县城相结合 创建GUI程序  实现图标滚动的功能
public class SwingAndThread extends JFrame {
	private int count = 0;
	private static Thread t;
	private JLabel j1 = new JLabel();
	private Container c = getContentPane(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingAndThread();
	}

	public SwingAndThread(){
		setBounds(300,300,650,250);
		c.setLayout(null);
		try{
			Icon icon = new ImageIcon("麋鹿.png");
			j1.setIcon(icon);
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("图片不存在,请将***复制到当前目录下");
			
		}
		j1.setHorizontalAlignment(SwingConstants.LEFT);
		j1.setBounds(10,10,200,200);
		j1.setOpaque(true);
		t = new Thread(new Thread1());
		t.start();
		c.add(j1);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	class Thread1 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(count <= 600){
				j1.setBounds(count,10,200,200);
				try {
					Thread.sleep(20);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				count += 4;
				if(count == 600)
					count = 10;
			} 
		}
		
	}
}

