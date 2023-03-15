package sitaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	public static void main(String[] args) {
		
		System.out.println("Testando condicional");
		System.out.println("--");
		int idade = 16;
		int quantidadePessoas = 2;
		boolean acompanhado = false;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo(a)!");
		} else {
			System.out.println("Infelizmente voce nao pode entrar!");
		}
		
		
// ------------------OU
//		if (idade >= 18 || quantidadePessoas >= 2 ) {
//			System.out.println("Seja bem vindo(a)!");
//		} else {
//			System.out.println("Infelizmente voce nao pode entrar!");
//		}
		
// ------------------ e		
//		if (idade >= 18 && quantidadePessoas >= 2 ) {
//			System.out.println("Seja bem vindo(a)!");
//		} else {
//			System.out.println("Infelizmente voce nao pode entrar!");
//		}
				
		
		

		
	}
}
