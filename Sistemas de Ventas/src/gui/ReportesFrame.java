package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JList;

public class ReportesFrame extends JFrame {

    public ReportesFrame() {
        setTitle("Generación de Reportes");
        setSize(400, 444);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JButton btnListadoVentas = new JButton("Listado de Ventas");
        btnListadoVentas.setBounds(50, 30, 150, 30);
        btnListadoVentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generarListadoVentas();
            }
        });
        panel.add(btnListadoVentas);

        JButton btnStockMinimo = new JButton("Stock por debajo del mínimo");
        btnStockMinimo.setBounds(50, 70, 250, 30);
        btnStockMinimo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generarListadoStockMinimo();
            }
        });
        panel.add(btnStockMinimo);

        JButton btnUnidadesVendidas = new JButton("Unidades Vendidas acumuladas");
        btnUnidadesVendidas.setBounds(50, 110, 250, 30);
        btnUnidadesVendidas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generarListadoUnidadesVendidas();
            }
        });
        panel.add(btnUnidadesVendidas);

        JButton btnImporteTotal = new JButton("Importe Total acumulado");
        btnImporteTotal.setBounds(50, 150, 200, 30);
        btnImporteTotal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generarListadoImporteTotal();
            }
        });
        panel.add(btnImporteTotal);
        
        JTextPane textPane = new JTextPane();
        textPane.setBounds(20, 195, 330, 186);
        panel.add(textPane);
    }

    private void generarListadoVentas() {
     
    }

    private void generarListadoStockMinimo() {

    }

    private void generarListadoUnidadesVendidas() {
   
    }

    private void generarListadoImporteTotal() {
      
    }

    public static void main(String[] args) {
      
    	
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    ReportesFrame frame = new ReportesFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
