import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Boletin02_4 {
    public static void main(String[] args) {
     float num1,num2,suma,resta,producto,cociente;
     //Ingresamos datos
     Scanner sc = new Scanner(System.in);
     System.out.println("teclea num1 :");
     num1 = sc.nextFloat();
     System.out.println("teclea num2 :");
     num2 = sc.nextFloat();

     //Hacemos operaciones
     suma=num1+num2;
     resta=num1-num2;
     producto=num1*num2;
     cociente=num1/num2;

     //Mostramos resultados
     System.out.println("suma="+suma);
     System.out.println("resta="+resta);
     System.out.println("producto="+producto);
     System.out.println("cociente="+cociente);

//Tambien podemos mostrar los resultados asi:
//System.out.println("Resultados:"+"\nSuma = " +suma +"\nResto = "+resto+"\nProducto = "+producto+"\nCociente = "+cociente);

    }
}