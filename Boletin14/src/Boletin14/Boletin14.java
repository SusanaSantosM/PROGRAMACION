package Boletin14;

import Com.susana.Partes.Monitor;
import Com.susana.Partes.Procesador;
import Com.susana.Partes.Teclado;

public class Boletin14 {
    public static void main(String[] args) {
            Teclado obT  = new Teclado("logitech");
            Procesador obP = new Procesador(360);
            Monitor obM = new Monitor(16);
            Ordenador ord = new Ordenador(obM, obT, obP, 600);

            System.out.println(ord);
/*
        Monitor obM = new Monitor();
        Procesador obP = new Procesador();
        Teclado obT = new Teclado();
        Ordenador ob = new Ordenador (obM,obT,obP, 600);
*/
        }
}