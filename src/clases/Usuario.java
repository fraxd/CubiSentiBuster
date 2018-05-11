package clases;

public class Usuario {
	private int idUser; //RUT SIN DIGITO VERIFICADOR NI PUNTOS
	private String pass;
	private String nombre;
	private int level;
	private int local;
		
	public Usuario(){
		idUser=0;
		pass=null;
		nombre=null;
		level=0;
		local=0;
	}
		
	public Usuario(int idUser, String pass, String nombre, int level, int local) {
		this.idUser = idUser;
		this.pass = pass;
		this.nombre = nombre;
		this.level = level;
		this.local = local;
	}

	public int getId(){
		return idUser;
	}
	public String getPass(){
		return this.pass;
	}
	public String getName() {
		return nombre;
	}
	public int getLevel(){
		return level;
	}
	public int getLocal(){
		return local;
	}
	public void setId(int id){
		idUser=id;
	}
	public void setPass(String p){
		pass=p;
		}
	public void setName(String n) {
		nombre=n;
	}
	public void setLevel(int le){
		level=le;
	}
	public void setLocal(int lo){
		local=lo;
	}

	public Usuario generarUsuario(int id,String p,String n,int le,int lo){
		Usuario aux = new Usuario();
		aux.idUser=id;
		aux.pass=p;
		aux.nombre=n;
		aux.level=le;
		aux.local=lo;

		return aux;
	}
	public String[] generarStringCSV() {
		String[] datos = {String.valueOf(idUser),pass,nombre,String.valueOf(level),String.valueOf(local)};
		return datos;
	}
	
}


