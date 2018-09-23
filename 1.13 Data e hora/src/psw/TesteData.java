package psw;

public class TesteData {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		
		data.inicializaData(23, 9, 2018);
		
		System.out.println("Dia: " + data.getDia());
		System.out.println("Mês:" + data.getMes());
		System.out.println("Ano" + data.getAno());
		
		data.setDia(20);
		data.setMes(9);
		data.setAno(2018);
		
		System.out.println(data.mostraData());
		
		
	}
}
