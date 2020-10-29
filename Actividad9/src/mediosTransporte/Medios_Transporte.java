package mediosTransporte;

public abstract class Medios_Transporte {
  
    private String modelo;
    private int capacidad_pasajeros;
    private int kilometraje;
    private int combustible;
    
    public Medios_Transporte() {
    	
    	modelo="";
    	capacidad_pasajeros=0;
    	combustible=0;
    	kilometraje=0;
    }
    
    public Medios_Transporte(String modelo,int capacidad, int combustible) {
    	this.modelo=modelo;
    	this.capacidad_pasajeros=capacidad;
    	this.combustible=combustible;
    	kilometraje=0;
    	
    }

    
    public void setModelo(String mod) {
    	modelo=mod;
    }
    
    public String getModelo() {
    	return modelo;
    }
    public void setCapacidad(int capas) {
    	capacidad_pasajeros=capas;
    }
    
    public int getCapacidad() {
    	return capacidad_pasajeros;
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
    
    public abstract String cDetiene();

}