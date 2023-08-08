package Biblioteca;


public class AppMain {public static void main(String[] args) {
	
	Livro lvr1 = new Livro("Será que eu fedo?", "Freud", 2003, true);
	Livro lvr2 = new Livro("Revolução dos bichos", "Sant", 2001, true);
	Livro lvr3 = new Livro("Mundo de Sofía", "Froid", 1998, false);
	Livro lvr4 = new Livro("Diário de um banana", "Greg", 2007, true);
	Livro lvr5 = new Livro("Assim falou nytzche", "Santos drummond", 1983, false);
	Livro lvr6 = new Livro();
	lvr6.setAno_Da_Publicacao(2000);
	lvr6.setAutor("Jucelino");
	lvr6.setDisponibilidade(false);
	lvr6.setTitulo("Miranha");
	Livro lvr7 = new Livro();lvr7.setTitulo("biblia");lvr7.setAutor("Roma");lvr7.setAno_Da_Publicacao(1540);lvr7.setDisponibilidade(true);
	
	Cliente cliente1 = new Cliente("João", 21);
	Cliente cliente3 = new Cliente("Rebson", 31);
	Cliente cliente2 = new Cliente("Everton", 3);
	
	Biblioteca biblioteca = new Biblioteca();
	
	biblioteca.CadastrarCliente(cliente1);
	biblioteca.CadastrarCliente(cliente2);
	biblioteca.CadastrarCliente(cliente3);

	
	biblioteca.CadastrarLivro(lvr1);
	biblioteca.CadastrarLivro(lvr2);
	biblioteca.CadastrarLivro(lvr3);
	biblioteca.CadastrarLivro(lvr4);
	biblioteca.CadastrarLivro(lvr5);
	biblioteca.CadastrarLivro(lvr6);
	biblioteca.CadastrarLivro(lvr7);
	
//	biblioteca.EmprestarLivro();
//	System.out.println();
//	biblioteca.ReservarLivro();
//	System.out.println(biblioteca.MultaPorDias(3));
	
	
//	System.out.println(biblioteca.getClientes());

	for (Cliente clentes : biblioteca.getClientes()) {
		System.out.println(clentes.getNome());
		System.out.println(clentes.getNumero_de_identificacao());}}}
		

