
public class ContaCorrenteTeste{
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente("Alessandro Almeida", 40000);
		
		conta.depositar(3000);
		conta.sacar(10000);
		VisualizarDadosConta.exibirDados(conta);
	}
}
