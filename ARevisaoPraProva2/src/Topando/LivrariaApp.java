package Topando;

import java.util.ArrayList;
import java.util.List;

public class LivrariaApp {public static void main(String[] args) {
	Produtos livro = new Livro("Nicolau","Maquiavel",1200);
	
	Produtos revista = new Revista();
	revista.setTitulo("Tititi");
	revista.setAutor("Falabela");
	revista.setPreco(7.50);

	Produtos ebook = new Ebook();
	ebook.setTitulo("Será que eu fedo?");
	ebook.setAutor("Freud");
	ebook.setPreco(25.30);

	List<Produtos> produtos = new ArrayList<Produtos>();
	produtos.add(livro);
	produtos.add(revista);
	produtos.add(ebook);
	
	for (Produtos produ : produtos) {
		if(produ instanceof Livro) {
			System.out.println("Só livros");
			produ.ExibirDetalhes();
			produ.CalcularDesconto();
			System.out.println();
		}else if  (produ instanceof Revista) {
			System.out.println("Só Revista");
			produ.ExibirDetalhes();
			produ.CalcularDesconto();
			System.out.println();
		}else {
			System.out.println("Só Ebooks");
			produ.ExibirDetalhes();
			produ.CalcularDesconto();
		}
				
	}
}}
