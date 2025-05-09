package org.example;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuantos archivos quieres crear?: ");
        int num = entrada.nextInt();
        entrada.nextLine();
        System.out.println("¿En que carpeta los quieres crear?: ");
        String carpeta = entrada.next();

        File validar_carpeta = new File(carpeta);

        if (validar_carpeta.exists()) {

            for (int i = 1; i <= num; i++) {

                File fichero = new File(carpeta + "/nombre(" + i + ").txt");

                try {
                    fichero.createNewFile();
                    System.out.println("Fichero " + fichero.getName() + " creado.");
                }catch (IOException e) {
                    System.out.println("Algo ha ido mal.");
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("El directorio no existe. Escríbelo bien!!");
        }

    }
}
