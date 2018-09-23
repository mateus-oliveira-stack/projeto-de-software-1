package psw;

public class TesteHora {
	
	public static void main(String[] args) {
		
		HoraAproximada hora = new HoraAproximada();
		
		hora.inicializaHora(19, 32, 03);
		
		System.out.println("horas: " + hora.getHoras());
		System.out.println("minutos: " + hora.getMinutos());
		System.out.println("segundos: " + hora.getSegundos());
		
		hora.setHoras(19);
		hora.setMinutos(35);
		hora.setSegundos(36);
		System.out.println(hora.mostraHora());
		
		HoraPrecisa horaprecisa = new HoraPrecisa();
		
		horaprecisa.inicializaHora(20, 2, 25, 10);
		System.out.println(horaprecisa.mostraHoraPrecisa());
	}
}
