package figuras;


/**
 * @author lorena
 * @version 1.0
 * Clase circunferencia
 */
public class Circunferencia {
	private double radio;

	/**
	 * Constructor circunferencia
	 * @param radio Radio de la circunferecia
	 */
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	
	/**
	 * Método imprimir información sobre la circunferencia
	 */
	public void imprimir() {
		String color = "rojo";
		System.out.println("Diï¿½metro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * radio * radio;
		System.out.println(area);
	}

	
	/**
	 * Cácula el área de la circunferencia
	 * @return el área de la circunferencia
	 */
	private double calcularArea() {
		return 2 * 3.1416 * radio * radio;
	}

	/**
	 * Compara dos circunferencia
	 * @param considerarDecimales Tiene en cuanta los decimales o no
	 * @param otro La otra circunferencia con la que comparar
	 * @return Si son iguales ambas circunferencias
	 */
	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}

	/**
	 * Recupera el radio
	 * @return radio de la circunferencia
	 */
	public double getRad() {
		return radio;
	}

	/**
	 * Cambia el valor del radio de la circunferencia
	 * @param rad Nuevo radio para la circunferencia
	 */
	public void setRad(double rad) {
		this.radio = rad;
	}
}
