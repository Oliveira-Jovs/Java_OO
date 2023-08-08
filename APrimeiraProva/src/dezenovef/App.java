package dezenovef;import java.util.ArrayList;import java.util.List;public class App 
{ public static void main(String[] args) {

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


	List<Funcionario> funcionarios = new ArrayList<>();
	funcionarios.add(f1); funcionarios.add(f2); funcionarios.add(f3);

	Departamento departamento = new Departamento("Cetic", funcionarios);
	Empresa empresa = new Empresa("LéoSTware ","2154-225364,11225",departamento);

	System.out.println("Empresa: " + empresa.getNome());
	System.out.println("Cnpj da empresa: " + empresa.getCnpj());
	System.out.println("Departamento : " + empresa.getDepartamento().getNome());



	for (Funcionario funcionario : empresa.getDepartamento().getFuncionarios()) 
	{System.out.println("----------------------------------");
	System.out.println("Nome : " + funcionario.getNome());
	System.out.println("Cargo : " + funcionario.getCargo());
	System.out.println("Sala : R$ " + funcionario.getSalario());
	System.out.println("Idade : " + funcionario.getIdade());
	System.out.println("Gênero : " + funcionario.getGenero()); }}}
