
package objetos;

public class Nutriologo extends Persona {
    
    private String celular;
    private Cuenta cuenta;
    private int blogs;

    public Nutriologo(){
        super("Ricardo");
        cuenta = new Cuenta("1234","Ricardo");
    }
    
    public void setcelular(String celular) {
    	this.celular=celular;
    }
    
    public String getCelular() {
    	return celular;
    }
    public int getBlogs() {
        return blogs;
    }

    public void setBlogs(int blogs) {
        this.blogs = blogs;
    }
    
    public void setCuenta(Cuenta cuent) {
    	this.cuenta=cuent;
    }
    
    public Cuenta getCuenta() {
    	return cuenta;
    }
    
    
    
}
