package construtora01;

public class Principal {

	public static void main(String[] args) {

		Filme meuFilme = new Filme();
		
		meuFilme.nome = "O Poderoso Chef�o";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180;
		
		//System.out.println(meuFilme.nome);
		//System.out.println(meuFilme.anoDeLancamento);
		
		
		meuFilme.exibeFichaTecnica();
		
		meuFilme.avalia(8);
		meuFilme.avalia(10);
		meuFilme.avalia(7);
		
		
		System.out.println("Soma das avaliacoes
		: "+meuFilme.somaDasAvaliacoes);
		System.out.println("Total das avalia��es: "+meuFilme.totalDeAvaliacoes);
		System.out.println("M�dia de aval��o: "+meuFilme.cauculaMedia());
		
	}

}
