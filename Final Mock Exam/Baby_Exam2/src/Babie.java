import java.util.*; //for random
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;

public class Babie extends JPanel implements ActionListener, MouseMotionListener, ItemListener {
	
	Timer timer = new Timer(500, this);
	int xPos = 50;
	int yPos = 50;
	
	JRadioButton cutieRB = new JRadioButton("cutiebaby");
	JTextField inputTF = new JTextField("Babe: ");
	JButton moveBT = new JButton("thatmeanteerak");
	JLabel answerLabel = new JLabel("Ans: ");
	
	JPanel belowPanel = new JPanel();
	
	
	Babie() {
		
		belowPanel.setLayout(new GridLayout(2,2));
		belowPanel.add(cutieRB);
		belowPanel.add(inputTF);
		belowPanel.add(moveBT);
		belowPanel.add(answerLabel);
		
		this.setLayout(new BorderLayout());
		this.add(belowPanel, BorderLayout.SOUTH);
		
		inputTF.addActionListener(this);
		
		cutieRB.addItemListener(this);
		moveBT.addActionListener(this);
		
		this.addMouseMotionListener(this);

	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(Color.PINK);
		g.fillOval(xPos, yPos, 50, 50);
		
	}

	public int getRandomXloc() {
		Random random = new Random();
		return random.nextInt(1000-100);
	}
	public int getRandomYloc() {
		Random random = new Random();
		return random.nextInt(500-100);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (cutieRB.isSelected()) {
	        timer.start();
	    } else {
	        timer.stop();
	    }
	}
		

	@Override
	public void mouseDragged(MouseEvent e) {
			xPos = e.getX();
			yPos = e.getY();
			repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == timer) {
	        xPos = getRandomXloc();
	        yPos = getRandomYloc();
	        repaint(); 
		} else if(e.getSource() == inputTF) {
			if(e.getActionCommand().equals("Babe: will you marry me")) { //compare string ใช้ == ไม่ได้นะ
				answerLabel.setText("Ans: yes");
			} else {
				answerLabel.setText("Ans: kuay");
			}
		} else if(e.getSource() == moveBT) {
			xPos = xPos + 15;
			repaint();
		}
		
	}
}
