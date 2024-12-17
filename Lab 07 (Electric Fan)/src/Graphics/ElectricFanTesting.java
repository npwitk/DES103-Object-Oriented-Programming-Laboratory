package Graphics;

import javax.swing.JFrame;

public class ElectricFanTesting {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My Electric Fan");
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ElectricFan myElectricFan = new ElectricFan();		
		frame.add(myElectricFan);
		
	}
}