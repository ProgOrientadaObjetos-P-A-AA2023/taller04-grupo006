package paquete2;

public class CalcularSueldo {

    private String nombre;
    private String apellido;
    private int cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public CalcularSueldo() {
        nombre = "Oliver Saraguro";
        apellido = "Oliver Saraguro";
        cedula = 1727135996;
        sueldoBasico = 450.00;

    }

    public CalcularSueldo(String n, String a, int c, double sB) {
        nombre = n;
        apellido = a;
        cedula = c;
        sueldoBasico = sB;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerCedula(int c) {
        cedula = c;
    }

    public void establecerSueldoBasico(double sB) {
        sueldoBasico = sB;
    }

    public void calcularSueldoTotal() {
        double iva = (sueldoBasico * 20) / 100;
        sueldoTotal = sueldoBasico + iva;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Sueldo de un Profesor\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %d\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f",
                nombre,
                apellido,
                cedula,
                sueldoBasico,
                sueldoTotal);
        return cadena;
    }

}
