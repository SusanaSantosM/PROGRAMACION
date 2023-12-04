import java.util.Scanner;
import javax.swing.JOptionPane;
public class Boletin17 {
    public static void main(String[] args) {
        Persoa per =  new Persoa("Karla","Aguilar",45962);

        Scanner sc = new Scanner(System.in);
        //ponemos el sop antes para indicar lo que pedimos
        System.out.println("Ingrese numero cuenta: ");
        //ponemos sc.nextlong() para poder sobreescribir el dato.
        Conta c = new Conta(sc.nextLong(),per);

        Scanner monto = new Scanner(System.in);
        System.out.println("Ingrese el monto del dinero: ");
        c.ingresar(monto.nextDouble());
        System.out.println("Ingrese el monto que quiere retirar: ");
        c.retirar(monto.nextDouble());

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoger una opción"
                +"\n1.Ingresar"
                + "\n2.Retirar"
                + "\n3.Visualizar Saldo"
                + "\n4.Salir"));

        switch(opcion){

        }
    }
}