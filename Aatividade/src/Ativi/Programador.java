package Ativi;

public class Programador extends Funcionario{

	@Override
	public void AumentarSalario(double salario) {
		setSalario(getSalario() + (salario * 0.20));
		
	}

	
	

}
