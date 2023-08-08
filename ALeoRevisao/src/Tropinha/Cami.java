package Tropinha;

public class Cami extends Veiculo {
	private int rodas;
	
	public void Barulho() {
		System.out.println("Brumbum");
	}

	public Cami(String nome, int rodas) {
		super(nome);
		this.rodas = rodas;
	}

	public Cami(String nome) {
		super(nome);
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	
}
