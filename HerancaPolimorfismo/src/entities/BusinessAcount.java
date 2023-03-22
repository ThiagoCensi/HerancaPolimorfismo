package entities;

public class BusinessAcount extends Account{

	  private Double limitEmprestimo;
	  
	  public BusinessAcount() {
		  super();
	  }
	 

	public BusinessAcount(Integer numeroConta, String titular, Double saldoConta, Double limitEmprestimo) {
		super(numeroConta, titular, saldoConta);
		this.limitEmprestimo = limitEmprestimo;
	}


	public Double getLimitEmprestimo() {
		return limitEmprestimo;
	}


	public void setLimitEmprestimo(Double limitEmprestimo) {
		this.limitEmprestimo = limitEmprestimo;
	}
	  
	public void emprestimo(double quantia) {
		if (quantia <= limitEmprestimo)
		deposito(quantia);
		saldoConta += quantia -10.0;
	}
	
	@Override
	public void saque(double quantia) {
		super.saque(quantia);
		saldoConta -= 2.0;
	}
}
