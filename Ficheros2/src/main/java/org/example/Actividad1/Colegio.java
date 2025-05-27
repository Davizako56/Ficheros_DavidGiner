package org.example.Actividad1;
import lombok.*;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@ToString
public class Colegio implements Serializable {

    private int habitaciones;
    private String nombre;
    private int num_alumnos;
    private int num_profesores;
}
