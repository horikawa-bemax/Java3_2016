package swingtest;

import javax.swing.*;
import java.awt.*;

public class SwingTest{
	public static void main(String[] args){
		
		JPanel screen = new JPanel();

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		
		JPanel buttonBase = new JPanel(new GridLayout());
		buttonBase.setPreferredSize(new Dimension(300,80));
		buttonBase.add(b1);
		buttonBase.add(b2);
		buttonBase.add(b3);

		JFrame f = new JFrame();
		f.setSize(300,300);
		f.getContentPane().add(screen, BorderLayout.CENTER);
		f.getContentPane().add(buttonBase, BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
