package Topando;

public abstract class Produtos {
	private String titulo;
	private String autor;
	private double preco;
	
	public abstract void CalcularDesconto();
	
	public abstract void ExibirDetalhes();
	
	public void ExibirDetalhis() {
	}
	
	public Produtos() {
		super();
	}
	public Produtos(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
