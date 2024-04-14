
package boletin31_ejercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public final class ControlDeMedios extends JFrame{
    private JPanel panelSur, panelCentral, panelNorte;
    private JButton play,pause,stop;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0;
    private JProgressBar barra;
    private final int duracionCancion=180; //Duración en segundos de la canción
    private int tiempoEnCurso;
    private Timer temporizador;
    
    public ControlDeMedios(){
        super("REPRODUCTOR DE MÚSICA");
        setSize(480,300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        //Instanciamos el método donde inician los componentes
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void iniciarComponentes(){
        //Creamos los paneles
        panelSur = new JPanel();
        panelSur.setLayout(new BoxLayout(panelSur, BoxLayout.X_AXIS));
        this.getContentPane().add(panelSur, BorderLayout.SOUTH);
        botonesReproducción();
        
        panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(5,6));
        this.getContentPane().add(panelCentral, BorderLayout.CENTER);
        botonesNumericos();
        
        panelNorte = new JPanel();
        panelNorte.setLayout(new FlowLayout());
        this.getContentPane().add(panelNorte, BorderLayout.NORTH);
        barraProgreso();
    }
    
    public void botonesReproducción(){
        play = new JButton("PLAY");
        panelSur.add(play);
        play.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(temporizador != null && temporizador.isRunning()){
                    temporizador.stop();
                }
                temporizador = new Timer(1000, new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        tiempoEnCurso++;
                        barra.setValue(tiempoEnCurso);
                        if(tiempoEnCurso >= duracionCancion){
                            temporizador.stop();
                            play.setText("Reproducir de nuevo");
                        }
                    }
                }); 
                temporizador.start();
                play.setText("PLAY");
            }
        });
        
        pause = new JButton("PAUSE");
        panelSur.add(pause);
        pause.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (temporizador != null && temporizador.isRunning()){
                    temporizador.stop();
                }
            }
        });
        
        //Stop detiene y reinica la canción
        stop = new JButton("STOP");
        panelSur.add(stop);
        stop.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(temporizador != null && temporizador.isRunning()){
                    temporizador.stop();
                }
                tiempoEnCurso = 0;
                barra.setValue(tiempoEnCurso);
                play.setText("PLAY");
            }
            
        });
    }
    
    public void botonesNumericos(){
        boton1 = new JButton("1");
        panelCentral.add(boton1);
        
        boton2 = new JButton("2");
        panelCentral.add(boton2);
        
        boton3 = new JButton("3");
        panelCentral.add(boton3);
        
        boton4 = new JButton("4");
        panelCentral.add(boton4);
        
        boton5 = new JButton("5");
        panelCentral.add(boton5);
        
        boton6 = new JButton("6");
        panelCentral.add(boton6);
        
        boton7 = new JButton("7");
        panelCentral.add(boton7);
        
        boton8 = new JButton("8");
        panelCentral.add(boton8);
        
        boton9 = new JButton("9");
        panelCentral.add(boton9);
        
        boton0 = new JButton("0");
        panelCentral.add(boton0);
    }
    
    public void barraProgreso(){
        barra = new JProgressBar(0, duracionCancion);
        barra.setStringPainted(true);
        panelNorte.add(barra);
        
        
    }
}
