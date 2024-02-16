package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlmacenFrame extends JFrame {

    private JTextField codigoProductoTextField;
    private JTextField nombreProductoTextField;
    private JTextField stockActualTextField;
    private JTextField stockMinimoTextField;
    private JTextField stockMaximoTextField;
    private JTextField textField;

    public AlmacenFrame() {
        setTitle("Ingreso de Stock");
        setSize(400, 353);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JLabel lblCodigoProducto = new JLabel("Código del Producto:");
        lblCodigoProducto.setBounds(20, 30, 150, 20);
        panel.add(lblCodigoProducto);

        codigoProductoTextField = new JTextField();
        codigoProductoTextField.setBounds(180, 30, 100, 20);
        panel.add(codigoProductoTextField);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(290, 30, 80, 20);
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarProducto();
            }
        });
        panel.add(btnBuscar);

        JLabel lblNombreProducto = new JLabel("Nombre del Producto:");
        lblNombreProducto.setBounds(20, 60, 150, 20);
        panel.add(lblNombreProducto);

        nombreProductoTextField = new JTextField();
        nombreProductoTextField.setBounds(180, 60, 190, 20);
        panel.add(nombreProductoTextField);

        JLabel lblStockActual = new JLabel("Stock Actual:");
        lblStockActual.setBounds(20, 90, 150, 20);
        panel.add(lblStockActual);

        stockActualTextField = new JTextField();
        stockActualTextField.setBounds(180, 90, 100, 20);
        panel.add(stockActualTextField);

        JLabel lblStockMinimo = new JLabel("Stock Mínimo:");
        lblStockMinimo.setBounds(20, 120, 150, 20);
        panel.add(lblStockMinimo);

        stockMinimoTextField = new JTextField();
        stockMinimoTextField.setBounds(180, 120, 100, 20);
        panel.add(stockMinimoTextField);

        JLabel lblStockMaximo = new JLabel("Stock Máximo:");
        lblStockMaximo.setBounds(20, 150, 150, 20);
        panel.add(lblStockMaximo);

        stockMaximoTextField = new JTextField();
        stockMaximoTextField.setBounds(180, 150, 100, 20);
        panel.add(stockMaximoTextField);

        JButton btnIngresar = new JButton("Ingresar Stock");
        btnIngresar.setBounds(115, 256, 150, 30);
        btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ingresarStock();
            }
        });
        panel.add(btnIngresar);
        
        textField = new JTextField();
        textField.setBounds(180, 181, 100, 20);
        panel.add(textField);
        
        JLabel lblAgregarstock = new JLabel("AgregarStock:");
        lblAgregarstock.setBounds(20, 181, 150, 20);
        panel.add(lblAgregarstock);
    }

    private void buscarProducto() {
        // Aquí deberías implementar la lógica para buscar el producto según el código.
        // Puedes llenar los campos de nombre, stock actual, stock mínimo y stock máximo si el producto se encuentra.
        // En caso contrario, puedes mostrar un mensaje de error.
        JOptionPane.showMessageDialog(this, "Producto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void ingresarStock() {
        // Aquí deberías implementar la lógica para verificar y actualizar el stock en tu almacén
        // por ejemplo, puedes tener una clase Almacen con métodos para gestionar el stock.

        // Si el ingreso se realiza correctamente, puedes mostrar un mensaje de éxito.
        JOptionPane.showMessageDialog(this, "Stock ingresado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Puedes cerrar el JFrame después de ingresar el stock.
        dispose();
    }

    public static void main(String[] args) {
        // Puedes probar el JFrame de la siguiente manera:
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AlmacenFrame frame = new AlmacenFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
