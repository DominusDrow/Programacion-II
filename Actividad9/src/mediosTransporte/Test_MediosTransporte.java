package mediosTransporte;

public class Test_MediosTransporte {

	public static void main(String[] args) {
		
		avion av1=new avion("Boeing", 400,600,"Intersjet",1155);
		naveEspacial nv1=new naveEspacial(true,2);
		
	
		System.out.println(nv1.Despegar());
		System.out.println(nv1.info());
		System.out.println(nv1.Aterrizar());

		
		
		
		
		
	}

}
