
public class ContaPoupanca extends Conta {
	
	public final double FATOR_RENDIMENTO_DIARIO = 0.000166667;
	
	
	public ContaPoupanca(String titular, double saldo) {
		super(titular, saldo);
	}
		
	public void sacar(double valor) {
	
		if(valor <= 0) {
			Imprimir.texto(MsgErro.SAQUE_NEGATIVO_NULO);
			return;
		}	
		
		if(this.getSaldo() >= valor) {
			super.sacar(valor);
			Imprimir.texto(MsgSucesso.SAQUE);
		}else {
			Imprimir.texto(MsgErro.SAQUE_SALDO_INSUFICIENTE);
		}
		
	
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			Imprimir.texto(MsgErro.DEPOSITO_NEGATIVO_NULO);
			return;
		}
		
		super.depositar(valor);
		Imprimir.texto(MsgSucesso.DEPOSITO);
	}
	
	public void rendimento() {
		this.depositar(this.getSaldo()*(this.FATOR_RENDIMENTO_DIARIO));
	}
	 
	public void SimularRendimento(int dias) {
		double novoSaldo = this.getSaldo() * Math.pow(this.FATOR_RENDIMENTO_DIARIO + 1, dias);
		novoSaldo = converterParaMoeda(novoSaldo);
		Imprimir.texto("Saldo em " + dias + " dia(s): " + novoSaldo);
	}
	
	public double converterParaMoeda(double valor) {
		double base = (int) (valor * 100);
		return base / 100; 
	}

}
