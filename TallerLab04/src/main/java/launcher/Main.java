package launcher;

import datos.DatosSelecciones;
import guis.Teams;
import modelo.Seleccion;

public class Main {
    public static void main(String[] args) {
        Seleccion seleccion = new Seleccion();
        DatosSelecciones.leerArchivoSeleccion(seleccion, "Datos/teams.txt");
        new Teams(seleccion);
    }
}
