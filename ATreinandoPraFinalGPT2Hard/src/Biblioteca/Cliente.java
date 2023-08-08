package Biblioteca;

public class Cliente {
	private String nome;
	private int numero_de_identificacao;
	
	public Cliente(String nome, int numero_de_identificacao) {
		super();
		this.nome = nome;
		this.numero_de_identificacao = numero_de_identificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero_de_identificacao() {
		return numero_de_identificacao;
	}
	public void setNumero_de_identificacao(int numero_de_identificacao) {
		this.numero_de_identificacao = numero_de_identificacao;
	}
}