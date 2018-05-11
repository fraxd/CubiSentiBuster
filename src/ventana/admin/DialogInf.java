package ventana.admin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogInf extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Se ejecuta este aviso cuando se crea la tienda correctamente
	 */

	private final JPanel contentPanel = new JPanel();
	

	public DialogInf(int tipo) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		/*
		 * tipo = 0 - Tienda agregada correctamente
		 * tipo = 1 - Error Agregar Tienda
		 * tipo = 2 - tienda Eliminada correctamente
		 * tipo = 3 - Error Eliminar Tienda
		 * tipo = 4 - Usuario Agregado Correctamente
		 * tipo = 5 . Error Id usuario ya existe
		 */
		setBounds(100, 100, 475, 128);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblMensaje = new JLabel();
			lblMensaje.setFont(new Font("Roboto", Font.PLAIN, 16));
			lblMensaje.setBounds(10, 11, 423, 19);
			contentPanel.add(lblMensaje);
			switch(tipo) {
				case 0:
					lblMensaje.setText("Tienda Agregada Correctamente.!");
					break;
				case 1:
					lblMensaje.setText("Error el Id de tienda ya esta utilizado!");
					break;
				case 2:
					lblMensaje.setText("Tienda Eliminada Correctamente.!");
					break;
				case 3:
					lblMensaje.setText("El Id tienda no se encontro.:c");
					break;
				case 4:
					lblMensaje.setText("Usuario Agregado Correctamente :)"); 
					break;
				case 5:
					lblMensaje.setText("Error el Rut ya esta registrado :c");
					break;
					
			
			}

		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
