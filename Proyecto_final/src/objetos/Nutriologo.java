
package objetos;

public class Nutriologo {
    
    private String contrasenia;
    private String celular;
    private String nombre;
    private int blogs;

    public int getBlogs() {
        return blogs;
    }

    public void setBlogs(int blogs) {
        this.blogs = blogs;
    }
    
    
    public Nutriologo(){
        
        contrasenia="1234";
        nombre="nutriologo";
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
