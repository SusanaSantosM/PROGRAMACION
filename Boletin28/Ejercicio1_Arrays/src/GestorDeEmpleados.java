import java.util.ArrayList;
import java.util.List;

public class GestorDeEmpleados{
    private ArrayList<Empleado>listaEmpleados;

    //Constructor
    public GestorDeEmpleados(){
        listaEmpleados = new ArrayList<>();
    }

    //Métodos para añadir empleados
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    //Método que muestra la infromación de toods los empleados
    public void mostrarEmpleado(){
        for(Empleado empleado : listaEmpleados){
            System.out.println("Empleado: "+empleado.getNombre()+ " del departamento "
            +empleado.getDepartamento()+" con salario "+empleado.getSalario());
            System.out.println();
        }
    }

    //Método para buscar empleados por su nombre y muestra su información
    public void buscarEmpleadoPorNombre(String nombre){
        boolean encontrado = false;
        for(Empleado empleado : listaEmpleados){
            if(empleado.getNombre().equals(nombre)){
                System.out.println("\n Empleado: "+ empleado.getNombre()+
                        "\n Departamento: "+empleado.getDepartamento()+
                        "\n Salario: "+empleado.getSalario()+"\n");
                encontrado = true;
                break;
            }
        } if (!encontrado){
            System.out.println("No se encontró a ningún empleado con ese nombre.");
        }
    }
}
