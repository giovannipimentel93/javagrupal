package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MantenimientoProductoIngresoFrame extends JFrame {

    private JPanel contentPane;
    private JTextField codigoProductoTextField;
    private JTextField nombreTextField;
    private JTextField precioTextField;
    private JTextField stockActualTextField;
    private JTextField stockMinimoTextField;
    private JTextField stockMaximoTextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MantenimientoProductoIngresoFrame frame = new MantenimientoProductoIngresoFrame();
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
    public MantenimientoProductoIngresoFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new GridLayout(7, 2, 10, 10));
        setContentPane(contentPane);

        JLabel lblCodigoProducto = new JLabel("Código Producto:");
        contentPane.add(lblCodigoProducto);

        codigoProductoTextField = new JTextField();
        contentPane.add(codigoProductoTextField);
        codigoProductoTextField.setColumns(10);

        JLabel lblNombre = new JLabel("Nombre:");
        contentPane.add(lblNombre);

        nombreTextField = new JTextField();
        contentPane.add(nombreTextField);
        nombreTextField.setColumns(10);

        JLabel lblPrecio = new JLabel("Precio:");
        contentPane.add(lblPrecio);

        precioTextField = new JTextField();
        contentPane.add(precioTextField);
        precioTextField.setColumns(10);

        JLabel lblStockActual = new JLabel("Stock Actual:");
        contentPane.add(lblStockActual);

        stockActualTextField = new JTextField();
        contentPane.add(stockActualTextField);
        stockActualTextField.setColumns(10);

        JLabel lblStockMinimo = new JLabel("Stock Mínimo:");
        contentPane.add(lblStockMinimo);

        stockMinimoTextField = new JTextField();
        contentPane.add(stockMinimoTextField);
        stockMinimoTextField.setColumns(10);

        JLabel lblStockMaximo = new JLabel("Stock Máximo:");
        contentPane.add(lblStockMaximo);

        stockMaximoTextField = new JTextField();
        contentPane.add(stockMaximoTextField);
        stockMaximoTextField.setColumns(10);

        JButton btnCrear = new JButton("Crear");
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí debes agregar la lógica para crear el producto
                crearProducto();
            }
        });
        contentPane.add(btnCrear);
    }

    private void crearProducto() {
        // Implementa la lógica para crear el producto en la base de datos
        // Puedes acceder a los valores de los campos con getText() de los JTextField
    }
}
