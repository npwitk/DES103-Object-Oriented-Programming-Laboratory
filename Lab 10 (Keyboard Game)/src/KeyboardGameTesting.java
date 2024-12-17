import javax.swing.JFrame;

public class KeyboardGameTesting extends JFrame{
	public static void main (String[]arg) {
		JFrame frame = new JFrame(); 
		frame.add(new KeyboardGame()); 
		
		frame.setTitle("My Keyboard Game");
		frame.setSize(500, 300); 
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
