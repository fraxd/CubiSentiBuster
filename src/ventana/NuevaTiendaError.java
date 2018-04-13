package ventana;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuevaTiendaError extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	public NuevaTiendaError() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NuevaTiendaError.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		setTitle("Error");
		setType(Type.POPUP);
		setBounds(100, 100, 480, 114);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblErrorIdDe = new JLabel("ERROR: Id de tienda ya esta ocupado. Probar con otro.");
			lblErrorIdDe.setHorizontalAlignment(SwingConstants.CENTER);
			lblErrorIdDe.setFont(new Font("Roboto", Font.PLAIN, 16));
			lblErrorIdDe.setBounds(10, 11, 443, 14);
			contentPanel.add(lblErrorIdDe);
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
