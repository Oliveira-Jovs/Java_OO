package Kauan;

public abstract class Funcionario {
	private String nome;
	private String id;
	private int Salario;
	
	public abstract void RealizarTarefa();
	public abstract void CalcularSalario(int Salario);
	
	public void BaterPonto() {}
	public void ReceberPagamento() {}
	
	public Funcionario(String nome, String id, int salario) {
		super();
		this.nome = nome;
		this.id = id;
		this.Salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}}
	