package refazendo;

public class Fazer {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1. ponta = 0.5f;

		c1.tampar();
		c1.rabiscar();
		c1.mostrar();

		System.out.println();

		Caneta c2 = new Caneta();

		c2.cor = "ainn Preto";
		c2.modelo = "Frota";
		c2.ponta = 0.7f;

		c2.destampar();
		c2.rabiscar();
		c2.mostrar();



	}

}
