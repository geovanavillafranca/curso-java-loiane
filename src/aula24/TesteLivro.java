package aula24;

public class TesteLivro {
	public static void main(String[] args) {
		
		Livro book = new Livro();
		book.nomeAutor = "John Green";
		book.nomeLivro = "Quem é você Alaska?";
		book.indice = "Fala sobre um menino que conheceu o amor da sua vida.";
		book.qtdPaginas = 345;
		book.anoLancamento = 2018;
		book.emprestado = false;
		book.usado = true;
		
		System.out.println("Nome do autor: " + book.nomeAutor);
		System.out.println("Nome do livro: " + book.nomeLivro);
		System.out.println("Ano de Lancamento: " + book.anoLancamento );
		System.out.println("Quantidade de páginas: " + book.qtdPaginas);
		System.out.print("Foi emprestado? ");
		if (book.emprestado == true) {
			System.out.println("sim");
	
		} else {
			System.out.println("não");
		}
		System.out.println("Indice: " + book.indice);
		System.out.print("É usado? ");
		if (book.usado == true) {
			System.out.print("sim");
	
		} else {
			System.out.print("não");
		}
	
	
	}
}
