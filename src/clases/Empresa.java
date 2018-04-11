package clases;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Usuario> Usuarios;
	
	public Empresa() {
		Usuarios= new ArrayList<Usuario>();
	}
	public boolean agregarUsuario(Usuario n) { //retorna false si el id ya existe, sino, agrega el usuario y retorna true;
		int i;
		for(i=0;i<(Usuarios.size());i++) {
			if(Usuarios.get(i).getId()==n.getId())return false;
		}
		Usuarios.add(n);
		return true;
	}
	public int verificarUsuario(int id, String password) { //1 es usuario correcto, 2 el usuario no existe, y 3 contraseña incorrecta
		int i;
		for(i=0;i<(Usuarios.size());i++) {
			if(id==Usuarios.get(i).getId()) {
				if(password==Usuarios.get(i).getPass()) {
					return 1;
				}
				return 3;
			}
		}
		return 2;
	}
	public boolean quitarUsuario(Usuario n) { //Si removio el usuario, retorna true, si no lo hace, retorna false
		if(Usuarios.contains(n)) {
			Usuarios.remove(n);
			return true;
		}
		return false;
	}
}