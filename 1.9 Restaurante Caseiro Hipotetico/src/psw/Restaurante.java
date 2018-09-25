package psw;

public class Restaurante {
	
	public static void main(String[] args) {
		
		int i, qtdMesas = 50;
		
		MesaDeRestaurante mesa[] = new MesaDeRestaurante[qtdMesas];
		
		for(i = 0; i < qtdMesas; i++) {
			mesa[i] = new MesaDeRestaurante();
		}
		
		mesa[0].adicionaAoPedido(5, 5);
		mesa[0].setQtdClientes(10);
		mesa[0].setPrecoBebida(5.00);
		mesa[0].setPrecoPrato(10.00);
		
		System.out.println("Total da mesa: " + mesa[0].calculaTotal());
		System.out.println("Total por cliente: " + mesa[0].divideConta());
		
		for(i = 0; i < 50; i++) {
			mesa[i].adicionaAoPedido(5, 5);
			mesa[i].setQtdClientes((i+1));
			mesa[i].setPrecoBebida(5.00);
			mesa[i].setPrecoPrato(10.00);
			System.out.println("\nTotal da mesa " + (i+1));
			System.out.println("Total da mesa: " + mesa[i].calculaTotal());
			System.out.println("Total por cliente: " + mesa[i].divideConta());
		}

	}
}
