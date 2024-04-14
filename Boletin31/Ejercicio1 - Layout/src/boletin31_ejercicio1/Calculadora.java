
package boletin31_ejercicio1;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Calculadora extends JFrame{
    private JTextField entrada;
    private JPanel panelOeste;
    private JPanel panelCentral;
    private JPanel panelEntrada;
    private JPanel panelEste;
    private JPanel panelSur;
    private final JButton[] botones = new JButton[14];
    private JButton igual,borrar;
    private JTextArea salida;
    private float numero1,numero2,resultado;
    private int numero;
    
    //Creamos la ventana 
    public Calculadora(){
        super("CALCULADORA");
        setSize(380,300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        //Instanciamos el método donde inician los componentes
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void iniciarComponentes(){
        //Creamos Los paneles 
        panelEntrada = new JPanel();
        panelEntrada.setLayout(new FlowLayout());
        this.getContentPane().add(panelEntrada, BorderLayout.NORTH);
        
        panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(4,4,1,1));
        panelCentral.setSize(400, 300);
        this.getContentPane().add(panelCentral, BorderLayout.CENTER);
        
        panelOeste = new JPanel();
        panelOeste.setLayout(new BoxLayout(panelOeste,BoxLayout.Y_AXIS));
        this.getContentPane().add(panelOeste, BorderLayout.WEST);
        
        panelEste = new JPanel();
        panelEste.setLayout(new BoxLayout(panelEste,BoxLayout.Y_AXIS));
        this.getContentPane().add(panelEste, BorderLayout.EAST);
        
        panelSur = new JPanel();
        panelSur.setLayout(new FlowLayout());
        this.getContentPane().add(panelSur, BorderLayout.SOUTH);
        
        //Añadimos los botones
        botonesOperacionales();
        botonesEspeciales();
        entradaDatos();
        salidaDatos();
    }
    
    public void botonesOperacionales(){
        //Creamos los botones de la calculadora
        for (int i =0; i<botones.length; i++){
            botones[i] = new JButton(""+(i+1));
            panelCentral.add(botones[i]);
        }
        
        botones[0].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("1");
            }
        });
        
        botones[1].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("2");
            }
        });
        
        botones[2].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("3");
            }
        });
        
        botones[3].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("4");
            }
        });
        
        botones[4].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("5");
            }
            
        });
        botones[5].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("6");
            }
        });
        
        botones[6].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("7");
            }
        });
        
        botones[7].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("8");
            }
        });
        
        botones[9].setText("9");
        botones[9].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("9");
            }
            
        });
        
        botones[10].setText("0");
        botones[10].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("0");
            }
            
        });
        
        botones[8].setText("+");
        botones[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Para guardar el primer número
                numero1 = Float.parseFloat(entrada.getText());
                //Luego limpia el campo de entrada para el segundo numero
                entrada.setText("");
                //Para guardar la suma
                numero = 1;
            }
        });
        
        botones[11].setText("-");
        botones[11].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Para guardar el primer número
                numero1 = Float.parseFloat(entrada.getText());
                //Limpiar el campo de entrada para el segundo número
                entrada.setText("");
                numero = 2; //Guarda la operación
            }
        });
        
        botones[12].setText("x");
        botones[12].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Para guardar el primer número
                numero1 = Float.parseFloat(entrada.getText());
                //Limpiar el campo de entrada para el segundo número
                entrada.setText("");
                numero = 3; //Guarda la operación
            }
        });
        
        botones[13].setText("/");
        botones[13].addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Para guardar el primer número
                numero1 = Float.parseFloat(entrada.getText());
                //Limpiar el campo de entrada para el segundo número
                entrada.setText("");
                numero = 4; //Guarda la operación
            }
        });
    }
    
    public void botonesEspeciales(){
        igual = new JButton("Calcular");
        igual.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                numero2 =Float.parseFloat(entrada.getText());
                switch(numero){
                    case 1:
                        resultado = numero1+numero2;
                        break;
                    case 2:
                        resultado = numero1-numero2;
                        break;
                    case 3:   
                        resultado = numero1*numero2;
                        break;
                    case 4:
                        if(numero2 !=0){
                        resultado = numero1/numero2;
                        return;
                    }
                        break;
                }
                //Mostrar el resultaado:
                salida.setText(String.valueOf(resultado));
            }
            
        });
        borrar = new JButton("Limpiar");
        borrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Borra la entrada y salida
                entrada.setText("");
                salida.setText("");
                
                //Reinicio de los botones operacionales
                numero1 = 0;
                numero2 = 0;
                resultado = 0;
                numero = 0;
            }
            
        });
        panelOeste.add(igual);
        panelEste.add(borrar);
    }
    
    public void entradaDatos(){
        entrada = new JTextField(10);
        panelEntrada.add(entrada);
    }
    
    public void salidaDatos(){
        salida = new JTextArea();
        salida.setSize(200, 200);
        panelSur.add(salida);
    }
}
