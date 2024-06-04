package Interfaz;

import javax.swing.*;
import java.awt.*;

public class VentanaEstado extends JFrame {

    public VentanaEstado() {
        super("Estado del Parking");
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panelTotal = new JPanel();
        panelTotal.setBounds(0, 0, 600, 500);
        panelTotal.setLayout(null);
        panelTotal.setBackground(new java.awt.Color(83, 131, 146));
        add(panelTotal);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(40, 400, 180, 30);
        btnVolver.setBackground(new Color(179, 226, 167));
        panelTotal.add(btnVolver);
        btnVolver.addActionListener(e -> {
            ocultar();
        });


    }

    public void mostrar() {
        setVisible(true);
    }

    public void ocultar() {
        setVisible(false);
    }

    public void actualizarEstado() {}
}
