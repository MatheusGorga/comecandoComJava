package sitaxe_variaveis_e_fluxo;

public class TestaLacosEncadeados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i = multiplicador 
		// j = contador
		
		for (int i = 1; i <= 10 ; i++) {
			for (int j = 0; j <= 10 ; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
