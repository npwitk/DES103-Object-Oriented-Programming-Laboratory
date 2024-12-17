import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMICalculator extends JPanel implements ActionListener {

	JLabel enterInfo = new JLabel("Enter your information");

	JLabel height = new JLabel("Your hieght (cm): ");
	JTextField heightTF = new JTextField(30);

	JLabel weight = new JLabel("Your weight (kg): ");
	JTextField weightTF = new JTextField(30);

	JButton computeButton = new JButton("Compute BMI");

	JLabel result = new JLabel("BMI = ");

	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	BMICalculator() {

		super();
		p1.setLayout(new GridLayout(1, 2));
		p1.add(height);
		p1.add(heightTF);

		p2.setLayout(new GridLayout(1, 2));
		p2.add(weight);
		p2.add(weightTF);

		this.setLayout(new GridLayout(5, 1));
		this.add(enterInfo);
		this.add(p1);
		this.add(p2);
		this.add(computeButton);
		this.add(result);

		computeButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double weightNum = Double.parseDouble(weightTF.getText());
		double heightInCM = Double.parseDouble(heightTF.getText());
		result.setText("BMI = " + String.format("%.2f",computeBMI(weightNum, heightInCM))); // (Format, Value) when using format
	}

	double computeBMI(double weightNum, double heightInCM) {
		return (weightNum) / (heightInCM / 100 * heightInCM / 100);
	}
}
