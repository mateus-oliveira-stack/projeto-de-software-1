package psw2;

public class Principal {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Perimetro = " + retangulo.calculaPerimetro());
		System.out.println("Área = " + retangulo.calculaArea());
		
		retangulo.setComprimento(15.0);
		retangulo.setLargura(10.0);
		
		System.out.println("\nPerimetro = " + retangulo.calculaPerimetro());
		System.out.println("Área = " + retangulo.calculaArea());
		
		retangulo.setComprimento(-20.00);
		retangulo.setLargura(20.0);
		System.out.println("\nPerimetro = " + retangulo.calculaPerimetro());
		System.out.println("Área = " + retangulo.calculaArea());
	}

}
