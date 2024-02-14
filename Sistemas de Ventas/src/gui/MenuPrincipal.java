package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        // Configurar la ventana principal
        setTitle("Sistema de Gesti�n");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear la barra de men�
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Men� principal
        JMenu menuPrincipal = new JMenu("Men� Principal");
        menuBar.add(menuPrincipal);

        // Submen�s del men� principal
        JMenuItem mantenimientoItem = new JMenuItem("Mantenimiento");
        JMenuItem ventasItem = new JMenuItem("Ventas");
        JMenuItem almacenItem = new JMenuItem("Almac�n");
        JMenuItem reportesItem = new JMenuItem("Reportes");

        // Agregar los elementos al men� principal
        menuPrincipal.add(mantenimientoItem);
        menuPrincipal.add(ventasItem);
        menuPrincipal.add(almacenItem);
        menuPrincipal.add(reportesItem);

        // Submen� Mantenimiento
        JMenu menuMantenimiento = new JMenu("Mantenimiento");
        menuBar.add(menuMantenimiento);

        // Submen�s del men� Mantenimiento
        JMenuItem clientesItem = new JMenuItem("Clientes");
        JMenuItem productosItem = new JMenuItem("Productos");

        // Agregar los elementos al men� Mantenimiento
        menuMantenimiento.add(clientesItem);
        menuMantenimiento.add(productosItem);

        // Manejadores de eventos para las opciones del men�
        mantenimientoItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // L�gica para la opci�n Mantenimiento
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Acceso a Mantenimiento");
            }
        });

        clientesItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // L�gica para la opci�n Clientes
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Acceso a Clientes");
            }
        });

        productosItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // L�gica para la opci�n Productos
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
