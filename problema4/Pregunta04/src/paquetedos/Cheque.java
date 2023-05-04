package paquetedos;

public class Cheque {

    private String nombre_del_cliente;
    private String nombre_del_banco;
    private double valor_del_cheque;
    private double comisión_del_banco;

    public Cheque() {
        nombre_del_cliente = "Oliver";
        nombre_del_banco = "Banco de Pichicha";
        valor_del_cheque = 15000;
    }

    public Cheque(String nombre, String nombreBanco, double cheque) {
        nombre_del_cliente = nombre;
        nombre_del_banco = nombreBanco;
        valor_del_cheque = cheque;
    }

    public String obtenerNombre_del_cliente() {
        return nombre_del_cliente;
    }

    public void establecerNombre_del_cliente(String x) {
        nombre_del_cliente = x;
    }

    public String obtenerNombre_del_banco() {
        return nombre_del_banco;
    }

    public void establecerNombre_del_banco(String x) {
        nombre_del_banco = x;
    }

    public double obtenerValor_del_cheque() {
        return valor_del_cheque;
    }

    public void establecerValor_del_cheque(double x) {
        valor_del_cheque = x;
    }

    public double obtenerComisión_del_banco() {
        return comisión_del_banco;
    }

    public void calcularComisión_del_banco() {
        comisión_del_banco = 0.003 * valor_del_cheque;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      Informacion del Banco.
                                      Nombre del cliente: %s
                                      Nombre del banco: %s
                                      Valor del cheque : %.2f
                                      Comision del banco: %.2f
                                      
                                      """,
                nombre_del_cliente, nombre_del_banco,
                valor_del_cheque, comisión_del_banco);
        return cadena;

    }
}
