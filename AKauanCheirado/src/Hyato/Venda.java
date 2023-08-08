package Hyato;
import java.util.List;
import java.util.ArrayList;


public class Venda {

	private List<Roupa> roupas = new ArrayList<Roupa>();
	
	private double valortotal;
	
	public double CalcularValorTotal(){
		return valortotal;
		
	}
	public void AdicionarRoupa(Roupa roupas) {
		 this.roupas.add(roupas);
	}
	
	public void MostrarRoupa() {
		for (Roupa roupa : roupas) {
			roupa.getNome();
			
		};
	}
	
	
	
	public double getValortotal() {
		return valortotal;
	}
	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}
	
	
	public List<Roupa> getRoupas() {
		return roupas;
	}
	public void setRoupas(List<Roupa> roupas) {
		this.roupas= roupas;
	}

	
	public Venda(List<Roupa> roupas, double valortotal) {
		super();
		this.roupas= roupas;
		this.valortotal= valortotal;
		
	}
	public Venda() {
		super();
	}

	




}
