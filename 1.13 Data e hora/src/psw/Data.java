package psw;

public class Data {
	private int dia, mes, ano;
	
	public void inicializaData(int dia, int mes, int ano) {
		
		if(dia < 1 || dia > 31 || mes < 1 || mes > 12|| ano < 1) {
			this.dia = 0;
			this.mes = 0;
			this.ano = 0;
		}
		
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
			if(dia > 30) {
				this.dia = 0;
				this.mes = 0;
				this.ano = 0;
			}
		}
		else if(mes == 2) {
			if(ano % 4 == 0) {
				if(dia > 29) {
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
			else if(ano % 4 != 0) {
				if(dia > 28) {
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
		}
		else {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}
	
	public void duplicaData(Object obj) {
		Data other = (Data) obj;
		this.dia = other.dia;
		this.ano = other.ano;
		this.mes = other.mes;
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
		
		String mesExtenso = null;
		
		if(this.mes == 1)
			mesExtenso = "janeiro";
		if(this.mes == 2)
			mesExtenso = "fevereiro";
		if(this.mes == 3)
			mesExtenso = "março";
		if(this.mes == 4)
			mesExtenso = "abril";
		if(this.mes == 5)
			mesExtenso = "maio";
		if(this.mes == 6)
			mesExtenso = "junho";
		if(this.mes == 7)
			mesExtenso = "julho";
		if(this.mes == 8)
			mesExtenso = "agosto";
		if(this.mes == 9)
			mesExtenso = "setembro";
		if(this.mes == 10)
			mesExtenso = "outubro";
		if(this.mes == 11)
			mesExtenso = "novembro";
		if(this.mes == 12)
			mesExtenso = "dezembro";
			
		
		return String.format("Data: %02d de %s %02d", this.dia, mesExtenso, this.ano);
	}
}
