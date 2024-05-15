package Personajes;

import java.util.ArrayList;

public class Personajes {

    private ArrayList<Personaje> personajes = new ArrayList<Personaje>();

    public void agregarPersonaje(Personaje personaje){
        personajes.add(personaje);
    }

    public void verPersonaje(){
        for (Personaje personaje : personajes) {
            System.out.println("Nombre: " + personaje.getNombre());
            System.out.println("Vida: " + personaje.getVida());
            System.out.println("Fuerza: " + personaje.getFuerza());
            System.out.println("Sabiduria: " + personaje.getSadiduria());
            System.out.println("Destreza: " + personaje.getDestreza());
            System.out.println("-------------------------------");
        }
    }

    public void eliminarPersonaje(String nombre){
        for (Personaje personaje : personajes) {
            if(personaje.getNombre().equals(nombre)){
                personajes.remove(personaje);
                break;
            }
        }
    }
}
