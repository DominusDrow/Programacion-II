
package objetos;

public class Persona {

    private String nombre; 
    private int  edad;
    private double peso;
    private double estatura;

    public Persona() {
		this.nombre="";
		this.edad=0;
		this.peso=0;
		this.estatura=0;
	}
    
    public Persona(String nom,int edad, double peso,double estatura) {
		this.nombre=nom;
		this.edad=edad;
		this.peso=peso;
		this.estatura=estatura;
	}
    
    public Persona(String nom) {
		this.nombre=nom;
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int Edad) {
        edad = Edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double Peso) {
        peso = Peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double Estatura) {
        estatura = Estatura;
    }
    
    

    
}
