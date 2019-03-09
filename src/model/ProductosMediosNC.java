/*
 Clase Algoritmo no congruencial productos medios
 Elaborado por: Carlos Fabricio Alfaro Alonso
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductosMediosNC {

    int tam2, tam1, primerc, numero1, referencia;
    long producto;

    public ProductosMediosNC() {
    }

    public void calcular(String d1, String x11, String x01, String iter1, String nombre) {

        try {
            int d = Integer.parseInt(d1);
            int x1 = Integer.parseInt(x11);
            int x0 = Integer.parseInt(x01);
            int iter = Integer.parseInt(iter1);
            
            ArrayList<String> equis = new ArrayList();

            if (d == Integer.toString(x0).length() && d >= 3) {
                for (int i = 0; i < iter; i++) {

                    producto = x0 * x1;
                    x0 = x1;
                    String snumero2 = Long.toString(producto);
                    tam2 = snumero2.length();
                    tam1 = d;
                    primerc = (tam2 - tam1) / 2;
                    String snumero3 = snumero2.substring(primerc, primerc + tam1);
                    numero1 = Integer.parseInt(snumero3);
                    equis.add(snumero3);
                    System.out.println(numero1);
                    busqueda(numero1, equis, nombre);

                    x1 = numero1;

                }
                new WriteInFile(listaNumeros(equis), nombre);

            } else {
                JOptionPane.showMessageDialog(null,
                        "El valor de la semilla debe ser igual al de D");
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Solo valores enteros");
        }
    }

    private ArrayList<String> listaNumeros(ArrayList<String> equis) {
        ArrayList<String> r = new ArrayList();
        int j = 0;
        for (int i = 0; i < equis.size(); i++) {
            j++;
            r.add("r" + j + " = 0." + equis.get(i));

        }
        return r;

    }

    private int busqueda(int producto, ArrayList<String> equis, String nombre) {
        if (equis.size() > 1) {

            for (int j = equis.size() - 1, i = 0; i < equis.size() - 1; i++) {
                if (equis.get(i).equals(equis.get(j))) {
                    JOptionPane.showMessageDialog(null, "SE REPITE LA SEMILLA");
                    JOptionPane.showMessageDialog(null, "x" + (i + 1) + ": "
                            + equis.get(i) + " y la semilla x" + (j + 2) + ": " + equis.get(j));
                    new WriteInFile(listaNumeros(equis), nombre);
                    System.exit(0);

                }
            }
        } else {
            return producto;
        }
        return producto;

    }
}
