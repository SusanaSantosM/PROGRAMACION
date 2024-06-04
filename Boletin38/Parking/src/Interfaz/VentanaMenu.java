package Interfaz;

import javax.swing.*;
import java.awt.*;

public class VentanaMenu extends JFrame {

    public VentanaMenu(){
        super("Parking");
        initComponents();
    }

    public void initComponents(){
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panelTotal = new JPanel();
        panelTotal.setBounds(0, 0, 600, 500);
        panelTotal.setBackground(new Color(83, 131, 146));
        panelTotal.setLayout(null);
        this.add(panelTotal);

        JLabel txtTitulo = new JLabel("Menú Principal");
        txtTitulo.setBounds(220, 50, 180, 30);
        txtTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        panelTotal.add(txtTitulo);

        JLabel txtInfo = new JLabel("Seleccione una opción:");
        txtInfo.setBounds(40, 120, 180, 30);
        txtInfo.setFont(new Font("Arial", Font.BOLD, 15));
        panelTotal.add(txtInfo);

        JButton btnIntroducir = new JButton("Introducir vehículo");
        btnIntroducir.setBounds(40, 180, 180, 30);
        btnIntroducir.setFont(new Font("Arial", Font.BOLD, 12));
        btnIntroducir.setBackground(new Color(179, 226, 167));
        btnIntroducir.setBorder(null);
        btnIntroducir.addActionListener(e -> {
            VentanaIntroducir ventanaIntroducir = new VentanaIntroducir();
            ventanaIntroducir.setVisible(true);
        });
        panelTotal.add(btnIntroducir);

        JButton btnSacar = new JButton("Sacar vehículo");
        btnSacar.setBounds(40, 240, 180, 30);
        btnSacar.setFont(new Font("Arial", Font.BOLD, 12));
        btnSacar.setBackground(new Color(179, 226, 167));
        btnSacar.setBorder(null);
        btnSacar.addActionListener(e -> {
            VentanaSacar ventanaSacar = new VentanaSacar();
            ventanaSacar.setVisible(true);
        });
        panelTotal.add(btnSacar);

        JButton btnEstado = new JButton("Comprobar estado");
        btnEstado.setBounds(40, 300, 180, 30);
        btnEstado.setFont(new Font("Arial", Font.BOLD, 12));
        btnEstado.setBackground(new Color(179, 226, 167));
        btnEstado.setBorder(null);
        btnEstado.addActionListener(e -> {
            VentanaEstado ventanaEstado = new VentanaEstado();
            ventanaEstado.setVisible(true);
        });
        panelTotal.add(btnEstado);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBounds(40, 360, 180, 30);
        btnSalir.setFont(new Font("Arial", Font.BOLD, 15));
        btnSalir.setBackground(new Color(98, 149, 162));
        btnSalir.setBorder(null);
        btnSalir.addActionListener(e -> System.exit(0));
        panelTotal.add(btnSalir);

        JLabel imagen = new JLabel();
        imagen.setBounds(250, 120, 300, 300);
        ImageIcon img = new ImageIcon("src/Recursos/estacionamiento-de-autos.png");
        imagen.setIcon(new ImageIcon(img.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
        panelTotal.add(imagen);
    }
}
