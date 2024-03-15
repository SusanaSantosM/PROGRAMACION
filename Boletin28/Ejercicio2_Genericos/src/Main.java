public class Main {
    public static void main(String[] args) {

        //Método para el tipo String
        Caja<String> cajaString = new Caja<>();
        cajaString.agregar("Nombre");
        System.out.println("Contenido en la caja: "+cajaString.obtener());

        //Método para el tipo Integer
        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.agregar(150);
        System.out.println("Contenido de la caja: "+cajaEntero.obtener());

        //Método para el tipo Empleado
        Empleado empleado =  new Empleado("Jose","RRHH",1500);
        Caja<Empleado> cajaEmpleado = new Caja<>();
        cajaEmpleado.agregar(empleado);

        //Creamos objeto empleadoRecuperado para alamacenar la nueva variable
        Empleado empleadoRecuperado = cajaEmpleado.obtener();
        System.out.println("Empleados en la caja: "+empleadoRecuperado);
    }
}