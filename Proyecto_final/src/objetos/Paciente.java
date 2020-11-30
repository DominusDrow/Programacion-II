
package objetos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Paciente extends Persona implements Comunica, Serializable{
  
    private float IMC;
    private Date Inicio;
    private Cuenta cuenta;
    private int Dias;
    private double pesoPerdido;
    private String EstadoSalud;
    
    
    public Paciente(){
    	this.Dias=0;
    	this.Inicio=new Date();
    	this.IMC=0;
    	this.cuenta=null;
    }
    
    public Paciente(String nom,int edad, double peso,double estatura){
    	super(nom,edad,peso,estatura);
    	this.Dias=0;
    	this.Inicio=new Date();
    	this.IMC=(float) ((float)peso/(estatura*estatura));
    }
    
    public Paciente(String nom,int edad, double peso,double estatura, String contra){
    	super(nom,edad,peso,estatura);
    	this.Dias=0;
    	this.Inicio=new Date();
    	this.IMC=0;
    	cuenta=new Cuenta(contra,nom);
    }
    
    public Paciente(Cuenta cuent){
    	this.cuenta=cuent;
    }
    
    public void setEstadoSalud(String estado) {
    	EstadoSalud=estado;
    }
    
    public void setCuenta(Cuenta cuent) {
    	cuenta=cuent;
    }
    
    public Cuenta getCuenta() {
    	return cuenta;
    }
    
    public String toString() {
    	return "Soy "+getNombre()+" tengo "+getEdad()+" anios.\n"
    			+"Peso "+getPeso()+" kg y mido "+getEstatura()+" cm.";
    }
    
    public String pedirRecomendacion() {
    	return "Nutriologo, quiero llevar una vida saludable.";
    }

    public String getInicio() {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	String fecha=sdf.format(Inicio);
    	return fecha;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(int peso, int estatura) {
        int alt2=estatura*estatura;
    	int imc=peso/alt2;
    	this.IMC = imc;
    }
    
    
    public int getDias() {
    	Dias=calculaDias(Inicio);
    	return Dias;
    }
    
    public double getPesoPerdido() {
		return pesoPerdido;
	}

	public void setPesoPerdido(double pesoPerdido) {
		this.pesoPerdido = pesoPerdido;
	}

	public int calculaDias(Date fechai) {
    	int dias=0;
    	Date actual=new Date();
		Calendar inicio=Calendar.getInstance();
		inicio.setTime(fechai);
		Calendar fin=Calendar.getInstance();
		fin.setTime(actual);
			
		while(inicio.before(fin)||inicio.equals(fin)) {
			dias++;
			inicio.add(Calendar.DATE, 1);	
		}
		return dias;
    }

	public String msgHumano() {
		return Comunica.msg+IMC;
	}

    
    
}
