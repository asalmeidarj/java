
public abstract class Funcionario {
	private String nome;
	private String cargo;
	protected double salario;
	private boolean filho;
	private boolean ativo;
	private boolean trabalho;
	
	final double BONUS_FAMILIA = 350.5;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		this.ativo = true;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean getTrabalho() {
		return this.trabalho;
	}
	
	public void informarFilhos() {	
		this.setFilho(true);
	}
	
	public void setFilho(boolean filho) {
		this.filho = filho;
	}
	
	public double getSalarioBruto() {
		if(hasFilho()) {
			return this.salario + BONUS_FAMILIA;
		}
		return this.salario;
	}
	
	public boolean hasFilho() {
		return this.filho;
	}
	
	public void trabalhar() {
		this.trabalho = true;
	}
	
	

	
	
	
	
}
