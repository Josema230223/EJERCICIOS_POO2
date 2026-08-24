/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Triangulo extends Figura_Geometrica {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        super("Triángulo sin nombre");

        this.punto1 = new Punto(0, 0);
        this.punto2 = new Punto(0, 0);
        this.punto3 = new Punto(0, 0);
    }

    public Triangulo(String nombre, Punto punto1,
            Punto punto2, Punto punto3) {

        super(nombre);

        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public double calcularArea() {
        double x1 = punto1.getX();
        double y1 = punto1.getY();

        double x2 = punto2.getX();
        double y2 = punto2.getY();

        double x3 = punto3.getX();
        double y3 = punto3.getY();

        return Math.abs(
                x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2)
        ) / 2;
    }

    @Override
    public boolean esRegular() {
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);

        return lado1 == lado2 && lado2 == lado3;
    }

    @Override
    public String toString() {
        return "Triángulo: " + getNombre()
                + " tiene 3 Puntos: "
                + getPunto1().toString() + ", "
                + getPunto2().toString() + ", "
                + getPunto3().toString();
    }
}