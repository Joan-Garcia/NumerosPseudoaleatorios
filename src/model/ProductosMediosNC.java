/*
 Clase Algoritmo no congruencial productos medios
Elaborado por: Carlos Fabricio Alfaro Alonso
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductosMediosNC {

    int D, x1, x0, iter;
    double r;
    long producto;

    //constructor recibe los parametros de la interfaz
    public ProductosMediosNC(int d, int xsegunda, int xinicial, int iteraciones) {
        x0 = xinicial;
        x1 = xsegunda;
        D = d;
        iter = iteraciones;
    }

    private void Calcular() {

        ArrayList<Integer> equis = new ArrayList();
        if (D == Integer.toString(x0).length() && D > 3) {
            for (int i = 0; i < iter; i++) {
                producto = x0 * x1;
                x0 = x1;
                x1 =  siguientenumero(producto,i);
               
            }
        } else {
            JOptionPane.showMessageDialog(null, "El valor de la semilla debe ser igual al de D");
        }

    }

    private int siguientenumero(long producto, int i) {
        String snumero2 = Long.toString(producto);
        int tam2 = snumero2.length();
        int tam1 = Integer.toString(x0).length();
        int primerc = (tam2 - tam1) / 2;
        if(tam2%2==0){
        String snumero3 = snumero2.substring(primerc, primerc + tam1);
      
        System.out.println(i + ". " + snumero3);
        int numero1;
        return numero1 = Integer.parseInt(snumero3);
  } else{
             String snumero3 = snumero2.substring(primerc, primerc + tam1+1);
      
        System.out.println(i + ". " + snumero3);
        int numero1;
        return numero1 = Integer.parseInt(snumero3);
        }
    }
    public static void main(String[] args) {
        new ProductosMediosNC(5,90111,11111,10).Calcular();
    }

}
