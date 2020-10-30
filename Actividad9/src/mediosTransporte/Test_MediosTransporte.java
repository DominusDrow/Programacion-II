package mediosTransporte;

public class Test_MediosTransporte {

	public static void main(String[] args) {
		
		avion av1=new avion("Boeing", 400, 1700,"Intersjet",1155);
		naveEspacial nv1=new naveEspacial(2,true);
		
		System.out.println(av1.Despegar());
	
		System.out.println(nv1.Despegar());


		
		
		
		
		
	}

}
