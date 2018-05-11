package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.csvreader.CsvWriter;

public class Empresa {
	private ArrayList<Usuario> usuarios;
	private ArrayList<Tienda> tiendas;
	private ArrayList<Persona> clientes;
	
	public Empresa() {
		usuarios= new ArrayList<Usuario>();
		tiendas= new ArrayList<Tienda>();
		clientes= new ArrayList<Persona>();
		
		// Datos de Prueba
		Usuario hola = new Usuario(123, "hola", "mauricio", 1,0);
		agregarUsuario(hola);
		Tienda tienda = new Tienda(100);
		agregarTienda(tienda);
	}
	
	public Empresa(ArrayList<Usuario> usuarios, ArrayList<Tienda> tiendas, ArrayList<Persona> clientes) {
		this.usuarios = usuarios;
		this.tiendas = tiendas;
		this.clientes= clientes;
	}

	public boolean agregarUsuario(Usuario usuario) { //retorna false si el id ya existe, sino, agrega el usuario y retorna true; //Falta encapsular
		int i;
		for(i=0;i<(usuarios.size());i++) {
			if(usuarios.get(i).getId()==usuario.getId())return false;
		}
		usuarios.add(usuario);
		return true;
	}
	public boolean agregarUsuario(int idUser, String pass, String name, int level, int local) {
		int i;
		for(i=0;i<(usuarios.size());i++) {
			if(usuarios.get(i).getId()==idUser)return false;
		}
		Usuario nuevo = new Usuario(idUser,pass,name,level,local);
		usuarios.add(nuevo);
		return true;
		
		
	}
	
	public boolean verificarUsuario(int id, String password) { // Busca y retorna usuario (Verifica el pass para retornar el usuario)
		int i;
		
		for(i=0;i<(usuarios.size());i++) {
			if(id==usuarios.get(i).getId()) {
				if(password.equals(usuarios.get(i).getPass())) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean quitarUsuario(int id, String password) { //Si removio el usuario, retorna true, si no lo hace, retorna false
		int i;
		for(i=0;i<(usuarios.size());i++) {
			if(id==usuarios.get(i).getId()) {
				if(password.equals(usuarios.get(i).getPass())) {
					usuarios.remove(i);
					return true;
				}
			}
		}
		return false;
	}

	public int obtenerLevelUsuario(int userAux) {
		int i;
		for(i=0;i<(usuarios.size());i++) {
			if(userAux==usuarios.get(i).getId()) {
					return usuarios.get(i).getLevel();
			}
		}
		return -1; ////En caso de retornar -1, no encontro al usuario
	}

	public boolean agregarTienda(Tienda tienda) { ////encapsulamiento pendiente
		int i;
		for(i=0;i<tiendas.size();i++) {
			if(tiendas.get(i).getIdTienda()==tienda.getIdTienda())return false;
		}
		tiendas.add(tienda);
		return true;
	}
	
	public boolean quitarTienda(int idTienda) {
		int i;
		for(i=0;i<tiendas.size();i++) {
			if(tiendas.get(i).getIdTienda()==idTienda) {
				tiendas.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean verifTienda(int idTienda) { //Verifica si existe determinada tienda
		int i;
		for(i=0;i<tiendas.size();i++) {
			if(tiendas.get(i).getIdTienda()==idTienda) {
				return true;
			}
		}
		return false;
	}
	
	//// Zona Cliente PD falta aun encapsulamiento
	public boolean agregarCliente(Persona cliente) {
		int i;
		for(i=0;i<clientes.size();i++) {
			if(cliente.getRut().equals(clientes.get(i).getRut())) {
				return false;
			}
		}
		clientes.add(cliente);
		return true;
	}
	public boolean quitarCliente(Persona cliente) {
		int i;
		for(i=0;i<clientes.size();i++) {
			if(cliente.getRut().equals(clientes.get(i).getRut())) {
				clientes.remove(i);
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
	
	//// Guardado en Archivos 
	
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
			
			for(Usuario user : usuarios) {
				
				csvOutput.write(String.valueOf(user.getId()));
				csvOutput.write(user.getPass());
				csvOutput.write(user.getName());
				csvOutput.write(String.valueOf(user.getLevel()));
				csvOutput.write(String.valueOf(user.getLocal()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}