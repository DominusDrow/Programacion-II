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

    public abstract void cMueve();
    
    public abstract String info();

}