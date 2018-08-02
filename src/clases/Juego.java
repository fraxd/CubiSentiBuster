package clases;

public class Juego {
	private int id;
	private String name;
	private String[] generos;
	private int year;
	private String plataforma;
	private Rate rate;
	private int stock;
	private int totalstock;

	//// Constructores
	public Juego(){
		name=null;
		generos= new String[3];
		year=0;
		plataforma=null;
		rate= new Rate();
		stock=0;
		totalstock=0;
	}
	public Juego(int id, String name, String[] generos, int year, String plataforma, Rate rate, int stock, int totalstock) {
		this.name = name;
		this.generos = generos;
		this.year = year;
		this.plataforma = plataforma;
		this.rate = rate;
		this.stock = stock;
		this.totalstock = totalstock;
	}
	//// Fin Constructores
	///////////////////////////////////
	//////////////////////////////////
	/*Zona Getters*/
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
	public String getPlataforma(){
		return plataforma;
	}
	public long getRate(){
		return rate.getRate();
	}
	public int getStock() {
		return stock;
	}
	public int getTotalstock() {
		return totalstock;
	}
	/*Fin Zona Getters*/
	/////////////////////////////////////////
	////////////////////////////////////////
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
	public void setPlataforma(String plataforma){
		this.plataforma=plataforma;
	}
	public void setRate(long rate){ ///no cambia realmente el rate actual al dado, mas bien, suma el rate dado a los anteriores
		this.rate.finalRate(rate);
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setTotalstock(int totalstock) {
		this.totalstock = totalstock;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*Fin Zona Setters*/
	/////////////////////////////////////////

	public Juego(String name, String[] generos, int year, String plataforma, long rate){
		setName(name);
		setGeneros(generos);
		setYear(year);
		setPlataforma(plataforma);
		setRate(rate);
	}	

}
