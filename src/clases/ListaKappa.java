package clases;

import java.util.ArrayList;

public class 	 {
	private ArrayList<Object> kappa;

	///kappita
	public ListaKappa(){
		kappa= new ArrayList<Object>();
	}


	///Obtiene el objeto en la posicion i de la listaKappa
	Object getKappa(int i){
		Object objeto;
		objeto=kappa.get(i);
		return objeto;
	}

	///Remueve el objeto en la posicion i de la listaKappa
	void removeKappa(int i){
		kappa.remove(i);
	}

	///Otiene el tamaño de listaKappa
	int sizeKappa(){
		return kappa.size();
	}

	///Añade el elemento en la listaKappa
	void addKappa(Object objeto){
		kappa.add(objeto);
	}


}