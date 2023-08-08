package Feito;

import java.util.List;
import java.util.ArrayList;

public class SistemaGestaoFuncionarios {public static void main(String[] args) {

	Funcionario funcionario1 = new Funcionario(); 
	funcionario1.setNome("João");
	funcionario1.setIdade(32);
	funcionario1.setSalario(1.200);

	Funcionario funcionario2 = new Funcionario(); 
	funcionario2.setNome("Maria");
	funcionario2.setIdade(27);
	funcionario2.setSalario(1.140);
	
	Funcionario funcionario3 = new Funcionario(); 
	funcionario3.setNome("Pedro");
	funcionario3.setIdade(23);
	funcionario3.setSalario(1.100);
	
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	funcionarios.add(funcionario1);
	funcionarios.add(funcionario2);
	funcionarios.add(funcionario3);
	
	Funcionario gerente = new Gerente("Cetic",3);
	
	gerente.setNome("Flavio");
	gerente.setIdade(37);
	gerente.setSalario(2600);
	
	System.out.println(gerente.getNome());
	System.out.println(gerente.getIdade());
	System.out.println(gerente.getSalario());
	System.out.println(((Gerente)gerente).getDepartamento());
	System.out.println(((Gerente)gerente).getNumeros_de_subordinados());
	System.out.println(" ");
	System.out.println("PULA");
	System.out.println();
	
	for (Funcionario TodosFuncionarios : funcionarios) {
		System.out.println(TodosFuncionarios.getNome());
		System.out.println(TodosFuncionarios.getIdade());
		System.out.println(TodosFuncionarios.getSalario());
	}
	
	
}}
