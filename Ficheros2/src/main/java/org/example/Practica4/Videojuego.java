package org.example.Practica4;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Videojuego {

    private String nombre;
    private String plataforma;
    private double precio;
    private boolean disponible;
    private ArrayList<String> genero = new ArrayList<>();

    public Videojuego(String nombre, String plataforma, double precio, boolean disponible) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.precio = precio;
        this.disponible = disponible;
    }


}
