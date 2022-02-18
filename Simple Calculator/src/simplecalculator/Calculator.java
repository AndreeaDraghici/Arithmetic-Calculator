package simplecalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
/*
 * author: andreea
 * 1 Aug 2021
 * 
 */
@SuppressWarnings("unused")
public class Calculator {

	private JFrame frame;
	private JTextField txtNumber1;
	private JTextField txtNumber2;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 51));
		frame.setBounds(100, 100, 652, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNumber1 = new JTextField();
		txtNumber1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtNumber1.setBackground(new Color(153, 204, 204));
		txtNumber1.setBounds(150, 38, 96, 19);
		frame.getContentPane().add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtNumber2.setBackground(new Color(153, 204, 204));
		txtNumber2.setBounds(150, 83, 96, 19);
		frame.getContentPane().add(txtNumber2);
		txtNumber2.setColumns(10);
		
		JButton btnAdditon = new JButton("Additon");
		btnAdditon.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAdditon.setBackground(new Color(153, 0, 255));
		btnAdditon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1= Integer.parseInt(txtNumber1.getText());
				int num2= Integer.parseInt(txtNumber2.getText());
				int result=num1+num2;
				txtResult.setText(Integer.toString(result));
				
			
				
			}
		});
		btnAdditon.setBounds(477, 54, 122, 31);
		frame.getContentPane().add(btnAdditon);
		
		JButton btnMultiply = new JButton("Multiplication");
		btnMultiply.setForeground(new Color(0, 0, 0));
		btnMultiply.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnMultiply.setBackground(new Color(153, 0, 255));
		btnMultiply.addActionListener(e -> {

			int num1= Integer.parseInt(txtNumber1.getText());
			int num2= Integer.parseInt(txtNumber2.getText());
			int result=num1*num2;
			txtResult.setText(Integer.toString(result));



		});
		btnMultiply.setBounds(477, 136, 122, 31);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnSubstraction = new JButton("Substraction");
		btnSubstraction.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnSubstraction.setBackground(new Color(153, 0, 255));
		btnSubstraction.addActionListener(e -> {

			int num1= Integer.parseInt(txtNumber1.getText());
			int num2= Integer.parseInt(txtNumber2.getText());
			int result=num1-num2;
			txtResult.setText(Integer.toString(result));

		});
		btnSubstraction.setBounds(477, 95, 122, 31);
		frame.getContentPane().add(btnSubstraction);
		
		JButton btnDivision = new JButton("Division");
		btnDivision.setForeground(new Color(0, 0, 0));
		btnDivision.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnDivision.setBackground(new Color(153, 0, 255));
		btnDivision.addActionListener(e -> {
			int num1= Integer.parseInt(txtNumber1.getText());
			int num2= Integer.parseInt(txtNumber2.getText());
			int result=num1/num2;
			txtResult.setText(Integer.toString(result));

		});
		btnDivision.setBounds(477, 177, 122, 31);
		frame.getContentPane().add(btnDivision);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtResult.setBackground(new Color(153, 204, 204));
		txtResult.setBounds(150, 145, 96, 22);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JLabel lblFirst = new JLabel("FIRST NUMBER");
		lblFirst.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblFirst.setBounds(44, 41, 96, 13);
		frame.getContentPane().add(lblFirst);
		
		JLabel lblNewLabel_1 = new JLabel("SECOND NUMBER");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_1.setBounds(27, 86, 113, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RESULT");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblNewLabel_2.setBounds(65, 146, 58, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnReset.setBackground(new Color(255, 153, 0));
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNumber1.setText(null);
			    txtNumber2.setText(null);
			    txtResult.setText(null);	
			    
			    JOptionPane.showMessageDialog(null, "Enter other numbers");
			}
		});
		btnReset.setBounds(44, 242, 85, 31);
		frame.getContentPane().add(btnReset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 119, 236, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setBackground(new Color(0, 204, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(305, 10, 104, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(287, 33, 122, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	            frame = new JFrame("Exit");
	            if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!",
	            		"Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
	            	System.exit(0);
	            }
			}
		});
		btnNewButton.setBounds(161, 242, 85, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCompare = new JButton("Click to compare");
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CompareTwoNumbers.main(null);
			}
		});
		btnCompare.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnCompare.setBackground(new Color(199, 21, 133));
		btnCompare.setBounds(430, 243, 169, 31);
		frame.getContentPane().add(btnCompare);
	}
}
