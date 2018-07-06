package clases;

import java.util.Date;

public class Arriendos {
	private Producto producto;
	
	Date fechaSalida;
	Date fechaEntrega;
	boolean estadoEntrega;
	int atraso; // Son Numeros de dias


	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
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

	public int getAtraso() {
		return atraso;
	}

	public void setAtraso(int atraso) {
		this.atraso = atraso;
	}


}
