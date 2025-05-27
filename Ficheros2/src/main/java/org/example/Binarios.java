package org.example;
import java.io.*;

public class Binarios {
    public static void main(String[] args) {


        try {
            DataOutputStream fichero_binario = new DataOutputStream(new FileOutputStream("src/main/resources/Binarios.bin"));
            fichero_binario.writeBoolean(true);
            fichero_binario.writeDouble(3.141515);
            fichero_binario.writeInt(10);
            fichero_binario.writeUTF("Hola");
        }catch (IOException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();
        }

        // Leer fichero binario - Conociendo su estructura

        try {
            DataInputStream leido = new DataInputStream(new FileInputStream("src/main/resource/Binarios.java"));
           // fichero_binario.writeBoolean(true);
           // fichero_binario.writeDouble(3.141515);
           // fichero_binario.writeInt(10);
           // fichero_binario.writeUTF("Hola");
            boolean valor_booleano = leido.readBoolean();
            double pi = leido.readDouble();
            int num = leido.readInt();
            String caracteres = leido.readUTF();
            System.out.println(valor_booleano + " " + pi + " " + num + " " + caracteres);
        }catch (IOException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();
        }

        // Leer fichero binario - Sin conocer su estructura

        try {
            FileInputStream ficherito = new FileInputStream("C:/Users/1DAM/ghfd");
            int byteprocesar;

            while (byteprocesar = ficherito.read() != -1) {
                System.out.println((char) byteprocesar + " ");
            }

            ficherito.close();

        }catch (IOException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();
        }
    }


}
