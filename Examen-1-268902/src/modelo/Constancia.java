package modelo;

public class Constancia {
    private Alumno alumno;

    public Constancia(Alumno alumno) {
        this.alumno = alumno;
    }

    public String generarTexto() {
        return "CONSTANCIA DE ALUMNO INSCRITO\n"
             + "ITSON Universidad\n\n"
             + "Se hace constar que el alumno:\n"
             + alumno.getNombre() + " (ID: " + alumno.getId() + ")\n\n"
             + "Se encuentra inscrito en el semestre " + alumno.getSemestre() + "\n"
             + "con " + alumno.getMaterias() + " materias.\n";
    }
}
