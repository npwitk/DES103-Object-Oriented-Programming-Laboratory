import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class ControlPanel extends JPanel {
	
	public ControlPanel(){		
		
		this.setLayout(new GridLayout(1,3));
		AdjustPanel adjustpanel_1 = new AdjustPanel("Channel");
		AdjustPanel adjustpanel_2 = new AdjustPanel("Volume");
		JButton power = new JButton("on/off");
		
		this.add(adjustpanel_1);
		this.add(adjustpanel_2);
		this.add(power);
		
	}
}