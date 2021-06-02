package code.calculator;
/**
 * @author Aykut Acarer
 * 
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Pace_Calculate extends JFrame {

	private JPanel contentPane;
	private JTextField text_km;
	private JTextField text_hour;
	private JTextField text_minute;
	private JTextField text_second;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pace_Calculate frame = new Pace_Calculate();
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
	public Pace_Calculate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text_km = new JTextField();
		text_km.setBounds(85, 45, 86, 20);
		contentPane.add(text_km);
		text_km.setColumns(10);
		
		text_hour = new JTextField();
		text_hour.setBounds(85, 76, 86, 20);
		contentPane.add(text_hour);
		text_hour.setColumns(10);
		
		text_minute = new JTextField();
		text_minute.setText("");
		text_minute.setBounds(85, 107, 86, 20);
		contentPane.add(text_minute);
		text_minute.setColumns(10);
		
		text_second = new JTextField();
		text_second.setBounds(85, 138, 86, 20);
		contentPane.add(text_second);
		text_second.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String km1 = text_km.getText();
				int km = Integer.parseInt(km1);
				String hour1 =text_hour.getText();
				int hour = Integer.parseInt(hour1);
				String minute1 =text_minute.getText();
				int minute = Integer.parseInt(minute1);
				String second1 = text_second.getText();
				int second = Integer.parseInt(second1);
				
				double hr = hour+ (double)minute/60 + (double)second/3600;
				double result = (double) hr/km;
				int hr1 = (int)result;
				double min = ((result - hr1)*60);
				double sec = ((min - (int)min)*60);
				
				JOptionPane.showMessageDialog(null, " The Time is pro Km: " + "\n"+ hr1 + " hour " + 
						"\n"+(int)min + " minute "+ "\n"+(int)sec + " second", "Pace Calculator", 1);
				
			}
		});
		btnNewButton.setBounds(85, 169, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("km:");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 48, 46, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblHour = new JLabel("hour:");
		lblHour.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblHour.setBounds(10, 79, 46, 14);
		contentPane.add(lblHour);
		
		JLabel lblMinute = new JLabel("minute:");
		lblMinute.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblMinute.setBounds(10, 110, 46, 14);
		contentPane.add(lblMinute);
		
		JLabel lblSecond = new JLabel("second:");
		lblSecond.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblSecond.setBounds(10, 141, 46, 14);
		contentPane.add(lblSecond);
		
		JLabel lblNewLabel_1 = new JLabel("Pace Calculator");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(70, 11, 130, 23);
		contentPane.add(lblNewLabel_1);
	}
}
