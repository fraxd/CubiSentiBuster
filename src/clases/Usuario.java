package clases;

public class Usuario {
	private int idUser;
	private String pass;	
	private int level;
	private int local;
		
	public Usuario(){
		idUser=0;
		pass=null;
		level=0;
		local=0;
	}
		
	public int getId(){
		return idUser;
	}
	public String getPass(){
		return pass;
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
	public void setLevel(int le){
		level=le;
	}
	public void setLocal(int lo){
		local=lo;
	}

	public Usuario generarUsuario(int id,String p,int le,int lo){
		Usuario aux = new Usuario();
		aux.idUser=id;
		aux.pass=p;
		aux.level=le;
		aux.local=lo;

		return aux;
	}
}


