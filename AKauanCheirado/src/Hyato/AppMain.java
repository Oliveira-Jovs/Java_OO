package Hyato;

public class AppMain {public static void main(String[] args) {
	
	
	Loja_de_Roupa loja = new Loja_de_Roupa();
	loja.setNome("Maviara");

	
	Endereco endereco = new Endereco();
	endereco.setRua("Rua ascenso ferreira");
	endereco.setBairro("Sao Sebastiao");
	endereco.setCidade_estado("Palmares");
	endereco.setCidade("342");
	
	loja.setEndereco1(endereco);

	Venda venda = new Venda();
	venda.setValortotal(250);
	
	Roupa roupa = new Roupa();
	roupa.setMarca("Asus");
	roupa.setTamanho("M");
	roupa.setNome("camisa");
	roupa.setCodigo("222");
	roupa.setPreco(50);
	roupa.setQuantidade(2);
	
	Roupa roupa2 = new Roupa();
	roupa2.setNome("cueca");
	roupa2.setPreco(24);
	roupa2.setCodigo("077");
	roupa2.setQuantidade(1);
	roupa2.setMarca("motorola");
	roupa2.setTamanho("G");
	
	
	Roupa roupa3 = new Roupa();
	roupa3.setNome("calcinha");
	roupa3.setPreco(12);
	roupa3.setCodigo("085");
	roupa3.setQuantidade(3);
	roupa3.setMarca("Secrets");
	roupa3.setTamanho("GG");
	
	venda.AdicionarRoupa(roupa);
	venda.AdicionarRoupa(roupa2);
	venda.AdicionarRoupa(roupa3);
	
	loja.getVendas().add(venda);
	
	
	
	for (Roupa vendinha : venda.getRoupas()   ) {
		System.out.println(vendinha.getNome());
		
		
	}

}}
