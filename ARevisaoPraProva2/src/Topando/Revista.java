package Topando;

public class Revista extends Produtos {

	@Override
	public void CalcularDesconto() {
		setPreco(getPreco() - getPreco() * 0.7);
		System.out.println("O desconto foi de 7%");
		System.out.println("O novo valor é R$ " + getPreco());
		
	}

	@Override
	public void ExibirDetalhes() {
		System.out.println(this.getTitulo());
		System.out.println(this.getAutor());
		System.out.println(this.getPreco());
	}

}
