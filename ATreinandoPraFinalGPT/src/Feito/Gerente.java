package Feito;

public class Gerente extends Funcionario {
	private String departamento;
	private int numeros_de_subordinados;
	
	public Gerente(String departamento, int numeros_de_subordinados) {
		super();
		this.departamento = departamento;
		this.numeros_de_subordinados = numeros_de_subordinados;
	
	
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getNumeros_de_subordinados() {
		return numeros_de_subordinados;
	}
	public void setNumeros_de_subordinados(int numeros_de_subordinados) {
		this.numeros_de_subordinados = numeros_de_subordinados;
	}
	
	
}
