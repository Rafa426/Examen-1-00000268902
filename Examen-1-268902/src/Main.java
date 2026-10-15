import controlador.ControladorConstancia;
import modelo.BaseAlumnos;
import vista.VistaConstancia;

public class Main {
    public static void main(String[] args) {
        BaseAlumnos base = new BaseAlumnos();
        VistaConstancia vista = new VistaConstancia();
        new ControladorConstancia(vista, base);
        vista.iniciar();
    }
}
