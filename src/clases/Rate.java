package clases;

public class Rate {
	private long votos; ///cantidad total de votos
	private long rate; ///rate entre todas las votaciones
	
	///////////Constructor///////
	public Rate() {
		votos=0;
		rate=0;
	}
	////////////////////
	///Zona Getters y Setters///
	public long getVotos() {
		return votos;
	}

	public void setVotos(long votos) {
		this.votos = votos;
	}

	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}
	/////////////////////////////
	/////////////////////////////

	public void finalRate(long voto) {///voto es el rate que le dio el usuario, se promedia inmediatamente con los votos del resto
		votos++;
		rate=((rate*(votos-1))/votos)+(voto/votos);
	}
}
