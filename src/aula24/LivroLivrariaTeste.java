package aula24;

public class LivroLivrariaTeste {
	public static void main(String[] args) {
		
		LivroLivraria book = new LivroLivraria();
		book.nomeAutor = "John Green";
		book.nomeLivro = "Quem é você Alaska?";
		book.indice = "Fala sobre um menino que conheceu o amor da sua vida.";
		book.qtdPaginas = 345;
		book.anoLancamento = 2018;
		book.emprestado = false;
		book.usado = true;
		book.preco = 35.98;
		
		System.out.println("Nome do autor: " + book.nomeAutor);
		System.out.println("Nome do livro: " + book.nomeLivro);
		System.out.println("Ano de Lancamento: " + book.anoLancamento );
		System.out.println("Quantidade de páginas: " + book.qtdPaginas);
		System.out.println("Preco: " + book.preco);
		
		
		
	}

}
