package sitaxe_variaveis_e_fluxo;

public class TesteEscopoVariaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testando condicional");
		System.out.println("--");
		int idade = 16;
		int quantidadePessoas = 2;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo(a)!");
		} else {
			System.out.println("Infelizmente voce nao pode entrar!");
		}
		
	}

}
