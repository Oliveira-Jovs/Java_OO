package Uvz;

public class App {public static void main(String[] args) {
	
	Frutas banana = new Banana();
	banana.setNome("Nanana");
	banana.setCor("Amarela");
	
	
	Frutas uva1 = new Uva();uva1.setCor("Ruiva");uva1.setNome("Uiva");
	Frutas uva2 = new Uva();uva2.setCor("Vierde");uva2.setNome("Ouva");

	Cesta cesta = new Cesta();
	cesta.setQuantidade(1);
	cesta.getFrutas().add(uva1);
	cesta.getFrutas().add(uva2);
	cesta.getFrutas().add(banana);
	
	
	Cliente cliente = new Cliente();
	cliente.setNome("Niclaudio");
	cliente.setCesta(cesta);
	
	for (Frutas sera : cliente.getCesta().getFrutas()) {
		
		if(sera instanceof Banana) {
			System.out.println("Só bananas");
			System.out.println(sera.getNome());
			System.out.println(sera.getCor());

			sera.Caroco();
			sera.Preco();
			System.out.println();
		}if(sera instanceof Uva) {
			System.out.println();
			System.out.println("Festa da uva");
			System.out.println(sera.getNome());
			System.out.println(sera.getCor());
			sera.Caroco();
			sera.Preco();
			System.out.println();
	}
		
	}
	
}}
