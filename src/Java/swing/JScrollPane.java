package Java.swing;

import javax.swing.*;
import java.awt.*;

public class JScrollPane extends JFrame {
	public JScrollPane(){
		setTitle("带滚动条的文字编辑器");
		setVisible(true);
		setBounds(600,300,500,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container C = getContentPane();
		
	}
}
