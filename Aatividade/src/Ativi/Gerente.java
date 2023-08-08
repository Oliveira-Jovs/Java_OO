package Ativi;

public class Gerente extends Funcionario {

	@Override              // gerente.AumentarSalario(1000)
	public void AumentarSalario(double salario) {
		setSalario(getSalario() + (salario * 0.10));
			//	    2500        + 1000     * 0.10 = 100
		                             
		
}}