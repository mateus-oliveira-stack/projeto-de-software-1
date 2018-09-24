package psw;

public class TesteData {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		Data data2 = new Data();
		
		data.inicializaData(23, 2, 2018);
		
		System.out.println("Dia: " + data.getDia());
		System.out.println("Mês: " + data.getMes());
		System.out.println("Ano: " + data.getAno());
		System.out.println(data.mostraData());
		
		//mudando a data
		data.setDia(20);
		data.setMes(9);
		data.setAno(2018);
		
		//mostrando a data2 inicialmente
		data2.inicializaData(20, 1, 2018);
		System.out.println(data2.mostraData());
		
		if(data.vemAntes(data2) == false)
			System.out.println("data 1 vem depois");
		else
			System.out.println("data 1 vem antes");
		
		//duplicando data para data2
		data2.duplicaData(data);
		System.out.println(data2.mostraData());
		
		
	}
}
