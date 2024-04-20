
package boletin33;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JFrame{
    private JPanel panel;
    private DefaultTableModel td;

  public Tabla(){
    super("Tabla De Datos");
    setSize(480,500);
    setLocationRelativeTo(null);
    setLayout(new BorderLayout());
    iniciamosComponentes();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void iniciamosComponentes(){
    //Panel Central donde ingresan los datos
    panel = new JPanel();
    panel.setLayout(null);
    this.getContentPane().add(panel, BorderLayout.CENTER);
    
    //PanelSur donde esta la tabla  
    JPanel panelSur = new JPanel();
    panelSur.setLayout(new BorderLayout());
    this.getContentPane().add(panelSur, BorderLayout.SOUTH);

    
    
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
    String[] clases = {"dam1","dam2", "asir1","asir2", "daw1","daw2"};
    JComboBox listaClase = new JComboBox(clases);
    listaClase.setBounds(300,50,80,20);
    panel.add(listaClase);

    
    
    //Colocamos boton
    JButton agregar = new JButton("AGREGAR TABLA");
    agregar.setFont(new Font("arial",Font.BOLD,10));
    agregar.setBounds(300,100,120,30);
    panel.add(agregar);
    agregar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = entrNombre.getText();
            String apellido = entrApellido.getText();
            String curso = (String)listaClase.getSelectedItem();
            
            td.addRow(new Object[]{nombre,apellido,curso});
        }
    });

    
    
    //Colocamos la tabla
    String[] columnas = {"NOMBRE", "APELLIDO", "CURSO"};
    td = new DefaultTableModel(columnas,0);
    JTable tabla = new JTable(td);
    tabla.setPreferredScrollableViewportSize(new Dimension(450,250));
    
    //Colocamos un JScrollPane para la tabla
    JScrollPane scrol = new JScrollPane(tabla);
    panelSur.add(scrol, BorderLayout.CENTER);
    
  }
}
