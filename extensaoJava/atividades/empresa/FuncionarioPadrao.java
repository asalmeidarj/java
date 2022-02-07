
public class FuncionarioPadrao extends Funcionario implements IFuncionarioPadrao {
	public FuncionarioPadrao(String nome, double salario) {
		super(nome, salario);
		this.setCargo("Funcionario Padrao");
	}
	
	public void baterPonto() {	
		
	}
}
