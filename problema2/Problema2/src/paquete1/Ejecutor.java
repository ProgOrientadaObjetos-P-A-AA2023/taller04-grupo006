package paquete1;

import paquete2.CalcularSueldo;

public class Ejecutor {

    public static void main(String[] args) {
        CalcularSueldo calcularSueldo1 = new CalcularSueldo();
        calcularSueldo1.calcularSueldoTotal();
        System.out.printf("%s\n", calcularSueldo1);

        CalcularSueldo calcularSueldo2 = new CalcularSueldo
        ("Roberto Alejandro", "Bustamante Zapata", 11010446, 500);
        calcularSueldo2.calcularSueldoTotal();
        System.out.println("--------------------------------");
        System.out.printf("%s\n", calcularSueldo2);

    }

}
