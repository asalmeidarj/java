
public class VisualizarDadosConta {
	
	public static void exibirDados(ContaCorrente conta) {
		System.out.println("----------------------------------------------");
		exibirDadosComuns(conta);
		exibirDadosEspecificos(conta);
		System.out.println("----------------------------------------------");
	}
	
	public static void exibirDados(ContaEspecial conta) {
		System.out.println("----------------------------------------------");
		exibirDadosComuns(conta);
		exibirDadosEspecificos(conta);
		System.out.println("----------------------------------------------");
	}
	
	public static void exibirDados(ContaPoupanca conta) {
		System.out.println("----------------------------------------------");
		exibirDadosComuns(conta);
		exibirDadosEspecificos(conta);
		System.out.println("----------------------------------------------");
	}
	
	private static void  exibirDadosComuns(Conta conta) {
		System.out.println("Nome do titular: " + conta.getTitular());
		System.out.println("Número da conta: " + conta.getNumero());
		System.out.printf("Saldo: %.2f %n", conta.getSaldo());
	}
	
	private static void exibirDadosEspecificos(ContaCorrente conta) {
		System.out.println("Atendimento: " + conta.ATENDIMENTO);
	}
	private static void exibirDadosEspecificos(ContaEspecial conta) {
		System.out.println("ChequeEspecial: " + conta.getValorChequeEspecial());
		System.out.println("Limite disponível: " + conta.getLimiteDisponivel());
		System.out.println("Atendimento: " + conta.ATENDIMENTO);
	}
	private static void exibirDadosEspecificos(ContaPoupanca conta) {
		System.out.printf("Fator de rendimento ao dia: %.8f %n", conta.FATOR_RENDIMENTO_DIARIO);
	}

}
