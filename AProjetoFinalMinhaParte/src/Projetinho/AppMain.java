package Projetinho; import java.util.Scanner; import java.util.ArrayList; import java.util.List;

public class AppMain {public static void main(String[] args) {
	
	Scanner inpute = new Scanner(System.in ); 

	List<Visitantes> visitantes = new ArrayList<Visitantes>();
	
	
	
	
	boolean continuar = true;
	while (continuar) {
		System.out.print("Digite S para sair: "); 
		String sair = inpute.nextLine();
		
		if (sair.equalsIgnoreCase("s")) {
	        continuar = false; // Sai do loop se o comando for "sair"
	    } else {
	    	Visitantes nome_dos_visitantes = new Visitantes();
	    	nome_dos_visitantes.DefinirValorIngresso(10);
	    	 
	    	System.out.print("Digite seu nome: "); 
			String nome = inpute.nextLine(); nome_dos_visitantes.setNome(nome); 
			visitantes.add(nome_dos_visitantes);
	    	
	    	System.out.print("Digite sua idade para saber o valor do ingresso: "); 
	    	int idade = inpute.nextInt(); nome_dos_visitantes.setIdade(idade);
	    	visitantes.add(nome_dos_visitantes);
	    	inpute.nextLine();
	    	

	    	System.out.println();
//	    	nome_dos_visitantes.ComprarEntrada();
	    	
	    }} 
    System.out.println();
	System.out.println("printar");
	for (Visitantes pao : visitantes) {
		pao.ComprarEntrada();
		
		
	}}}
	 