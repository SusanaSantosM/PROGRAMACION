package Interfaz;

import javax.swing.*;

public class VentanaIntroducir extends JFrame {

    public VentanaIntroducir() {
        initComponents();
    }

    public void initComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panelTotal = new JPanel();
        panelTotal.setBounds(0, 0, 600, 500);
        panelTotal.setLayout(null);
        panelTotal.setBackground(new java.awt.Color(83, 131, 146));
        add(panelTotal);

        JLabel txtTitulo = new JLabel("Introducir vehículo");
        txtTitulo.setBounds(220, 50, 180, 30);
        txtTitulo.setFont(new java.awt.Font("Arial", 1, 20));
        panelTotal.add(txtTitulo);

        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setBounds(50, 120, 100, 30);
        panelTotal.add(lblMatricula);

        JTextField txtMatricula = new JTextField();
        txtMatricula.setBounds(150, 120, 150, 30);
        panelTotal.add(txtMatricula);

        JLabel lblMensaje = new JLabel();
        lblMensaje.setBounds(50, 200, 300, 30);
        panelTotal.add(lblMensaje);

        JButton btnIntroducir = new JButton("Introducir");
        btnIntroducir.setBounds(150, 160, 100, 30);
        panelTotal.add(btnIntroducir);

        btnIntroducir.addActionListener(e -> {
            String matricula = txtMatricula.getText();
            if (matricula.isEmpty()) {
                lblMensaje.setText("Introduce la matrícula");
            } else {
                // Introducir vehículo
                lblMensaje.setText("Vehículo introducido");
            }
        });

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(150, 240, 100, 30);
        panelTotal.add(btnVolver);
        btnVolver.addActionListener(e -> {
            setVisible(false);
        });

    }
}
