import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SquareDoingTesting {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.add(new SqaureDoing());
		
		frame.setTitle("My Final Exam");
		frame.setSize(1000, 500); 
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}
