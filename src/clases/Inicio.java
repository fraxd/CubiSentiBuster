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
		Empresa cubiSentiBuster = new Empresa();
		
		Login login = new Login(cubiSentiBuster);
		login.setVisible(true);
		

	}

}
