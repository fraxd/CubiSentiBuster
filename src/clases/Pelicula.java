package clases;

public class Pelicula {
	private int id;
	private String name;
	private String[] generos;
	private int year;
	private String duracion;
	private Rate rate;
	private int stock;
	private int totalstock;

	///////////////////////////////
	//// Constructores
	public Pelicula(){
		name=null;
		generos= new String[3];
		year=0;
		duracion=null;
		rate= new Rate();
		stock=0;
		totalstock=0;
	}

	public Pelicula(int id, String name, String[] generos, int year, String duracion, Rate rate, int stock, int totalstock) {
		this.name = name;
		this.generos = generos;
		this.year = year;
		this.duracion = duracion;
		this.rate = rate;
		this.stock = stock;
		this.totalstock = totalstock;
	}
	//// Fin Constructores
	////////////////////////////////
	///////////////////////////////
	/*Zona de Getters */
	
	public String getName(){
		return name;
	}
	public int getId() {
		return id;
	}



	public String[] getGeneros(){
		return generos;
	}
	public int getYear(){
		return year;
	}
	public String getDuracion(){
		return duracion;
	}
	public double getRate(){
		return rate.getRate();
	}
	public int getStock() {
		return stock;
	}
	public int getTotalstock() {
		return totalstock;
	}
	
	/*Fin zona Getters*/
	//////////////////////////////////////
	/////////////////////////////////////
	/*Zona Setters*/
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name){
		this.name=name;	
	}
	public void setGeneros(String[] generos){
		this.generos=generos;
	}
	public void setYear(int year){
		this.year=year;
	}
	public void setDuracion(String duracion){
		this.duracion=duracion;
	}
	public void setRate(long rate){///no cambia realmente el rate actual al dado, mas bien, suma el rate dado a los anteriores
		this.rate.finalRate(rate);
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setTotalstock(int totalstock) {
		this.totalstock = totalstock;
	}
	
	/*Fin zona Setters */
	////////////////////////////////////
}
