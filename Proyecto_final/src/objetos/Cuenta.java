package objetos;

public class Cuenta {
	private String Usuario;
	private String contraseña;
	
	public Cuenta(String contra, String usu) {
		this.contraseña=contra;
		this.Usuario=usu;
	}
	
	public Cuenta() {
		this.contraseña="";
		this.Usuario="";
	}
	
	public void setContra(String contra) {
		contraseña=contra;
	}
	
	public String getContra() {
		return contraseña;
	}
	
	public void setUsuario(String usu) {
		Usuario=usu;
	}
	
	public String getUsuario() {
		return Usuario;
	}
	
}
