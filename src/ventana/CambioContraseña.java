package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class CambioContraseña extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	public CambioContraseña() {
		
		setTitle("Cambio Contrase\u00F1a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblContraseaAntigua = new JLabel("Contrase\u00F1a Antigua:");
		lblContraseaAntigua.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblContraseaAntigua.setBounds(10, 24, 160, 19);
		contentPane.add(lblContraseaAntigua);
		
		JLabel lblContraseaNueva = new JLabel("Contrase\u00F1a Nueva");
		lblContraseaNueva.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblContraseaNueva.setBounds(10, 56, 139, 19);
		contentPane.add(lblContraseaNueva);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir Contrase\u00F1a");
		lblRepetirContrasea.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblRepetirContrasea.setBounds(10, 86, 130, 19);
		contentPane.add(lblRepetirContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 24, 170, 19);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(143, 56, 170, 19);
		contentPane.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(143, 86, 170, 20);
		contentPane.add(passwordField_2);
	}
}
