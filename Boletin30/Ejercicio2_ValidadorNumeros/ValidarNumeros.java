import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarNumeros{
    private int numero;

    public void Validar() {
        IValidador validador = new IValidador() {
            @Override
            public boolean validarNumeroPar(int numero) {
                return numero % 2 == 0;
            }
        };

    do {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un número");
            numero = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El número introducido no es válido, intente de nuevo");
            Validar();
        }

        if (numero != 0) {
            if (validador.validarNumeroPar(numero)) {
                System.out.println("El numero " + numero + " es par");
            } else {
                System.out.println("El numero " + numero + " es impar");
            }
            Validar();
        } else if (numero == 0) {
            System.exit(0);
        }
    }while(numero !=0);

    }
}
