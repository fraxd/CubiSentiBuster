package clases;

public class Producto {
	private ListaKappa peliculas; ///Es una lista que contiene peliculas
	private ListaKappa juegos; ///Es una lista que contiene juegos
	private ListaKappa series; ///Es una lista que contiene series
	
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
	public String obtenerPeliculaName(String name){ //retorna el nombre de la pelicula
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getName();
		}
		return null;
	}
	public String[] obtenerPeliculaGeneros(String name){ ///retorna los generos de la pelicula
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getGeneros();
		}
		return null;
	}
	public int obtenerPeliculaYear(String name){ ///retorna el año de la pelicula
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getYear();
		}
		return 0;
	}
	public String obtenerPeliculaDuracion(String name){ ///retorna la duracion de la pelicula
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getDuracion();
		}
		return null;
	}
	public double obtenerPeliculaRate(String name){ ///retorna el rate de la pelicula
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getRate();
		}
		return 0;
	}
	public int obtenerPeliculaStock(String name){ ///retorna el stock de la pelicula
		int i;
		for(i=0;i<peliculas.sizeKappa();i++) {
			if(((Pelicula) peliculas.getKappa(i)).getName()==name)return ((Pelicula) peliculas.getKappa(i)).getStock();
		}
		return 0;
	}
	public int obtenerPeliculaTotalstock(String name){ ///retorna el stock total de la pelicula
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
		public String obtenerJuegoName(String name){ ///retorna el nombre del juego
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getName();
		}
		return null;
	}
	public String[] obtenerJuegoGeneros(String name){ ///retorna los generos del juego
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getGeneros();
		}
		return null;
	}
	public int obtenerJuegoYear(String name){ ///retorna el año del juego
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getYear();
		}
		return 0;
	}
	public String obtenerJuegoPlataforma(String name){ ///retorna la plataforma del juego
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getPlataforma();
		}
		return null;
	}
	public double obtenerJuegoRate(String name){ ///retorna el rate del juego
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getRate();
		}
		return 0;
	}
	public int obtenerJuegoStock(String name){ ///retorna el stock del juego
		int i;
		for(i=0;i<juegos.sizeKappa();i++) {
			if(((Juego) juegos.getKappa(i)).getName()==name)return ((Juego) juegos.getKappa(i)).getStock();
		}
		return 0;
	}
	public int obtenerJuegoTotalstock(String name){ ///retorna el stock total del juego
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
		public String obtenerSerieName(String name){ ///retorna el nombre de la serie
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getName();
		}
		return null;
	}
	public String[] obtenerSerieGeneros(String name){ ///retorna los generos de la serie
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getGeneros();
		}
		return null;
	}
	public int obtenerSerieYear(String name){ ///retorna el año de la serie
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getYear();
		}
		return 0;
	}
	public String obtenerSerieDuracion(String name){ ///retprma la duracion de la serie
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getDuracion();
		}
		return null;
	}
	public int obtenerSerieCapitulos(String name){ ///retorna los capitulos de la serie
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getCapitulos();
		}
		return 0;
	}
	public double obtenerSerieRate(String name){ ///retorna el rate de la serie
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getRate();
		}
		return 0;
	}
	public int obtenerSerieStock(String name){ ///retorna el stock de la serie
		int i;
		for(i=0;i<series.sizeKappa();i++) {
			if(((Serie) series.getKappa(i)).getName()==name)return ((Serie) series.getKappa(i)).getStock();
		}
		return 0;
	}
	public int obtenerSerieTotalstock(String name){ ///retorna el stock total de la serie
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
	
	//////////A partir de aqui estan todos los modificar ///////
	public boolean modificarProducto(String name, Object modificado, int tipo, int tipomod) { /// tipo-> 0 == Pelicula, 1 == Juego, 2 == Serie
		int i;																				///// tipomod->
		int j;
		if(tipo==0) {
			if(tipomod==0) {///name
				for(i=0;i<peliculas.sizeKappa();i++) {
					if(((Pelicula)peliculas.getKappa(i)).getName()==name) {
						for(j=0;j<peliculas.sizeKappa();i++) {
							if(((Pelicula)peliculas.getKappa(j)).getName()==name) {
								return false;
							}
							else {
								((Pelicula)peliculas.getKappa(i)).setName((String)modificado);
								return true;
							}
						}
					}
				}
			}
			else if(tipomod==1) {///generos
				for(i=0;i<peliculas.sizeKappa();i++) {
					if(((Pelicula)peliculas.getKappa(i)).getName()==name) {
						((Pelicula)peliculas.getKappa(i)).setGeneros((String[])modificado);
						return true;
					}
				}
			}
			else if(tipomod==2) {///year
				for(i=0;i<peliculas.sizeKappa();i++) {
					if(((Pelicula)peliculas.getKappa(i)).getName()==name) {
						((Pelicula)peliculas.getKappa(i)).setYear((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==3) {///rate
				for(i=0;i<peliculas.sizeKappa();i++) {
					if(((Pelicula)peliculas.getKappa(i)).getName()==name) {
						((Pelicula)peliculas.getKappa(i)).setRate((long)modificado);
						return true;
					}
				}
			}
			else if(tipomod==4) {///stock
				for(i=0;i<peliculas.sizeKappa();i++) {
					if(((Pelicula)peliculas.getKappa(i)).getName()==name) {
						((Pelicula)peliculas.getKappa(i)).setStock((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==5) {///totalstock
				for(i=0;i<peliculas.sizeKappa();i++) {
					if(((Pelicula)peliculas.getKappa(i)).getName()==name) {
						((Pelicula)peliculas.getKappa(i)).setTotalstock((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==6) {///duracion
				for(i=0;i<peliculas.sizeKappa();i++) {
					if(((Pelicula)peliculas.getKappa(i)).getName()==name) {
						((Pelicula)peliculas.getKappa(i)).setDuracion((String)modificado);
						return true;
					}
				}
			}
		}
		if(tipo==1) {
			if(tipomod==0) {///name
				for(i=0;i<juegos.sizeKappa();i++) {
					if(((Juego)juegos.getKappa(i)).getName()==name) {
						for(j=0;j<juegos.sizeKappa();i++) {
							if(((Juego)juegos.getKappa(j)).getName()==name) {
								return false;
							}
							else {
								((Juego)juegos.getKappa(i)).setName((String)modificado);
								return true;
							}
						}
					}
				}
			}
			else if(tipomod==1) {///generos
				for(i=0;i<juegos.sizeKappa();i++) {
					if(((Juego)juegos.getKappa(i)).getName()==name) {
						((Juego)juegos.getKappa(i)).setGeneros((String[])modificado);
						return true;
					}
				}
			}
			else if(tipomod==2) {///year
				for(i=0;i<juegos.sizeKappa();i++) {
					if(((Juego)juegos.getKappa(i)).getName()==name) {
						((Juego)juegos.getKappa(i)).setYear((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==3) {///rate
				for(i=0;i<juegos.sizeKappa();i++) {
					if(((Juego)juegos.getKappa(i)).getName()==name) {
						((Juego)juegos.getKappa(i)).setRate((long)modificado);
						return true;
					}
				}
			}
			else if(tipomod==4) {///stock
				for(i=0;i<juegos.sizeKappa();i++) {
					if(((Juego)juegos.getKappa(i)).getName()==name) {
						((Juego)juegos.getKappa(i)).setStock((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==5) {///totalstock
				for(i=0;i<juegos.sizeKappa();i++) {
					if(((Juego)juegos.getKappa(i)).getName()==name) {
						((Juego)juegos.getKappa(i)).setTotalstock((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==6) {///plataforma
				for(i=0;i<juegos.sizeKappa();i++) {
					if(((Juego)juegos.getKappa(i)).getName()==name) {
						((Juego)juegos.getKappa(i)).setPlataforma((String)modificado);
						return true;
					}
				}
			}
		}
		if(tipo==2) {
			if(tipomod==0) {
				for(i=0;i<series.sizeKappa();i++) {
					if(((Serie)series.getKappa(i)).getName()==name) {
						for(j=0;j<series.sizeKappa();i++) {
							if(((Serie)series.getKappa(j)).getName()==name) {
								return false;
							}
							else {
								((Serie)series.getKappa(i)).setName((String)modificado);
								return true;
							}
						}
					}
				}
			}
			else if(tipomod==1) {///generos
				for(i=0;i<series.sizeKappa();i++) {
					if(((Serie)series.getKappa(i)).getName()==name) {
						((Serie)series.getKappa(i)).setGeneros((String[])modificado);
						return true;
					}
				}
			}
			else if(tipomod==2) {///year
				for(i=0;i<series.sizeKappa();i++) {
					if(((Serie)series.getKappa(i)).getName()==name) {
						((Serie)series.getKappa(i)).setYear((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==3) {///rate
				for(i=0;i<series.sizeKappa();i++) {
					if(((Serie)series.getKappa(i)).getName()==name) {
						((Serie)series.getKappa(i)).setRate((long)modificado);
						return true;
					}
				}
			}
			else if(tipomod==4) {///stock
				for(i=0;i<series.sizeKappa();i++) {
					if(((Serie)series.getKappa(i)).getName()==name) {
						((Serie)series.getKappa(i)).setStock((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==5) {///totalstock
				for(i=0;i<series.sizeKappa();i++) {
					if(((Serie)series.getKappa(i)).getName()==name) {
						((Serie)series.getKappa(i)).setTotalstock((int)modificado);
						return true;
					}
				}
			}
			else if(tipomod==6) {///duracion
				for(i=0;i<series.sizeKappa();i++) {
					if(((Serie)series.getKappa(i)).getName()==name) {
						((Serie)series.getKappa(i)).setDuracion((String)modificado);
						return true;
					}
				}
			}
			else if(tipomod==7) {///capitulos
				for(i=0;i<series.sizeKappa();i++) {
					if(((Serie)series.getKappa(i)).getName()==name) {
						((Serie)series.getKappa(i)).setCapitulos((int)modificado);
						return true;
					}
				}
			}
		}
		else {
			return false;
		}
	}
	
	
	
}