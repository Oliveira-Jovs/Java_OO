package Hyato;
import java.util.List;
import java.util.ArrayList;

public class Loja_de_Roupa {
	private String nome;
	
	private Endereco endereco1;
	private List<Venda> vendas = new ArrayList<Venda>();
	
	public Loja_de_Roupa(String nome, Endereco endereco1, List<Venda> vendas) {
		super();
		this.nome = nome;
		this.endereco1 = endereco1;
		this.vendas = vendas;
	}

	public void Abrir() {
		System.out.println("Está aberta");
		
	}

	public void Fechar() {
		System.out.println("Está fechada");
		
	}
	public void RelatorioVenda() {
		
		
	}

	public Loja_de_Roupa(String nome, List<Venda> vendas) {
		super();
		this.nome = nome;
		this.vendas = vendas;
	}

	public Loja_de_Roupa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public Endereco getEndereco1() {
		return endereco1;
	}

	public void setEndereco1(Endereco endereco1) {
		this.endereco1 = endereco1;
	}
	
	
	
	
	
	
	
	
}
