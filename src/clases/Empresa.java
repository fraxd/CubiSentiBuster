package clases;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Usuario> usuarios;
	
	public Empresa() {
		usuarios= new ArrayList<Usuario>();
		Usuario hola = new Usuario(123, "hola", "mauricio", 2,0);
		agregarUsuario(hola);
	}
	
	public boolean agregarUsuario(Usuario n) { //retorna false si el id ya existe, sino, agrega el usuario y retorna true;
		int i;
		for(i=0;i<(usuarios.size());i++) {
			if(usuarios.get(i).getId()==n.getId())return false;
		}
		usuarios.add(n);
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
	
	public boolean quitarUsuario(Usuario n) { //Si removio el usuario, retorna true, si no lo hace, retorna false
		if(usuarios.contains(n)) {
			usuarios.remove(n);
			return true;
		}
		return false;
	}

	public int obtenerLevelUsuario(int userAux) {
		
		
		return 1;
	}
}