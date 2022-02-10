
public class Massa extends Prato{
	
	private final double PRECO = 23;
	
	public Massa(String nome) {
		super(nome, 0);
		this.setTipo("Massa");
	}
	
	private Massa(String nome, double preco) {
		super(nome, preco);
		this.setTipo("Massa");
	}
	
	public double getPreco() {
		return PRECO;
	}
	
	public Massa copia() {
		Massa copia = new Massa(this.getNome(), this.getPreco());
		return copia;
	}
	
}
