package Tropinha;

public class Auto extends Veiculo {
	private int valor;
	
	
	public void Barulho() {
		System.out.println("Fuuuuuu");
	}
	
	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public Auto(String nome) {
		super(nome);
	}

	public Auto(String nome, int valor) {
		super(nome);
		this.valor = valor;
	}
	

}
