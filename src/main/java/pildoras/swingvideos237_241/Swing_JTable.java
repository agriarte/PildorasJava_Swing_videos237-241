/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras.swingvideos237_241;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Pedro
 */
public class Swing_JTable {

    public static void main(String[] args) {
        MarcoLista marco = new MarcoLista();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

class MarcoLista extends JFrame {

    private final JPanel miJPanel1;
    
    // columnas y filas de la tabla
    private String[] nombresColumnas = {"Nombre", "Radio", "Lunas", "Gaseoso"};
    private Object[][] datosFilas = {
        {"Mercurio", 2440, 0, false},
        {"Venus", 6052, 0, false},
        {"Tierra", 6378, 1, false},
        {"Marte", 3397, 2, false},
        {"Jupiter", 71492, 18, true},
        {"Saturno", 60268, 18, true},
        {"Urano", 25559, 17, true},
        {"Neptuno", 24766, 8, true},
        {"Plutón", 1137, 1, false},};

    public MarcoLista() {
        setTitle("Ejemplo JTree");
        setBounds(100, 100, 450, 150);

        // crear JTable
        JTable tablaPlanetas = new JTable(datosFilas, nombresColumnas);
        
        
        // crear panel del JTable 
        miJPanel1 = new JPanel();

        miJPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
        miJPanel1.setLayout(new BorderLayout(0, 0));
        
        miJPanel1.add(new JScrollPane(tablaPlanetas),BorderLayout.CENTER);
        
        JButton btnImprimir = new JButton("Imprimir Tabla");
        miJPanel1.add(btnImprimir, BorderLayout.SOUTH);
        btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    tablaPlanetas.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(MarcoLista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        setContentPane(miJPanel1);
    }
}
