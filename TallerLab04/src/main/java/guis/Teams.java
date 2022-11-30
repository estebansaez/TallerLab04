package guis;

import modelo.Seleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Teams extends Ventana implements ActionListener {
    private Seleccion seleccion;
    private JButton btnjugadores;
    private JButton btnsalir;
    private JComboBox nombreSeleccion;
    private JLabel ranking;

    public Teams (Seleccion seleccion){
        this.seleccion=seleccion;
        this.setTitle("Selecciones");
        this.generarEtiqueta("Seleccion: ", 20, 50, 100, 20);
        this.generarEtiqueta("Ranking FIFA: ", 20, 120, 100, 20);

        btnjugadores = this.generarBoton("Jugadores", 20, 200, 150, 30);
        btnsalir = this.generarBoton("Salir",200, 200, 150, 30);

        btnjugadores.addActionListener(this);
        btnsalir.addActionListener(this);

        nombreSeleccion = this.generarComboBox(seleccion.getSelecciones(), 200, 50, 150, 20);
        ranking = this.generarEtiqueta(mostrarRanking(), 150, 120, 100, 20);

    }

    public String mostrarRanking(){
        Seleccion s = seleccion.buscarSeleccionPorNombre(nombreSeleccion.getSelectedItem().toString());
        return s.getRanking();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnsalir){
            this.dispose();
        }
        if(e.getSource()== btnjugadores){
            new Players();
        }

    }
}
