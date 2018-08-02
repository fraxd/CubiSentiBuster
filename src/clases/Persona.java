package clases;

public class Persona {

	private String rut; //Sin puntos
	private String nombre;
	private int telefono;
	private String correo;
	private ListaKappa Arriendos;
		
	public Persona() {
		this.rut = null;
		this.nombre = null;
		this.telefono = 0;
		this.Arriendos= new ListaKappa();
	}
 	
	public Persona(String rut) {
		this.rut = rut;
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
	

	public void setArriendos(ListaKappa arriendos) {
		Arriendos = arriendos;
	}

	public void cargarArriendo(Arriendos arriendo) {
		Arriendos.addKappa(arriendo);
		
	}

}