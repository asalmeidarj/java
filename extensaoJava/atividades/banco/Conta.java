
public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private static int numContas = 0;
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.numero = ++numContas;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public static int getNumContas() {
		return numContas;
	}
	

	
	public void sacar(double valor) {
		if(valor > 0) {
			this.saldo -=  valor;
		}	
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}
	}

}
