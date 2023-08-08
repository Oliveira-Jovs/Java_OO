package Tropinha;

public abstract class Veiculo {
	private String nome;

	public abstract void Barulho();
 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public Veiculo(String nome){
		super();
		this.nome=nome;}
	
	public Veiculo(){
		super();
		}
}
