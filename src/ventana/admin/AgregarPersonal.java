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
import javax.swing.JLabel;
import java.awt.Font;

public class AgregarPersonal extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public AgregarPersonal() {
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
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EmptyBorder(0, 0, 0, 0));
			buttonPane.setBackground(new Color(40, 53, 147));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
