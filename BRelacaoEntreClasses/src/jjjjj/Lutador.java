package jjjjj;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private String vitorias;
	private String derrotas;
	private String empates;

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String categoria,
			String vitorias, String derrotas, String empates) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.categoria = categoria;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;}
	
	public void Apresentar() {
		System.out.println("Apresentar");
		System.out.println("Lutador: "+getNome());
		System.out.println("Origem: "+getNacionalidade());
		System.out.println("Idade: "+getIdade());
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso "+getPeso());
		System.out.println("Vitorias: "+getVitorias());
		System.out.println("Derrotas: "+getDerrotas());
		System.out.println("Empates: "+getEmpates());
	}
	public void Status() {
		System.out.println("Lutador: "+getNome());
		System.out.println("Origem: "+getNacionalidade());
		System.out.println("Idade: "+getIdade());
		System.out.println("Altura: "+getAltura());
		System.out.println("Peso "+getPeso());
		System.out.println("Categoria " + getCategoria());
		System.out.println("Vitorias: "+getVitorias());
		System.out.println("Derrotas: "+getDerrotas());
		System.out.println("Empates: "+getEmpates());
	}
	public void GanharLuta() {
		setVitorias(getVitorias() +1);
	}
	public void PerderLuta() {		
		setDerrotas(getDerrotas() +1);
}
	public void EmpatarLuta() {
		setEmpates(getEmpates() +1);
	}

	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (peso <52.2) {
			categoria= "Inválido";
		}else if (peso <=70.3) {
			categoria= "Leve";}
		else if(peso<=120.2) {
			categoria= "Pesado";}
		else {
			categoria="Invalido";}
		}	
	public String getVitorias() {
		return vitorias;
	}
	public void setVitorias(String vitorias) {
		this.vitorias = vitorias;
	}
	public String getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(String derrotas) {
		this.derrotas = derrotas;
	}
	public String getEmpates() {
		return empates;
	}
	public void setEmpates(String empates) {
		this.empates = empates;
	}
	
	
}
