import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Baby extends JPanel implements ActionListener, ItemListener {
	
	Timer timer = new Timer(50, this);
	
	int xPos = 700;
	int yPos = 130;
	int startAngle = 0;
	int arcLength = 45;
	int shift = 5;
	int d = 200;
	double answer = 0;
	
	JPanel buttonHold = new JPanel();
	
	JButton startBT = new JButton("Start");
	JButton babyBT = new JButton("Baby");
	JRadioButton hiRB = new JRadioButton("Hi");

	Baby() {
		
		//timer.start();
		setFocusable(true);
		
		buttonHold.setLayout(new GridLayout(3,1));
		buttonHold.add(startBT);
		buttonHold.add(babyBT);
		buttonHold.add(hiRB);
		
		this.setLayout(new BorderLayout());
		this.add(buttonHold, BorderLayout.WEST);
		
		startBT.addActionListener(this);
		babyBT.addActionListener(this);
		hiRB.addItemListener(this);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		g.drawOval(xPos, yPos, d, d);
		for(int i = 0; i < 360; i = i + 90) {
			g.fillArc(xPos, yPos, d, d, startAngle + i, arcLength);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		startAngle = startAngle + shift;
		repaint();
		if(e.getSource() == startBT) {
			xPos = xPos - 10;
			repaint();
		} else if(e.getSource() == babyBT) {
			timer.start();
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == hiRB) {
			timer.stop();
			xPos = 2000;
			yPos = 2000;
			repaint();
		}
		
	}
	
}
