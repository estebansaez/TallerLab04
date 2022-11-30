package guis;

import datos.DatosSelecciones;
import modelo.Seleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Players extends Ventana implements ActionListener {
    private Seleccion seleccion;
    JLabel jugadores;
    public Players(){
        this.setTitle("Jugadores");
        this.setSize(500,700);
        this.generarEtiqueta("Numero ", 20, 50, 100, 20);
        this.generarEtiqueta("Nombre ", 140, 50, 100, 20);
        this.generarEtiqueta("Posicion",260, 50, 100, 20);
        //jugadores=this.generarEtiqueta(DatosSelecciones.leerArchivoJugadores(seleccion,ruta),50,70,300,600);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
