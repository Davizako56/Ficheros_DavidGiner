package org.example;
import java.io.*;

public class SerializarCarcel {
    public static void main(String[] args) {

        Carcel rosario_peru = new Carcel(1000, "Rosario Perú", 100);

        try {
            ObjectOutputStream fichero_seri = new ObjectOutputStream(new FileOutputStream("src/main/resources/carcel.David"));
            fichero_seri.writeObject(rosario_peru);
            fichero_seri.close();
        }catch (IOException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();
        }

        try {
            ObjectInputStream obtener_objeto = new ObjectInputStream(new FileInputStream("src/main/resources/Carcel.David"));
            Carcel carcel_leida = (Carcel) obtener_objeto.readObject();
            obtener_objeto.close();
            System.out.println("Numero de celdas: " + carcel_leida.getCeldas() + ", nombre de la carcel: " + carcel_leida.getNombre() + ", numero de presos: " + carcel_leida.getNum_presos());
        }catch (IOException | ClassNotFoundException e) {
            System.out.println("Algo ha salido mal");
            e.printStackTrace();
        }
    }
}
