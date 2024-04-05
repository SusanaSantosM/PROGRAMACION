/**
 * Ejemplo para iniciar las interfaces gráficas con JFRAME
 * Sirve para crear ventanas
 * La ventana es como tu mesa y el panel las hojas donde escribes
 * La ventana y el panel tienen cada uno su propio Layaout por defecto
 * Las etiquetas por defectos no te dejan poner color de fondo, si quieres dar ese permiso usas un método(Opaque)
 * JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER); //Con SwingConstants.CENTER se centra el texto de la etiqueta
 * CAmbiar la fuente de texto depende mucho de tu sistema operativo
 */
package gestordeeventos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    
    //Constructor
    public Ventana(){
        setBounds(50,50,500,500); //Establecemos la posicion y tamaño de la ventana (x,y,Width,Heigh)
        setTitle("EVENTOS"); //Ponemos titulo en nuestra ventana
        
     
        iniciarComponentes();   //LLamamos al método 
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Para cerrar la ventana
    }
 
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiquetas();
        colocarBotones();
        colocarCajaDeTexto();
        //colocarListaDesplegable();
    }
    
    private void colocarPanel(){
        //Creamos un nuevo panel (la hoja encima de la mesa)
        panel = new JPanel();
        panel.setLayout(null);  //Desactivamos el diseño del panel para mover las etiquetas 
        this.add(panel);
    }
    
    private void colocarEtiquetas(){
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel(); //Creamos la etiqueta
        panel.add(etiqueta);    //Agregamos la etiqueta al panel
        etiqueta.setText("Ingrese su nombre:");   //Establecemos el texto de la etiqueta
        etiqueta.setBounds(30, 10, 200, 30);  //Posicionamos la etiqueta (x,y,widht,heigh)
        etiqueta.setFont(new Font("cooper black",0,20)); //Establecemos la fuente del texto de la etiqueta Font("tipo de letra",estilo de letra,tamaño)
    }
    
    private void colocarBotones(){
        boton = new JButton(); //Creamos un botón
        boton.setText("¡Pulsa aqui!"); //Escribe un texto en el boton
        boton.setBounds(150, 100, 150, 40); //Posicionamos y damos el tamaño al boton
        boton.setFont(new Font("arial",0,15)); //EStablecemos la fuente, estilo y tamaño de la letra del boton
        panel.add(boton);  //Añadimos un boton al panel
        
        saludo = new JLabel();
        saludo.setBounds(50, 200, 300, 400);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);
        
        //Agregando Evento de tipo ActionListener
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola "+cajaTexto.getText());
            }
        };
        //Añades el evento al boton para que haga la acción
        boton.addActionListener(oyenteDeAccion);
    }
    
    private void colocarListaDesplegable(){
        //creamos un array String de colores (Objeto)
        String [] colores = {"verde","rojo","negro","azul","amarillo"};

        //Creamos una lista desplegable de colores (array)
        JComboBox listaColores = new JComboBox(colores);
        listaColores.setBounds(20,20,100,30); //Dimensionamos
        listaColores.addItem("gris"); //Agregas más colores(objetos) a tu lista despues de haberlo creado
        listaColores.setSelectedItem("rojo"); //Pones el color "rojo" como el primero a visualizar en la lista
        panel.add(listaColores); //Agregamos la lista al panel
    }
    
    private void colocarCajaDeTexto(){
        cajaTexto = new JTextField();
        cajaTexto.setBounds(30, 50, 300, 30);
        panel.add(cajaTexto);
    }
}
