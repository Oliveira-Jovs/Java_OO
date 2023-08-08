package Kauan;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, String id, int salario) {
		super(nome, id, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RealizarTarefa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CalcularSalario(int Salario) {
		setSalario(getSalario() + Salario);
		
	
}}