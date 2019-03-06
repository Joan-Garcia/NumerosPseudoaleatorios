/*
 Clase Algoritmo no congruencial productos medios
Elaborado por: Carlos Fabricio Alfaro Alonso
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductosMediosNC {

    int D, x1, x0, iter, tam2, tam1, primerc, numero1, referencia;
    long producto;

    public ProductosMediosNC() {
    }

    public void Calcular(int d, int xsegunda, int xinicial, int iteraciones) {
        x0 = xinicial;
        x1 = xsegunda;
        D = d;
        iter = iteraciones;

        ArrayList<String> equis = new ArrayList();

        if (D == Integer.toString(x0).length() && D >= 3) {
            for (int i = 0; i < iter; i++) {

                producto = x0 * x1;
                x0 = x1;
                String snumero2 = Long.toString(producto);
                tam2 = snumero2.length();
                tam1 = D;
                primerc = (tam2 - tam1) / 2;
                String snumero3 = snumero2.substring(primerc, primerc + tam1);
                numero1 = Integer.parseInt(snumero3);

                x1 = numero1;
                equis.add(snumero3);

            }
            new WriteInFile(listaNumeros(equis), "Productos Medios No Congruencial");
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
