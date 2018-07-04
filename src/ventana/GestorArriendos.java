package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import clases.Empresa;

import javax.swing.ListSelectionModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class GestorArriendos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnPrestamo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnGuardar;

	
	/*
	 * Clase Ventana que contiene las opciones de arriendo, devolucion y perdida de peliculas. Su funcionamiento se basa en el rut del cliente excencialmente
	 */
	public GestorArriendos(Empresa cubiSentiBuster) {
		setBackground(Color.WHITE);
		setTitle("Gestor de Arriendos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 386);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 205, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblIngresarRutCliente = new JLabel("Ingresar Rut Cliente");
		lblIngresarRutCliente.setFont(new Font("Roboto", Font.PLAIN, 14));
		
		JButton btnCargar = new JButton("Cargar ");
		btnCargar.setFont(new Font("Roboto", Font.PLAIN, 14));
		
		scrollPane = new JScrollPane();
		
		btnPrestamo = new JButton("Prestamo");
		btnPrestamo.setFont(new Font("Roboto", Font.PLAIN, 14));
		
		btnNewButton = new JButton("Devolucion");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 14));
		
		btnNewButton_1 = new JButton("Perdida");
		btnNewButton_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Roboto", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblIngresarRutCliente, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(btnCargar, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnPrestamo, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
							.addContainerGap(91, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnGuardar)
							.addGap(21))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(lblIngresarRutCliente, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(btnCargar, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnPrestamo)
							.addGap(15)
							.addComponent(btnNewButton)
							.addGap(16)
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
							.addComponent(btnGuardar)))
					.addContainerGap())
		);
		
		table = new JTable();
		table.setFont(new Font("Roboto", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Titulo ", "Tipo", "Fecha Prestamo"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(18);
		table.getColumnModel().getColumn(2).setPreferredWidth(109);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
