package Ativi;

public class Apica {
	public static void main(String[] args) {

		Gerente gerente= new Gerente();
		gerente.setNome("tadeu");
		gerente.setSalario(500);
	    gerente.AumentarSalario(1000);


		System.out.println(gerente.getNome() + ' ' + gerente.getSalario());
		
		Programador programador = new Programador();
		programador.setNome("judeus");
		programador.setSalario(500);
		programador.AumentarSalario(100);

		System.out.println();
		System.out.println(programador.getNome() +' '+programador.getSalario());

	}}

