package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Usuario;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class VMenuPrincipal extends JFrame {

	private JPanel contentPane;

	
	public VMenuPrincipal() {
		setTitle("Menu Principal");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 443);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 204, 101));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido!");
		lblBienvenido.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblBienvenido.setBounds(10, 11, 93, 14);
		contentPane.add(lblBienvenido);
		
		JLabel lblNombreUser = new JLabel("");
		lblNombreUser.setFont(new Font("Roboto", Font.ITALIC, 18));
		lblNombreUser.setBounds(121, 11, 125, 14);
		contentPane.add(lblNombreUser);
	}
}
