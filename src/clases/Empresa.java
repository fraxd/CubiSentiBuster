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
	public   Usuario verificarUsuario(int id, String password) { // Busca y retorna usuario (Verifica el pass para retornar el usuario)
		int i;
		for(i=0;i<(Usuarios.size());i++) {
			if(id==Usuarios.get(i).getId()) {
				if(password==Usuarios.get(i).getPass()) {
					return Usuarios.get(i);
				}
			}
		}
		return null;
	}
	public boolean quitarUsuario(Usuario n) { //Si removio el usuario, retorna true, si no lo hace, retorna false
		if(Usuarios.contains(n)) {
			Usuarios.remove(n);
			return true;
		}
		return false;
	}
}