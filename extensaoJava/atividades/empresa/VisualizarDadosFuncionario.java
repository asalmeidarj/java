
public class VisualizarDadosFuncionario {
	public static void imprimir(Funcionario func) {
		
		System.out.println("---------------------------------------------------");
		System.out.printf("Nome do funcionario: %s%n", func.getNome());
		System.out.printf("Cargo do funcionario: %s%n", func.getCargo());
		System.out.printf("Salario do funcionario: %s%n", func.getSalario());
		System.out.printf("Salario bruto do funcionario: %s%n", func.getSalarioBruto());
		System.out.printf("funcionario tem filhos? %s%n", func.hasFilho());
		System.out.printf("funcionario esta ativo? : %s%n", func.isAtivo());
		System.out.println("---------------------------------------------------");
	}
}
