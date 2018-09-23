package psw;

public class Principal {
	
	//verificar se dois objetos do tipo hora são iguais
	public static int comparaHora(int minuto1, int minuto2, int hora1, int hora2) {
		if(hora1 < hora2) 
				return -1;

		if(hora1 == hora2 && minuto1 == minuto2)
			return 0;
		
		return 1;
		
	}

	public static void main(String[] args) {
		
		//instanciamento
		Hora hora = new Hora(8, 20);
		Hora hora2 = new Hora(8, 30);
		Data data = new Data(01,01,2000);
		//fim instanciamento
		
		if(comparaHora(hora.getMinuto(), hora2.getMinuto(), hora.getHora(), hora2.getHora()) == -1){
			System.out.println("hora1 é menor que hora2");
		}
		if(comparaHora(hora.getMinuto(), hora2.getMinuto(), hora.getHora(), hora2.getHora()) == 0){
			System.out.println("hora1 = hora2");
		}
		
		if(comparaHora(hora.getMinuto(), hora2.getMinuto(), hora.getHora(), hora2.getHora()) == 1){
			System.out.println("hora1 é maior que hora2");
		}
		
		//imprimir data e hora
		System.out.println(hora.mostraHora());
		System.out.println(data.mostraData());
	}

}
