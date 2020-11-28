
package objetos;

import java.util.Date;

public class Usuario extends Persona{
  
    private String contrasenia;
    private Date Inicio;
    private int Dias;
    
    
    public Usuario(){
    
    
    }

    public Date getInicio() {
        return Inicio;
    }

    public void setInicio(Date Inicio) {
        this.Inicio = Inicio;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    
    
}
