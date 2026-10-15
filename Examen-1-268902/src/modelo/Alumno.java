package modelo;

public class Alumno {
    private String id;
    private String nombre;
    private int semestre;
    private int materias;

    public Alumno(String id, String nombre, int semestre, int materias) {
        this.id = id;
        this.nombre = nombre;
        this.semestre = semestre;
        this.materias = materias;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getSemestre() { return semestre; }
    public int getMaterias() { return materias; }

    @Override
    public String toString() { return id + " - " + nombre; }
}
