package Setores;

import java.util.List;

import Pessoas.Visitantes;

public class Administracao extends Setor {
	
	private List<Visitantes> visitantes;
	


	
	public Administracao() {
		super();
	}

	public Administracao(List<Visitantes> visitantes) {
		super();
		this.visitantes = visitantes;
	}

	public List<Visitantes> getVisitantes() {
		return visitantes;
	}

	public void setVisitantes(List<Visitantes> visitantes) {
		this.visitantes = visitantes;
	}

	public void pagarFuncionario() {
		System.out.println("Pagando salário aos funcionários... $$$");	
	}
	
	public void venderEntrada() {
		System.out.println("Vendendo ingresso aos visitantes... $$$");
	}

}
