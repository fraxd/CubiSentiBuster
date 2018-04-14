package ventana;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TiendaEliminarError extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public TiendaEliminarError() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TiendaEliminarError.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		setTitle("Error");
		setBounds(100, 100, 448, 146);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Error, no se pudo eliminar la tienda. Verifica Id tienda");
			lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 16));
			lblNewLabel.setBounds(10, 11, 412, 27);
			contentPanel.add(lblNewLabel);
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
