import java.awt.*;
import javax.swing.*;

public class KeyboardEventTesting extends JPanel {

	public static void main(String[] args) {

		JFrame frame = new JFrame("My Keyboard Event");
		KeyboardEvent keyB = new KeyboardEvent();

		frame.add(keyB);
		frame.setSize(800, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
