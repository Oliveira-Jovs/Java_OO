package Projetinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trepar {public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	List<Visitantes> visitantess = new ArrayList<Visitantes>();

	boolean continuar = true;

	while (continuar) {
	    Visitantes visitante = new Visitantes();
	    
	    System.out.print("Digite seu nome (ou 'sair' para encerrar): ");
	    String nome = input.nextLine();
	    
	    if (nome.equalsIgnoreCase("sair")) {
	        continuar = false; // Sai do loop se o comando for "sair"
	    } else {
	        visitante.setNome(nome);
	        
	        System.out.print("Digite sua idade: ");
	        int idade = input.nextInt();
	        input.nextLine(); // Limpa o buffer de entrada
	        
	        visitante.setIdade(idade);
	        
	        System.out.print("Digite o valor pago: ");
	        double valorPago = input.nextDouble();
	        input.nextLine(); // Limpa o buffer de entrada
	        
	        visitante.setValor(valorPago);
	        
	        visitantess.add(visitante);
	    }
	}

	// Aqui você pode realizar outras operações com a lista de visitantes

	input.close(); // Fecha o Scanner

}

	
}
