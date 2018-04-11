package clases;

public class Pelicula {
	private String name;
	private String[] generos;
	private int year;
	private String duracion;
	private double rate;
	
	public Pelicula(){
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
	public double getRate(){
		return rate;
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
	public Pelicula(String name, String[] generos, int year, String duracion, double rate){
		setName(name);
		setGeneros(generos);
		setYear(year);
		setDuracion(duracion);
		setRate(rate);
	}
}
