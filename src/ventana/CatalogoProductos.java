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
import javax.swing.table.DefaultTableModel;

import clases.Empresa;


public class CatalogoProductos extends JFrame {

	private JPanel contentPane;
	private JPlaceholderTextField txtIdProducto ;
	private JTable table;


	
	/*
	 * Clase Ventana Catalogo Proudcto donde se podra agregar, quitar, y modificiar peliculas
	 */
	public CatalogoProductos(Empresa cubiSentiBuster) {
		setOpacity(0.6f);
		setTitle("Catalogo Productos");
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
		btnBuscar.setBounds(219, 26, 97, 24);
		contentPane.add(btnBuscar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(383, 27, 89, 23);
		contentPane.add(btnNuevo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 660, 390);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id Producto", "Titulo", "Tipo", "Stock", "Arrendados"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.setFont(new Font("Roboto", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(482, 27, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnArriendos = new JButton("Arriendos");
		btnArriendos.setBounds(581, 27, 89, 23);
		contentPane.add(btnArriendos);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(680, 88, 89, 23);
		contentPane.add(btnNewButton);
		
	}
}
