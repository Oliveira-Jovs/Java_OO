package Projetinho;

public class Funcionario extends Pessoa {
	private double salário;
	public String cargo;
	
	public void CargaHoraria() {}
	
	public void ReceberSalario() {}
	
	public void CalcularSalario() {}
	
	public void AumentarSalario() {}
	
	

	
	public Funcionario(double salário, String cargo) {
		super();
		this.salário = salário;
		this.cargo = cargo;}
	
	
	public Funcionario() {
		super();}
	
	public double getSalário() {
		return salário;}
	public void setSalário(double salário) {
		this.salário = salário;}
	public String getCargo() {
		return cargo;}
	public void setCargo(String cargo) {
		this.cargo = cargo;}

}
