package psw;

public class TesteData {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		
		data.inicializaData(23, 2, 2018);
		
		System.out.println("Dia: " + data.getDia());
		System.out.println("Mês: " + data.getMes());
		System.out.println("Ano: " + data.getAno());
		System.out.println(data.mostraData());
		
		data.setDia(20);
		data.setMes(9);
		data.setAno(2018);
		
		System.out.println(data.mostraData());
		
		
	}
}
