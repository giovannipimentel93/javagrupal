package gui;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MantenimientoClienteEliminacionFrame extends JFrame {

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
                    MantenimientoClienteEliminacionFrame frame = new MantenimientoClienteEliminacionFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MantenimientoClienteEliminacionFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 449, 326);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel formPanel = new JPanel();
        contentPane.add(formPanel, BorderLayout.CENTER);
        formPanel.setLayout(null);

        JLabel lblCodigoCliente = new JLabel("Código Cliente:");
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

        direccionTextField = new JTextField();
        direccionTextField.setBounds(145, 121, 134, 29);
        formPanel.add(direccionTextField);
        direccionTextField.setColumns(10);

        JLabel lblTelefono = new JLabel("Teléfono:");
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

        apellidosTextField = new JTextField();
        apellidosTextField.setBounds(145, 81, 134, 29);
        formPanel.add(apellidosTextField);
        apellidosTextField.setColumns(10);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(0, 251, 423, 23);
        formPanel.add(btnEliminar);
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarDatos();
            }
        });
    }

    private void buscarDatos() {
       
    }

    private void modificarDatos() {
     
    }
}
