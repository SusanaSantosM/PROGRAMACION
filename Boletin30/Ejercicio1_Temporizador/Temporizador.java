/**
 * Objetivo: Crear un programa que utilice un javax.swing.Timer para ejecutar
una tarea repetitiva cada cierto intervalo de tiempo. La tarea será mostrar
un mensaje personalizado en la consola. Este mensaje puede variar
dependiendo de una condición específica definida por el usuario.
Utilizaremos una clase anónima para definir la acción que realizará el
temporizador.
 */
package tareaca_temporizador;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Temporizador extends JFrame{
    private JButton boton;
    private JPanel panel;
    private Timer temporizador;
    private String mensaje;
    private int contador=0;
    private boolean activa = false;
    
    public Temporizador(){
        super("TEMPORIZADOR");
        setSize(400,300);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        
        //Llamamos a los métodos
        colocamosBoton();
        panel();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void panel(){
        panel = new JPanel();
        //Añadimos el panel a la ventana
        this.getContentPane().add(panel);
        panel.setLayout(new BorderLayout());
    }
    
    private void colocamosBoton(){
        boton = new JButton();
        boton.setBounds(200,200,100,40);
        boton.setText("Click, para ver el mensaje");
        add(boton,BorderLayout.CENTER);
        getContentPane().add(boton);
        
        boton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!activa){
                    colocamosTemporizador();
                }
            }
        });
        
    }
    
    private void colocamosTemporizador(){
        //Colocamos el temporizador con los miliseg
        temporizador = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                contador++;
        
                if(contador == 1){
                    JOptionPane.showMessageDialog(null, "¡Hola!");
                } else if(contador == 2){
                    JOptionPane.showMessageDialog(null, "Levantante!");
                } else if(contador == 3){
                    JOptionPane.showMessageDialog(null, "y toma cafecito UwU");
                    temporizador.stop();
                }
            }
        });
        temporizador.start();
    }    
}
