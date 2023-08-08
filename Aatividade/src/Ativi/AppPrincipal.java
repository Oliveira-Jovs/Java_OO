package Ativi;
import java.util.Scanner;


public class AppPrincipal {
	public static void main(String[] args) {
		//CRIA OS OBJETOS GERENTE E PROGRAMADOR
		Gerente gerente= new Gerente();
		gerente.setNome("tadeu");
		gerente.setSalario(500);

		Programador programador = new Programador();
		programador.setNome("judeus");
		programador.setSalario(500);

		// MENU INICIAL
		Scanner scanner = new Scanner(System.in);
		System.out.println("MENU ");
		System.out.println("press 1 para: imprimir dados");
		System.out.println("press 2 para: Aumentar salario");

		int opcao = scanner.nextInt();

		if (opcao == 1) {
			System.out.println("Você desejar ver os dados do Gerente ou do Programador");
			System.out.println("1- Gerente / 2- Programador");
			int imprimi = scanner.nextInt();
			if  (imprimi == 1) {
				System.out.println("O gerente se chama " + gerente.getNome() + " e seu salário é de R$"+ gerente.getSalario());
			}else {
				System.out.println("O programador se chama " + programador.getNome() + " e seu salário é de R$"+ programador.getSalario());
			}
		}else {
			System.out.println("Você desejar aumentar o salário do Gerente ou do Programador? ");
			System.out.println("1- Gerente / 2- Programador");
			int aumento = scanner.nextInt();
			if (aumento == 1) {
				System.out.println("Informe o valor do aumento...");
				int aumentogerente = scanner.nextInt();
				System.out.println("O gerente teve um aumento de R$" + aumentogerente + " e agora seu novo salário é de R$" + (gerente.getSalario() + aumentogerente));
			}else {
				System.out.println("Informe o valor do aumento...");
				int aumentoprogra = scanner.nextInt();
				programador.AumentarSalario(aumentoprogra);
				System.out.println("O programador teve um aumento de 20% de " + aumentoprogra + " e agora seu novo salário é de R$" + programador.getSalario());

			}
		}
	}
}
