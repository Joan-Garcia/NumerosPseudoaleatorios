/*
Interfaz de usuario.
Autor: Joan Roberto Garcia Garcia
*/
package view;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Gui {
    private final JFrame window;
    private final JPanel panel;
    private final JRadioButton pmedios, cuadratico, constante;
    private final ButtonGroup rgroup;
    
    public Gui(){
        window = new JFrame();
        panel = new JPanel();
        pmedios = new JRadioButton("Productos Medios");
        cuadratico = new JRadioButton("Cuadratico");
        constante = new JRadioButton("Constante Multiplicativo");
        rgroup = new ButtonGroup();
    }
    
    private void windowSettings(){
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
    }
    
    private void rGroupSettings(){
        rgroup.add(pmedios);
        rgroup.add(cuadratico);
        rgroup.add(constante);
        
        pmedios.setBounds(20, 20, 150, 20);
        cuadratico.setBounds(180, 20, 100, 20);
        constante.setBounds(300, 20, 200, 20);
    }
    
    private void panelSettings(){
        panel.setLayout(null);
        panel.add(pmedios);
        panel.add(cuadratico);
        panel.add(constante);
    }
    
    private void show(){
        window.getContentPane().add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    public void launch(){
        windowSettings();
        rGroupSettings();
        panelSettings();
        show();
    }
}
