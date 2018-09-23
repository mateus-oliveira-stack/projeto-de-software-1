package psw;

public class DataHora {
	
	public static void main(String[] args) {
		
		HoraAproximada hora = new HoraAproximada();
		Data data = new Data();
		
		hora.inicializaHora(20, 10, 25);
		data.inicializaData(25, 10, 1990);
		
		System.out.println(data.mostraData() + "\n" + hora.mostraHora());
	}
}
