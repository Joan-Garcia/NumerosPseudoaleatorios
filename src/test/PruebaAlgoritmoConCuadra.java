package test;

import java.util.Scanner;
import model.variables;

/**
 *
 * @author HunterXB
 */
public class PruebaAlgoritmoConCuadra {

    Scanner scan = new Scanner(System.in);
    variables vari = new variables();

    public static void main(String[] args) {
        PruebaAlgoritmoConCuadra acc = new PruebaAlgoritmoConCuadra();
        String op;
        Scanner scanOp = new Scanner(System.in);
        do {
            acc.inicio();
            acc.datos(acc.vari);
            acc.resultados();
            acc.calcular(acc.vari);

            System.out.println("Desea calcular otros numeros??");
            op = scanOp.nextLine();
        } while (op.charAt(0) == 's' || op.charAt(0) == 'S');
    }

    public void calcular(variables n) {
        int m = (int) Math.pow(2, vari.getG());
        int xi = vari.getXo();
        int[] xo = new int[m + 2];
        xo[0] = -1;
        for (int i = 1; i <= m + 1; i++) {
            xi = ((vari.getA() * (((int) Math.pow(xi, 2)))) + (vari.getB() * xi) + vari.getC()) % m;
            xo[i] = xi;
            System.out.println("x" + i + "=" + xi);
            for (int j = 1; i - j > 0; j++) {
                if (xo[i] == xo[i - j]) {
//                    System.out.println("x" + j + "=" + xi);
                    System.out.println("SE REPITE LA SEMILLA");
                    System.out.println("x" + (i - j) + ":" + xo[i] + " y la semilla x" + i + ":" + xo[i - j]);
                    System.exit(0);
                }
            }
        }
    }

    public void inicio() {
        System.out.println("Este programa calcula numeros aleatorios utilizando"
                + "el metodo CONGRUENCIAL CUADRATICO");
    }

    public boolean isNum(String cad) {
        try {
            Integer.parseInt(cad);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Debes teclear un numero");
            return false;
        }
    }

    public void datos(variables n) {
        String aux;

        do {
            do {
                System.out.println("Introduzca el numero Xo : ");
                aux = scan.nextLine();
            } while (!isNum(aux));
        } while (!vari.setXo(Integer.parseInt(aux)));
        do {
            do {
                System.out.println("Introduzca el numero a : ");
                aux = scan.nextLine();
            } while (!isNum(aux));
        } while (!vari.setA(Integer.parseInt(aux)));
        do {
            do {
                System.out.println("Introduzca el numero b : ");
                aux = scan.nextLine();
            } while (!isNum(aux));
        } while (!vari.setB(Integer.parseInt(aux)));
        do {
            do {
                System.out.println("Introduzca el numero c : ");
                aux = scan.nextLine();
            } while (!isNum(aux));
        } while (!vari.setC(Integer.parseInt(aux)));
        do {
            do {
                System.out.println("Introduzca el numero g : ");
                aux = scan.nextLine();
            } while (!isNum(aux));
        } while (!vari.setG(Integer.parseInt(aux)));
    }

    public void resultados() {
        System.out.println("Damos los numeros");
        System.out.println("a: " + vari.getA());
        System.out.println("b: " + vari.getB());
        System.out.println("c: " + vari.getC());
        System.out.println("g: " + vari.getG());
        System.out.println("Xo: " + vari.getXo());
        int m = (int) Math.pow(2, vari.getG());
        System.out.println("m: " + m);
    }
}
