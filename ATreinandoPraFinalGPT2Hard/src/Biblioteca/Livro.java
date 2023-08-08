package Biblioteca;

public class Livro { 
	private String titulo;
	private String Autor;
	private int Ano_Da_Publicacao;
	private Boolean Disponibilidade;
	
	public Livro(String titulo, String autor, int ano_Da_Publicacao, Boolean disponibilidade) {
		super();
		this.titulo = titulo;
		Autor = autor;
		Ano_Da_Publicacao = ano_Da_Publicacao;
		Disponibilidade = disponibilidade;
	}
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getAno_Da_Publicacao() {
		return Ano_Da_Publicacao;
	}
	public void setAno_Da_Publicacao(int ano_Da_Publicacao) {
		Ano_Da_Publicacao = ano_Da_Publicacao;
	}
	public Boolean getDisponibilidade() {
		return Disponibilidade;
	}
	public void setDisponibilidade(Boolean disponibilidade) {
		Disponibilidade = disponibilidade;
	
	}
	
}
