package datos;

import modelo.Jugador;
import modelo.Seleccion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DatosSelecciones {
    public static void leerArchivoSeleccion(Seleccion seleccion, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(";");
                seleccion.getSelecciones().add(new Seleccion(data[0], data[1], data[2], data[3]));
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Documento no disponible");
        }
    }

    public static Seleccion leerArchivoJugadores(Seleccion seleccion, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(";");
                seleccion.getJugadores().add(new Jugador(data[0], data[1], data[2]));
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Documento no disponible");
        }
        return seleccion;
    }
}
