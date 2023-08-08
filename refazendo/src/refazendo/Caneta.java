package refazendo;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;

	void mostrar() {
		System.out.println("Uma caneta "+ this.cor);
		System.out.println("Está tampada ? " +  this.tampada);
		System.out.println(""+ this.carga);
		System.out.println(""+ this.ponta);
	}


	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERROR! NÃO POSSO RABISCAR !!!");
		}
		else{ 
			System.out.println("Estou rabiscando");
		}


	}

	void tampar() {
		this.tampada = true;

	}

	void destampar() {
		this.tampada = false;

	}
}
