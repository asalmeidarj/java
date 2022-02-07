
public class Gerente extends Funcionario implements IGerente{
	
	private final double BONUS_GERENTE = 500;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
		this.salario = salario;
		this.setAtivo(true);
	}
	
	public void aumentarSalarioPadrao(FuncionarioPadrao funcPadrao, double aumento) {
		if (salario < 0) {
			System.out.println("Não pode reduzir salario do funcionario!");
			return;
		}
		funcPadrao.salario += aumento;		
	}
	public void demitirFuncionarioPadrao(FuncionarioPadrao funcPadrao) {
		
	}
	public void pagarSalarioPadrao(FuncionarioPadrao funcPadrao) {
		
	}
	public void supervisionarPadra(FuncionarioPadrao funcPadrao) {
		
	}
}
