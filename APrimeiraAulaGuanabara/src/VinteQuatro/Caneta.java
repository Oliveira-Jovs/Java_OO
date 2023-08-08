package VinteQuatro;

public class Caneta {
	public String caractere;
	public String Cor;
	public int ponta;
	public boolean tampada;
	
	
	
	public Caneta() {
		super();
	}

	public Caneta(String caractere, String cor, int ponta, boolean tampada) {
		super();
		this.caractere = caractere;
		Cor = cor;
		this.ponta = ponta;
		this.tampada = tampada;
	}

	public void rabiscar() {
		if (tampada == true) {
			System.out.println("Caneta está Tampada");
	} else {
			System.out.println("Rabiscando");
	}}

	public void status() {
		System.out.println("COR:" + this.Cor);
		System.out.println("MODELO:" +  this.caractere );
		System.out.println("PONTA:" +  this.ponta); 
		this.rabiscar();
			
	
	
	}
}
