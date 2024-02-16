package gui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentasFrame extends JFrame {

  
    private String codigoCliente;
    private String nombresApellidosCliente;
    private String codigoProducto;
    private String nombreProducto;
    private int cantidadUnidades;
    private double precioUnitario;
    private double stockActual;


    private JTextField codigoClienteField, nombresApellidosField, codigoProductoField,
            nombreProductoField, cantidadUnidadesField, precioUnitarioField, stockActualField;
    private JButton realizarVentaButton;
    private JTextArea textArea;
    private JButton ButtonConsultar;
    private JButton ButtonConsultarCodigo;

    public VentasFrame() {
     
        setTitle("VentasFrame");
        setSize(595, 579);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      
        codigoClienteField = new JTextField(10);
        codigoClienteField.setBounds(0, 14, 433, 37);
        nombresApellidosField = new JTextField(20);
        nombresApellidosField.setBounds(0, 65, 433, 37);
        codigoProductoField = new JTextField(10);
        codigoProductoField.setBounds(0, 116, 433, 37);
        nombreProductoField = new JTextField(20);
        nombreProductoField.setBounds(0, 167, 433, 37);
        cantidadUnidadesField = new JTextField(5);
        cantidadUnidadesField.setBounds(0, 218, 433, 37);
        precioUnitarioField = new JTextField(8);
        precioUnitarioField.setBounds(0, 269, 433, 37);
        stockActualField = new JTextField(5);
        stockActualField.setBounds(0, 320, 433, 37);
        realizarVentaButton = new JButton("Realizar Venta");
        realizarVentaButton.setBounds(7, 355, 101, 23);

      
        realizarVentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarVenta();
            }
        });
        getContentPane().setLayout(null);

       
        JLabel label = new JLabel("Código del Cliente:");
        label.setBounds(8, 0, 90, 14);
        getContentPane().add(label);
        getContentPane().add(codigoClienteField);
        JLabel label_1 = new JLabel("Nombres y Apellidos del Cliente:");
        label_1.setBounds(8, 51, 153, 14);
        getContentPane().add(label_1);
        getContentPane().add(nombresApellidosField);
        JLabel label_2 = new JLabel("Código del Producto:");
        label_2.setBounds(8, 102, 100, 14);
        getContentPane().add(label_2);
        getContentPane().add(codigoProductoField);
        JLabel label_3 = new JLabel("Nombre del Producto:");
        label_3.setBounds(8, 153, 104, 14);
        getContentPane().add(label_3);
        getContentPane().add(nombreProductoField);
        JLabel label_4 = new JLabel("Cantidad de Unidades:");
        label_4.setBounds(8, 204, 109, 14);
        getContentPane().add(label_4);
        getContentPane().add(cantidadUnidadesField);
        JLabel label_5 = new JLabel("Precio Unitario:");
        label_5.setBounds(8, 255, 73, 14);
        getContentPane().add(label_5);
        getContentPane().add(precioUnitarioField);
        JLabel label_6 = new JLabel("Stock Actual:");
        label_6.setBounds(8, 306, 63, 14);
        getContentPane().add(label_6);
        getContentPane().add(stockActualField);
        getContentPane().add(realizarVentaButton);
        
        textArea = new JTextArea();
        textArea.setBounds(8, 391, 485, 142);
        getContentPane().add(textArea);
        
        ButtonConsultar = new JButton("Consultar");
        ButtonConsultar.setBounds(443, 21, 89, 23);
        getContentPane().add(ButtonConsultar);
        
        ButtonConsultarCodigo = new JButton("Consultar");
        ButtonConsultarCodigo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        ButtonConsultarCodigo.setBounds(443, 123, 89, 23);
        getContentPane().add(ButtonConsultarCodigo);
    }

   
    private void realizarVenta() {
       
    }

   
    private void limpiarCampos() {
       
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentasFrame().setVisible(true);
            }
        });
    }
}
