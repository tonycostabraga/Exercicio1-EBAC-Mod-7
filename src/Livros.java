/**
 * 
 * @author Tony da Costa Braga
 *
 */

// Classe principal por onde iremos invocar os m�todos de acesso �s vari�veis da classe LivrosDetalhes
public class Livros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Criando o objeto LivrosDetalhes para acesso aos m�todos e buscar as informa��es nas vari�veis
	LivrosDetalhes book = new LivrosDetalhes();
	
	//definindo os valores e inserindo nas vari�veis
	book.setNome("O Tar� de Marselha");
	book.setAutor("Carlos Godo");
	book.setEditora("Pensamento");
	
	//invocando o m�todo de exibi��o para mostrar os valores inseridos nas vari�veis
	book.exibirLivro();

	}

}
