package Biblioteca;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

	private List<Livro> livros = new ArrayList<Livro>();
	private List<Cliente> clientes = new ArrayList<Cliente>();

	
	public Biblioteca() {
		super();}
	
	


	
	
	public List<Livro> getLivros() {
		return livros;
	}






	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}






	public List<Cliente> getClientes() {
		return clientes;
	}






	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}






	public void CadastrarLivro(Livro livros) {
		this.livros.add(livros);
	}

	public void CadastrarCliente(Cliente clientes) {
		this.clientes.add(clientes);
	}

	public void EmprestarLivro() {
		for (Livro livr : livros) {
			if (livr.getDisponibilidade() == true) {
				System.out.println("Posso emprestar o livro: " + livr.getTitulo());
//				livr.setDisponibilidade(false);
			} else {
				System.out.println("Desculpe, infelizmente o livro: "+ livr.getTitulo()+ " encontra-se indisponível");
			}
		}
	}

	public void ReservarLivro() {
		for (Livro livr : livros) {
			if (livr.getDisponibilidade() == true) {
				System.out.println("Reserva concluída do livro: "  + livr.getTitulo());
				livr.setDisponibilidade(false);
			} else {
				System.out.println("Desculpe, infelizmente o livro: "+ livr.getTitulo()+ " encontra-se indisponível");
			}
		}
	}

	public double MultaPorDias(double dias) {
		return dias * 0.3;
	}

}
