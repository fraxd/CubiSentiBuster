package clases;

public class Pelicula {
	private String name;
	private String[] generos;
	private int year;
	private String duracion;
	private double rate;
	private int stock;
	private int totalstock;
	
	public Pelicula(){
		name=null;
		generos= new String[3];
		year=0;
		duracion=null;
		rate=0;
		stock=0;
		totalstock=0;
	}

	public Pelicula(String name, String[] generos, int year, String duracion, double rate, int stock, int totalstock) {
		super();
		this.name = name;
		this.generos = generos;
		this.year = year;
		this.duracion = duracion;
		this.rate = rate;
		this.stock = stock;
		this.totalstock = totalstock;
	}

	public String getName(){
		return name;
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
		return rate;
	}
	public int getStock() {
		return stock;
	}
	public int getTotalstock() {
		return totalstock;
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
	public void setRate(double rate){
		this.rate=rate;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setTotalstock(int totalstock) {
		this.totalstock = totalstock;
	}
	
}
