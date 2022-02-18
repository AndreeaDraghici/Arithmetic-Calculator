package simplecalculator.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompareTwoNumbers {

	private JFrame frame;
	private JTextField textNum1;
	private JTextField textNum2;
	private JTextField textResult;

	/**
	 * Launch the application.
	 */
	protected static void main() {
		main();
	}

	/**
	 * Launch the application.
	 */
	protected static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			run();
		});
	}

	/**
	 * Create the application.
	 */
	public CompareTwoNumbers() {
		initialize();
	}

	private static void run() {
		try {
			CompareTwoNumbers window = new CompareTwoNumbers();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 0, 128));
		frame.setBounds(100, 100, 527, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Compare Two Numbers");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(190, 17, 139, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 40, 461, 2);
		frame.getContentPane().add(separator);
		
		textNum1 = new JTextField();
		textNum1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textNum1.setBackground(new Color(135, 206, 235));
		textNum1.setBounds(84, 67, 96, 19);
		frame.getContentPane().add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textNum2.setBackground(new Color(135, 206, 235));
		textNum2.setBounds(328, 67, 96, 19);
		frame.getContentPane().add(textNum2);
		textNum2.setColumns(10);
		
		JLabel lblNum1 = new JLabel("Number 1");
		lblNum1.setBackground(Color.BLACK);
		lblNum1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNum1.setBounds(10, 70, 64, 13);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Number 2");
		lblNum2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNum2.setBackground(Color.BLACK);
		lblNum2.setBounds(254, 70, 64, 13);
		frame.getContentPane().add(lblNum2);
		
		textResult = new JTextField();
		textResult.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textResult.setBackground(new Color(135, 206, 235));
		textResult.setBounds(190, 151, 96, 19);
		frame.getContentPane().add(textResult);
		textResult.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblResult.setBackground(Color.BLACK);
		lblResult.setBounds(135, 154, 45, 13);
		frame.getContentPane().add(lblResult);
		
		JButton btnReset = new JButton("Reset All");
		btnReset.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				textNum1.setText(null);
			    textNum2.setText(null);
			    textResult.setText(null);	
			    JOptionPane.showMessageDialog(null, " Compare other numbers ");
				
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnReset.setBounds(295, 232, 85, 21);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
	            if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!",
	            		"Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
	            	System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnExit.setBounds(407, 232, 85, 21);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 203, 461, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnCompare = new JButton("Compare");
		btnCompare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1= Integer.parseInt(textNum1.getText());
				int num2= Integer.parseInt(textNum2.getText());
				String result = null;
				
				if(num1>num2){
					result=num1+" > "+num2;
				}else if(num1<num2){
					result=num1+" < "+num2;
				}else if(num1==num2) {
					result=num1+" = "+num2;
				}
				textResult.setText(result);
			}
		});
		btnCompare.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnCompare.setBounds(45, 232, 85, 21);
		frame.getContentPane().add(btnCompare);
	}
}
