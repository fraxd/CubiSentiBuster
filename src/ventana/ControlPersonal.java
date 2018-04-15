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

public class ControlPersonal extends JFrame {

	public ControlPersonal(Empresa cubiSentiBuster,int idTienda) {
		setTitle("Control Personal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 187, 239);
		getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnAgregarPersonal = new JButton("Agregar Personal");
		btnAgregarPersonal.setBounds(224, 9, 143, 23);
		getContentPane().add(btnAgregarPersonal);
		
		JButton btnEliminarPersonal = new JButton("Eliminar Personal");
		btnEliminarPersonal.setBounds(224, 43, 143, 23);
		getContentPane().add(btnEliminarPersonal);
	}
}
