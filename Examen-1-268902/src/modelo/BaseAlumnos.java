package modelo;

import java.util.ArrayList;
import java.util.List;

public class BaseAlumnos {
    private List<Alumno> alumnos = new ArrayList<>();

    public BaseAlumnos() {
        alumnos.add(new Alumno("00000268902", "Minndy Karelly Ayon Ramirez", 5, 6));
        alumnos.add(new Alumno("00000268915", "Rafael Pacheco Servin", 3, 5));
        alumnos.add(new Alumno("00000271340", "Maria Torres Vega", 7, 4));
        alumnos.add(new Alumno("00000254477", "Jose Ramirez Leon", 1, 7));
        alumnos.add(new Alumno("00000263018", "Lucia Fernandez Cota", 9, 3));
    }

    public List<Alumno> buscar(String parteId) {
        List<Alumno> resultado = new ArrayList<>();
        if (parteId.isEmpty()) return resultado;
        for (Alumno a : alumnos) {
            if (a.getId().contains(parteId)) resultado.add(a);
        }
        return resultado;
    }
}
