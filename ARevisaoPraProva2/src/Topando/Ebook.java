package Topando;

public class Ebook extends Produtos {

	@Override
	public void CalcularDesconto() {
		setPreco(getPreco() - getPreco() * 0.10);
		System.out.println("O desconto foi de 10%");
		System.out.println("O novo valor é R$ " + getPreco());
		
	}

	@Override
	public void ExibirDetalhes() {
		System.out.println(getTitulo());
		System.out.println(getAutor());
		System.out.println(getPreco());
	}

	
}
