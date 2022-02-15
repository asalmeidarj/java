package Lanches;

public class Bolo extends Lanche{
	
	private double preco;
	private String massa;
	private String recheio;
	private String cobertura;
	private double tempoTotal;
	
	public Bolo() {
		
	}
	
	public Bolo(double preco) {
		super();
		this.preco = preco;
				
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void calcularTempo(double distancia) {
		double inteira, resto;
		this.tempoTotal = (distancia * 10) + 30;
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		System.out.println("  Tempo total para entrega: " + (int)inteira + " hora e " + resto + " minutos" );
		System.out.println("------------------------------------------------------------------------------------------------------------------ ");
		
	}
	
	@Override
	public void fecharPedido() {
		
		System.out.println("---------------------Seu pedido foi realizado com sucesso--------------------------------------------------------- ");
		System.out.println("  Seu pedido ficou em: R$ " + getPreco());
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
	}

	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	

}