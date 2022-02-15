package Lanches;

public class Macarrao extends Massa{
	private String molho;
	private String tipo;
	private double preco;
	
	public Macarrao() {
		
	}
	
	public String molho() {
		return molho;
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

	@Override
	public void fecharPedido() {
		System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		System.out.println("  Seu pedido ficou em: R$ " + getPreco());
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		
	}

	

	

	
	

}
