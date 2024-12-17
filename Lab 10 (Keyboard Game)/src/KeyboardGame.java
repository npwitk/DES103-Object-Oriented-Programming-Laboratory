import java.util.*; //for making a random character
import javax.swing.Timer;
import javax.swing.*; //for JFrame and JPanel
import java.awt.*; //for graphics, layout manager
import java.awt.event.*; //for events and listeners

public class KeyboardGame extends JPanel implements ActionListener, KeyListener {
	
	Timer timer = new Timer(1000, this);
	int score = 0;	
	char displayedChar = 'A';
	char response = '?';
	int xloc = 75;
	int yloc = 75;
	int linespace = 75;
	
	KeyboardGame() {
		setFocusable(true);
		timer.start();
		addKeyListener(this);
	}
	
	protected void paintComponent(Graphics g) {
		Font myfont = new Font("SansSerif", Font.BOLD, 45);
		g.setFont(myfont);
		super.paintComponent(g); //for clearing the panel
		displayedChar = getRandomChar();
		g.drawString(("Letter: " + displayedChar), xloc, yloc);
		g.drawString("You Typed: ", xloc, yloc + linespace);
		g.setColor(Color.BLUE);
		g.drawString("" + response, xloc + 250, yloc + linespace);
		g.setColor(Color.BLACK);
		g.drawString("Your Socre = " + score, xloc, xloc + 150);
			
	}
	
	public char getRandomChar() {
		Random random = new Random();
		return (char)(65 + random.nextInt(26));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		response = e.getKeyChar();
		if(response == displayedChar) {
			score++;
		}
		repaint();		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	

}
