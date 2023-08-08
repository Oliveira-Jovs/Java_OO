package dezenovef;

import java.util.ArrayList;


public class AppPrincipal {
	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Lider",10347.21f);
		f1.setNome("João");
		f1.setIdade(45);
		f1.setGenero("mascu");

		Funcionario f2 = new Funcionario("Vice-Lider",4890.32f);
		f2.setNome("Sergio");
		f2.setIdade(27);
		f2.setGenero("mascu");

		Funcionario f3 = new Funcionario("Capacho",1250.85f);
		f3.setNome("Jiear");
		f3.setIdade(19);
		f3.setGenero("femi");
	
		
		Departamento departamento = new Departamento("Cetic", new ArrayList<>());
//		departamento.addFuncionario(f1);
		departamento.getFuncionarios().add(f1);
//		departamento.addFuncionario(f2);
		departamento.getFuncionarios().add(f2);
//		departamento.addFuncionario(f);
		departamento.getFuncionarios().add(f3);


		Empresa empresa = new Empresa("IFPE", "25224.45566-966/1",departamento);

		System.out.println("Funcionários da empresa " + empresa.getNome() + " " + empresa.getCnpj() + "");

		for (Funcionario funcionario : departamento.getFuncionarios()) {
			System.out.println("- " + funcionario.getNome() + " " + funcionario.getGenero() + ", " + funcionario.getIdade() + " anos - " + funcionario.getCargo());
		}
		System.out.println("Departamento: " + departamento.getNome());

	}}