
package objetos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;


public class Registro {
    
    private ArrayList <Paciente> usuarios;
    Nutriologo nutriologo;
    
    public Registro(){
        
        usuarios = new ArrayList <Paciente> ();
        nutriologo = new Nutriologo();
    }
   
    public void LLenar_lista(){ //lllena el arraylist con datos de un arhivo
    	Paciente p= new Paciente();
		try{
			FileInputStream fis= new FileInputStream("Usuarios.dat");
			ObjectInputStream ois= new ObjectInputStream(fis);
			    int i=0;
		    	p=(Paciente)ois.readObject();
		    	usuarios.clear();
		    	while(true) {
			    	usuarios.add(i,p);
			    	p=(Paciente)ois.readObject();

			    }
        }catch(EOFException e) {System.out.println("EOFE");	}
		catch (FileNotFoundException ex){} 
		catch (ClassNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
    }
    
    
    public void Usuario_nuevo(String nom,int edad, double peso,double estatura,String contra){ //crea un nuevo usuario 
        usuarios.add(new Paciente(nom,edad,peso,estatura,contra));
    }
    
    
    public Paciente Validar_usuarioYcontrasenia(String usua,String contra){  //busca en el arraylist si el usuario existe
    	for(int i=0;i<usuarios.size();i++) {
    		if(usuarios.get(i).getCuenta().getUsuario().equals(usua)){
    			System.out.println("Usuario encontrado.");
    			if(usuarios.get(i).getCuenta().getContra().equals(contra)) {
    				return usuarios.get(i);
    			}
    		}
		}
    	return null;//debe devolver algo que no sea null
        //al final de cada motodo se limpian las casillasNO
    }
    
    public boolean Valida_nutriologo(String nom,String contra) {
    	if(contra.equals(nutriologo.getCuenta().getContra())&&nom.equals(nutriologo.getNombre()))
    		return true;
    	
    	return false;
    }
    
    public boolean Validar_registro(String contra,String confirma,String Cnom,String Cedad,String Cpeso,String Cestat){ //comprueba que ningun campo este vacio o incorrecto
        
    	if(!(contra.isEmpty()&&confirma.isEmpty()&&Cnom.isEmpty()&&Cedad.isEmpty()&&Cpeso.isEmpty()&&Cestat.isEmpty())&&contra.equals(confirma))
        	return true;
        
        return false;
    }
    
    public void guardaUsuarios(){//guarda los usuarios que hay en el array
		try{
			OutputStream fos=new FileOutputStream("Usuarios.dat");
			ObjectOutputStream bos= new ObjectOutputStream(fos);
	    	
			for(int i=0;i<usuarios.size();i++) {
	    		bos.writeObject(usuarios.get(i));
			}
			bos.close();
        }catch (Exception ex){ }
		
  }
    
    public double calPesoP(double pesoAnt,double pesoAct) {
    	return pesoAnt-pesoAct;
    }
    
    public void eliminaCuenta(Paciente paciente) {
    	int i=usuarios.indexOf(paciente);
    	if(i!=-1)
    		usuarios.remove(i);
    }
    
    public void actualizarCuenta(Paciente paciente, int edad, double peso, double est){
       
        paciente.setPesoPerdido(calPesoP(paciente.getPeso(),peso));
        paciente.setEdad(edad);
        paciente.setPeso(peso);
        paciente.setEstatura(est);
    }
    
    
 
    
    
    
    
}
