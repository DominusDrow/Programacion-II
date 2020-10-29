package mediosTransporte;

public class naveEspacial extends trasporte_Espacial implements Comunicacion {

	private boolean Caniones;
	private boolean Escudos;

	
	public naveEspacial(int propulsores) {
		super(propulsores);

	}
	
    public void maneobrar() {

    }

    public void Orbitando() {
    	
    }

    public String msgHumano() {
        return "";
    }


	public String info() {
		return "";
	}

	public String cMueve() {
		return "";
	}

	public String cDetiene() {
		
		return null;
	}

}