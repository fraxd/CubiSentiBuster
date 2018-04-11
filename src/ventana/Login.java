package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField userField;
	private JPasswordField passwordField;

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(249, 168, 37));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setFont(new Font("Roboto", Font.BOLD, 20));
		lblUser.setBounds(25, 115, 85, 29);
		contentPane.add(lblUser);
		
		userField = new JTextField();
		userField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userField.setBounds(144, 115, 216, 29);
		contentPane.add(userField);
		userField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a:");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 20));
		lblNewLabel.setBounds(21, 176, 140, 29);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Contrase\u00F1a");
		passwordField.setBounds(144, 176, 216, 29);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Ingresar");
		btnLogin.setFont(new Font("Roboto", Font.BOLD, 20));
		btnLogin.setBounds(144, 227, 132, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel("CubiSentiBuster");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(46, 11, 334, 78);
		contentPane.add(lblNewLabel_1);
	}
}
