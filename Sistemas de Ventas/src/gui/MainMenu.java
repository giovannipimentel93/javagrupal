package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainMenu extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainMenu frame = new MainMenu();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                setVisible(false);
            }
        });

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnVentas = new JMenu("Ventas");
        mnVentas.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        menuBar.add(mnVentas);

        JMenuItem SubVentas = new JMenuItem("Ventas");
        SubVentas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                VentasFrame ventasFrame = new VentasFrame();
                ventasFrame.setVisible(true);
            }
        });
        mnVentas.add(SubVentas);

        JMenu mnAlmacen = new JMenu("Almacen");
        mnAlmacen.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        menuBar.add(mnAlmacen);

        JMenuItem SubAlmacen = new JMenuItem("Almacen");
        SubAlmacen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AlmacenFrame almacenFrame = new AlmacenFrame();
                almacenFrame.setVisible(true);
            }
        });
        mnAlmacen.add(SubAlmacen);

        JMenu mnReportes1 = new JMenu("Reportes");
        menuBar.add(mnReportes1);

        JMenuItem SubReportes = new JMenuItem("Reportes");
        SubReportes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReportesFrame reportesFrame = new ReportesFrame();
                reportesFrame.setVisible(true);
            }
        });
        mnReportes1.add(SubReportes);

        JMenu mnMantenimiento = new JMenu("Mantenimiento");
        menuBar.add(mnMantenimiento);

        JMenu menuClientes = new JMenu("Clientes");
        mnMantenimiento.add(menuClientes);

        JMenuItem clienteIngreso = new JMenuItem("Ingreso");
        clienteIngreso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoClienteIngresoFrame ingresoFrame = new MantenimientoClienteIngresoFrame();
                ingresoFrame.setVisible(true);
            }
        });
        menuClientes.add(clienteIngreso);

        JMenuItem clienteModificacion = new JMenuItem("Modificacion");
        clienteModificacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoClienteModificacionFrame modificacionFrame = new MantenimientoClienteModificacionFrame();
                modificacionFrame.setVisible(true);
            }
        });
        menuClientes.add(clienteModificacion);

        JMenuItem clienteConsulta = new JMenuItem("Consulta");
        clienteConsulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoClienteConsultaFrame consultaFrame = new MantenimientoClienteConsultaFrame();
                consultaFrame.setVisible(true);
            }
        });
        menuClientes.add(clienteConsulta);

        JMenuItem clienteEliminacion = new JMenuItem("Eliminacion");
        clienteEliminacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoClienteEliminacionFrame eliminacionFrame = new MantenimientoClienteEliminacionFrame();
                eliminacionFrame.setVisible(true);
            }
        });
        menuClientes.add(clienteEliminacion);

        JMenuItem clienteListado = new JMenuItem("Listado");
        menuClientes.add(clienteListado);

        JMenu menuProductos = new JMenu("Productos");
        mnMantenimiento.add(menuProductos);

        JMenuItem productoIngreso = new JMenuItem("Ingreso");
        productoIngreso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoProductoIngresoFrame ingresoFrame = new MantenimientoProductoIngresoFrame();
                ingresoFrame.setVisible(true);
            }
        });
        menuProductos.add(productoIngreso);

        JMenuItem productoModificacion = new JMenuItem("Modificacion");
        productoModificacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoProductoModificacionFrame modificacionFrame = new MantenimientoProductoModificacionFrame();
                modificacionFrame.setVisible(true);
            }
        });
        menuProductos.add(productoModificacion);

        JMenuItem productoConsulta = new JMenuItem("Consulta");
        productoConsulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoProductoConsultaFrame consultaFrame = new MantenimientoProductoConsultaFrame();
                consultaFrame.setVisible(true);
            }
        });
        menuProductos.add(productoConsulta);

        JMenuItem productoEliminacion = new JMenuItem("Eliminacion");
        productoEliminacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoProductoEliminacionFrame eliminacionFrame = new MantenimientoProductoEliminacionFrame();
                eliminacionFrame.setVisible(true);
            }
        });
        menuProductos.add(productoEliminacion);

        JMenuItem productoListado = new JMenuItem("Listado");
        productoListado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MantenimientoProductoListadoFrame listadoFrame = new MantenimientoProductoListadoFrame();
                listadoFrame.setVisible(true);
            }
        });
        menuProductos.add(productoListado);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
    }
}
