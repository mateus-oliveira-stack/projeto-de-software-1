package psw;

public class Hora {
	private int hora;
	private int minuto;
	

	public Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public String mostraHora() {
		return String.format("Hora: %02d:%02d", this.hora, this.minuto);
	}
	

	
}
