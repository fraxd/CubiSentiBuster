package ventana.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empresa;
import ventana.Login;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAdmin extends JFrame {

	private JPanel contentPane;

	
	public MenuAdmin(Empresa cubiSentiBuster) {
		setTitle("Menu Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 211);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 150, 136));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login login = new Login(cubiSentiBuster);
				login.setVisible(true);
			}
		});
		btnCerrarSesion.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnCerrarSesion.setBounds(211, 11, 105, 23);
		contentPane.add(btnCerrarSesion);
		
		JButton btnControlTienda = new JButton("Control Tienda");
		btnControlTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlTienda controltienda = new ControlTienda(cubiSentiBuster);
				controltienda.setVisible(true);
			}
		});
		btnControlTienda.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnControlTienda.setBounds(10, 54, 160, 23);
		contentPane.add(btnControlTienda);
		
		JButton btnControlPersonal = new JButton("Control Personal");
		btnControlPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElegirLocal elegirLocal = new ElegirLocal(cubiSentiBuster,1);
				elegirLocal.setVisible(true);	
			}
		});
		btnControlPersonal.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnControlPersonal.setBounds(10, 88, 160, 23);
		contentPane.add(btnControlPersonal);
		
		JButton btnMenuTienda = new JButton("Menu Tienda");
		btnMenuTienda.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnMenuTienda.setBounds(10, 122, 160, 23);
		contentPane.add(btnMenuTienda);
	}
}
