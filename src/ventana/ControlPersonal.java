package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empresa;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;

public class ControlPersonal extends JFrame {

	public ControlPersonal(Empresa cubiSentiBuster,int idTienda) {
		getContentPane().setBackground(new Color(63, 81, 181));
		setTitle("Control Personal");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 187, 239);
		getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnAgregarPersonal = new JButton("Agregar Personal");
		btnAgregarPersonal.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnAgregarPersonal.setBounds(224, 37, 171, 23);
		getContentPane().add(btnAgregarPersonal);
		
		JButton btnEliminarPersonal = new JButton("Eliminar Personal");
		btnEliminarPersonal.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnEliminarPersonal.setBounds(224, 81, 171, 23);
		getContentPane().add(btnEliminarPersonal);
		
		JButton btnNewButton = new JButton("Modificar Personal");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnNewButton.setBounds(224, 123, 171, 23);
		getContentPane().add(btnNewButton);
	}
}
