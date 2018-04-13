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
	
	public Serie(){
		name=null;
		generos= new String[3];
		year=0;
		duracion=null;
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

	public Serie(String name, String[] generos, int year, String duracion,int capitulos, double rate){
		setName(name);
		setGeneros(generos);
		setYear(year);
		setDuracion(duracion);
		setCapitulos(capitulos);
		setRate(rate);
	}
}
