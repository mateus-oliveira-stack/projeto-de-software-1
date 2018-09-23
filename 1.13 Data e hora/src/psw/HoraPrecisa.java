package psw;

public class HoraPrecisa extends HoraAproximada {
	private int centesimos;
	
	public void inicializaHora(int hora, int min, int seg, int cen) {
		this.horas = hora;
		this.minutos = min;
		this.segundos = seg;
		this.centesimos = cen;
		
	}

	public int getCentesimos() {
		return centesimos;
	}

	public void setCentesimos(int centesimos) {
		this.centesimos = centesimos;
	}
	
	public String mostraHoraPrecisa() {
		return String.format("Hora precisa: %02d:%02d:%02d:%02d", this.horas, this.minutos, this.segundos, this.centesimos);
	}
	
}
