package gui;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MantenimientoClienteIngresoFrame extends JFrame {

    private JPanel contentPane;
    private JTextField codigoClienteTextField;
    private JTextField nombresTextField;
    private JTextField apellidosTextField;
    private JTextField direccionTextField;
    private JTextField telefonoTextField;
    private JTextField dniTextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MantenimientoClienteIngresoFrame frame = new MantenimientoClienteIngresoFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MantenimientoClienteIngresoFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 549, 428);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel formPanel = new JPanel();
        contentPane.add(formPanel, BorderLayout.CENTER);
        formPanel.setLayout(null);

        JLabel lblCodigoCliente = new JLabel("Código Cliente:");
        lblCodigoCliente.setBounds(0, 2, 256, 41);
        formPanel.add(lblCodigoCliente);

        codigoClienteTextField = new JTextField();
        codigoClienteTextField.setBounds(266, 2, 256, 41);
        formPanel.add(codigoClienteTextField);
        codigoClienteTextField.setColumns(10);

        JLabel lblNombres = new JLabel("Nombres:");
        lblNombres.setBounds(0, 53, 256, 41);
        formPanel.add(lblNombres);

        nombresTextField = new JTextField();
        nombresTextField.setBounds(266, 53, 256, 41);
        formPanel.add(nombresTextField);
        nombresTextField.setColumns(10);

        JLabel lblApellidos = new JLabel("Apellidos:");
        lblApellidos.setBounds(0, 104, 256, 41);
        formPanel.add(lblApellidos);

        apellidosTextField = new JTextField();
        apellidosTextField.setBounds(266, 104, 256, 41);
        formPanel.add(apellidosTextField);
        apellidosTextField.setColumns(10);

        JLabel lblDireccion = new JLabel("Dirección:");
        lblDireccion.setBounds(0, 155, 256, 41);
        formPanel.add(lblDireccion);

        direccionTextField = new JTextField();
        direccionTextField.setBounds(266, 155, 256, 41);
        formPanel.add(direccionTextField);
        direccionTextField.setColumns(10);

        JLabel lblTelefono = new JLabel("Teléfono:");
        lblTelefono.setBounds(0, 206, 256, 41);
        formPanel.add(lblTelefono);

        telefonoTextField = new JTextField();
        telefonoTextField.setBounds(266, 206, 256, 41);
        formPanel.add(telefonoTextField);
        telefonoTextField.setColumns(10);

        JLabel lblDni = new JLabel("DNI:");
        lblDni.setBounds(0, 257, 256, 41);
        formPanel.add(lblDni);

        dniTextField = new JTextField();
        dniTextField.setBounds(266, 257, 256, 41);
        formPanel.add(dniTextField);
        dniTextField.setColumns(10);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(-1, 333, 523, 23);
        formPanel.add(btnGuardar);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí debes agregar la lógica para guardar los datos
                guardarDatos();
            }
        });
    }

    private void guardarDatos() {
        // Implementa la lógica para guardar los datos en la base de datos o donde sea necesario
        // Puedes acceder a los valores de los campos con getText() de los JTextField
    }
}
