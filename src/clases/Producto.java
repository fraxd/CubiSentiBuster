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
	////Agregado encapsulado - El que debemos usar supuestamente(?)
/*	public boolean agregarPelicula(String name, String[] generos, int year, String duracion, double rate, int stock, int totalstock){
		int i;
		Pelicula pelicula= new pelicula(String name, String[] generos, int year, String duracion, double rate, int stock, int totalstock);
		for(i=0;i<peliculas.size();i++) {
			if(pelicula.getName()==peliculas.get(i).getName())return false;
		}
		peliculas.add(pelicula);
		return true;
	}*/
	////
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
	////Encapsulado Pelicula
	public String obtenerPeliculaName(String name){
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name)return peliculas.get(i).getName();
		}
		return null;
	}
	public String[] obtenerPeliculaGeneros(String name){
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name)return peliculas.get(i).getGeneros();
		}
		return null;
	}
	public int obtenerPeliculaYear(String name){
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name)return peliculas.get(i).getYear();
		}
		return 0;
	}
	public String obtenerPeliculaDuracion(String name){
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name)return peliculas.get(i).getDuracion();
		}
		return null;
	}
	public double obtenerPeliculaRate(String name){
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name)return peliculas.get(i).getRate();
		}
		return 0;
	}
	public int obtenerPeliculaStock(String name){
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name)return peliculas.get(i).getStock();
		}
		return 0;
	}
	public int obtenerPeliculaTotalstock(String name){
		int i;
		for(i=0;i<peliculas.size();i++) {
			if(peliculas.get(i).getName()==name)return peliculas.get(i).getTotalstock();
		}
		return 0;
	}

	////
	
	public Juego obtenerJuego(String name) { //retorna el juego si lo encuentra, null si no
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i);
		}
		return null;
	}

	////Encapsulado obtenerJuego
		public String obtenerJuegoName(String name){
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i).getName();
		}
		return null;
	}
	public String[] obtenerJuegoGeneros(String name){
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i).getGeneros();
		}
		return null;
	}
	public int obtenerJuegoYear(String name){
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i).getYear();
		}
		return 0;
	}
	public String obtenerJuegoPlataforma(String name){
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i).getPlataforma();
		}
		return null;
	}
	public double obtenerJuegoRate(String name){
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i).getRate();
		}
		return 0;
	}
	public int obtenerJuegoStock(String name){
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i).getStock();
		}
		return 0;
	}
	public int obtenerJuegoTotalstock(String name){
		int i;
		for(i=0;i<juegos.size();i++) {
			if(juegos.get(i).getName()==name)return juegos.get(i).getTotalstock();
		}
		return 0;
	}
	////

	public Serie obtenerSerie(String name) { // retorna la Serie si la encuentra, null si no
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i);
		}
		return null;
	}

	////Zona de obtenerSerie encapsulado
		public String obtenerSerieName(String name){
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i).getName();
		}
		return null;
	}
	public String[] obtenerSerieGeneros(String name){
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i).getGeneros();
		}
		return null;
	}
	public int obtenerSerieYear(String name){
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i).getYear();
		}
		return 0;
	}
	public String obtenerSerieDuracion(String name){
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i).getDuracion();
		}
		return null;
	}
	public int obtenerSerieCapitulos(String name){
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i).getCapitulos();
		}
		return 0;
	}
	public double obtenerSerieRate(String name){
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i).getRate();
		}
		return 0;
	}
	public int obtenerSerieStock(String name){
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i).getStock();
		}
		return 0;
	}
	public int obtenerSerieTotalstock(String name){
		int i;
		for(i=0;i<series.size();i++) {
			if(series.get(i).getName()==name)return series.get(i).getTotalstock();
		}
		return 0;
	}
	////

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