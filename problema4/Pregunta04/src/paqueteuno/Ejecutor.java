
package paqueteuno;

import paquetedos.Cheque;


public class Ejecutor {

    public static void main(String[] args) {
        Cheque cc = new Cheque();
        cc.calcularComisión_del_banco();
        System.out.printf("%s\n", cc);
        Cheque cc2 = new Cheque("Roberto", "Banco de Loja", 25000);
        cc2.calcularComisión_del_banco();
        System.out.printf("%s\n", cc2);

    }
}
