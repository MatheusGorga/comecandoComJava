package sitaxe_variaveis_e_fluxo;

public class TestaLacosEncadeados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i = linha 
		// j = coluna
		
		for (int i = 0; i < 10 ; i++) {
			for (int j = 0; j < 10 ; j++) {
				if(i == j ) {
					break;
				}
				System.out.print("*");
				
			}
			System.out.println();
		}
	
	}

}
