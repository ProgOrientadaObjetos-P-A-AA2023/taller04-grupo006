package paquete1;

import paquete2.Calificaciones;

public class Ejecutor {

    public static void main(String[] args) {
        // objeto 1
        Calificaciones calificaciones1 = new Calificaciones();
        calificaciones1.calcularPromedio();
        System.out.printf("%s\n", calificaciones1);

        // objeto 2 
        Calificaciones calificaciones2 = new Calificaciones("Roberto Bustamante", 9.00, 8.50, 10.00);
        calificaciones2.calcularPromedio();
        System.out.printf("%s\n", calificaciones2);

    }
}
