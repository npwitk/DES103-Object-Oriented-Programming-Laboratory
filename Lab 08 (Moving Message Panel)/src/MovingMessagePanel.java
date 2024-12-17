import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MovingMessagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener
{
	JPanel colorPanel = new JPanel(); //Color Panel (Left)
	JPanel messagePanel = new JPanel(); //Message Panel (Top)
	JPanel directionPanel = new JPanel(); //Direction Panel (Bottom)
	
	//Color Panel
	JLabel backgroundColor = new JLabel("Background Color");
	JRadioButton whiteButton = new JRadioButton("White");
	JRadioButton blackButton = new JRadioButton("Black");
	
	//Message Panel
	JLabel labelMessage = new JLabel("Message to be display");
	JTextField textFieldmessageDisplay = new JTextField(40); //Text Field
	
	//Direction Panel
	JButton leftButton = new JButton("Left");
	JButton rightButton = new JButton("Right");
	JButton upButton = new JButton("Up");
	JButton downButton = new JButton("Down");
	
	JRadioButton useMouseButton = new JRadioButton("Use Mouse");
	
	Color textColor;
	String message = "";
	int x = 0; //Default position of the text!
	int y = 100;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font myfont = new Font("SansSerif",Font.BOLD, 50);
		g.setFont(myfont);
		g.setColor(textColor);
		g.drawString(message, x, y); //drawString is here!
	}
	
	public MovingMessagePanel() {
		
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout()); //Set overall layout to be BorderLayout
		
		frame.add(colorPanel, BorderLayout.WEST);
		frame.add(messagePanel, BorderLayout.NORTH);
		frame.add(directionPanel, BorderLayout.SOUTH);
		frame.add(this, BorderLayout.CENTER);
		frame.add(useMouseButton, BorderLayout.EAST); ///????? 
		
		//Setting colorPanel
		colorPanel.setLayout(new GridLayout(3,1));
		colorPanel.add(backgroundColor);
		colorPanel.add(whiteButton);
		colorPanel.add(blackButton);
		
		//Setting messagePanel
		messagePanel.setLayout(new FlowLayout());
		messagePanel.add(labelMessage);
		messagePanel.add(textFieldmessageDisplay);
		
		//Setting directionPanel
		directionPanel.setLayout(new FlowLayout());
		directionPanel.add(leftButton);
		directionPanel.add(rightButton);
		directionPanel.add(upButton);
		directionPanel.add(downButton);
		
		//Listener
		textFieldmessageDisplay.addActionListener(this); //Action
		
		blackButton.addItemListener(this); //Item
		whiteButton.addItemListener(this); //Item
		
		leftButton.addActionListener(this); //Action
		rightButton.addActionListener(this); //Action
		upButton.addActionListener(this); //Action
		downButton.addActionListener(this); //Action
		
		this.addMouseMotionListener(this); //Mouse Motion
		
		//Frame Settings
		frame.setSize(1000, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My Moving Message Panel");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (useMouseButton.isSelected() == true) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) { //Background Change (Fixed Bugs on Button Selected)
		if(e.getSource() == blackButton && e.getStateChange() == 1) {
			whiteButton.setSelected(false);
			this.setBackground(Color.black);
			textColor = Color.pink;
			blackButton.setSelected(true);
		}
		else if (e.getSource() == whiteButton && e.getStateChange() == 1) {
			blackButton.setSelected(false);
			this.setBackground(Color.white);
			textColor = Color.black;
			whiteButton.setSelected(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) { //Text Field + 4 Buttons
		if(e.getSource() == textFieldmessageDisplay){
			message = e.getActionCommand();
			repaint();
			}
			else if(e.getSource() == leftButton) {
				x = x - 10;
			}
			else if(e.getSource() == rightButton) {
				x = x + 10;
			}
			else if(e.getSource() == upButton) {
				y = y - 10;
			}
			else if(e.getSource() == downButton) {
				y = y + 10;
			}
			repaint();
	}
}


