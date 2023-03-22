package application;

import entities.Account;
import entities.BusinessAcount;
import entities.ContaPoupaca;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.);
		Account acc3 = new ContaPoupaca(1004, "Ana", 0.0, 0.1);
		
		// DOWNCAST
		
		BusinessAcount acc4 = (BusinessAcount)acc2;
		acc4.emprestimo(100.0);
		
		// BusinessAcount acc5 = (BusinessAcount)acc3; (FORMA ERRADA)
		 if (acc3 instanceof BusinessAcount) {
			 BusinessAcount acc5 = (BusinessAcount)acc3;
			 acc5.emprestimo(200.0);
			 System.out.println("Emprestimo feito!");
		 }
	
		 if (acc3 instanceof ContaPoupaca) { 
			 ContaPoupaca acc5 = (ContaPoupaca)acc3;
			 acc5.attSaldo();
			 System.out.println("Atualização!");
		 }
		 
		 Account ac1 = new Account(1001, "Tania", 1000.0);
		 ac1.saque(200.0);
		 System.out.println(ac1.getTitular()+ ", Saldo em conta: " + ac1.getSaldoConta());
		 
		 // SOBREPOSIÇÃO 
		 Account ac2 = new ContaPoupaca(1009, "Marcia", 1000.0, 0.01);
		 ac2.saque(200.0);
		 System.out.println(ac2.getTitular() + ", Saldo em conta: " + ac2.getSaldoConta());
		 
		 // SOBREPOSIÇÃO COM SUPERCLASSE DESCONTANDO 2
		 Account ac3 = new BusinessAcount(1010, "Bob", 1000.0, 500.0);
		 ac3.saque(200.0);
		 System.out.println(ac3.getTitular() + ", Saldo em conta: " + ac3.getSaldoConta());
	}

}
