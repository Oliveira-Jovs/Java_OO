package Projetinho;

	import java.util.List;
	import java.util.ArrayList;
	import java.util.Scanner;



	public class aefafdsadsa {public static void main(String[] args) {
	        Scanner inpute = new Scanner(System.in); 

	        List<Visitantes> visitantes = new ArrayList<Visitantes>();

	        boolean continuar = true;
	        while (continuar) {
	            System.out.print("Digite S para sair: "); 
	            String sair = inpute.nextLine();

	            if (sair.equalsIgnoreCase("s")) {
	                continuar = false; // Sai do loop se o comando for "sair"
	            } else {
	                Visitantes visitante = new Visitantes();
	                visitante.DefinirValorIngresso(10);

	                System.out.print("Digite seu nome: "); 
	                String nome = inpute.nextLine(); 
	                visitante.setNome(nome); 

	                System.out.print("Digite sua idade para saber o valor do ingresso: "); 
	                int idade = inpute.nextInt(); 
	                visitante.setIdade(idade);
	                inpute.nextLine();

	                visitantes.add(visitante);
	            }

	        } 

	        System.out.println();
	        System.out.println("Lista de visitantes");
	        for (Visitantes visitante : visitantes) {
	            visitante.ComprarEntrada();
	        }
	    }
	

}

	


