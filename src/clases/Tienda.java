package clases;

import java.util.ArrayList;

public class Tienda {
	
	private int idTienda;
	private ArrayList<Usuario> trabajadores;
	private Producto productos;
	
	public Tienda() {
		this.idTienda = 0;
		trabajadores= new ArrayList<Usuario>();
		this.productos= new Producto();
	}
	
	public Tienda(int idTienda) {
		this.idTienda =idTienda;
	}
	
	public Tienda(int idTienda, ArrayList<Usuario> trabajadores, Producto productos) {
		this.idTienda = idTienda;
		this.trabajadores = trabajadores;
		this.productos = productos;
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

	public boolean agregarProducto(Pelicula pelicula) {
		boolean aux;
		aux=productos.agregarPelicula(pelicula);
		return aux;
	}
	public boolean agregarProducto(Juego juego) {
		boolean aux;
		aux=productos.agregarJuego(juego);
		return aux;
	}
	public boolean agregarProducto(Serie serie) {
		boolean aux;
		aux=productos.agregarSerie(serie);
		return aux;
	}
	
	//// Agregar Trabajadores al ArrayList
	public boolean agregarTrabajadores(Usuario usuario) {
		int i;
		for(i=0;i<(trabajadores.size());i++) {
			if(trabajadores.get(i).getId()==usuario.getId())return false;
		}
		trabajadores.add(usuario);
		return true;
	}
	
	//// Quitar trabajadores al ArrayList
	public boolean quitarTrabajadores(int id, String password) {
		int i;
		for(i=0;i<(trabajadores.size());i++) {
			if(id==trabajadores.get(i).getId()) {
				if(password.equals(trabajadores.get(i).getPass())) {
					trabajadores.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
}
