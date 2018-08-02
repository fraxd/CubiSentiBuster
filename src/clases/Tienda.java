package clases;

public class Tienda {
	/*
		Actualizada tienda, con nombre y direccion.-
	*/
	
	private int idTienda;
	private String nombre;
	private String direccion;
	private ListaKappa trabajadores;
	private Producto productos;
	
	public Tienda() {
		this.idTienda = 0;
		this.nombre = null;
		this.direccion = null;
		trabajadores= new ListaKappa();
		this.productos= new Producto();
	}
	
	public Tienda(int idTienda) { ///Eliminar pronto
		this.idTienda =idTienda;
	}
	public Tienda(int idTienda, String nombre, String direccion){
		this.idTienda = idTienda;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Tienda(int idTienda, ListaKappa trabajadores, Producto productos) {
		this.idTienda = idTienda;
		this.trabajadores = trabajadores;
		this.productos = productos;
	}

	public int getIdTienda() {
		return idTienda;
	}
	public String getNombre(){
		return nombre;
	}
	public String getDir(){
		return direccion;
	}
	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setDir(String dir){
		this.direccion=dir;
	}
	
	public ListaKappa getTrabajadores() {
		return trabajadores;
	}
	public void setTrabajadores(ListaKappa trabajadores) {
		this.trabajadores = trabajadores;
	}

	public boolean agregarProducto(Pelicula pelicula) {
		boolean aux;
		aux=productos.agregarPelicula(pelicula);
		return aux;
	}
	public boolean agregarProducto(Juego juego) {
		boolean aux;
		aux=productos.agregarJuego(juego);
		return aux;
	}
	public boolean agregarProducto(Serie serie) {
		boolean aux;
		aux=productos.agregarSerie(serie);
		return aux;
	}
	
	//// Agregar Trabajadores al ArrayList
	public boolean agregarTrabajadores(Usuario usuario) {
		int i;
		Usuario aux;
		for(i=0;i<(trabajadores.sizeKappa());i++) {
			aux=(Usuario)trabajadores.getKappa(i);
			if(aux.getId()==usuario.getId())return false;
		}
		trabajadores.addKappa(usuario);
		return true;
	}
	
	//// Quitar trabajadores al ArrayList
	public boolean quitarTrabajadores(int id, String password) {
		int i;
		Usuario aux;
		for(i=0;i<(trabajadores.sizeKappa());i++) {
			aux=(Usuario)trabajadores.getKappa(i);
			if(id==((Usuario) trabajadores.getKappa(i)).getId()) {
				if(password.equals(aux.getPass())) {
					trabajadores.removeKappa(i);
					return true;
				}
			}
		}
		return false;
	}
	
	//////////Zona modificar producto////////////
	public boolean modificarProducto(String name, Object modificador, int tipo, int tipomod) {
		boolean retornable;
		retornable=productos.modificarProducto(name,modificador,tipo,tipomod);
		return retornable;
	}
	
}
