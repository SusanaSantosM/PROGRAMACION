
package boletin32;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Conversor extends JFrame{
    private JPanel panel;
    private JButton celsius;
    private JButton fahrenheit;
    private JTextField entrada;
    private JTextField salida;
    private final double  temperatura = 0;
    private double gradoC;
    private double gradoF;
    
    public Conversor(){
        super("CONVERSOR DE TEMPERATURA");
        setSize(500,300);
        setLocationRelativeTo(null);
        //instanciar métodos
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void iniciarComponentes(){
        //Agregamos el panel
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.GRAY);
        
        //Etiqueta temperatura
        JLabel  etTemperatura = new  JLabel("Ingresa la temperatura");
        etTemperatura.setFont(new Font("arial", Font.BOLD,20));
        etTemperatura.setForeground(Color.WHITE);
        etTemperatura.setBounds(120, 50, 250, 40);
        panel.add(etTemperatura);
        
        //Boton Celsius
        celsius = new JButton("Celsius");
        celsius.setBounds(100, 150, 80, 30);
        panel.add(celsius);
        celsius.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                    deCelsiusAFahrenheit();
            }
            
        });
        
        //Boton Farenheit
        fahrenheit = new JButton("Fahrenheit");
        fahrenheit.setBounds(300, 150, 120, 30);
        panel.add(fahrenheit);
        fahrenheit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                deFahrenheitACelsius();
            }
        });
        
        //Entrada
        entrada = new JTextField();
        entrada.setBounds(70,100,150,30);
        entrada.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                gradoC = Double.parseDouble(entrada.getText());
                gradoF = Double.parseDouble(entrada.getText());
            }
        });
        panel.add(entrada);
        
        //Salida
        salida = new JTextField();
        salida.setBounds(290, 100, 150, 30);
        panel.add(salida);
        salida.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        }
    
    public double deCelsiusAFahrenheit(){
        if(gradoC<temperatura){
            gradoF = (gradoC*9/5)+32;
        } return gradoF;
    }
    
    public double deFahrenheitACelsius(){
        if(gradoF<temperatura){
            gradoC=(gradoF-32)*5/9;
        }return gradoC;
    }
}
