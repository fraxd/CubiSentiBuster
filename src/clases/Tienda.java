package clases;

import java.util.ArrayList;

public class Tienda {
	
	private int idTienda;
	private ArrayList<Usuario> trabajadores;
	
	public Tienda() {
		this.idTienda = 0;
		trabajadores= new ArrayList<Usuario>();
	}
	
	public Tienda(int idTienda, ArrayList<Usuario> trabajadores) {
		this.idTienda = idTienda;
		this.trabajadores = trabajadores;
	}

	public int getIdTienda() {
		return idTienda;
	}
	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}
	public ArrayList<Usuario> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Usuario> trabajadores) {
		this.trabajadores = trabajadores;
	}
}
