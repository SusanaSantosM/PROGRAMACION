import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Tabla extends JFrame{
  private JPanel panel;
  private String[] clases = {"dam1","dam2", "asir1","asir2", "daw1","daw2"};
  private String[] columnas = {"NOMBRE", "APELLIDO", "CURSO"};

   private Object[][] datos = {{"Luis", "Perez","dam"}};

  public Tabla(){
    super("Tabla De Datos");
    setSize(480,500);
    setLocationRelativeTo(null);
    iniciamosComponentes();

    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void iniciamosComponentes(){
    panel = new JPanel();
    panel.setLayout(null);
    this.getContentPane().add(panel);

    //Colocamos la etiquetas y entrada de nombre
    JLabel nombre = new JLabel("Nombre");
    nombre.setBounds(50,50,80,30);
    panel.add(nombre);

    JTextField entrNombre = new JTextField();
    entrNombre.setBounds(150,50,100,20);
    panel.add(entrNombre);

    //Colocamos la etiqueta y entrada de apellido
    JLabel apellido = new JLabel("Apellido");
    apellido.setBounds(50,100,80,30);
    panel.add(apellido);

    JTextField entrApellido = new JTextField();
    entrApellido.setBounds(150,100,100,20);
    panel.add(entrApellido);

    //Colocamos la lista de clases
    JComboBox listaClase = new JComboBox(clases);
    listaClase.setBounds(300,50,80,20);
    panel.add(listaClase);

    //Colocamos boton
    JButton agregar = new JButton("AGREGAR TABLA");
    agregar.setFont(new Font("arial",Font.BOLD,10));
    agregar.setBounds(300,100,120,30);
    panel.add(agregar);

    //Colocamos la tabla
    DefaultTableModel td = new DefaultTableModel(datos,columnas);
    JTable tabla = new JTable(td);
    tabla.setPreferredScrollableViewportSize(new Dimension(450,70));
    panel.add(tabla);


  }
}
