package Tropinha;
import java.util.List;


import java.util.ArrayList;

public class Dono {
	
	private int idade;
	
	private List<Veiculo> veiculo = new ArrayList<Veiculo>();
	private List<Motorista> motorista= new ArrayList<Motorista>();
	public Dono(int idade, List<Veiculo> veiculo, List<Motorista> motorista) {
		super();
		this.idade = idade;
		this.veiculo = veiculo;
		this.motorista = motorista;
	}
	public Dono() {
		super();
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public List<Veiculo> getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
	public List<Motorista> getMotorista() {
		return motorista;
	}
	public void setMotorista(List<Motorista> motorista) {
		this.motorista = motorista;
	}
	
	
	
	

}
