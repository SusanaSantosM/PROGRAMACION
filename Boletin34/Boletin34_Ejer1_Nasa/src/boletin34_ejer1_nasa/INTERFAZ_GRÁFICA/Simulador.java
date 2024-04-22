
package boletin34_ejer1_nasa.INTERFAZ_GRÁFICA;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Simulador extends JFrame{
    
    public Simulador(){
        super("MISIONES ESPACIALES");
        setSize(400,320);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Agregamos componentes
        
        //Paneles
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        add(panel);
        
        //Etiqueta
        JLabel texto = new JLabel("Bienvenido a la NASA");
        texto.setForeground(Color.WHITE);
        texto.setFont(new Font("Agency FB", Font.BOLD,20));
        texto.setBounds(100,20,250,40);
        panel.add(texto);
        
        //Botones
        JButton btnCreaMisiones = new JButton("Crea una misión");
        btnCreaMisiones.setBounds(130,80,150,30);
        panel.add(btnCreaMisiones);
        
        JButton btnAsignaNaves = new JButton("Asigna naves");
        btnAsignaNaves.setBounds(130,130,150,30);
        panel.add(btnAsignaNaves);
        
        JButton btnAsignaTripulante = new JButton("Asigna tripulantes");
        btnAsignaTripulante.setBounds(130,180,150,30);
        panel.add(btnAsignaTripulante);
        
        JButton btnEstado = new JButton("Ver estado de la misión");
        btnEstado.setBounds(100,230,210,30);
        panel.add(btnEstado);
    }
}