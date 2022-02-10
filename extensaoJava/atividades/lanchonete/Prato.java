
public abstract class Prato {
	
	private String tipo;
	private String nome;
	private double preco;
	
	public Prato(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getTipo() {
		return tipo;
	}
	public String getNome() {
		return this.nome;
	}
	public double getPreco() {
		return this.preco;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public abstract Prato copia();
	
	
	
}
