package construtora01;

public class Filme {
	
	int anoDeLancamento;
	double somaDasAvaliacoes;
	int totalDeAvaliacoes;
	String nome;
        int duracaoEmMinutos;

	
	void exibeFichaTecnica() {
		System.out.println("Nome: "+nome);

		System.out.println("Ano de Lan�amento: "+anoDeLancamento);
	}
	
	void avalia(double nota) {
		somaDasAvaliacoes +=nota;
		totalDeAvaliacoes++;
	}
	
	double cauculaMedia() {
		return somaDasAvaliacoes/totalDeAvaliacoes;
	}
}
