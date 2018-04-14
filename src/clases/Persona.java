package clases;

public class Persona {

	private String rut;
	private String[] arriendos;
	
	public Persona() {
		this.rut = null;
		this.arriendos= new String[5];
	}
	
	public Persona(String rut, String[] arriendos) {
		this.rut = rut;
		this.setArriendos(arriendos);
	}
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String[] getArriendos() {
		return arriendos;
	}
	public void setArriendos(String[] arriendos) {
		this.arriendos = arriendos;
	}
	
}
