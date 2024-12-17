package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ElectricFan extends JPanel {
	public void paintComponent(Graphics g) {

		// Exercise 1: Fan's frame
		g.setColor(Color.gray);
		g.fillOval(295, 95, 210, 210);
		g.setColor(Color.white);
		g.fillOval(300, 100, 200, 200);
		
		// Exercise 2: Fan's Blades
		g.setColor(Color.orange);
		g.fillArc(310, 110, 180, 180, 0, 36);
		g.fillArc(310, 110, 180, 180, 72, 36);
		g.fillArc(310, 110, 180, 180, 144, 36);
		g.fillArc(310, 110, 180, 180, 216, 36);
		g.fillArc(310, 110, 180, 180, 288, 36);
		
		// Exercise 3: Fan's neck 
		g.setColor(Color.gray);
		g.fillRect(380, 300, 45, 150);
		
		// Exercise 4: Fan's base
		g.setColor(Color.blue);
		int[] x = {350, 450, 500, 300};
		int[] y = {450, 450, 550, 550};
		g.fillPolygon(x, y, 4);
		
		// Exercise 5: Fan's speed buttons
		// Exercise 5: Four red round speed buttons
		g.setColor(Color.red);
		g.fillRoundRect(360, 500, 17, 20, 20, 20);
		g.fillRoundRect(380, 500, 17, 20, 20, 20);
		g.fillRoundRect(400, 500, 17, 20, 20, 20);
		g.fillRoundRect(420, 500, 17, 20, 20, 20);
		
		g.setColor(Color.white);
		g.drawString("1", 366, 514);
		g.drawString("2", 366+20, 514);
		g.drawString("3", 366+40, 514);
		g.drawString("4", 366+60, 514);

	}
}