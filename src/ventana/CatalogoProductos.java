package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import java.awt.Font;

import extras.JPlaceholderTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class CatalogoProductos extends JFrame {

	private JPanel contentPane;
	private JPlaceholderTextField txtIdProducto ;
	private JTable table;


	
	
	public CatalogoProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdProducto = new JPlaceholderTextField("ID Producto");
		txtIdProducto.setFont(new Font("Roboto", Font.PLAIN, 14));
		txtIdProducto.setBounds(10, 26, 194, 23);
		contentPane.add(txtIdProducto);
		txtIdProducto.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(247, 26, 97, 24);
		contentPane.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 660, 390);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
	}
}
