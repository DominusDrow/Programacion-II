package mediosTransporte;

public abstract class trasporte_Espacial extends Medios_Transporte {


    public trasporte_Espacial() {
    }

    private int NumPropulsores;
    private boolean SaltoInterestelar;

    public String Despegar() {
       return "";
    }

    public abstract void Orbitando();


    public abstract String cMueve();

  
    public abstract String info();

}