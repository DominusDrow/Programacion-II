package InterfacesGraficas;

public class Cliente {
	
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
