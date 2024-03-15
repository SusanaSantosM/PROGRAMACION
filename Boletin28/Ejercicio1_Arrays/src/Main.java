import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos un scanner para las opciones y las variables
        Scanner scanner = new Scanner(System.in);

        //Creamos un objeto de GestorDeEmpleados
        GestorDeEmpleados gestor = new GestorDeEmpleados();


        //Hacemos un menú para escoger las opciones
        int opcion;

        do{
            System.out.println("Menú de inicio del gestor " +
                    "\n 1.- Añadir empleado" +
                    "\n 2.- Ver lista de empleados" +
                    "\n 3.- Buscar empleado" +
                    "\n 4.- Salir" +
                    "\n Seleccione la opción que desea realizar hoy");
            opcion = scanner.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombre = scanner.next();
                    System.out.println("Ingrese el departamento del empleado: ");
                    String departamento = scanner.next();
                    System.out.println("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();

                    //Creamos un nuevo empleado en Empleado
                    Empleado nuevoEmpleado = new Empleado(nombre, departamento, salario);

                    //Agregamos este nuevo empleado al gestor de GestorDeEmpleados
                    gestor.agregarEmpleado(nuevoEmpleado);

                    //Finalizamos  con
                    System.out.println("Empleado agregado correctamente");
                    break;

                case 2:
                    System.out.println("Lista de Empleados ");
                    gestor.mostrarEmpleado();
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = scanner.next();
                    gestor.buscarEmpleadoPorNombre(nombreEmpleado);
                    break;

                case 4:
                    System.out.println("¡Nos vemos pronto!");
                    break;

                default:
                    System.out.println("¡Error! Opción no válida. Intentelo nuevamente.");
            }
        } while (opcion != 4);
        scanner.close();
    }
}