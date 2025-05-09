package org.example;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
            File fichero = new File("src/main/resources/Hola.txt");

            try {
                fichero.createNewFile();
                System.out.println("El fichero " + fichero.getName() + " ha sido creado con éxito.");
            }catch (IOException e) {
                System.out.println("Algo ha salido mal.");
                e.printStackTrace();
            }

            if (fichero.isFile()) {
                System.out.println(fichero.getName() + " existe.");
            }else{
                System.out.println(fichero.getName() + " no existe.");
            }

        System.out.println("Tamaño (carácteres): " + fichero.length());
        System.out.println("Ruta: " + fichero.getAbsolutePath());

        File carpeta = new File("src/main/pruebas");

        carpeta.mkdir();

        if (carpeta.exists()) {
            System.out.println(carpeta.getName() + " existe.");
        }else{
            System.out.println(carpeta.getName() + " no existe.");
        }
    }
}