package entities;

public class Account {

	private Integer numeroConta;
	private String titular;
	protected Double saldoConta;
	
	public Account() {
	}

	public Account(Integer numeroConta, String titular, Double saldoConta) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldoConta = saldoConta;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void saque(double quantia) {
		saldoConta -= quantia + 5.0;
	}
	
	public void deposito(double quantia) {
		saldoConta += quantia;
	}
}
