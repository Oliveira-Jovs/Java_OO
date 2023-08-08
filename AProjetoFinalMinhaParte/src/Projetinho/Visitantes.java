package Projetinho;

public class Visitantes extends Pessoa {
	protected int idade;
	
	public void DefinirValorIngresso(double valor) {
		this.valor= valor;
	}
	private double valor;
	public void ComprarEntrada() {
		
		if (idade >=6 && idade <=59 ) {

			System.out.println("Caro Senhor(a) " + this.getNome() + " o valor do seu ingresso é de R$" + valor+"0");
		
		}else if (idade >=60 ) {
			System.out.println("Caro Senhor(a) " + this.getNome() + " o valor do seu ingresso é de R$" + valor/2);

		}else if (idade <=5 ) {

			System.out.println("Caro " + this.getNome() + " a sua entrada é franca " );}}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	}