import java.awt.*;
import javax.swing.*;

public class BMICalculatorTesting extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My BMI Calculator");
		BMICalculator BMICal = new BMICalculator();

		frame.add(BMICal);
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
