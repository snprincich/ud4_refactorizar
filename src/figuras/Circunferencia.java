package figuras;

public class Circunferencia {

    /**
     * @return the rad
     */
    public double getRad() {
        return rad;
    }

    /**
     * @param rad the rad to set
     */
    public void setRad(double rad) {
        this.rad = rad;
    }
    private double rad;

    public Circunferencia(double radio) {
        this.rad = radio;
    }

    public void imprimir() {
        String color = "rojo";
        System.out.println("Di�metro: " + 2 * getRad());
        System.out.println("Color: " + color);
        double area = calcularArea();
        System.out.println(area);
    }

    private double calcularArea() {
        double area = 2 * PI * getRad() * getRad();
        return area;
    }
    private static final double PI = 3.1416;

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.getRad();
        double radio2 = otro.getRad();
        if (considerarDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
