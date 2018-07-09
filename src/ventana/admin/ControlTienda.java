package ventana.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empresa;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlTienda extends JFrame {

	private JPanel contentPane;

	/*
	 * clase ventana enfocada en la creacion, eliminacion y modificacion de tiendas
	 */
	public ControlTienda(Empresa cubiSentiBuster) {
		setTitle("Control Tienda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 371, 280);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(77, 182, 172));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAgregar = new JButton("Agregar Tienda");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaTienda nuevatienda = new NuevaTienda(cubiSentiBuster);
				nuevatienda.setVisible(true);
				
			}
		});
		btnAgregar.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnAgregar.setBounds(69, 59, 200, 23);
		contentPane.add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar Tienda");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TiendaEliminar tiendaEliminar = new TiendaEliminar(cubiSentiBuster);
				tiendaEliminar.setVisible(true);
			}
		});
		btnEliminar.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnEliminar.setBounds(69, 106, 200, 23);
		contentPane.add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar Tienda");
		btnModificar.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnModificar.setBounds(69, 151, 200, 23);
		contentPane.add(btnModificar);
	}

}
