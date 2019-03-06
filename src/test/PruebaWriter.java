/*
Clase de prueba de escritura en el archivo.
*/
package test;

import model.WriteInFile;


public class PruebaWriter {
    public static void main(String[] args){
        String [] n = {"0.2324", "0.4634"};
        WriteInFile w = new WriteInFile(n, "prueba1");
    }
}
