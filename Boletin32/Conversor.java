
package boletin32;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Conversor extends JFrame{
    private JPanel panel;
    private JTextField entrada;
    private JTextField salida;
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
        JLabel  etTemperatura = new  JLabel("Temperatura");
        etTemperatura.setFont(new Font("arial", Font.BOLD,17));
        etTemperatura.setForeground(Color.WHITE);
        etTemperatura.setBounds(90, 50, 250, 20);
        panel.add(etTemperatura);
        
        //Etiqueta Resultado
        JLabel  etResultado = new  JLabel("Resultado");
        etResultado.setFont(new Font("arial", Font.BOLD,17));
        etResultado.setForeground(Color.WHITE);
        etResultado.setBounds(300, 50, 250, 20);
        panel.add(etResultado);
        
        //Boton Celsius
        JButton celsius = new JButton("Celsius");
        celsius.setBounds(105, 150, 80, 30);
        panel.add(celsius);
        celsius.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                    deCelsiusAFahrenheit();
            }
        });
        
        //Boton Farenheit
        JButton fahrenheit = new JButton("Fahrenheit");
        fahrenheit.setBounds(290, 150, 120, 30);
        panel.add(fahrenheit);
        fahrenheit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                deFahrenheitACelsius();
            }
        });
        
        //Entrada de datos
        entrada = new JTextField();
        entrada.setBounds(70,100,150,30);
        panel.add(entrada);
        
        //Salida de datos
        salida = new JTextField();
        salida.setBounds(270, 100, 150, 30);
        panel.add(salida);
    }
 
    //Método para calcular la temperatura de Celsius a Fahrenheit
    public void deCelsiusAFahrenheit(){
        try{
            gradoC = Double.parseDouble(entrada.getText());
            gradoF = (gradoC*9/5)+32;
            salida.setText(String.valueOf(gradoF));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡Error! Ingresa el grado correctamente.");
        }
    }
    
    //Método para calcular la temperatura de Fahrenheit a Celsius
    public void deFahrenheitACelsius(){
        try{
            gradoF = Double.parseDouble(entrada.getText());
            gradoC = (gradoF-32)*5/9;
            salida.setText(String.valueOf(gradoC));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "¡Error! Ingresa el grado correctamente.");
        }
    }
}
