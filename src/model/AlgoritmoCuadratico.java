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
    boolean s;


    public void calcular(String a1, String b1, String c1, String g1, String xi1, String n1, String nombre) {

         try {
            int a =Integer.parseInt(a1);
            int b =Integer.parseInt(b1);
            int c =Integer.parseInt(c1);
            int g =Integer.parseInt(g1);
            int xi =Integer.parseInt(xi1);
            int n =Integer.parseInt(n1);
            ArrayList<String> p = new ArrayList();
            s=true;
            int m = (int) Math.pow(2, g);
            int[] xo12 = new int[m + 2];
            xo12[0] = -1;
            for (int i = 1; i < n + 1; i++) {
                if(s==true){
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
                        s=false;
                        new WriteInFile(p, nombre);
                    }
                }}
                new WriteInFile(p, nombre);
            }
        } catch (Exception e) {
            
        }
    }

}
