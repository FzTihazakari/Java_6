import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LengthConverter extends JFrame {

	private JFrame frame;
	private JButton jButtonCM;
	private JButton jButtonFt;
	private JLabel jLabelLength;
	private JLabel jLabelResult;
	private JTextField jTextFieldLength;
	private JTextField jTextFieldResult;


private void showLengthConverterr(){

	double cm;
	double feet;
	double length;

	jLabelLength = new JLabel ("Enter Length: ",JLabel.LEFT);
	jTextFieldLength = new JTextField();

	jLabelResult = new JLabel ("Result : ",JLabel.LEFT);
	jTextFieldResult = new JTextField();

	jButtonFt = new JButton ("Feet to Centimeter");
	jButtonFt.addActionListener(new ButtonListener1());

	jButtonCM = new JButton ("Centimeter to Feet");
	jButtonCM.addActionListener(new ButtonListener2());

	JPanel mainPanel = new JPanel();
	mainPanel.setLayout(new GridLayout (4,1,10,10));

	JPanel panel1 = new JPanel();
	panel1.setLayout(new GridLayout(2,2,10,10));
	panel1.add(jLabelLength);
	panel1.add(jTextFieldLength);
	panel1.add(jLabelResult);
	panel1.add(jTextFieldResult);
	mainPanel.add(panel1);

	JPanel panel3 = new JPanel();
	panel3.setLayout(new FlowLayout());
	panel3.add(jButtonFt);
	panel3.add(jButtonCM);
	mainPanel.add(panel3);

	frame=new JFrame("Length Converter");
	frame.setSize(500,300);
	frame.setContentPane(mainPanel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
}
public class ButtonListener1 implements ActionListener {
	public void actionPerformed(ActionEvent e)
	{
		final double FEET1=30.48;
		String value1;
		double lengthFt;

		value1=jTextFieldLength.getText();
		lengthFt=Double.parseDouble(value1)*FEET1;
		jTextFieldResult.setText(lengthFt+"cm");
	}
}

public class ButtonListener2 implements ActionListener {
	public void actionPerformed(ActionEvent e)
	{
		final double CM1=30.4;
		String value2;
		double lengthC;

		value2=jTextFieldLength.getText();
		lengthC=Double.parseDouble(value2)*CM1;
		jTextFieldResult.setText(lengthC+"ft");
	}
}

public static void main(String[] args) {

	LengthConverter convert = new LengthConverter();
	convert.showLengthConverterr();
   }
}