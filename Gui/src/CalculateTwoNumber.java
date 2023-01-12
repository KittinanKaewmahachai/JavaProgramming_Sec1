import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField textNum1;
	private JTextField textNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setBounds(55, 11, 119, 31);
		contentPane.add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(55, 53, 94, 17);
		contentPane.add(lblNumber2);
		
		textNum1 = new JTextField();
		textNum1.setBounds(237, 16, 86, 20);
		contentPane.add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setBounds(237, 51, 86, 20);
		contentPane.add(textNum2);
		textNum2.setColumns(10);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setBounds(175, 185, 46, 14);
		contentPane.add(lblResult);
		
		JComboBox cmdOperator = new JComboBox();
		cmdOperator.setBounds(238, 85, 85, 22);
		cmdOperator.addItem("+");
		cmdOperator.addItem("-");
		cmdOperator.addItem("*");
		cmdOperator.addItem("/");
		contentPane.add(cmdOperator);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(55, 81, 72, 30);
		contentPane.add(lblOperator);
		
		JLabel lblDigit = new JLabel("How to show digit");
		lblDigit.setBounds(55, 132, 109, 45);
		contentPane.add(lblDigit);
		
		JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(234, 128, 109, 23);
		contentPane.add(oneDigit);
		
		JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(234, 154, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(textNum1.getText());
					num2 = Double.parseDouble(textNum2.getText());
					//JComboBox
					operator = (String)cmdOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					DecimalFormat frmNumber = null;
					//JRadioButton
					if(oneDigit.isSelected())
						frmNumber=new DecimalFormat("#,###.0");
					else if(twoDigit.isSelected())
						frmNumber = new DecimalFormat("#,###.00");
					
					//JLabel
					lblResult.setText(String.format("%.2f",sum));
				}
				
			}
		});
		btnOK.setBounds(60, 208, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.setBounds(237, 208, 89, 23);
		contentPane.add(btnEXIT);
		
		
	}
}
