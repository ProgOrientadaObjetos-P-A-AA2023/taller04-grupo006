package paquete2;

public class Calificacion {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioCalificaciones;

    public Calificacion() {
        nombreEstudiante = "Oliver Saraguro";
        calificacionMateria1 = 8.80;
        calificacionMateria2 = 9.80;
        calificacionMateria3 = 9.00;
    }

    public Calificacion(String n, double nota1, double nota2, double nota3) {
        nombreEstudiante = n;
        calificacionMateria1 = nota1;
        calificacionMateria2 = nota2;
        calificacionMateria3 = nota3;
    }

    public void establecerNombreEstudiante(String n) {
        nombreEstudiante = n;
    }

    public void establecerCalificacionMateria1(double nota1) {
        calificacionMateria1 = nota1;
    }

    public void establecerCalificacionMateria2(double nota2) {
        calificacionMateria2 = nota2;
    }

    public void establecerCalificacionMateria3(double nota3) {
        calificacionMateria3 = nota3;
    }

    public void calcularPromedio() {
        double suma = calificacionMateria1 + calificacionMateria2 
                + calificacionMateria3;
        promedioCalificaciones = suma / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double obtenerCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double obtenerCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double obtenerPromedio() {
        return promedioCalificaciones;
    }

    @Override
    public String toString() {
        String cadena = String.format(""
                + "Calificaciones del Estudiante\n"
                + "Nombre Estudiante: %s\n"
                + "Calificacion Materia 1: %.2f\n"
                + "Calificacion Materia 2: %.2f\n"
                + "Calificacion Materia 3: %.2f\n"
                + "Promedio de Calificaciones: %.2f",
                nombreEstudiante,
                calificacionMateria1,
                calificacionMateria2,
                calificacionMateria3,
                promedioCalificaciones
        );

        return cadena;
    }

}
