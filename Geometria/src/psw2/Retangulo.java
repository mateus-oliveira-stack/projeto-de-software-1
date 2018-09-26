package psw2;

public class Retangulo {
	private double comprimento = 1, largura = 1;
	
	public double calculaArea() {
		double area;
		area = this.comprimento * this.largura;
		return area;
	}
	
	public double calculaPerimetro() {
		double perimetro;
		perimetro = (this.comprimento + this.largura) * 2;
		return perimetro;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		if(comprimento > 0.00 && comprimento < 20.0)
			this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(largura > 0.0 && largura < 20.0)
			this.largura = largura;
	}
	
	
}
