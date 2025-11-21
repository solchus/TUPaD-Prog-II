package Ejercicio2.Punto3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            //File archivo = new File("archivo.txt");
            File archivo = new File("txt_para_error.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }
    }
}
