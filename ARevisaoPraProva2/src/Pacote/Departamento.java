package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nome;
	private List <Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Departamento(String nome, List<Funcionario> funcionarios) {
		super();
		this.nome = nome;
		this.funcionarios = funcionarios;
	}

	public Departamento() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	
	
	
}