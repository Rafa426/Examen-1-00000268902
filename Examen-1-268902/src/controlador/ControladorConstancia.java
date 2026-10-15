package controlador;

import modelo.Alumno;
import modelo.BaseAlumnos;
import modelo.Constancia;
import vista.VistaConstancia;

public class ControladorConstancia {
    private VistaConstancia vista;
    private BaseAlumnos base;

    public ControladorConstancia(VistaConstancia vista, BaseAlumnos base) {
        this.vista = vista;
        this.base = base;
        this.vista.setControlador(this);
    }

    public void idTecleado(String parteId) {
        vista.mostrarAlumnos(base.buscar(parteId));
    }

    public void alumnoSeleccionado(Alumno alumno) {
        String datos = "DATOS DE CONFIRMACION\n\n"
                + "Alumno: " + alumno.getNombre() + "\n"
                + "Semestre inscrito: " + alumno.getSemestre() + "\n"
                + "Cantidad de materias: " + alumno.getMaterias() + "\n";
        vista.mostrarDatos(datos);
    }

    public void generarConstancia(Alumno alumno) {
        Constancia constancia = new Constancia(alumno);
        vista.mostrarConstancia(constancia.generarTexto());
    }
}