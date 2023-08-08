package Tropinha;

public class Appp {public static void main(String[] args) {
	Dono dono1 = new Dono();dono1.setIdade(20);
	
	Veiculo auto1 = new Auto("Automovel1");Veiculo auto2 = new Auto("Automovel2");Veiculo auto3 = new Auto("Automovel3");
	
	Veiculo cami1 = new Cami("Caminhão1");Veiculo cami2 = new Cami("Caminhão2");Veiculo cami3 = new Cami("Caminhão3");
	
	Motorista motorista1 = new Motorista("Motorista Um");Motorista motorista2 = new Motorista("Motorista Dois");Motorista motorista3 = new Motorista("Motorista Tres");

	dono1.getMotorista().add(motorista1);
	dono1.getMotorista().add(motorista2);
	dono1.getMotorista().add(motorista3);

	dono1.getVeiculo().add(auto1);
	dono1.getVeiculo().add(auto2);
	dono1.getVeiculo().add(auto3);
	dono1.getVeiculo().add(cami1);
	dono1.getVeiculo().add(cami2);
	dono1.getVeiculo().add(cami3);
	
	System.out.println(dono1.getIdade());
	System.out.println();
	
	for(Motorista motora : dono1.getMotorista()) {
			System.out.println(motora.getNome());
			if(auto1 instanceof Veiculo) {
				
			}
			}for (Veiculo veicu : dono1.getVeiculo()) {
				System.out.println(veicu.getNome());
				veicu.Barulho();
		
	}





}}
