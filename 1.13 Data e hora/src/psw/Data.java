package psw;

public class Data {
	private int dia, mes, ano;
	
	public void inicializaData(int dia, int mes, int ano) {
		if(dia < 1 || dia > 31 || mes < 1 || mes > 12|| ano < 1) {
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
		}
		else {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	
	public boolean dataEValida() {
		if(this.dia > 31 || this.dia < 1)
			return false;
		if(this.mes < 1 || this.mes > 12)
			return false;
		if(this.ano < 1)
			return false;
		
		return true;
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
		if(this.dia == 0 || this.mes == 0 || this.ano == 0)
			return String.format("Data inválida");
		
		return String.format("Data: %02d/%02d/%02d", this.dia, this.mes, this.ano);
	}
}
