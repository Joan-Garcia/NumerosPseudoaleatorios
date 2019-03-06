/*
Clase de prueba de escritura en el archivo.
*/
package test;

import java.util.ArrayList;
import model.WriteInFile;


public class PruebaWriter {
    public static void main(String[] args){
        ArrayList<String> n = new ArrayList();
        WriteInFile w = new WriteInFile(n, "prueba1");
    }
}
