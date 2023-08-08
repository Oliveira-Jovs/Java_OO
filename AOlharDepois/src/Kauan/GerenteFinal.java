package Kauan;

public class GerenteFinal extends Funcionario {


	public GerenteFinal(String nome, String id, int salario) {
		super(nome, id, salario);
		this.getNome();
		this.getId();
		this.getSalario();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RealizarTarefa() {
		System.out.println("Good Joob");
		
	}

	@Override
	public void CalcularSalario(int Salario) {
		setSalario(getSalario() + Salario);
		
		
	}

}
