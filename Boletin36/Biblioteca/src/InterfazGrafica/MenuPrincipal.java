package InterfazGrafica;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal(){
        super("Biblioteca");
        setSize(1000,800);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(90,178,255));
        panel.setLayout(null);
        add(panel);


        JButton btnAgregar = new JButton("Registrar Libro");
        btnAgregar.setBounds(200,50,200,30);
        panel.add(btnAgregar);

        JButton btnConsultar = new JButton("Consultar Libro");
        btnConsultar.setBounds(200,90,200,30);
        panel.add(btnConsultar);

        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(200,130,200,30);
        panel.add(btnActualizar);

        JButton btnEliminar = new JButton("Eliminar Libro");
        btnEliminar.setBounds(200,170,200,30);
        panel.add(btnEliminar);

        JLabel lblTitulo = new JLabel("Sistema de la biblioteca");
        lblTitulo.setBounds(400, 10, 250, 30);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(new Color(255,249,208));
        lblTitulo.setForeground(Color.WHITE);
        panel.add(lblTitulo);

        JLabel lblIcono = new JLabel();
        lblIcono.setBounds(30,70,128,128);
        setImagenLabel(lblIcono, "src/Recursos/libros.png");
        panel.add(lblIcono);

    }

    public void setImagenLabel(JLabel label, String ruta){
        ImageIcon icono = new ImageIcon(ruta);
        label.setIcon(new ImageIcon(icono.getImage().getScaledInstance(label.getWidth(),label.getHeight(),Image.SCALE_SMOOTH)));
        label.setIcon(icono);
        this.repaint();
    }

}
