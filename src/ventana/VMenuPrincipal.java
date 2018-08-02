package ventana;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Empresa;
import clases.Usuario;
import ventana.admin.ControlPersonal;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class VMenuPrincipal extends JFrame {

	private JPanel contentPane;

	/*
	 * menu principal de la applicacion
	 */
	public VMenuPrincipal(Empresa cubiSentiBuster, int userAux, int local) {
		setTitle("Menu Principal");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 297);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 204, 101));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenido!");
		lblBienvenido.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblBienvenido.setBounds(10, 11, 117, 14);
		contentPane.add(lblBienvenido);
		
		JLabel lblNombreUser = new JLabel(""+userAux);
		lblNombreUser.setFont(new Font("Roboto", Font.ITALIC, 20));
		lblNombreUser.setBounds(137, 11, 125, 14);
		contentPane.add(lblNombreUser);
		
		JButton btnGestorArriendos = new JButton("Gestor de Arriendos");
		btnGestorArriendos.setHorizontalAlignment(SwingConstants.LEFT);
		btnGestorArriendos.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnGestorArriendos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestorArriendos gestorArriendos = new GestorArriendos(cubiSentiBuster);
				gestorArriendos.setVisible(true);
				
			}
		});
		btnGestorArriendos.setBounds(10, 64, 234, 30);
		contentPane.add(btnGestorArriendos);
		
		JButton btnCatalogo = new JButton("Catalogo Productos");
		btnCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CatalogoProductos catalogoProductos = new CatalogoProductos(cubiSentiBuster);
				catalogoProductos.setVisible(true);
				
			}
		});
		btnCatalogo.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnCatalogo.setHorizontalAlignment(SwingConstants.LEFT);
		btnCatalogo.setBounds(10, 115, 234, 30);
		contentPane.add(btnCatalogo);
		
		JButton btnCliente = new JButton("Gestion de clientes");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCliente.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnCliente.setHorizontalAlignment(SwingConstants.LEFT);
		btnCliente.setBounds(10, 163, 234, 30);
		contentPane.add(btnCliente);
		
		JButton btnPass = new JButton("Cambio Contrase\u00F1a");
		btnPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambioContraseña cambioContraseña = new CambioContraseña();
				cambioContraseña.setVisible(true);
				
			}
		});
		btnPass.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPass.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnPass.setBounds(296, 64, 234, 30);
		contentPane.add(btnPass);
		
		JButton btnPersonal = new JButton("Control Personal");
		btnPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlPersonal controlPersonal = new ControlPersonal(cubiSentiBuster, local, cubiSentiBuster.obtenerLevelUsuario(userAux));
				controlPersonal.setVisible(true);
			}
		});
		btnPersonal.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPersonal.setFont(new Font("Roboto", Font.PLAIN, 16));
		btnPersonal.setBounds(296, 115, 234, 30);
		contentPane.add(btnPersonal);
		
		JButton btnNewButton = new JButton("Cerrar Sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login login = new Login(cubiSentiBuster);
				login.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnNewButton.setBounds(413, 10, 117, 30);
		contentPane.add(btnNewButton);
		
		if(cubiSentiBuster.obtenerLevelUsuario(userAux)==3) btnPersonal.setEnabled(false);
		
	}
}
