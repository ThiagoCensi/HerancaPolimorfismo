package entities;

public class ContaPoupaca extends Account {

	private Double taxaJuros;
	
	public ContaPoupaca() {
		super();
	}

	public ContaPoupaca(Integer numeroConta, String titular, Double saldoConta, Double taxaJuros) {
		super(numeroConta, titular, saldoConta);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void attSaldo() {
		saldoConta += saldoConta * taxaJuros;
	}
	
	@Override
	public void saque(double quantia) {
		saldoConta -= quantia;
	}
}
