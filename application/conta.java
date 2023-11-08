package application;

import java.util.Scanner;

import entities.acoont;

public class conta {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		
		
	System.out.print("numero da conta:");	
	int numero = sc.nextInt();
	System.out.print("Nome do titular:");
	String name = sc.next();
	double deposit = 0;
	System.out.print("deseja fazer deposito a inical a conta? (S/N)");
	String escolha =sc.next();
	
	if (escolha.equalsIgnoreCase("sim")) {
		System.out.println();
		System.out.print("Deposito:");
		deposit = sc.nextDouble();
	}else {
		System.out.println("cadastro concluido!");
	}
	
	acoont saldo = new acoont(numero,name,deposit);  
	
	
	//SALDO
	System.out.println();
	System.out.println(saldo);
	
	//DEPÓSITO
	System.out.println();
	System.out.print("INSIRA UM VALOR SE DESEJAR FAZER MAIS DEPÓSITO:");
	saldo.addDeposit(sc.nextDouble());
	System.out.println(saldo);
	
	//SAQUE
	System.out.println();
	System.out.println("--- VALOR DO SAQUE:--");
	System.out.println("(OBS: Taxa de saque 5%):");
	double saque = sc.nextDouble();
	saldo.RemoveDeposit(saque);
	System.out.println();
	System.out.println("valor retirado: -R$" + saque);
	System.out.println(saldo);
	
	sc.close();
	}

}
