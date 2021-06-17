package figuras;

public class Circunferencia {
	private static final double PI = 3.1416;
	private double radio;

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public void imprimir() {
		String color = "rojo";
		double d = 2 * radio;
		System.out.println("Di�metro: " + d);
		System.out.println("Color: " + color);
		double area = calcularArea();
		System.out.println(area);
	}

	private double calcularArea() {
		return 2 * PI * radio * radio;
	}

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

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}
}
