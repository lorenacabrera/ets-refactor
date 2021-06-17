package figuras;

/**
 * Clase principal del programa
 * @author lorena
 * @version 1.0
 */
public class Test {
	
	/**
	 * Método que ejecurará el programa
	 * @param args No son necesarios para este programa
	 */
	public static void main(String[] args) {
		Circunferencia c1 = new Circunferencia(5.5);
		Circunferencia c2 = new Circunferencia(10.1);
		Circunferencia c3 = new Circunferencia(10.9);

		if (c2.esIgual(false, c3))
			System.out.println("c2 y c3: iguales sin considerar decimales");

		if (c2.esIgual(true, c3))
			System.out.println("c2 y c3: iguales considerando decimales");
	}

}
