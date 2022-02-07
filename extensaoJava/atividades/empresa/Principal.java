
public class Principal {
	public static void main(String[] args) {
		FuncionarioPadrao func = new FuncionarioPadrao("Alessandro", 1000);
		
		Gerente gerente = new Gerente("Gisele", 6000);
		
		gerente.aumentarSalarioPadrao(func, 1000);
		
		VisualizarDadosFuncionario.imprimir(func);
		
		
		
		func.informarFilhos();
		VisualizarDadosFuncionario.imprimir(func);
	
	}
}
