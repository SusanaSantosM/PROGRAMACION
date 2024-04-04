import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField numero1;
    private JTextField numero2;
    private JButton BotonSuma;
    private JButton BotonResta;
    private JTextArea resultado;


    public Calculadora(){
        super("CALCULADORA");
        setLayout(new FlowLayout());

        //Ventana
        setSize(300, 200);
        setLocationRelativeTo(null); //Centramos la ventana

        //Ingreso de Texto en el panel
        numero1 = new JTextField(5);
        add(numero1);
        numero2 = new JTextField(5);
        add(numero2);


        //Boton de Suma
        JButton botonSuma = new JButton();
        botonSuma.setText("+");

        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                //Convertimos de float a String
                float num1 = Float.parseFloat(numero1.getText());
                float num2 = Float.parseFloat(numero2.getText());
                float totals = num1+num2;
                String texto = Float.toString(totals);
                resultado.getText();
                resultado.append(texto + "\n");
                resultado.setText(texto);
            }
        });
        add(botonSuma);

        //Boton de Resta
        JButton botonResta = new JButton();
        botonResta.setText("_");
        botonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Convertimos de float a String
                float num1 = Float.parseFloat(numero1.getText());
                float num2 = Float.parseFloat(numero2.getText());
                float totalr = num1 - num2;
                String texto = Float.toString(totalr);
                resultado.getText();
                resultado.append(texto + "\n");
                resultado.setText(texto);
            }
        });
        add(botonResta);

        //Resultado en el cuadro de texto
        resultado = new JTextArea(2,10);
        add(new JScrollPane(resultado));


        //Finalizamos al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
