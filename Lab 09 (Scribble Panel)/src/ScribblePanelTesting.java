import java.awt.*;
import javax.swing.*;

public class ScribblePanelTesting extends JPanel {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Scribble Demo");
		ScribblePanel scribeP = new ScribblePanel();

		frame.add(scribeP);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
