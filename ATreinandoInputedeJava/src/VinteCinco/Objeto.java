package VinteCinco;

public class Objeto {
	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "Bic Crystal";
		c1.Cor = "Azul";
		//c1.setponta = 0.5f;
		c1.tampada = false;
		c1.status();
		c1.rabiscar();
	}

}
