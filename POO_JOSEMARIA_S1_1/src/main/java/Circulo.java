/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Circulo {

    private double radio = 12.5;
    private String color = "azul";

    public Circulo() {

    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;

    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circulo(double radio) {

        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return radio * radio * Math.PI;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Circulo{radio=" + radio
                + ", color='" + color + '\''
                + ", area=" + getArea() + "}";
    }

}
