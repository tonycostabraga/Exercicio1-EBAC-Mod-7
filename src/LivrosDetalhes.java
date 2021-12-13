//Criando a classe que possui os atributos dos livros bem como os método de acessos a esses atributos

public class LivrosDetalhes {
	
	// Criando 4 variáveis de acesso privado, ou seja, somente acesso a classe
	private int codigo;
	String nome;
	private String autor;
	private String editora;
	
	//criando os métodos de acesso às variáveis acima
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String seteditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}

	public void exibirLivro() {
		System.out.println(nome);
		System.out.println(autor);
		System.out.println(editora);
	}

}
