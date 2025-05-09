package org.example;
import java.io.File;
import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true) {

            System.out.println("Elija una carpeta");
            String carpeta = entrada.next();

            File validar_carpeta = new File(carpeta);

            if (validar_carpeta.exists()){
                String[] archivos = validar_carpeta.list();

                if (archivos != null && archivos.length > 0) {

                    for (String archivo : archivos) {

                        if (archivo.endsWith(".txt")) {
                            System.out.println(archivo);
                        }
                    }
                    break;
                }
            }else{
                System.out.println("La carpeta no existe. Escríbela bien!!");
            }
        }
    }
}
