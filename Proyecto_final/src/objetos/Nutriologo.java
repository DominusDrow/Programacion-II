
package objetos;

public class Nutriologo extends Persona {
    
    private String celular;
    private Cuenta cuenta;
    private int blogs;

    public Nutriologo(){
        super("Ricardo");
        cuenta = new Cuenta("1234","Ricardo");
    }
    
    public void setcelular(String celular) {
    	this.celular=celular;
    }
    
    public String getCelular() {
    	return celular;
    }
    public int getBlogs() {
        return blogs;
    }

    public void setBlogs(int blogs) {
        this.blogs = blogs;
    }
    
    public void setCuenta(Cuenta cuent) {
    	this.cuenta=cuent;
    }
    
    public Cuenta getCuenta() {
    	return cuenta;
    }
    
    public void recomendar() {//permite recomendar
    	
    }
    
    public float CalculCalo(double peso,double estatura,int edad) {
    	float calorias=(float) (66+(13.7*peso)+(5*estatura)+6.75*edad);   	
    	return calorias;
    }
    
    public int ComerDia(float IMC) {
    	int veces=0;
    	if(IMC<18 ) {
    		veces=5;
    	}else if(IMC>=18&&IMC<=25) {
        	veces=5;
        }else if(IMC<30&&IMC>25){
    		veces=4;
     	}else if(IMC>=30) {
    		veces=3;
    	}
    	return veces;
    }
    
    public int EjercicioDia(float IMC) {
    	int veces=0;
    	if(IMC<18 ) {
    		veces=3;
    	}else if(IMC>=18&&IMC<=25) {
        	veces=4;
        }else if(IMC<30&&IMC>25){
    		veces=4;
     	}else if(IMC>=30) {
    		veces=5;
    	}
    	return veces;
    }
    
    public String toString() {
    	return "Hola, soy tu nutriologo "+getNombre();
    }
    
    public String VerEstado(float IMC) {
    	String EstadoSalud="";
    	if(IMC<18 ) {
    		EstadoSalud="Bajo peso.";
    	}else if(IMC>=18&&IMC<=25) {
        EstadoSalud="Peso normal.";
        }else if(IMC<30&&IMC>25){
    		EstadoSalud="Sobrepeso";
     	}else if(IMC>=30) {
    		EstadoSalud="Obesidad";
    	}
    	
    	return EstadoSalud;
    }
    
    public String DarRecomendaciones(float IMC) {
        	if(IMC<18 ) {
        		return "Deberias comer mas";
        	}else if(IMC>=18&&IMC<=25) {
        		return "Buen trabajo, haz ejercicio y sigue comiendo saludable";
            }else if(IMC<30&&IMC>25){
        		return "Elija alimentos con poca grasa y reduzca en consumo de azúcar.";
         	}
        	
        	return "No alterne períodos de ayuno con comidas abundantes y no coma entre comidas.";
    }
    
    
    
}
