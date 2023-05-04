
package paquetedos;

public class CaracteristicasV {

    private int cédula_del_dueño;
    private String marca_de_vehículo;
    private int año_de_fabricación;
    private double valor_de_vehículo;
    private double valor_de_la_matricula;

    public CaracteristicasV() {
        cédula_del_dueño = 1105446544;
        marca_de_vehículo = "BMW";
        año_de_fabricación = 2004;
        valor_de_vehículo = 15000;
    }
    public CaracteristicasV(int cedula, String marca, int anio, double valor) {
        cédula_del_dueño = cedula;
        marca_de_vehículo = marca;
        año_de_fabricación = anio;
        valor_de_vehículo = valor;
    }

    public int obtenerCédula_del_dueño() {
        return cédula_del_dueño;
    }

    public void establecerCédula_del_dueño(int x) {
        cédula_del_dueño = x;
    }

    public String obtenerMarca_de_vehículo() {
        return marca_de_vehículo;
    }

    public void establecerMarca_de_vehículo(String x) {
        marca_de_vehículo = x;
    }

    public int obtenerAño_de_fabricación() {
        return año_de_fabricación;
    }

    public void establecerAño_de_fabricación(int x) {
        año_de_fabricación = x;
    }

    public double obtenerValor_de_vehículo() {
        return valor_de_vehículo;
    }

    public void establecerValor_de_vehículo(double x) {
        valor_de_vehículo = x;
    }

    public double obtenerValor_de_la_matricula() {
        return valor_de_la_matricula;
    }

    public void calcularValor_de_la_matricula() {
        double x;
        x = 0.002 * valor_de_vehículo;
        valor_de_la_matricula = x * año_de_fabricación;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      Caracteristicas del vehiculo.
                                      Numero de cedula del dueño: %d
                                      Marca del vehiculo: %s
                                      A\u00f1o del vehiculo: %d
                                      valor del vehiculo: %.2f
                                      valor de la matricula: %.2f\n
                                      """, 
                cédula_del_dueño, marca_de_vehículo,
                año_de_fabricación, valor_de_vehículo,
                valor_de_la_matricula);
        return cadena;

    }
}
