package mediosTransporte;

public abstract class Medios_Transporte {


    public Medios_Transporte() {
    }

  
    private String modelo;
    private int capacidad;
    protected int kilometraje;
    protected int combustible;

    public abstract void cMueve();
    
    public abstract String info();

}