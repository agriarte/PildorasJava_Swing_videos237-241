/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pildoras.swingvideos237_241;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Pedro
 */
public class Swing_JTree {

    public static void main(String[] args) {
        MarcoLista marco = new MarcoLista();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}

class MarcoLista extends JFrame {

    private final JPanel miJPanel1;

    public MarcoLista() {
        setTitle("Ejemplo JTree");
        setBounds(100, 100, 450, 150);

        // crear panel del JTree 
        miJPanel1 = new JPanel();

        miJPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
        miJPanel1.setLayout(new BorderLayout(0, 0));
        setContentPane(miJPanel1);

        DefaultMutableTreeNode nRaiz = new DefaultMutableTreeNode("Mundo");
        //--- Colombia
        DefaultMutableTreeNode nPais = new DefaultMutableTreeNode("Colombia");
        nRaiz.add(nPais);

        DefaultMutableTreeNode rAndina = new DefaultMutableTreeNode("Andina");
        nPais.add(rAndina);
        DefaultMutableTreeNode rCaribe = new DefaultMutableTreeNode("Caribe");
        nPais.add(rCaribe);

        //--- España
        DefaultMutableTreeNode nPais2 = new DefaultMutableTreeNode("España");
        nRaiz.add(nPais2);
        DefaultMutableTreeNode rCata = new DefaultMutableTreeNode("Catalunya");
        nPais2.add(rCata);
        DefaultMutableTreeNode bcn = new DefaultMutableTreeNode("Barcelona");
        rCata.add(bcn);

        DefaultMutableTreeNode rVale = new DefaultMutableTreeNode("Valencia");
        nPais2.add(rVale);
        DefaultMutableTreeNode ali = new DefaultMutableTreeNode("Alicante");
        rVale.add(ali);

        // Añadir JTree al contenedor
        JTree MArbol = new JTree(nRaiz);
        miJPanel1.add(MArbol, BorderLayout.NORTH);

        // Crear barra de scroll
        Container barra = getContentPane();
        barra.add(new JScrollPane(MArbol));

        // Crear barra de scroll método alternativo
        // en el curso se obtiene el contenedor principal donde va el JTree pero ese 
        // dato ya lo conocemos al haberlo creado en miJPanel1 = new JPanel();
        // Por tanto, esto tambien funciona en este caso:      
        //miJPanel1.add(new JScrollPane(MArbol));
    }

}
