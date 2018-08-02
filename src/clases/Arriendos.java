package clases;

import java.util.Date;

public class Arriendos {
	private int id;
	private int type;
	private Date fechaSalida;
	private Date fechaEntrega;
	private boolean estadoEntrega; // True = Entregado - False = No entregado

	public Arriendos() {
		id=0;
		type=0;
		fechaSalida=null;
		fechaEntrega=null;
		estadoEntrega=false;
	}
	
	public Arriendos(int id, int type, Date fechaSalida, Date fechaEntrega, boolean estadoEntrega, int atraso) {
		this.id=id;
		this.type=type;
		this.fechaSalida=fechaSalida;
		this.fechaEntrega=fechaEntrega;
		this.estadoEntrega=estadoEntrega;
	}

	
	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public boolean isEstadoEntrega() {
		return estadoEntrega;
	}

	public void setEstadoEntrega(boolean estadoEntrega) {
		this.estadoEntrega = estadoEntrega;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


}
