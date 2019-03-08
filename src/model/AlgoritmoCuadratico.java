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
 * @author HunterXB
 */
public class AlgoritmoCuadratico {

    ArrayList<String> p = new ArrayList();

    public void calcular(int a, int b, int c, int g, int xi, int n, String nombre) {

        int m = (int) Math.pow(2, g);
        int[] xo12 = new int[m + 2];
        xo12[0] = -1;

        for (int i = 1; i < n+1; i++) {
            xi = ((a * (int) Math.pow(xi, 2)) + (b * xi) + c) % m;
            xo12[i] = xi;
            float r = ((float) xi) / ((float) (m - 1));
            p.add("r" + i + ": " + String.valueOf(r));
            for (int j = 1; i - j > 0; j++) {
                if (xo12[i] == xo12[i - j]) {
//                    System.out.println("x" + j + "=" + xi);
                    JOptionPane.showMessageDialog(null, "SE REPITE LA SEMILLA");
                    JOptionPane.showMessageDialog(null, "x" + (i - j) + ":"
                            + xo12[i] + " y la semilla x" + i + ":" + xo12[i - j]);
                    new WriteInFile(p, nombre);
                    System.exit(0);
                }
            }
        }
        new WriteInFile(p, nombre);

    }

}
