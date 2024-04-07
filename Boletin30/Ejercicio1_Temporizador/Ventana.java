import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private int contador=0;
    private JButton boton;
    Timer temporizador;
    JTextArea mensaje;

    public Ventana(){
        super("TEMPORIZADOR");
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        //Llamamos a los métodos
        colocamosBoton();

        //Finalizamos operación
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void colocamosBoton(){
        //Creamos el botón
        boton = new JButton("¡Clickeame y ve el mensaje!");
        boton.setBounds(100,100,100,40);
        boton.setForeground(Color.BLUE);

        //Creamos la etiqueta
        mensaje = new JTextArea(6,40);
        add(new JScrollPane(mensaje));

        //Lo añadimos a la ventana
        this.getContentPane().add(boton);

        //Añadimos el manejador de eventos al botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    colocamosTemporizador();
            }
        });
    }

    private void colocamosTemporizador(){

        temporizador = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;

                if(contador < 3) {
                    mensaje.setText("Hola");
                } else if (contador >= 3  && contador <5) {
                    mensaje.setText("Tienes una misión");
                } else if (contador >=5 && contador <7) {
                    mensaje.setText("Levantate temprano y ...");
                } else if (contador == 7) {
                    mensaje.setText("Toma cafecito para despertar bien UwU ");
                    temporizador.stop();
                }

            }
        });
        temporizador.start();
    }
}
