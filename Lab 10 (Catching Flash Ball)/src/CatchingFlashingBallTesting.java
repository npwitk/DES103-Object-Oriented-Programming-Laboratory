import javax.swing.JFrame;

public class CatchingFlashingBallTesting extends JFrame{
	public static void main (String[]arg) {
		JFrame frame = new JFrame(); 
		frame.add(new CatchingFlashingBall()); 
		
		frame.setTitle("My Catching FlashBall");
		frame.setSize(600, 400); 
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	
	}
}
