/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Principal {

    public static void main(String[] args) {

        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(0, 3);

        Triangulo triangulo = new Triangulo(
                "Triángulo de prueba", p1, p2, p3);

        SuperficiePlana superficie = new SuperficiePlana();

        System.out.println(triangulo);
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("¿Es regular?: " + triangulo.esRegular());

        superficie.mostrarArea(triangulo);
    }
}
