package Hyato;

public class Roupa extends Produto{
	private String tamanho;
	private String marca;
	
	public Roupa() {
		super();
	}

	public Roupa(String tamanho, String marca) {
		super();
		this.marca=marca;
		this.tamanho=tamanho;}
		
		
	public Roupa(String codigo, String nome, int quantidade, int preco, String tamanho, String marca) {
		super(codigo, nome, quantidade, preco);
		this.tamanho = tamanho;
		this.marca = marca;
	}

	public String getTamanho() {
		return tamanho;
	}
		
	public void setTamanho(String tamanho) {
		this.tamanho=tamanho;
	}
	
	public String getMarca() {
		return marca;
	}
		
	public void setMarca(String marca) {
		this.marca= marca;
	}
	
}
