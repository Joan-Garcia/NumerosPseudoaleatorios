/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rodo
 */
public class ConstanteMultiplicativoSC {

    int producto;
    float r;

    public ConstanteMultiplicativoSC() {
    }

    public void Calcular(int x0, int a, int c, int m, int iter, String nombre) {
        if ((a + c + m + x0) % 1 == 0) {
            ArrayList<String> equis = new ArrayList();

            for (int i = 0; i < iter; i++) {
                producto = ((a * x0) + c) % m;
                x0 = producto;
                r = (float) producto / (m - 1);
                equis.add(Float.toString(r));
            }
            new WriteInFile(listaNumeros(equis), nombre);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Solo valores enteros");
            System.exit(0);
        }

    }

    private ArrayList<String> listaNumeros(ArrayList<String> equis) {
        ArrayList<String> r = new ArrayList();
        int j = 0;
        for (int i = 0; i < equis.size(); i++) {
            j++;
            r.add("r" + j + " = " + equis.get(i));

        }
        return r;

    }

}
