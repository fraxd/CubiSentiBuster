package clases;

public class listaKappa {
	private ArrayList<Object> kappa;

	///kappita
	public listaKappa(){
		kappa= new Arraylist<Object>();
	}


	///Obtiene el objeto en la posicion i de la listaKappa
	Object getKappa(int i){
		Object objeto;
		objeto=kappa.get(i);
		return objeto;
	}

	///Remueve el objeto en la posicion i de la listaKappa
	Void removeKappa(int i){
		kappa.remove(i);
	}

	///Otiene el tamaño de listaKappa
	int sizeKappa(){
		return kappa.size();
	}

	///Añade el elemento en la listaKappa
	Void addKappa(Object objeto){
		kappa.add(objeto);
	}


}