package clases;

public class Producto {
	private ListaKappa peliculas;
	private ListaKappa juegos;
	private ListaKappa series;
	
	public Producto(){
		peliculas= new ListaKappa();
		juegos= new ListaKappa();
		series= new ListaKappa();
	}
	
	public Producto(ListaKappa peliculas, ListaKappa juegos, ListaKappa series) {
		super();
		this.peliculas = peliculas;
		this.juegos = juegos;
		this.series = series;
	}

	//Zona de Agregados
	public boolean agregarPelicula(Pelicula pelicula) { //agrega una Pelicula, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(pelicula.getName()==((Pelicula) peliculas.getKappa(i)).getName())return false;
		}
		peliculas.addKappa(pelicula);
		return true;
	}
	////Agregado encapsulado - El que debemos usar supuestamente(?)
/*	public boolean agregarPelicula(String name, String[] generos, int year, String duracion, double rate, int stock, int totalstock){
		int i;
		Pelicula pelicula= new pelicula(String name, String[] generos, int year, String duracion, double rate, int stock, int totalstock);
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(pelicula.getName()==peliculas.getKappa(i).getName())return false;
		}
		peliculas.addKappa(pelicula);
		return true;
	}*/
	////
	public boolean agregarJuego(Juego juego) { //agrega un Juego, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(juego.getName()==((Juego) juegos.getKappa(i)).getName())return false;
		}
		juegos.addKappa(juego);
		return true;
	}

	public boolean agregarSerie(Serie serie) { //agrega una Serie, retorna false si ya esta, true si la agrega con exito
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(serie.getName()==((Serie) series.getKappa(i)).getName())return false;
		}
		series.addKappa(serie);
		return true;
	}
	
//Zona de Obtencion
	public Pelicula obtenerPelicula(String name) { //retorna la Pelicula si la encuentra, null si no
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return (Pelicula) peliculas.getKappa(i);
		}
		return null;
	}
	////Encapsulado Pelicula
	public String obtenerPeliculaName(String name){
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getName();
		}
		return null;
	}
	public String[] obtenerPeliculaGeneros(String name){
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getGeneros();
		}
		return null;
	}
	public int obtenerPeliculaYear(String name){
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getYear();
		}
		return 0;
	}
	public String obtenerPeliculaDuracion(String name){
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getDuracion();
		}
		return null;
	}
	public double obtenerPeliculaRate(String name){
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getRate();
		}
		return 0;
	}
	public int obtenerPeliculaStock(String name){
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getStock();
		}
		return 0;
	}
	public int obtenerPeliculaTotalstock(String name){
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getTotalstock();
		}
		return 0;
	}

	////
	
	public Juego obtenerJuego(String name) { //retorna el juego si lo encuentra, null si no
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return (Juego) juegos.getKappa(i);
		}
		return null;
	}

	////Encapsulado obtenerJuego
		public String obtenerJuegoName(String name){
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getName();
		}
		return null;
	}
	public String[] obtenerJuegoGeneros(String name){
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getGeneros();
		}
		return null;
	}
	public int obtenerJuegoYear(String name){
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getYear();
		}
		return 0;
	}
	public String obtenerJuegoPlataforma(String name){
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getPlataforma();
		}
		return null;
	}
	public double obtenerJuegoRate(String name){
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getRate();
		}
		return 0;
	}
	public int obtenerJuegoStock(String name){
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getStock();
		}
		return 0;
	}
	public int obtenerJuegoTotalstock(String name){
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getTotalstock();
		}
		return 0;
	}
	////

	public Serie obtenerSerie(String name) { // retorna la Serie si la encuentra, null si no
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return (Serie) series.getKappa(i);
		}
		return null;
	}

	////Zona de obtenerSerie encapsulado
		public String obtenerSerieName(String name){
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getName();
		}
		return null;
	}
	public String[] obtenerSerieGeneros(String name){
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getGeneros();
		}
		return null;
	}
	public int obtenerSerieYear(String name){
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getYear();
		}
		return 0;
	}
	public String obtenerSerieDuracion(String name){
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getDuracion();
		}
		return null;
	}
	public int obtenerSerieCapitulos(String name){
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getCapitulos();
		}
		return 0;
	}
	public double obtenerSerieRate(String name){
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getRate();
		}
		return 0;
	}
	public int obtenerSerieStock(String name){
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getStock();
		}
		return 0;
	}
	public int obtenerSerieTotalstock(String name){
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getTotalstock();
		}
		return 0;
	}
	////

//Zona de Quitar
	public boolean quitarPelicula(String name) { //remueve una Pelicula por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name) {
				peliculas.removeKappa(i);
				return true;
			}
		}
		return false;
	}
	public boolean quitarJuego(String name) { //remueve un Juego por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name) {
				juegos.removeKappa(i);
				return true;
			}
		}
		return false;
	}
	public boolean quitarSerie(String name) { //remueve una Serie por su nombre y retorna true, si no esta, retorna false
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name) {
				series.removeKappa(i);
				return true;
			}
		}
		return false;
	}
	
}