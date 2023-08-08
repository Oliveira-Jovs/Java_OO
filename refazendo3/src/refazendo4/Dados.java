package refazendo4;

public class Dados {
	public String numConta;
	protected String tipo;
	private String dono;
	private int saldo;
	private boolean status;


	public Dados(String numConta, String tipo, String dono, int saldo) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = 0;
		this.status = false;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}


	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}



	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if (tipo == "CC") {
			saldo = 50;
		}else {
			saldo = 150;
		}
	}


	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta com dinheiro");
		}if (saldo < 0 ) {
			System.out.println("Conta esta em débito");
		}else {
			System.out.println(false);
		}

	}
	public void depositar(int sal) {
		if (status = true){
			setSaldo(getSaldo() + sal);
		}else {
			System.out.println("Impossivel depositar");

		}



	}
	public void sacar(int valor) {
		if (status = true) {
		
		}

	}
	public void pagarMensal() {

	}
	public void mostrar() {
		System.out.println("ARROMBADO");
		System.out.println(this.numConta);
		System.out.println(this.tipo);
		System.out.println(this.dono);
		System.out.println(this.saldo);
		System.out.println(this.status);



	}

}
