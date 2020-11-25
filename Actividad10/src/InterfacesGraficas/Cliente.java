package InterfacesGraficas;

import java.io.Serializable;

public class Cliente implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 5776047000500851072L;
private String nombre;
private String celular;
private boolean tarjetaCredito;

	public Cliente(String nombre,String cel,boolean have) {
		this.nombre=nombre;
		this.celular=cel;
		this.tarjetaCredito=have;
	}
	
	public Cliente(String nombre) {
		this.nombre=nombre;
	}
	
	public Cliente() {
		this.nombre="";
		this.celular="";
		this.tarjetaCredito=false;
	}

	public void setNombre(String name) {
		nombre=name;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCelular(String cel) {
		celular=cel;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setTarjeta(boolean tarj) {
		tarjetaCredito=tarj;
	}
	
	public boolean getTarjeta() {
		return tarjetaCredito;
	}


}
