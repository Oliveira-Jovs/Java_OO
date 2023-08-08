package refazendo3;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public Caneta(String modelo, float ponta, String cor) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampar();

	 	
	}
	public Caneta(String modelo) {
		super();
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public void mostrar() {
		System.out.println("Sobre a caneta   ");
		System.out.println("Sobre a caneta " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor " + this.cor);
		System.out.println("Tampada " + this.tampada);

	}

}


