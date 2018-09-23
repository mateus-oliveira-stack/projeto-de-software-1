package psw;

public class HoraAproximada {
	private int horas, minutos, segundos;
	
	public void inicializaHora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public String mostraHora() {
		return String.format("Hora: %02d:%02d:%02d", this.horas, this.minutos, this.segundos);
	}
	
}
