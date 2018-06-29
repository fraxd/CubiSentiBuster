package ventana.admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import clases.Empresa;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import com.sun.glass.events.WindowEvent;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;

public class ControlPersonal extends JFrame {

	public ControlPersonal(Empresa cubiSentiBuster,int idTienda) {
		//** Override para confirmar cierre *///
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				close();
			}
		});
		getContentPane().setBackground(new Color(63, 81, 181));
		setTitle("Control Personal    ID TIENDA: " + idTienda);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		
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
		btnAgregarPersonal.setBounds(224, 107, 171, 23);
		getContentPane().add(btnAgregarPersonal);
		
		JButton btnEliminarPersonal = new JButton("Eliminar Personal");
		btnEliminarPersonal.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnEliminarPersonal.setBounds(224, 146, 171, 23);
		getContentPane().add(btnEliminarPersonal);
		
		JButton btnModificarPersonal = new JButton("Modificar Personal");
		btnModificarPersonal.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnModificarPersonal.setBounds(224, 189, 171, 23);
		getContentPane().add(btnModificarPersonal);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cubiSentiBuster.grabUsuarios();
			}
		});
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setFont(new Font("Roboto", Font.BOLD, 14));
		btnGuardar.setBounds(306, 9, 89, 23);
		getContentPane().add(btnGuardar);
	}
	
	//** ventana que consulta cierre de la app *//
	public void close() {
		Object [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
		if (eleccion == JOptionPane.YES_OPTION)dispose();
		
	}
}

