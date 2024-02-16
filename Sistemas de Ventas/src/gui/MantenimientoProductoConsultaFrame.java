package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MantenimientoProductoConsultaFrame extends JFrame {

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
                    MantenimientoProductoConsultaFrame frame = new MantenimientoProductoConsultaFrame();
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
    public MantenimientoProductoConsultaFrame() {
        setTitle("Consultar Producto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 569, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCodigoProducto = new JLabel("C�digo Producto:");
        lblCodigoProducto.setBounds(5, 6, 207, 27);
        contentPane.add(lblCodigoProducto);

        codigoProductoTextField = new JTextField();
        codigoProductoTextField.setBounds(222, 6, 207, 27);
        contentPane.add(codigoProductoTextField);
        codigoProductoTextField.setColumns(10);

        // Bot�n Buscar al lado del campo "C�digo Producto"
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(439, 8, 89, 23);
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aqu� debes agregar la l�gica para buscar los datos
                buscarProducto();
            }
        });
        contentPane.add(btnBuscar);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(5, 43, 207, 27);
        contentPane.add(lblNombre);

        nombreTextField = new JTextField();
        nombreTextField.setBounds(222, 43, 207, 27);
        contentPane.add(nombreTextField);
        nombreTextField.setColumns(10);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(5, 80, 207, 27);
        contentPane.add(lblPrecio);

        precioTextField = new JTextField();
        precioTextField.setBounds(222, 80, 207, 27);
        contentPane.add(precioTextField);
        precioTextField.setColumns(10);

        JLabel lblStockActual = new JLabel("Stock Actual:");
        lblStockActual.setBounds(5, 117, 207, 27);
        contentPane.add(lblStockActual);

        stockActualTextField = new JTextField();
        stockActualTextField.setBounds(222, 117, 207, 27);
        contentPane.add(stockActualTextField);
        stockActualTextField.setColumns(10);

        JLabel lblStockMinimo = new JLabel("Stock M�nimo:");
        lblStockMinimo.setBounds(5, 154, 207, 27);
        contentPane.add(lblStockMinimo);

        stockMinimoTextField = new JTextField();
        stockMinimoTextField.setBounds(222, 154, 207, 27);
        contentPane.add(stockMinimoTextField);
        stockMinimoTextField.setColumns(10);

        JLabel lblStockMaximo = new JLabel("Stock M�ximo:");
        lblStockMaximo.setBounds(5, 191, 207, 27);
        contentPane.add(lblStockMaximo);

        stockMaximoTextField = new JTextField();
        stockMaximoTextField.setBounds(222, 191, 207, 27);
        contentPane.add(stockMaximoTextField);
        stockMaximoTextField.setColumns(10);
        
        JButton btnNewButton = new JButton("Cerrar");
        btnNewButton.setBounds(222, 229, 207, 23);
        contentPane.add(btnNewButton);
    }

    private void buscarProducto() {
        // Implementa la l�gica para buscar los datos seg�n el c�digo del producto
        // y cargarlos en los campos correspondientes
    }
}
