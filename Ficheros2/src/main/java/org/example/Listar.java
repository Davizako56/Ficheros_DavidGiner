package org.example;
import java.io.File;

public class Listar {
    public static void main(String[] args) {
        File directorio = new File("src/main/resources");

        String[] archivos = directorio.list();

        if (archivos != null && archivos.length > 0) {

            for (String archivo : archivos) {
                System.out.println(archivo);
            }
        }else{
            System.out.println("No existen ficheros en el directorio " + directorio.getName());
        }

        // OPCION 2: Obtener pile para acceder a todas sus propiedades

        File[] ficheros = directorio.listFiles();

        if (ficheros != null && ficheros.length > 0) {

            for (File fichero : ficheros) {
                System.out.println("Fichero " + fichero.getName() + " con tamaño " + fichero.length() + " bytes.");
            }
        }else{
            System.out.println("No existen ficheros en el directorio");
        }
    }
}
