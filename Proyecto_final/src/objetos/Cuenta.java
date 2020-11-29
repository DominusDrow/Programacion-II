package objetos;

public class Cuenta {
	private String Usuario;
	private String contrasenia;
	
	public Cuenta(String contra, String usu) {
		this.contrasenia=contra;
		this.Usuario=usu;
	}
	
	public Cuenta() {
		this.contrasenia="";
		this.Usuario="";
	}
	
	public void setContra(String contra) {
		contrasenia=contra;
	}
	
	public String getContra() {
		return contrasenia;
	}
	
	public void setUsuario(String usu) {
		Usuario=usu;
	}
	
	public String getUsuario() {
		return Usuario;
	}
	
}
