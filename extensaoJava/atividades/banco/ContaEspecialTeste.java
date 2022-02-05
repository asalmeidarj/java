
public class ContaEspecialTeste {
	public static void main(String[] args) {
		
		ContaEspecial conta3 = new ContaEspecial("Giovana", 1000, 2000);
		
		conta3.sacar(1500);
		VisualizarDadosConta.exibirDados(conta3);
		conta3.sacar(4000);
		conta3.depositar(1000);
		
		VisualizarDadosConta.exibirDados(conta3);
		
	}
}
