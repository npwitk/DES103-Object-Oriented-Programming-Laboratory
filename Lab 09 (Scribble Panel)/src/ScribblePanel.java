import java.awt.*;
import javax.swing.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener {
	
	int x = 0;
	int y = 0;
	int r = 20;
	boolean leftClick;
	
	ScribblePanel() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		setFocusable(true);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		if(leftClick){
			g.setColor(Color.BLACK);
			g.drawLine(x, y, e.getX(), e.getY());
			x = e.getX();
			y = e.getY();
		} else {
			g.setColor(getBackground());
			g.fillOval(e.getX()-r, e.getY()-r, 2*r, 2*r);
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		if(e.getButton() == MouseEvent.BUTTON1) {
			leftClick = true;
		} else {
			leftClick = false;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
