package Projetinho;

public class Veterinario extends Funcionario {
	private int crmv;
	
	
	public void AplicarMedicamento() {}

public Veterinario() {
	// TODO Auto-generated constructor stub
}
	public int getCrmv() {
		return crmv;}
	public void setCrmv(int crmv) {
		this.crmv = crmv;}

	public Veterinario(double salário, String cargo, int crmv) {
		super(salário, cargo);
		this.crmv = crmv;}

	public Veterinario(double salário, String cargo) {
		super(salário, cargo);}}
