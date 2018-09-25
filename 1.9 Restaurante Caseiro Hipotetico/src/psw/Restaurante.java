package psw;

public class Restaurante {
	private int qtdBebidas, qtdPratos, qtdClientes, qtdMesas;
	private double precoBebida, precoPrato, lucroTotal;
	private String endereco;
	
	public void calculaLucro(double lucro) {
		this.lucroTotal = this.lucroTotal + lucro;
	}
	
	public double calculaImposto(double porcentImposto) {
		double imposto;
		imposto = (lucroTotal * porcentImposto);
		lucroTotal = lucroTotal - imposto;
		return imposto;
	}
	
	public double calculaConta() {
		double resultado;
		resultado = (this.precoBebida * this.qtdBebidas) + (this.qtdPratos * this.precoPrato);
		resultado = resultado / this.qtdClientes;
		return resultado;
	}
	
	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}


	public int getQtdBebidas() {
		return qtdBebidas;
	}

	public void setQtdBebidas(int qtdBebidas) {
		this.qtdBebidas = qtdBebidas;
	}

	public int getQtdPratos() {
		return qtdPratos;
	}

	public void setQtdPratos(int qtdPratos) {
		this.qtdPratos = qtdPratos;
	}

	public double getPrecoBebida() {
		return precoBebida;
	}

	public double getPrecoPrato() {
		return precoPrato;
	}
	
	
}
