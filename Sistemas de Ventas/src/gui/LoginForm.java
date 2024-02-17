package gui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContraseña;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 192);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 14, 40, 14);
        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(10, 40, 60, 14);

        txtUsuario = new JTextField(15);
        txtUsuario.setBounds(74, 11, 200, 20);
        txtContraseña = new JPasswordField(15);
        txtContraseña.setBounds(74, 37, 200, 20);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(74, 94, 83, 23);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        JCheckBox chkMostrarContraseña = new JCheckBox("Mostrar Contraseña");
        chkMostrarContraseña.setBounds(72, 64, 121, 23);
        chkMostrarContraseña.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtContraseña.setEchoChar(chkMostrarContraseña.isSelected() ? '\0' : '*');
            }
        });

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(169, 94, 83, 23);
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText("");
                txtContraseña.setText("");
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(lblUsuario);
        getContentPane().add(lblContraseña);
        getContentPane().add(txtUsuario);
        getContentPane().add(txtContraseña);
        getContentPane().add(chkMostrarContraseña);
        getContentPane().add(btnLogin);
        getContentPane().add(btnLimpiar);
    }

    private void login() {
        Usuario usuarioDemo = new Usuario("Pimentel", "123456");

        String nombreUsuarioIngresado = txtUsuario.getText();
        String contraseñaIngresada = new String(txtContraseña.getPassword());

        if (nombreUsuarioIngresado.equals(usuarioDemo.getNombreUsuario())
                && contraseñaIngresada.equals(usuarioDemo.getContraseña())) {
            JOptionPane.showMessageDialog(this, "¡Bienvenido, " + nombreUsuarioIngresado + "!", "Inicio de sesión exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}
