
package objetos;

import java.util.Calendar;
import java.util.Date;

public class Paciente extends Persona implements Comunica{
  
    private float IMC;
    private Date Inicio;
    private Cuenta cuenta;
    private int Dias;
    
    
    public Paciente(){
    	this.Dias=0;
    	this.Inicio=null;
    	this.IMC=0;
    	this.cuenta=null;
    }
    
    public Paciente(String nom,int edad, double peso,double estatura, String contra){
    	super(nom,edad,peso,estatura);
    	this.Dias=0;
    	this.Inicio=null;
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

    public Date getInicio() {
    	return Inicio;
    }

    public void setInicio(Date Inicio) {
        this.Inicio = Inicio;
    }

    public float getUMC() {
        return IMC;
    }

    public void setIMC(int peso, int estatura) {
        int alt2=estatura*estatura;
    	int imc=peso/alt2;
    	this.IMC = imc;
    }
    
    public void setDias() {
    	this.Dias=calculaDias(Inicio);
    }
    
    public int getDias() {
    	return Dias;
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
