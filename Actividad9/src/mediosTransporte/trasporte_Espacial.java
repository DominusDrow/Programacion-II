package mediosTransporte;

public abstract class trasporte_Espacial extends Medios_Transporte {

	private int NumPropulsores;
    private boolean SaltoInterestelar;

    public trasporte_Espacial() {
    	super();
    }
    
    public trasporte_Espacial(int propulsores, boolean salto) {
    	super();
    	NumPropulsores=propulsores;
    	SaltoInterestelar=salto;
    }
    
    public trasporte_Espacial(String modelo,int capacidad,int propulsores, boolean salto ) {
    	super(modelo,capacidad);
    	NumPropulsores=propulsores;
    	SaltoInterestelar=salto;
    }
    

    public String Despegar() {
       return "";
    }

    public abstract void Orbitando();
    
    public abstract String cMueve();

    public abstract String info();

}