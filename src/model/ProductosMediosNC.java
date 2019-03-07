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

    public void calcular(int d, int x1, int x0, int iter, String nombre) {

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

                x1 = numero1;
                equis.add(snumero3);

            }
            new WriteInFile(listaNumeros(equis), nombre);
        } else {
            JOptionPane.showMessageDialog(null,
                    "El valor de la semilla debe ser igual al de D");
            System.exit(0);
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
}
