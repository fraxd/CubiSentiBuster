package clases;

public class Juego {
	private String name;
	private String[] generos;
	private int year;
	private String plataforma;
	private double rate;
		private int stock;
	private int totalstock;

	public Juego(){
		name=null;
		generos= new String[3];
		year=0;
		plataforma=null;
		rate=0;
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
	public String getPlataforma(){
		return plataforma;
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
	public void setPlataforma(String plataforma){
		this.plataforma=plataforma;
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

	public Juego(String name, String[] generos, int year, String plataforma, double rate){
		setName(name);
		setGeneros(generos);
		setYear(year);
		setPlataforma(plataforma);
		setRate(rate);
	}	

}
