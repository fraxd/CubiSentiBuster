package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

/*Entre las clases es la más general, pues desde esta se pueden llegar a todas las otras clases */

public class Empresa {
	private ListaKappa usuarios; ///es una lista que contiene los usuarios
	private ListaKappa tiendas; ///es una lista que contiene las tiendas
	private ListaKappa clientes; ///es una lista que contiene los clientes
	
	public Empresa() {
		usuarios= new ListaKappa();
		tiendas= new ListaKappa();
		clientes= new ListaKappa();
		
		Tienda tienda = new Tienda(100);
		agregarTienda(tienda);
		//File Folder = new File("csv");
		
		
		// Carga de datos ****************************
		
		leerPersonas();
		leerUsuario();
		
	}
	
	public Empresa(ListaKappa usuarios, ListaKappa tiendas, ListaKappa clientes) {
		this.usuarios = usuarios;
		this.tiendas = tiendas;
		this.clientes= clientes;
	}

	public boolean agregarUsuario(Usuario usuario) { //retorna false si el id ya existe, sino, agrega el usuario y retorna true; //Falta encapsular
		int i;
		for(i=0;i<(usuarios.sizeKappa());i++) {
			if(((Usuario) usuarios.getKappa(i)).getId()==usuario.getId())return false;
		}
		usuarios.addKappa(usuario);
		return true;
	}
	public boolean agregarUsuario(int idUser, String pass, String name, int level, int local) { //retorna false si el id ya existe, sino, agrega el usuario y retorna true; forma encapsulada
		int i;
		for(i=0;i<(usuarios.sizeKappa());i++) {
			if(((Usuario) usuarios.getKappa(i)).getId()==idUser)return false;
		}
		Usuario nuevo = new Usuario(idUser,pass,name,level,local);
		usuarios.addKappa(nuevo);
		return true;
		
		
	}
	
	public boolean verificarUsuario(int id, String password) { // Busca y retorna usuario (Verifica el pass para retornar el usuario)
		int i;
		
		for(i=0;i<(usuarios.sizeKappa());i++) {
			if(id==((Usuario) usuarios.getKappa(i)).getId()) {
				if(password.equals(((Usuario) usuarios.getKappa(i)).getPass())) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean quitarUsuario(int id, String password) { //Si removio el usuario, retorna true, si no lo hace, retorna false
		int i;
		for(i=0;i<(usuarios.sizeKappa());i++) {
			if(id==((Usuario) usuarios.getKappa(i)).getId()) {
				if(password.equals(((Usuario) usuarios.getKappa(i)).getPass())) {
					usuarios.removeKappa(i);
					return true;
				}
			}
		}
		return false;
	}

	public int obtenerLevelUsuario(int userAux) { //Retorna el nivel de usuario, entiendase que el nivel determina los privilegios del usuario
		int i, aux;
		for(i=0;i<(usuarios.sizeKappa());i++) {
			if(userAux==((Usuario) usuarios.getKappa(i)).getId()) {
					aux=((Usuario) usuarios.getKappa(i)).getLevel();
					return aux;
					//return usuarios.getKappa(i).getLevel();
			}
		}
		return -1; ////En caso de retornar -1, no encontro al usuario
	}
	

	public boolean agregarTienda(Tienda tienda) { /// Agrega una tienda, retorna true si lo logra, false si no  ////encapsulamiento pendiente
		int i;
		for(i=0;i<tiendas.sizeKappa();i++) {
			if(((Tienda) tiendas.getKappa(i)).getIdTienda()==tienda.getIdTienda())return false;
		}
		tiendas.addKappa(tienda);
		return true;
	}
	
	public boolean quitarTienda(int idTienda) { /// Remueve una tienda, retorna true si lo logra, false si no
		int i;
		for(i=0;i<tiendas.sizeKappa();i++) {
			if(((Tienda) tiendas.getKappa(i)).getIdTienda()==idTienda) {
				tiendas.removeKappa(i);
				return true;
			}
		}
		return false;
	}
	public boolean verifTienda(int idTienda) { //Verifica si existe determinada tienda
		int i;
		for(i=0;i<tiendas.sizeKappa();i++) {
			if(((Tienda) tiendas.getKappa(i)).getIdTienda()==idTienda) {
				return true;
			}
		}
		return false;
	}
	
	//// Zona Cliente PD falta aun encapsulamiento
	public boolean agregarCliente(Persona cliente) { ///Aqui se agrega el cliente, retorna true si lo logra, false si no
		int i;
		for(i=0;i<clientes.sizeKappa();i++) {
			if(cliente.getRut().equals(((Persona) clientes.getKappa(i)).getRut())) {
				return false;
			}
		}
		clientes.addKappa(cliente);
		return true;
	}
	public boolean quitarCliente(Persona cliente) { ///Aqui se remueve el cliente, retorna true si lo logra, false si no
		int i;
		for(i=0;i<clientes.sizeKappa();i++) {
			if(cliente.getRut().equals(((Persona) clientes.getKappa(i)).getRut())) {
				clientes.removeKappa(i);
				return true;
			}
		}
		return false;
	}
	
	public 	Persona buscaRetornaCliente(String rut) {
		int i;
		for(i=0;i<clientes.sizeKappa();i++) {
			if(((Persona) clientes.getKappa(i)).getRut().equals(rut))return (Persona) clientes.getKappa(i);
		}
		return null;
	}
	
	
	//// Otros Metodos
	public boolean verifPassword(String pass1, String pass2) { ///Compara los password, si coinciden retorna ture, si no, false.
		if(pass1.equals(pass2))return true;
		return false;
	}
	
	//// Guardado en Archivos *********************************************************************************************************************//////
	
	public boolean grabUsuarios() { //Graba los usuarios, retorna true si lo logra, false si no
		int i;
		/// Pronto, muy pronto - http://www.myutilsjava.net/tutoriales/index.php/java/49-generar-y-leer-csv-desde-java
		String outputFile = "csv/ArchivoEmpleados.csv";
		boolean alreadyExists = new File(outputFile).exists();
		
		if(alreadyExists) {
			File ArchivoEmpleados = new File(outputFile);
			ArchivoEmpleados.delete();
		}
		try {
			CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile,true),',');
			
			csvOutput.write("IdUser");
			csvOutput.write("Pass");
			csvOutput.write("Nombre");
			csvOutput.write("level");
			csvOutput.write("local");
			csvOutput.endRecord();			
			
			for(i=0;i<usuarios.sizeKappa();i++) {
				
				csvOutput.write(String.valueOf(((Usuario) usuarios.getKappa(i)).getId()));
				csvOutput.write(((Usuario) usuarios.getKappa(i)).getPass());
				csvOutput.write(((Usuario) usuarios.getKappa(i)).getName());
				csvOutput.write(String.valueOf(((Usuario) usuarios.getKappa(i)).getLevel()));
				csvOutput.write(String.valueOf(((Usuario) usuarios.getKappa(i)).getLocal()));
				csvOutput.endRecord();
			}

			csvOutput.close();	
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean grabTiendas(){ //Graba las tiendas, retorna true si lo logra, false si no
		int i;
		String outputFile ="csv/ArchivoTiendas.csv";
		boolean alreadyExists = new File(outputFile).exists();

		if(alreadyExists){
			File ArchivoTiendas = new File(outputFile);
			ArchivoTiendas.delete();
		}
		try{
			CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile,true),',');

			csvOutput.write("IdTienda");
			csvOutput.write("Nombre");
			csvOutput.write("Direccion");
			csvOutput.endRecord();

			for(i = 0;i<tiendas.sizeKappa();i++){
				csvOutput.write(String.valueOf(((Tienda) tiendas.getKappa(i)).getIdTienda()));
				csvOutput.write(((Tienda) tiendas.getKappa(i)).getNombre());
				csvOutput.write(((Tienda) tiendas.getKappa(i)).getDir());
				csvOutput.endRecord();
			}
			csvOutput.close();
			return true;
		} catch (IOException e){
			e.printStackTrace();
			return false;
		}
	}

// Lectura de Archivos ******************************************************************************************////
	public void leerPersonas() { // Carga de clientes a partir de un archivo csv
		try {
			
			Persona cliente = new Persona();
			int aux;
		    CsvReader personas_import = new CsvReader("csv/ArchivoPersonas.csv");
	        personas_import.readHeaders();
	        
	        while (personas_import.readRecord()) {
	            String rut = personas_import.get("rut");
	            String nombres = personas_import.get("nombre");
	            String telefono = personas_import.get("telefono");
	            String correo = personas_import.get("Correo");
	            
	            aux=Integer.parseInt(telefono);
	            cliente.setRut(rut);
	            cliente.setNombre(nombres);
	            cliente.setTelefono(aux);
	            cliente.setCorreo(correo);
	     
	            agregarCliente(cliente);
	            
	        }
            personas_import.close();


		}catch(FileNotFoundException e) {     
			e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
	}
	
	public void leerUsuario() { // Carga de los usuarios de Empresa a partir de un archivo csv
		try {
			int auxRut, auxLevel, auxLocal;
			CsvReader usuarios_import = new CsvReader("csv/ArchivoEmpleados.csv");
			usuarios_import.readHeaders();
			
			while(usuarios_import.readRecord()) {
				String idUser = usuarios_import.get("IdUser");
				String pass = usuarios_import.get("Pass");
				String nombre = usuarios_import.get("Nombre");
				String level = usuarios_import.get("level");
				String local = usuarios_import.get("local");
				
				auxRut = Integer.parseInt(idUser);
				auxLevel = Integer.parseInt(level);
				auxLocal = Integer.parseInt(local);
				
				agregarUsuario(auxRut, pass, nombre, auxLevel, auxLocal);
				
				
			}
			usuarios_import.close();

			
		}catch(FileNotFoundException e) {     
			e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public void leerTiendas() {
		
		
				
	}

/****** Metodos Varios ****/
	public void cargarArriendo(String rut, Arriendos arriendo) {
		Persona cliente = new Persona();
		cliente = buscaRetornaCliente(rut);
		cliente.cargarArriendo(arriendo);
	}
	
	
}//*** FIN ARCHIVO FIN ARCHIVO FIN ARCHIVO FIN ARCHIVO FIN ARCHIVO FIN ARCHVIO	