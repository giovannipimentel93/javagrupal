package gui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContrase�a;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 192);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 14, 40, 14);
        JLabel lblContrase�a = new JLabel("Contrase�a:");
        lblContrase�a.setBounds(10, 40, 60, 14);

        txtUsuario = new JTextField(15);
        txtUsuario.setBounds(74, 11, 200, 20);
        txtContrase�a = new JPasswordField(15);
        txtContrase�a.setBounds(74, 37, 200, 20);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(74, 94, 83, 23);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        JCheckBox chkMostrarContrase�a = new JCheckBox("Mostrar Contrase�a");
        chkMostrarContrase�a.setBounds(72, 64, 121, 23);
        chkMostrarContrase�a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtContrase�a.setEchoChar(chkMostrarContrase�a.isSelected() ? '\0' : '*');
            }
        });

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(169, 94, 83, 23);
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText("");
                txtContrase�a.setText("");
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(lblUsuario);
        getContentPane().add(lblContrase�a);
        getContentPane().add(txtUsuario);
        getContentPane().add(txtContrase�a);
        getContentPane().add(chkMostrarContrase�a);
        getContentPane().add(btnLogin);
        getContentPane().add(btnLimpiar);
    }

    private void login() {
        Usuario usuarioDemo = new Usuario("Pimentel", "123456");

        String nombreUsuarioIngresado = txtUsuario.getText();
        String contrase�aIngresada = new String(txtContrase�a.getPassword());

        if (nombreUsuarioIngresado.equals(usuarioDemo.getNombreUsuario())
                && contrase�aIngresada.equals(usuarioDemo.getContrase�a())) {
            JOptionPane.showMessageDialog(this, "�Bienvenido, " + nombreUsuarioIngresado + "!", "Inicio de sesi�n exitoso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contrase�a incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
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
