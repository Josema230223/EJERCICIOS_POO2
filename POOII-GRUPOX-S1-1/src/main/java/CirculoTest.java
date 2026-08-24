/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class CirculoTest {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();

        System.out.println("El radio de circulo por defecto es " + c1.getRadio());
        System.out.println("El área de circulo por defecto es " + c1.getArea());

        Circulo c2 = new Circulo(6.55);
        System.out.println("El radio de circulo por sobrecarga  es " + c2.getRadio());
        System.out.println("El área de circulo por sobrecarga es " + c2.getArea());

        Circulo c3 = new Circulo(10.0, "verde");
        System.out.println("Radio: " + c3.getRadio());
        System.out.println("Color: " + c3.getColor());
        System.out.println("Área: " + c3.getArea());
    
    System.out.println(c1);
    
    }
}
