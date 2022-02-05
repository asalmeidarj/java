
public class ContaEspecial extends Conta {
	
	public final String ATENDIMENTO = "Prioritário";
	private double valorChequeEspecial;
	private double limiteDisponivel;
			
	public ContaEspecial(String titular, double saldo, double valorChequeEspecial) {
		super(titular, saldo);
		this.valorChequeEspecial = valorChequeEspecial;
		this.limiteDisponivel = valorChequeEspecial;
	}
	
	public double getValorChequeEspecial() {
		return this.valorChequeEspecial;
	}
	
	public double getLimiteDisponivel() {
		return this.limiteDisponivel;
	}
	
	public void setLimiteDisponivel(double valor) {
		this.limiteDisponivel = valor;
	}
	
	public void incrementarLimiteDisponivel(double valor) {
		this.limiteDisponivel += valor;
	}
	
	public void sacar(double valor) {
		
		if(valor <= 0) {
			Imprimir.texto(MsgErro.SAQUE_NEGATIVO_NULO);
			return;
		}	
		
		if(getSaldo() +  getValorChequeEspecial() >= valor) {
			super.sacar(valor);
			Imprimir.texto(MsgSucesso.SAQUE);
			
			if(this.getSaldo() < 0) {
				setLimiteDisponivel(getValorChequeEspecial() + getSaldo());
				Imprimir.texto("Você utilizou seu cheque especial!");
			}
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
		
		if(getSaldo() < 0) {
			incrementarLimiteDisponivel(valor);
		} else {
			setLimiteDisponivel(this.valorChequeEspecial);
		}
	}
	
}
