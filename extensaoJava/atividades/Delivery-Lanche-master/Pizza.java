package Lanches;

public class Pizza extends Massa{
	private double preco;
	

	public Pizza() {
			
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
