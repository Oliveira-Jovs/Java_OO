package Pacote;

public class Funcionario extends Pessoa{
	private String cargo;
	private int salario;
	
	public Funcionario(String nome, int idade, String genero, String cargo, int salario) {
		super(nome, idade, genero);
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Funcionario(String nome, int idade, String genero) {
		super(nome, idade, genero);
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}



}
