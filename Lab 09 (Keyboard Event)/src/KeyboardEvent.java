import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEvent extends JPanel implements KeyListener {
	
	String text = "";

	KeyboardEvent() {
		this.addKeyListener(this);
		this.setFocusable(true);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.white);
		g.setFont(new Font("SansSerif", Font.BOLD, 50));
		g.setColor(Color.blue);
		g.drawString(text, 20, 50);
	}

	public void keyTyped(KeyEvent ke) {
		text = text + ke.getKeyChar();
		repaint();
	}

	public void keyPressed(KeyEvent ke) {
	}

	public void keyReleased(KeyEvent ke) {
	}

}
