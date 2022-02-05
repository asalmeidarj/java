
public class ContaPoupancaTeste {
	public static void main(String[] args) {
		ContaPoupanca conta1 = new ContaPoupanca("Pedro", 100000);
		
		VisualizarDadosConta.exibirDados(conta1);
		conta1.SimularRendimento(30);
		for(int i = 0; i < 360; i++) {
			conta1.rendimento();
		}
		VisualizarDadosConta.exibirDados(conta1);
	
	}
}
