package clases;

public class Persona {

	private String rut; //Sin puntos
	private String nombre;
	private int telefono;
	private String correo;
	private String[] arriendos;
	
	public Persona() {
		this.rut = null;
		this.nombre = null;
		this.telefono = 0;
		this.arriendos= new String[5];
	}
 	
	public Persona(String rut, String[] arriendos) {
		this.rut = rut;
		this.setArriendos(arriendos);
	}
	
	public Persona(String rut, String nombre, int telefono, String correo) {
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.setCorreo(correo);
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
	public void setArriendos(String[] arriendos) { // 
		this.arriendos = arriendos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
