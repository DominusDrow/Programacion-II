package mediosTransporte;

public abstract class Medios_Transporte {


    public Medios_Transporte() {
    }

  
    private String modelo;
    private int capacidad;
    protected int kilometraje;

    public abstract void cMueve();
    
    public abstract String info();

}