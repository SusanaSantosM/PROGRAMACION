package Interfaz;

import javax.swing.*;

public class VentanaSacar extends JFrame {

    public VentanaSacar() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sacar vehículo");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setBounds(50, 50, 100, 30);
        add(lblMatricula);

        JTextField txtMatricula = new JTextField();
        txtMatricula.setBounds(150, 50, 150, 30);
        add(txtMatricula);

        JButton btnSacar = new JButton("Sacar");
        btnSacar.setBounds(150, 100, 100, 30);
        add(btnSacar);

        JLabel lblMensaje = new JLabel();
        lblMensaje.setBounds(50, 150, 300, 30);
        add(lblMensaje);

        btnSacar.addActionListener(e -> {
            String matricula = txtMatricula.getText();
            if (matricula.isEmpty()) {
                lblMensaje.setText("Introduce la matrícula");
            } else {
                // Sacar vehículo
                lblMensaje.setText("Vehículo sacado");
            }
        });

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(150, 200, 100, 30);
        add(btnVolver);
        btnVolver.addActionListener(e -> {
            setVisible(false);
        });
    }
}
