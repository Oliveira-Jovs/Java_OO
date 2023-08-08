package aulao;

public class Aula {
	public static void main(String[] args) {
		AGuanabaraCaneta c1 = new AGuanabaraCaneta();
		c1.cor = "Verde";
		c1.ponta = 0.5f;
		c1.tampar();
		c1.modelo = "Beck";
		
		c1.status();
		c1.rabiscar();
		
		AGuanabaraCaneta c2 = new AGuanabaraCaneta();
		c2.modelo = "Jang";
		c2.cor = "Azul";
		c2.status();
		c2.rabiscar();
		c2.destampar();
	}
	
}
