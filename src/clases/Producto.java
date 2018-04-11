package clases;

import java.util.ArrayList;

public class Producto {
	private ArrayList<Pelicula> Peliculas;
	private ArrayList<Juego> Juegos;
	private ArrayList<Serie> Series;
	
	public Producto(){
		Peliculas= new ArrayList<Pelicula>();
		Juegos= new ArrayList<Juego>();
		Series= new ArrayList<Serie>();
	}
	
	public boolean agregarPelicula(Pelicula n) { //agrega una Pelicula, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<Peliculas.size();i++) {
			if(n.getName()==Peliculas.get(i).getName())return false;
		}
		Peliculas.add(n);
		return true;
	}
	public boolean agregarJuego(Juego n) { //agrega un Juego, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<Juegos.size();i++) {
			if(n.getName()==Juegos.get(i).getName())return false;
		}
		Juegos.add(n);
		return true;
	}
	public boolean agregarSerie(Serie n) { //agrega una Serie, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<Series.size();i++) {
			if(n.getName()==Series.get(i).getName())return false;
		}
		Series.add(n);
		return true;
	}
	
	public Pelicula obtenerPelicula(String name) { //retorna la Pelicula si la encuentra, null si no
		int i;
		for(i=0;i<Peliculas.size();i++) {
			if(Peliculas.get(i).getName()==name)return Peliculas.get(i);
		}
		return null;
	}
	public Juego obtenerJuego(String name) { //retorna el juego si lo encuentra, null si no
		int i;
		for(i=0;i<Juegos.size();i++) {
			if(Juegos.get(i).getName()==name)return Juegos.get(i);
		}
		return null;
	}
	public Serie obtenerSerie(String name) { // retorna la Serie si la encuentra, null si no
		int i;
		for(i=0;i<Series.size();i++) {
			if(Series.get(i).getName()==name)return Series.get(i);
		}
		return null;
	}

	public boolean quitarPelicula(String name) { //remueve una Pelicula por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<Peliculas.size();i++) {
			if(Peliculas.get(i).getName()==name) {
				Peliculas.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean quitarJuego(String name) { //remueve un Juego por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<Juegos.size();i++) {
			if(Juegos.get(i).getName()==name) {
				Juegos.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean quitarSerie(String name) { //remueve una Serie por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<Series.size();i++) {
			if(Series.get(i).getName()==name) {
				Series.remove(i);
				return true;
			}
		}
		return false;
	}
	
}