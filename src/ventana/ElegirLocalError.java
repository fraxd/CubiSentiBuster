package ventana;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ElegirLocalError extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public ElegirLocalError() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ElegirLocalError.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Error");
		setType(Type.POPUP);
		setBounds(100, 100, 392, 119);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblErrorLaTienda = new JLabel("Error: La tienda elegida no existe");
		lblErrorLaTienda.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblErrorLaTienda.setBounds(10, 11, 420, 14);
		contentPanel.add(lblErrorLaTienda);
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
