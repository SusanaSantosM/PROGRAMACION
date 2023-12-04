package boletin16;

import boletin16.Biblioteca.Libro;
import boletin16.Biblioteca.Publicacion;
import boletin16.Biblioteca.Revista;

public class Boletin16 {
    public static void main(String[] args) {
        Publicacion ob = new Libro(false,34,"Hoora",1996);
        Publicacion obx = new Revista(52,34,"Face",2010);

        System.out.println(ob);
        System.out.println(obx);
    }
}