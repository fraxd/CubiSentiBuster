package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empresa;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlTienda extends JFrame {

	private JPanel contentPane;

	public ControlTienda(Empresa cubiSentiBuster) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 268, 207);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(77, 182, 172));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Agregar Tienda");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NuevaTienda nuevatienda = new NuevaTienda(cubiSentiBuster);
				nuevatienda.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnNewButton.setBounds(27, 59, 200, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar Tienda");
		btnNewButton_1.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnNewButton_1.setBounds(27, 107, 200, 23);
		contentPane.add(btnNewButton_1);
	}

}
