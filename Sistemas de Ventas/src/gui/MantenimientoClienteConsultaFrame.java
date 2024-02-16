package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MantenimientoClienteConsultaFrame extends JFrame {

    private JPanel contentPane;
    private JTextField codigoClienteTextField;
    private JTextField nombresTextField;
    private JTextField apellidosTextField;
    private JTextField direccionTextField;
    private JTextField telefonoTextField;
    private JTextField dniTextField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MantenimientoClienteConsultaFrame frame = new MantenimientoClienteConsultaFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MantenimientoClienteConsultaFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 449, 326);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel formPanel = new JPanel();
        contentPane.add(formPanel, BorderLayout.CENTER);
        formPanel.setLayout(null);

        JLabel lblCodigoCliente = new JLabel("C�digo Cliente:");
        lblCodigoCliente.setBounds(1, 2, 134, 29);
        formPanel.add(lblCodigoCliente);

        codigoClienteTextField = new JTextField();
        codigoClienteTextField.setBounds(145, 2, 134, 29);
        formPanel.add(codigoClienteTextField);
        codigoClienteTextField.setColumns(10);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(289, 2, 134, 29);
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // L�gica para buscar datos
                buscarDatos();
            }
        });
        formPanel.add(btnBuscar);

        JLabel lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(1, 41, 134, 29);
        formPanel.add(lblNombres);

        nombresTextField = new JTextField();
        nombresTextField.setBounds(145, 41, 134, 29);
        formPanel.add(nombresTextField);
        nombresTextField.setColumns(10);

        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(1, 81, 134, 29);
        formPanel.add(lblApellidos);

        apellidosTextField = new JTextField();
        apellidosTextField.setBounds(145, 81, 134, 29);
        formPanel.add(apellidosTextField);
        apellidosTextField.setColumns(10);

        JLabel lblDireccion = new JLabel("Direcci�n:");
        lblDireccion.setBounds(1, 121, 134, 29);
        formPanel.add(lblDireccion);

        direccionTextField = new JTextField();
        direccionTextField.setBounds(145, 121, 134, 29);
        formPanel.add(direccionTextField);
        direccionTextField.setColumns(10);

        JLabel lblTelefono = new JLabel("Tel�fono:");
        lblTelefono.setBounds(1, 161, 134, 29);
        formPanel.add(lblTelefono);

        telefonoTextField = new JTextField();
        telefonoTextField.setBounds(145, 161, 134, 29);
        formPanel.add(telefonoTextField);
        telefonoTextField.setColumns(10);

        JLabel lblDni = new JLabel("DNI:");
        lblDni.setBounds(1, 201, 134, 29);
        formPanel.add(lblDni);

        dniTextField = new JTextField();
        dniTextField.setBounds(145, 201, 134, 29);
        formPanel.add(dniTextField);
        dniTextField.setColumns(10);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setBounds(0, 251, 423, 23);
        formPanel.add(btnCerrar);
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // L�gica para modificar datos
                modificarDatos();
                // Cierra el JFrame actual
                dispose();
            }
        });
    }

    private void buscarDatos() {
        // Implementa la l�gica para buscar los datos seg�n el c�digo del cliente
        // y cargarlos en los campos correspondientes
    }

    private void modificarDatos() {
        // Implementa la l�gica para modificar los datos en la base de datos
        // Puedes acceder a los valores de los campos con getText() de los JTextField
    }
}