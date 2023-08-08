package dezenovef;

public class Funcionario extends Pessoa{
	private String cargo;
	private float salario;
	
	// CONSTRUTORES
	public Funcionario(String cargo, float salario) {
		super();
		this.cargo = cargo;
		this.salario = salario;
	}
	public Funcionario() {
		super();
	}
	
	//	GET AND SET

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
