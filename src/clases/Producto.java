package clases;

import java.util.ArrayList;

public class Producto {
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Juego> juegos;
	private ArrayList<Serie> series;
	
	public Producto(){
		peliculas= new ArrayList<Pelicula>();
		juegos= new ArrayList<Juego>();
		series= new ArrayList<Serie>();
	}
	
	public Producto(ArrayList<Pelicula> peliculas, ArrayList<Juego> juegos, ArrayList<Serie> series) {
		super();
		this.peliculas = peliculas;
		this.juegos = juegos;
		this.series = series;
	}

	//Zona de Agregados
	public boolean agregarPelicula(Pelicula pelicula) { //agrega una Pelicula, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(pelicula.getName()==peliculas.get(i).getName())return false;
		}
		peliculas.add(pelicula);
		return true;
	}

	public boolean agregarJuego(Juego juego) { //agrega un Juego, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juego.getName()==juegos.get(i).getName())return false;
		}
		juegos.add(juego);
		return true;
	}

	public boolean agregarSerie(Serie serie) { //agrega una Serie, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<series.size();i++) {
			if(serie.getName()==series.get(i).getName())return false;
		}
		series.add(serie);
		return true;
	}
	
//Zona de Obtencion
	public Pelicula obtenerPelicula(String name) { //retorna la Pelicula si la encuentra, null si no
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name)return peliculas.get(i);
		}
		return null;
	}
	public Juego obtenerJuego(String name) { //retorna el juego si lo encuentra, null si no
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i);
		}
		return null;
	}
	public Serie obtenerSerie(String name) { // retorna la Serie si la encuentra, null si no
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i);
		}
		return null;
	}

//Zona de Quitar
	public boolean quitarPelicula(String name) { //remueve una Pelicula por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name) {
				peliculas.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean quitarJuego(String name) { //remueve un Juego por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name) {
				juegos.remove(i);
				return true;
			}
		}
		return false;
	}
	public boolean quitarSerie(String name) { //remueve una Serie por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name) {
				series.remove(i);
				return true;
			}
		}
		return false;
	}
	
}