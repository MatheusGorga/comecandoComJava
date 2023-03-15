package sitaxe_variaveis_e_fluxo;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 1; i < 10; i++) {
//			System.out.println( i + "! = " + (i + i) +  " = " + i * i  );
//		}
		
		
		 int fatorial = 1;
	        for (int i = 1; i < 11; i++) {
	            fatorial *= i;
	            System.out.println("Fatorial de " + i + " = " + fatorial);
	        }
	}

}
