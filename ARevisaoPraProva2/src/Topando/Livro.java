package Topando;

public class Livro extends Produtos {

	@Override
	public void CalcularDesconto() {
		setPreco(getPreco() - (getPreco() * 0.5));
		System.out.println("O desconto foi de 5%");
		System.out.println("O novo valor é R$ " + getPreco());
	}

	@Override
	public void ExibirDetalhes() {
		System.out.println(this.getTitulo());
		System.out.println(this.getAutor());
		System.out.println(this.getPreco());
	}
	
	public Livro(String titulo, String autor, double preco) {
		super(titulo,autor,preco);
		
	}
}
