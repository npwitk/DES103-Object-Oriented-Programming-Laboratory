import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BabieTesting extends JFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.add(new Babie());
		
		frame.setTitle("Babyraknaka");
		frame.setSize(1000, 500); 
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}
