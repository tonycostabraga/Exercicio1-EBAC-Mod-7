/**
 * 
 * @author Tony da Costa Braga
 *
 */

// Classe principal por onde iremos invocar os métodos de acesso às variáveis da classe LivrosDetalhes
public class Livros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Criando o objeto LivrosDetalhes para acesso aos métodos e buscar as informações nas variáveis
	LivrosDetalhes book = new LivrosDetalhes();
	
	//definindo os valores e inserindo nas variáveis
	book.setNome("O Tarô de Marselha");
	book.setAutor("Carlos Godo");
	book.setEditora("Pensamento");
	
	//invocando o método de exibição para mostrar os valores inseridos nas variáveis
	book.exibirLivro();

	}

}
