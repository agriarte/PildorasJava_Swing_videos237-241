/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

// Ejemplo de JList íntegro desde código.

package pildoras.swingvideos237_241;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Pedro
 */
public class Swing_JList {

    public static void main(String[] args) {
        MarcoLista marco = new MarcoLista();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

}

class MarcoLista extends JFrame {

    private JList<String> listaMeses;
    private JPanel laminaLista, laminaLabel;
    private JLabel rotuloMeses;

    public MarcoLista() {
        setTitle("Lista de meses");
        setBounds(500, 300, 500, 300);
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};

        //instanciar objeto JList<>
        listaMeses = new JList<>(meses);
        //num. elementos visibles del JList 4
        listaMeses.setVisibleRowCount(4);
        //crear barra de desplazamiento
        JScrollPane barraMeses = new JScrollPane(listaMeses);

        // listaMeses a la escucha
        listaMeses.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                List<String> elementos = listaMeses.getSelectedValuesList();

                StringBuilder textoseleccionado = new StringBuilder("Meses seleccionados: ");

                for (String iterador : elementos) {
                    String mes = iterador;

                    textoseleccionado.append(mes);
                    textoseleccionado.append(" ");
                }
                rotuloMeses.setText(textoseleccionado.toString());
            }
        });

        // crear panel de la lista y añadir componente
        laminaLista = new JPanel();
        laminaLista.add(barraMeses);

        // crear otro panel con un JLabel
        laminaLabel = new JPanel();
        rotuloMeses = new JLabel("Mes seleccionado: ");
        laminaLabel.add(rotuloMeses);

        // añadir los paneles a los border layouts correspondientes.
        add(laminaLista, BorderLayout.NORTH);
        add(laminaLabel, BorderLayout.SOUTH);

    }

}
