/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Punto {
    private double x;
    private double y;

    public Punto() {
        this(0, 0);
    }

    public Punto(double coordenadaX, double coordenadaY) {
        this.x = coordenadaX;
        this.y = coordenadaY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia() {
        return calcularDistancia(new Punto(0, 0));
    }

    public double calcularDistancia(Punto otroPunto) {
        double diferenciaX = this.x - otroPunto.x;
        double diferenciaY = this.y - otroPunto.y;

        return Math.sqrt(diferenciaX * diferenciaX
                + diferenciaY * diferenciaY);
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: "
                + x + "," + y;
    }
}
