package Projetinho;

public class Biologo extends Funcionario{
	private int crbio;
	
	public void AlimentarAnimais() {}

	public int getCrbio() {
		return crbio;}

	public void setCrbio(int crbio) {
		this.crbio = crbio;}

	public Biologo(double salário, String cargo, int crbio) {
		super(salário, cargo);
		this.crbio = crbio;}

	public Biologo(double salário, String cargo) {
		super(salário, cargo);}public Biologo() {
			// TODO Auto-generated constructor stub
		}}
