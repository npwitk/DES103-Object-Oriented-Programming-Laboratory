import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SqaureDoing extends JPanel implements ActionListener {
	
	int xPos = 60;
	int yPos = 180;
	double answer = 0;
	
	JPanel buttonHold = new JPanel();
	
	JButton startBT = new JButton("Start");
	JButton computeBT = new JButton("Compute");
	JTextField radiusTF = new JTextField("Insert width here...");
	JLabel outputLabel = new JLabel("Compute the area of the square ...");
	

	SqaureDoing() {
		
		setFocusable(true);
		
		buttonHold.setLayout(new GridLayout(2,2));
		buttonHold.add(startBT);
		buttonHold.add(radiusTF);
		buttonHold.add(computeBT);
		buttonHold.add(outputLabel);
		
		this.setLayout(new BorderLayout());
		this.add(buttonHold, BorderLayout.NORTH);
		
		startBT.addActionListener(this);
		computeBT.addActionListener(this);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.GRAY);
		g.setColor(Color.WHITE);
		g.fillRect(xPos, yPos, 30, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == startBT) {
			yPos = yPos + 10;
			repaint();
		} else if(e.getSource() == computeBT) {
			double userRadius = Double.parseDouble(radiusTF.getText());
			double area = userRadius*userRadius;
			outputLabel.setText("The area of the square is " + area);
		}
		
	}
	
}
