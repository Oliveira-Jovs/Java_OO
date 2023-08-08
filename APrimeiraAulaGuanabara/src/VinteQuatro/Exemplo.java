package VinteQuatro;

public class Exemplo {
	public static void main(String[] args) {
		System.out.println("            1 CANETA           ");
		
		Caneta caneta1 = new Caneta("bic", "azul", 7, true);
		caneta1.status();
	
		System.out.println("            CÓPIA DA 1 CANETA");
		
		Caneta copiadacaneta1 = new Caneta();
		copiadacaneta1.caractere = "bic1";
		copiadacaneta1.Cor= "azul";
		copiadacaneta1.ponta= 9;
		copiadacaneta1.tampada= false;
		copiadacaneta1.status();
		
	}

}
