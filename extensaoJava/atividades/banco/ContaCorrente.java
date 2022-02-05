
public class ContaCorrente extends Conta{
	public final String ATENDIMENTO = "Não prioritário";
	
	public ContaCorrente(String titular, double saldo) {
		super(titular, saldo);
	}
	
	public void sacar(double valor) {
		
		if(valor < 0) {
			Imprimir.texto(MsgErro.SAQUE_NEGATIVO_NULO);
		}
		
		if(valor <= getSaldo()) {
			super.sacar(valor);
			Imprimir.texto(MsgSucesso.SAQUE);
		} else {
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
	
}
