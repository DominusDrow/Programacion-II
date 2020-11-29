
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
    private int pesoPerdido;
    
    public Paciente(){
    	this.Dias=0;
    	this.Inicio=new Date();
    	this.IMC=0;
    	this.cuenta=null;
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
    
    public void setCuenta(Cuenta cuent) {
    	cuenta=cuent;
    }
    
    public Cuenta getCuenta() {
    	return cuenta;
    }

    public String getInicio() {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	String fecha=sdf.format(Inicio);
    	return fecha;
    }

    public float getUMC() {
        return IMC;
    }

    public void setIMC(int peso, int estatura) {
        int alt2=estatura*estatura;
    	int imc=peso/alt2;
    	this.IMC = imc;
    }
    
    
    public int getDias() {
    	return calculaDias(Inicio);
    }
    
    public int getPesoPerdido() {
		return pesoPerdido;
	}

	public void setPesoPerdido(int pesoPerdido) {
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
