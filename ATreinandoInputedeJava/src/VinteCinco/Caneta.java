package VinteCinco;

public class Caneta {
	public String modelo;
	public String Cor;
	private float ponta;
	protected boolean tampada;
	
	/*public float getPonta() {
		return ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}*/
	
	
	

	public void rabiscar() {
		if (tampada == true) {
			System.out.println("Caneta está Tampada");
		} else {
			System.out.println("Rabiscando");
		}}
	
	protected void tampar() {
		this.tampada = true;}

	protected void destampar() {
		this.tampada = false;}


	public void status() {
		System.out.println("COR:" + this.Cor);
		System.out.println("MODELO:" +  this.modelo );
		System.out.println("PONTA:" +  this.ponta); 
		System.out.println("Está tampada? " + this.tampada);

	} }
