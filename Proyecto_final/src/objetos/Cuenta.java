package objetos;

public class Cuenta {
	private String Usuario;
	private String contraseņa;
	
	public Cuenta(String contra, String usu) {
		this.contraseņa=contra;
		this.Usuario=usu;
	}
	
	public Cuenta() {
		this.contraseņa="";
		this.Usuario="";
	}
	
	public void setContra(String contra) {
		contraseņa=contra;
	}
	
	public String getContra() {
		return contraseņa;
	}
	
	public void setUsuario(String usu) {
		Usuario=usu;
	}
	
	public String getUsuario() {
		return Usuario;
	}
	
}
