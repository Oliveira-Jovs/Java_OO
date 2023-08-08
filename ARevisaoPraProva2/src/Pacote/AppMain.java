package Pacote;
public class AppMain { public static void main(String[] args) {

	Departamento departamento = new Departamento();
	departamento.setNome("Cetic");

	Empresa empresa = new Empresa();
	empresa.setNome("LeoSoft S/A");
	empresa.setCnpj("015.754.852.321.12");
	empresa.setDepartamento(departamento);

	Funcionario funcionario1 = new Funcionario("Elder",32,"masculino","Gerente",1630);
	Funcionario funcionario2 = new Funcionario("Felipe",30,"masculino","Supervisor",6950);
	Funcionario funcionario3 = new Funcionario("Amanda",47,"Feminino","Chefia",17230);

	departamento.getFuncionarios().add(funcionario1);departamento.getFuncionarios().add(funcionario2);
	departamento.getFuncionarios().add(funcionario3);

	departamento.setFuncionarios(null);

	System.out.println("Empresa " + empresa.getNome());
	System.out.println(empresa.getCnpj());
	System.out.println();
	System.out.println("Funcionarios do departamneto " + departamento.getNome());
	System.out.println();

	for (Funcionario tira : departamento.getFuncionarios()) {
		System.out.println(tira.getNome());
		System.out.println(tira.getIdade()+ " anos ");
		System.out.println(tira.getGenero());
		System.out.println(tira.getCargo());
		System.out.println(tira.getSalario());
		System.out.println();}}}