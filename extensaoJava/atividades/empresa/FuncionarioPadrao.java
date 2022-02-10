
public class FuncionarioPadrao extends Funcionario implements IFuncionarioPadrao {
	public FuncionarioPadrao(String nome, double salario) {
		super(nome, salario);
		this.setCargo("Funcionário Padrão");
	}
	
	public void baterPonto() {	
		
	}
}
