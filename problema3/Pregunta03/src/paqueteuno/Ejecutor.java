
package paqueteuno;

import paquetedos.CaracteristicasV;

public class Ejecutor {

    public static void main(String[] args) {
        CaracteristicasV cv = new CaracteristicasV();
        cv.calcularValor_de_la_matricula();
        System.out.printf("%s\n", cv);
        
        CaracteristicasV cv2 = new CaracteristicasV(1103291082, "Tesla", 2005,
                25000);
        cv2.calcularValor_de_la_matricula();
        System.out.printf("%s\n", cv2);
    }
}
