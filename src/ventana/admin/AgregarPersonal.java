package ventana.admin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import clases.Empresa;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarPersonal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField fieldRut;
	private JTextField fieldName;
	private JPasswordField passField;
	private JPasswordField passField1;

	public AgregarPersonal(Empresa cubiSentiBuster, int idTienda) {
		setTitle("Nuevo Personal");
		getContentPane().setBackground(new Color(48, 63, 159));
		setBounds(100, 100, 499, 348);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPanel.setBackground(new Color(51, 0, 204));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblRut = new JLabel("Rut:");
		lblRut.setForeground(Color.WHITE);
		lblRut.setFont(new Font("Roboto", Font.BOLD, 16));
		lblRut.setBounds(32, 31, 46, 14);
		contentPanel.add(lblRut);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNombre.setBounds(32, 67, 92, 14);
		contentPanel.add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Nivel de usuario:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNewLabel.setBounds(32, 103, 131, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Roboto", Font.BOLD, 16));
		lblContrasea.setBounds(32, 135, 121, 19);
		contentPanel.add(lblContrasea);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir Contrase\u00F1a:");
		lblRepetirContrasea.setForeground(Color.WHITE);
		lblRepetirContrasea.setFont(new Font("Roboto", Font.BOLD, 16));
		lblRepetirContrasea.setBounds(32, 172, 173, 14);
		contentPanel.add(lblRepetirContrasea);
		
		fieldRut = new JTextField();
		fieldRut.setBounds(228, 30, 220, 20);
		contentPanel.add(fieldRut);
		fieldRut.setColumns(10);
		
		fieldName = new JTextField();
		fieldName.setBounds(228, 66, 220, 20);
		contentPanel.add(fieldName);
		fieldName.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Roboto", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1.- Usuario", "2.- Encargado de Tienda", "3.- Administrador"}));
		comboBox.setBounds(228, 102, 220, 23);
		contentPanel.add(comboBox);
		
		passField = new JPasswordField();
		passField.setBounds(228, 136, 220, 20);
		contentPanel.add(passField);
		
		passField1 = new JPasswordField();
		passField1.setBounds(228, 171, 220, 20);
		contentPanel.add(passField1);
		
		JLabel labelError = new JLabel("");
		labelError.setForeground(Color.RED);
		labelError.setFont(new Font("Roboto", Font.PLAIN, 14));
		labelError.setBounds(32, 228, 416, 14);
		contentPanel.add(labelError);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EmptyBorder(0, 0, 0, 0));
			buttonPane.setBackground(new Color(40, 53, 147));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String user = fieldRut.getText().toString();
						int userAux=Integer.parseInt(user);
						String name =fieldName.getText().toString();
						int seleccion = comboBox.getSelectedIndex() + 1; 
						char[] passAux = passField.getPassword(); // Se obtiene contraseña de passField
						String pass1= String.valueOf(passAux);
						passAux=passField1.getPassword();//se obtiene contraseña de passField1
						String pass2 = String.valueOf(passAux);
						if(cubiSentiBuster.verifPassword(pass1, pass2)) {
							if(cubiSentiBuster.agregarUsuario(userAux, pass1, name, seleccion, idTienda)) {
								DialogInf dialogInf = new DialogInf(4); // Tipo = 4 - Usuario Agregado Correctamente
								dialogInf.setVisible(true);
								dispose();
							}
							else {
								DialogInf dialogInf = new DialogInf(5); // tipo =5 - Error Agregar Usuario
								dialogInf.setVisible(true);
							}
						}
						else labelError.setText("Error las contraseñas no son iguales");
						
						
						
						
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
