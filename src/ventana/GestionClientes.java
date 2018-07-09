package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import extras.JPlaceholderTextField;

import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class GestionClientes extends JFrame {

	private JPanel contentPane;
	private JPlaceholderTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	
	/*
	 * Ventana para agregar, quitar, modificar clientas en empresa
	 */
	public GestionClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JPlaceholderTextField("Rut sin digito verificador");
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c))e.consume();
			}
		});
		textField.setBounds(10, 11, 194, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo ");
		btnNuevo.setBounds(216, 10, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(315, 10, 89, 23);
		contentPane.add(btnBuscar);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 69, 283, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y Apellido");
		lblNombreYApellido.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNombreYApellido.setBounds(10, 69, 149, 20);
		contentPane.add(lblNombreYApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblTelefono.setBounds(10, 110, 89, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
		lblCorreoElectronico.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblCorreoElectronico.setBounds(10, 142, 123, 14);
		contentPane.add(lblCorreoElectronico);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 108, 108, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(141, 140, 283, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(403, 186, 89, 23);
		contentPane.add(btnGuardar);
		
		
		//Los TextFields son iniciado desactivados 
		textField_1.setEnabled(false); 
		textField_2.setEnabled(false);
		textField_3.setEnabled(false);
		
	}
	
	
}
