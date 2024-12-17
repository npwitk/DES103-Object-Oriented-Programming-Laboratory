import java.util.*; //for making a random character
import javax.swing.Timer;
import javax.swing.*; //for JFrame and JPanel
import java.awt.*; //for graphics, layout manager
import java.awt.event.*; //for events and listeners

public class CatchingFlashingBall extends JPanel implements MouseListener, ActionListener {
	
	Timer timer = new Timer(1000, this);
	int xloc = getRandomXloc();
	int yloc = getRandomYloc();
	
	CatchingFlashingBall() {
		this.setBackground(Color.BLACK);
		this.addMouseListener(this);
		this.setFocusable(true);
		timer.start();
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.ORANGE);
		g.fillOval(xloc, yloc, 10, 10);
	}
	
	double calculateDistance(int x1, int y1, int x2, int y2){
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); //Cover the whole ball (radius)
	}
	
	public int getRandomXloc() {
		Random random = new Random();
		return random.nextInt(600-10);
	}
	public int getRandomYloc() {
		Random random = new Random();
		return random.nextInt(400-10);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		xloc = getRandomXloc();
		yloc = getRandomYloc();
		repaint();	
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (calculateDistance(xloc + 5, yloc + 5, e.getX(), e.getY()) <= 10) {
			timer.stop();
		}
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
}