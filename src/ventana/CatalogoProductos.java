package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;

public class CatalogoProductos extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdProducto;


	
	
	public CatalogoProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdProducto = new JTextField();
		txtIdProducto.setToolTipText("ID Producto");
		txtIdProducto.setFont(new Font("Roboto", Font.PLAIN, 14));
		txtIdProducto.setBounds(10, 33, 211, 23);
		contentPane.add(txtIdProducto);
		txtIdProducto.setColumns(10);
		TextPrompt placeholder = new TextPrompt("Apellido Paterno", txtIdProducto);
		placeholder.changeAlpha(0.75f);
		placeholder.changeStyle(Font.ITALIC);
		JOptionPane.showMessageDialog(null, txtIdProducto);
	}
}
