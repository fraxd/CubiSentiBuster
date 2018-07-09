package ventana.admin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empresa;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TiendaEliminar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;


	/*
	 * Ventana para eliminar tiendas de empresa
	 */
	public TiendaEliminar(Empresa cubiSentiBuster) {
		setBounds(100, 100, 493, 203);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblIngreseElLocal = new JLabel("Ingrese el Local a Eliminar");
		lblIngreseElLocal.setFont(new Font("Roboto", Font.PLAIN, 16));
		lblIngreseElLocal.setBounds(10, 11, 450, 25);
		contentPanel.add(lblIngreseElLocal);
		
		textField = new JTextField();
		textField.setBounds(10, 47, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAdvertenciaNoSe = new JLabel("Advertencia: No se puede revertir esta Accion");
		lblAdvertenciaNoSe.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblAdvertenciaNoSe.setBounds(10, 104, 440, 14);
		contentPanel.add(lblAdvertenciaNoSe);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int idTienda = Integer.parseInt(textField.getText());
						if(cubiSentiBuster.quitarTienda(idTienda)) {
							DialogInf dialogInf = new DialogInf(2); // tipo = 2 - Tienda Eliminada Correctamente
							dialogInf.setVisible(true);
							dispose();
						}
						else {
							DialogInf dialogInf = new DialogInf(3); // tipo = 3 - Tienda Error Eliminar
							dialogInf.setVisible(true);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
