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
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirLocal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/*
	 * Clase Ventana que permite la seleccion de local para luego gestionarlo
	 */
	public ElegirLocal(Empresa cubiSentiBuster, int opcion) { // opcion 1 = ControlPersonal
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setType(Type.POPUP);
		setBounds(100, 100, 415, 143);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIngreseLocal = new JLabel("Ingrese Local:");
			lblIngreseLocal.setBounds(129, 11, 153, 31);
			lblIngreseLocal.setFont(new Font("Roboto", Font.BOLD, 16));
			contentPanel.add(lblIngreseLocal);
		}
		{
			textField = new JTextField();
			textField.setBounds(139, 45, 86, 20);
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
						int aux=Integer.parseInt(textField.getText());
						if(cubiSentiBuster.verifTienda(aux)) {
							ControlPersonal controlPersonal = new ControlPersonal(cubiSentiBuster,aux,0); //Corregir pronto .- franco
							controlPersonal.setVisible(true);
							dispose();
						}
						else {
							ElegirLocalError elegirLocalError = new ElegirLocalError();
							elegirLocalError.setVisible(true);
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
