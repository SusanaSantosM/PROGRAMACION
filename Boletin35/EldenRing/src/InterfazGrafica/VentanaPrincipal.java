package InterfazGrafica;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        super("Elden Ring");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 800, 600);
        panel.setBackground(Color.BLACK);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);

        //Botón para crear personaje
        JButton boton1 = new JButton("Crear Personaje");
        boton1.setSize(150,40);
        panel.add(boton1, getContentPane().getAlignmentX());

        //Botón para ver personajes
        JButton boton2 = new JButton("Ver Personajes");
        panel.add(boton2);

        //Botón para seleccionar personaje
        JButton boton3 = new JButton("Seleccionar Personaje");
        panel.add(boton3);

        //Botón para ver enfrentamientos
        JButton boton4 = new JButton("Enfrentamientos");
        panel.add(boton4);
    }

}
