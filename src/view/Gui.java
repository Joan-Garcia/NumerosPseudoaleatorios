/*
Interfaz de usuario.
Autor: Joan Roberto Garcia Garcia
*/
package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
    private final JFrame window;
    private final JPanel panel;
    
    public Gui(){
        window = new JFrame();
        panel = new JPanel();
    }
    
    private void windowSettings(){
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
    }
    
    private void panelSettings(){
        panel.setLayout(null);
        
    }
    
    private void show(){
        window.getContentPane().add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    public void launch(){
        windowSettings();
        panelSettings();
        show();
    }
}
