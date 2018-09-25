package psw;

public class MesaDeRestaurante {
	private int qtdBebidas, qtdPratos, qtdClientes;
	private double precoPrato, precoBebida;
	
	public void adicionaAoPedido(int qtdPratos, int qtdBebidas) {
		this.qtdBebidas = this.qtdBebidas + qtdBebidas;
		this.qtdPratos = this.qtdPratos + qtdPratos;
	}
	public void zeraPedidos() {
		this.qtdBebidas = 0;
		this.qtdPratos = 0;
	}
	
	public double calculaTotal() {
		double resultado;
		resultado = (this.qtdPratos * this.precoPrato) + (this.qtdBebidas * this.precoBebida);
		return resultado;
	}
	
	public double divideConta() {
		double resultado;
		resultado = ((this.qtdPratos * this.precoPrato) + (this.qtdBebidas * this.precoBebida)) / this.qtdClientes;
		return resultado;
	}
	public double getPrecoPrato() {
		return precoPrato;
	}
	public void setPrecoPrato(double precoPrato) {
		this.precoPrato = precoPrato;
	}
	public double getPrecoBebida() {
		return precoBebida;
	}
	public void setPrecoBebida(double precoBebida) {
		this.precoBebida = precoBebida;
	}
	public int getQtdClientes() {
		return qtdClientes;
	}
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
}
