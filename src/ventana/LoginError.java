package ventana;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginError extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public LoginError() {
		setType(Type.POPUP);
		setTitle("ERROR");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginError.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		setBounds(100, 100, 438, 130);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUsuarioYoContrasea = new JLabel("Usuario y/o Contrase\u00F1a Erroneo!");
		lblUsuarioYoContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsuarioYoContrasea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsuarioYoContrasea.setBounds(10, 11, 402, 25);
		contentPanel.add(lblUsuarioYoContrasea);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			{
			
				JButton okButton = new JButton("Oki Doki");
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
