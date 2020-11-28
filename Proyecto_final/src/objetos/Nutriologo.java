
package objetos;

public class Nutriologo extends Persona {
    
    private String celular;
    private int blogs;

    public Nutriologo(String nombre){
        super(nombre);
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
    
    
    
    
    
}
