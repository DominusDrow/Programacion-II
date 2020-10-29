package mediosTransporte;

public abstract class Medios_Transporte {


    public Medios_Transporte() {
    }

  
    private String modelo;
    private int capacidad;
    protected int kilometraje;
    protected int combustible;
    
    public Medios_Transporte(String modelo,int capacidad,int kilometraje,int combustible) {
    	this.modelo=modelo;
    	this.capacidad=capacidad;
    	this.kilometraje=kilometraje;
    	this.combustible=combustible;
    }
    
    public void setModelo(String mod) {
    	modelo=mod;
    }
    
    public String getModelo() {
    	return modelo;
    }
    public void setCapacidad(int capas) {
    	capacidad=capas;
    }
    
    public int getCapacidad() {
    	return capacidad;
    }
    public void setKilometraje(int kil) {
    	kilometraje=kil;
    }
    
    public int getKilometraje() {
    	return kilometraje;
    }

    public void setCombustible(int com) {
    	combustible=com;
    }
    
    public int getCombustible() {
    	return combustible;
    }

    public abstract String cMueve();
    
    public abstract String info();

}