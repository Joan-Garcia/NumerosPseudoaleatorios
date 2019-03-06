/*
Clase que imprime los numeros en un archivo .txt
Autor: Joan Roberto Garcia Garcia
*/
package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class WriteInFile {
    File f;
    FileWriter writer;
    
    public WriteInFile(ArrayList<String>  numbers, String name){
        try {
            f = new File("src/outputs/" + name + ".txt");
            
            writer = new FileWriter(f);
            
            for(String num:numbers){
                writer.write(num + "\r\n");
            }
            
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
        }
    }
}
