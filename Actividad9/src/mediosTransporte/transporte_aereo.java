package mediosTransporte;

public abstract class transporte_aereo extends Medios_Transporte {

    private int alas;
    private int alerones;
    /*
    public transporte_aereo(String modelo,int capacidad,int kilometraje,int combustible) {
    	super(modelo,capacidad,kilometraje,combustible);
    }
    
    public transporte_aereo(String modelo,int capacidad,int kilometraje,int combustible,int alas, int alerones) {
    	super(modelo,capacidad,kilometraje,combustible);
    	this.alas=alas;
    	this.alerones=alerones;
    }
    */
    public String ascender() {
    	return "Ascendiendo";
    }

    public String descender() {
    	return "Descendiendo";
    }

    public String aterrizar() {
        return "Aterrizando, ojo cuidado";
    }

	public abstract String cMueve();

	public abstract String info();

}