package clases;

import ventana.Login;
import javax.swing.UIManager;

public class Inicio {

	public static void main(String[] args) {
		try
		{
		   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e)
		{
		   e.printStackTrace();
		}
		Login login = new Login();
		login.setVisible(true);
		

	}

}
