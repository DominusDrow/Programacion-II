
package objetos;

import java.util.Date;

public class Usuario extends Persona{
  
    private String contrasenia;
    private Date Inicio;
    private Date Actual;
    
    
    public Usuario(){
    
    
    }

    public Date getInicio() {
        return Inicio;
    }

    public void setInicio(Date Inicio) {
        this.Inicio = Inicio;
    }

    public Date getActual() {
        return Actual;
    }

    public void setActual(Date Actual) {
        this.Actual = Actual;
    }


    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    
    
}
