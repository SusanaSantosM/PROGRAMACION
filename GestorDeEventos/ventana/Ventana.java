/**
 * Ejemplo para iniciar las interfaces gráficas con JFRAME
 * Sirve para crear ventanas
 * La ventana es como tu mesa y el panel las hojas donde escribes
 * La ventana y el panel tienen cada uno su propio Layaout por defecto
 * Las etiquetas por defectos no te dejan poner color de fondo, si quieres dar ese permiso usas un método(Opaque)
 * JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER); //Con SwingConstants.CENTER se centra el texto de la etiqueta
 * CAmbiar la fuente de texto depende mucho de tu sistema operativo
 */
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    public JPanel panel;
    
    //Constructor
    public Ventana(){
        setSize(500, 500); //Establecemos el tamaño de la ventana (ancho,largo)
        //setLocation(100,200);  //Establecemos la posisicion de la ventana (x,y)
        //setBounds(100,200,500,500); //Establecemos la posicion y tamaño de la ventana (x,y,Width,Heigh)
        setLocationRelativeTo(null); //Centra la ventana con null
        
        setTitle("Mira mi ventanita"); //Ponemos titulo en nuestra ventana
        
        //setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no (osea agrandar)
        setMinimumSize(new Dimension(200,200)); //Establecemos el tamaño minimo
        
        //this.getContentPane().setBackground(Color.BLUE); //Establecer un color de fondo en la ventana
        
        iniciarComponentes();   //LLamamos al método 
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Para cerrar la ventana
    }
 
    private void iniciarComponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        colocarListaDesplegable();
    }
    
    private void colocarPaneles(){
        //Creamos un nuevo panel (la hoja encima de la mesa)
        panel = new JPanel();
        //panel.setBackground(Color.red); //Agregamos un color de fondo al panel
        this.getContentPane().add(panel);   //Agregamos el panel a la ventana
        panel.setLayout(null);  //Desactivamos el diseño del panel para mover las etiquetas 
    }
    
    private void colocarEtiquetas(){
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel(); //Creamos la etiqueta
        panel.add(etiqueta);    //Agregamos la etiqueta al panel
        etiqueta.setText("Mundial 2022");   //Establecemos el texto de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Establecemos la alinecion horizontal del texto en la etiqueta
        etiqueta.setBounds(85, 10, 300, 80);  //Posicionamos la etiqueta (x,y,widht,heigh)
        etiqueta.setForeground(Color.BLACK);  //Ponemos el color de la letra de la etiqueta
        //etiqueta.setOpaque(true);   //Damos permiso para pintar el fondo de la etiqueta con true
        //etiqueta.setBackground(Color.BLACK);  //Cambiamos el color del fondo de la etiqueta
        etiqueta.setFont(new Font("cooper black",0,40)); //Establecemos la fuente del texto de la etiqueta Font("tipo de letra",estilo de letra,tamaño)
        
        
        //Etiqueta 2 - etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("mundial2022.jpg");
        JLabel etiqueta2 = new JLabel();    //Creamos la etiqueta
        panel.add(etiqueta2); //Lo agregamos al panel
        //etiqueta2.setIcon(new ImageIcon("mundial2022.jpg")); //Ponemos la imagen
        etiqueta2.setBounds(80, 90, 300, 300);  //Posicionamos nuestra etiqueta !NO LA IMAGEN
        //Para cambiar el tamaño de la imagen dentro de la etiqueta y tengan el mismo tamaño
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        
    }
    
    private void colocarBotones(){
        JButton boton1 = new JButton(); //Creamos un botón
        boton1.setText("Aprietame!"); //Escribe un texto en el boton
        boton1.setBounds(100, 100, 100, 40); //Posicionamos y damos el tamaño al boton
        boton1.setEnabled(true); //Para desactivar la interacción del boton(false) con true si se interactua
        boton1.setMnemonic('a');  //Establecemos "alt + letra('a')" para dar click al boton sin el ratón
        boton1.setForeground(Color.BLUE); //Cambiamos el color del texto del boton
        boton1.setFont(new Font("arial",Font.BOLD,13)); //EStablecemos la fuente, estilo y tamaño de la letra del boton
        panel.add(boton1);  //Añadimos un boton al panel
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
}
