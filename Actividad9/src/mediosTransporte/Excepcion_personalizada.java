package mediosTransporte;

public class Excepcion_personalizada extends Exception{		//la clase de todas las excepciones

	public static final long serialVersionUID = 700L;	//para que java maneje la excepcion en el RunTime
	
    public Excepcion_personalizada(String msg) {
    	
    	super(msg);
    }	
    
}

class mensajes_excepciones{
	
	public void validar_gas(int gas) throws Excepcion_personalizada{
		
		if(gas<100) {
			
			throw new Excepcion_personalizada("La nave se quedo sin combustible");
		}
	}
	
	public void validar_cargar(boolean en_tierra) throws Excepcion_personalizada{
		
		if(en_tierra) {
			
			throw new Excepcion_personalizada("La nave no puede cargarse mientras no este en tierra");
		}
		
	}

}