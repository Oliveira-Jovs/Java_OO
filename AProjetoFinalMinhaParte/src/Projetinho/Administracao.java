package Projetinho;

import java.util.List;

public class Administracao {
	
	private List<Visitantes> visitantes;
		
		public void pagarFuncionario() {
			System.out.println("Pagando salário aos funcionários... $$$");	
		}
		
		public void venderEntrada() {
			System.out.println("Vendendo ingresso aos visitantes... $$$");
			
		}

		private double valor;

		

		public void DefinirValorIngresso(double valor) {
			this.valor= valor;
		}

		public void ComprarEntrada() {
		
//			if (this.getIdade >=6 && this.getIdade <=59 ) {

		///		System.out.println("Caro Senhor(a) " + this.getNome() + " o valor do seu ingresso é de R$" + valor+"0");
			
//			}else if (idade >=60 ) {
	///			System.out.println("Caro Senhor(a) " + this.getNome() + " o valor do seu ingresso é de R$" + valor/2);

			///}else if (idade <=5 ) {

				///System.out.println("Caro " + this.getNome() + " a sua entrada é franca " );}}
		}

		public List<Visitantes> getVisitantes() {
			return visitantes;
		}

		public void setVisitantes(List<Visitantes> visitantes) {
			this.visitantes = visitantes;
		}

	
}
