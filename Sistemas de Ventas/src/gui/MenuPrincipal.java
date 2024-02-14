package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        // Configurar la ventana principal
        setTitle("Sistema de Gestión");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Menú principal
        JMenu menuPrincipal = new JMenu("Menú Principal");
        menuBar.add(menuPrincipal);

        // Submenús del menú principal
        JMenuItem mantenimientoItem = new JMenuItem("Mantenimiento");
        JMenuItem ventasItem = new JMenuItem("Ventas");
        JMenuItem almacenItem = new JMenuItem("Almacén");
        JMenuItem reportesItem = new JMenuItem("Reportes");

        // Agregar los elementos al menú principal
        menuPrincipal.add(mantenimientoItem);
        menuPrincipal.add(ventasItem);
        menuPrincipal.add(almacenItem);
        menuPrincipal.add(reportesItem);

        // Submenú Mantenimiento
        JMenu menuMantenimiento = new JMenu("Mantenimiento");
        menuBar.add(menuMantenimiento);

        // Submenús del menú Mantenimiento
        JMenuItem clientesItem = new JMenuItem("Clientes");
        JMenuItem productosItem = new JMenuItem("Productos");

        // Agregar los elementos al menú Mantenimiento
        menuMantenimiento.add(clientesItem);
        menuMantenimiento.add(productosItem);

        // Manejadores de eventos para las opciones del menú
        mantenimientoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para la opción Mantenimiento
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Acceso a Mantenimiento");
            }
        });

        clientesItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para la opción Clientes
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Acceso a Clientes");
            }
        });

        productosItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para la opción Productos
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Acceso a Productos");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
}
