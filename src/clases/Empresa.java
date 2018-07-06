package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class Empresa {
	private ListaKappa usuarios;
	private ListaKappa tiendas;
	private ListaKappa clientes;
	
	public Empresa() {
		usuarios= new ListaKappa();
		tiendas= new ListaKappa();
		clientes= new ListaKappa();
		
		// Datos de Prueba
		Usuario hola = new Usuario(123, "hola", "mauricio", 3,100); ///// Usuario noob sin privilegios
		agregarUsuario(hola);
		agregarUsuario(124,"hola","caca",1,0);
		
		Tienda tienda = new Tienda(100);
		agregarTienda(tienda);
		//File Folder = new File("csv");
		
		
		// Carga de datos 
		
		LeerPersonas();
		
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
	public boolean agregarUsuario(int idUser, String pass, String name, int level, int local) {
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

	public int obtenerLevelUsuario(int userAux) {
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

	public boolean agregarTienda(Tienda tienda) { ////encapsulamiento pendiente
		int i;
		for(i=0;i<tiendas.sizeKappa();i++) {
			if(((Tienda) tiendas.getKappa(i)).getIdTienda()==tienda.getIdTienda())return false;
		}
		tiendas.addKappa(tienda);
		return true;
	}
	
	public boolean quitarTienda(int idTienda) {
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
	public boolean agregarCliente(Persona cliente) {
		int i;
		for(i=0;i<clientes.sizeKappa();i++) {
			if(cliente.getRut().equals(((Persona) clientes.getKappa(i)).getRut())) {
				return false;
			}
		}
		clientes.addKappa(cliente);
		return true;
	}
	public boolean quitarCliente(Persona cliente) {
		int i;
		for(i=0;i<clientes.sizeKappa();i++) {
			if(cliente.getRut().equals(((Persona) clientes.getKappa(i)).getRut())) {
				clientes.removeKappa(i);
				return true;
			}
		}
		return false;
	}
	
	//// Otros Metodos
	public boolean verifPassword(String pass1, String pass2) {
		if(pass1.equals(pass2))return true;
		return false;
	}
	
	//// Guardado en Archivos *********************************************************************************************************************//////
	
	public boolean grabUsuarios() {
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
			
			for(Usuario user : usuarios) {
				
				csvOutput.write(String.valueOf(user.getId()));
				csvOutput.write(user.getPass());
				csvOutput.write(user.getName());
				csvOutput.write(String.valueOf(user.getLevel()));
				csvOutput.write(String.valueOf(user.getLocal()));
				csvOutput.endRecord();
			}

			csvOutput.close();	
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean grabTiendas(){
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

			for(Tienda store : tiendas){
				csvOutput.write(String.valueOf(store.getIdTienda()));
				csvOutput.write(store.getNombre());
				csvOutput.write(store.getDir());
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
	public boolean LeerPersonas() { // 
		try {
			
			Persona cliente = new Persona();
			int aux;
		    CsvReader personas_import = new CsvReader("csv/ArchivoPersonas.csv");
	        personas_import.readHeaders();
	        
	        while (personas_import.readRecord())
	        {
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

		}catch(FileNotFoundException e) {     
			e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		return false;
	}


	
	
}	