package ventana.admin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empresa;
import clases.Tienda;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaTienda extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;


	public NuevaTienda(Empresa cubiSentiBuster) {
		setBounds(100, 100, 453, 161);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIngresaElNumero = new JLabel("Ingresa el numero de tienda para el nuevo local");
			lblIngresaElNumero.setHorizontalAlignment(SwingConstants.CENTER);
			lblIngresaElNumero.setFont(new Font("Roboto", Font.PLAIN, 14));
			lblIngresaElNumero.setBounds(10, 11, 414, 14);
			contentPanel.add(lblIngresaElNumero);
		}
		{
			JLabel lblIngresar = new JLabel("Ingresar:");
			lblIngresar.setFont(new Font("Roboto", Font.PLAIN, 14));
			lblIngresar.setBounds(10, 50, 76, 14);
			contentPanel.add(lblIngresar);
		}
		{
			textField = new JTextField();
			textField.setBounds(96, 48, 86, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int idTienda = Integer.parseInt(textField.getText());
						Tienda tienda = new Tienda();
						tienda.setIdTienda(idTienda);
						if(cubiSentiBuster.agregarTienda(tienda)) {
							NuevaTiendaOk nuevaTiendaOk = new NuevaTiendaOk();
							nuevaTiendaOk.setVisible(true);
							dispose();
						}
						else {
							NuevaTiendaError error = new NuevaTiendaError();
							error.setVisible(true);
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
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
