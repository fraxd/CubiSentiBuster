package ventana.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empresa;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlPersonal extends JFrame {

	public ControlPersonal(Empresa cubiSentiBuster,int idTienda) {
		getContentPane().setBackground(new Color(63, 81, 181));
		setTitle("Control Personal    ID TIENDA: " + idTienda);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		addWindowListener(new java.awt.event.WindowAdapter(){
			@Override
			public void windowsClosing(java.awt.event.WindowEvent evt) {
				closeAndSave(cubiSentiBuster);
			}
		});
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 187, 239);
		getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnAgregarPersonal = new JButton("Agregar Personal");
		btnAgregarPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarPersonal agregarPersonal = new AgregarPersonal(cubiSentiBuster, idTienda);
				agregarPersonal.setVisible(true);
				
			}
		});
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
	
	public void closeAndSave(Empresa cubiSentiBuster) {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?", "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				System.exit(0);
				cubiSentiBuster.grabUsuarios();
		}
	}
}
