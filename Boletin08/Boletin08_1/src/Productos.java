public class Productos{
    public void mostrarProductos(String nombre, int ventas) {

        if (ventas <= 100) {
            System.out.println(nombre + "Bajo consumo");
        } else if (ventas>100 && ventas<=500){
            System.out.println(nombre + "Consumo medio");
        }else if (ventas>500 && ventas<=1000) {
            System.out.println(nombre + "Alto consumo");
        }else if (ventas>1000)
            System.out.println(nombre+ "Primera necesidad");


    }
}
