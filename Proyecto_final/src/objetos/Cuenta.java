package objetos;

public class Cuenta {
	private String Usuario;
	private String contrase�a;
	
	public Cuenta(String contra, String usu) {
		this.contrase�a=contra;
		this.Usuario=usu;
	}
	
	public Cuenta() {
		this.contrase�a="";
		this.Usuario="";
	}
	
	public void setContra(String contra) {
		contrase�a=contra;
	}
	
	public String getContra() {
		return contrase�a;
	}
	
	public void setUsuario(String usu) {
		Usuario=usu;
	}
	
	public String getUsuario() {
		return Usuario;
	}
	
}
