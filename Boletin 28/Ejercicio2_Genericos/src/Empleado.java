public class Empleado {
    private String nombre;
    private String departamento;
    private double salario;

    // Constructor
    public Empleado(String nombre, String departamento, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado "+ nombre + '\'' +
                ", departamento '" + departamento + '\'' +
                ", salario " + salario;
    }
}
