package entities;

public class acoont {

	public static final double TAXA =0.05;
	
	private int numero;
	private String name;
	private double deposit;
	
	
	public int getNumero() {
		return numero;
	}

	public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}
 
	
	public acoont(int numero, String name, double deposit) {
		this.numero = numero;
		this.name = name;
		this.deposit = deposit;
	}

	
	
	public double addDeposit(double deposito) {
		return this.deposit += deposito;
	}
	
	public double RemoveDeposit(double deposito) {
		double calc = deposito * TAXA;
		deposito = deposito + calc;
		return this.deposit -= deposito;
	}
	
	public String toString() {
		return "AGÊNCIA: -" 
				+ numero 
				+ "- / Nome titular: (" 
				+ name 
				+ ") / SALDO NA CONTA: R$" 
				+ String.format("%.2f", deposit)
				+ " Reais";
	}
}
