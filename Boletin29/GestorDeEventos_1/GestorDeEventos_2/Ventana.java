import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Ventana extends JFrame {
    //Creamos una array de tipo String de lista de colores con la lista desplegable
    private JComboBox<String> listaColores;
    //creamos un array String de colores
    private String[] colores= {"verde","rojo","negro","azul","amarillo"};
    private JPanel panel;

    //Constructor
    public Ventana(){
        super("CAMBIO EL COLOR DE FONDO"); //Ponemos titulo a la ventana
        setSize(400,400); //Dimensionamos
        setLocationRelativeTo(null); //Centramos la ventana
        setLayout(new FlowLayout());
        setVisible(true);

        //Llamamos a los metodos
        añadimosLaAccion();
        cambiarColores();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Salimos del programa al cerrar la ventana
    }

    private void añadimosLaAccion(){
        //Creamos un nuevo panel
        panel = new JPanel();
        //panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(300,300));

        //Indicamos al usuario con un texto
        JLabel textoIndicativo = new JLabel("Selecciona un color: ");
        add(textoIndicativo);

        //Agregando Evento de tipo ActionListener con la lista desplegable
        listaColores = new JComboBox<>(colores);
        listaColores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarColores();
            }
        });

        //Agregamos el panel a la ventana
        add(panel, BorderLayout.NORTH);
        add(listaColores, BorderLayout.CENTER);
        add(textoIndicativo);
    }

    private void cambiarColores(){
        //Creamos un objeto para seleccionar la lista de colores del desplegable
        String seleccionColor = (String) listaColores.getSelectedItem();

        //Creamos un objeto de tipo Color
        Color color = Color.WHITE;

        switch (seleccionColor){
            case "Verde":
                color = Color.GREEN;
                break;
            case "Rojo":
                color = Color.RED;
                break;
            case "Negro":
                color = Color.BLACK;
                break;
            case "Azul":
                color = Color.BLUE;
                break;
            case "Amarillo":
                color = Color.YELLOW;
                break;
            default:
                color = Color.WHITE;
                break;
        }
        panel.setBackground(color);
    }

}
