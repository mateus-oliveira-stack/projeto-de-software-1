package psw;

public class Data {
	private int dia, mes, ano;
	
	public void inicializaData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String mostraData() {
		return String.format("Data: %02d/%02d/%02d", this.dia, this.mes, this.ano);
	}
}
