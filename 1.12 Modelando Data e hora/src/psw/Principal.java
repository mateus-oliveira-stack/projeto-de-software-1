package psw;

public class Principal {
	
	//questão 5: comparando dois objetos do tipo hora
	public static int comparaHora(int hora1, int minuto1, int hora2, int minuto2) {
		if(hora1 < hora2) 
				return -1;

		if(hora1 == hora2 && minuto1 == minuto2)
			return 0;
		
		return 1;
		
	}
	
	//questão 7: comparando dois objetos do tipo data
	public static int comparaData(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2){
		if(ano1 < ano2)
			return -1;
		if(ano1 > ano2)
			return 1;
		if(ano1 == ano2) {
			if(mes1 == mes2) {
				if(dia1 == dia2) {
					return 0;
				}
				else if(dia1 < dia2) {
					return -1;
				}
				else if(dia1 > dia2) {
					return 1;
				}
			}
			else if(mes1 < mes2) {
				return -1;
			}
			else if(mes1 > mes2) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		
		//instanciamento
		Hora hora = new Hora(8, 20);
		Hora hora2 = new Hora(8, 30);
		Data data = new Data(01,01,2000);
		Data data2 = new Data(01,01,2001);
		//fim instanciamento
		
		
		//imprimindo resultado da questao 5:
		System.out.println("Questão 5: " + comparaHora(hora.getHora(), hora.getMinuto(), hora2.getHora(), hora2.getMinuto()));
		
		//imprimindo resultado da questão 7:
		System.out.println("Questão 7: " + comparaData(data.getDia(), data.getMes(), data.getAno(), data2.getDia(), data2.getMes(), data2.getAno()));
		
		//comparando hora (questão 4)
		if(hora.equals(hora2) == true)
			System.out.println("hora1 = hora2");
		else if(hora.equals(hora2) == false)
			System.out.println("hora1 != hora2");
		//fim comparando hora
		
		
		//comparando a data (questão 7)
		if(data.equals(data2) == true)
			System.out.println("data1 = data2");
		else if(data.equals(data2) == false)
			System.out.println("data1 != data2");
		//fim comparando a data
		
		//imprimir data e hora
		System.out.println("\ndata e hora 1:");
		System.out.println(hora.mostraHora());
		System.out.println(data.mostraData());
		System.out.println("\ndata e hora 2:");
		System.out.println(hora2.mostraHora());
		System.out.println(data2.mostraData());
		
	}

}
