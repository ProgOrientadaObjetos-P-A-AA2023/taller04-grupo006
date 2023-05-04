package paquete1;

import paquete2.Calificacion;

public class Ejecutor {

    public static void main(String[] args) {
        // objeto 1
        Calificacion calificaciones1 = new Calificacion();
        calificaciones1.calcularPromedio();
        System.out.printf("%s\n", calificaciones1);

        // objeto 2 
        Calificacion calificaciones2 = new Calificacion
        ("Roberto Bustamante", 9.00, 8.50, 10.00);
        calificaciones2.calcularPromedio();
        System.out.println("--------------------------------");
        System.out.printf("%s\n", calificaciones2);

    }
}
