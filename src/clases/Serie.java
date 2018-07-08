package clases;

public class Serie {
	private String name;
	private String[] generos;
	private int year;
	private String duracion;
	private int capitulos;
	private double rate;
	private int stock;
	private int totalstock;

	//// Constructores
	public Serie(){
		name=null;
		generos= new String[3];
		year=0;
		duracion=null;
		rate=0;
	}
	public Serie(String name, String[] generos, int year, String duracion, int capitulos, double rate, int stock,
			int totalstock) {
		this.name = name;
		this.generos = generos;
		this.year = year;
		this.duracion = duracion;
		this.capitulos = capitulos;
		this.rate = rate;
		this.stock = stock;
		this.totalstock = totalstock;
	}
	//// Fin Constructores
	//////////////////////////////////
	/////////////////////////////////
	/*Zona Getters*/
	
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
	public int getCapitulos(){
		return capitulos;
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
	/*Fin zona Getters*/
	//////////////////////
	/////////////////////
	/*Zona Setters*/
	
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
	public void setCapitulos(int capitulos){
		this.capitulos=capitulos;
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
	
	/*Fin zona Setters*/
	///////////////////////////
}
