package Hyato;

public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	private String cidade_estado;
	
	public Endereco(String rua, String bairro, String cidade, String cidade_estado) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cidade_estado = cidade_estado;
	}
	public Endereco() {
		super();
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCidade_estado() {
		return cidade_estado;
	}
	public void setCidade_estado(String cidade_estado) {
		this.cidade_estado = cidade_estado;
	}
	
	
	
	
	

}
