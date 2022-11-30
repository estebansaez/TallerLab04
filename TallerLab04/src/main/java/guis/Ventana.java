package guis;

import modelo.Jugador;
import modelo.Seleccion;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public abstract class Ventana extends JFrame{

    public Ventana() {
        this.setLayout(null);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    protected JTextField generarCampoDeTexto(int x, int y, int ancho, int largo) {
        JTextField campoDeTexto = new JTextField();
        this.add(campoDeTexto);
        campoDeTexto.setBounds(x, y, ancho, largo);
        return campoDeTexto;
    }

    protected JButton generarBoton(String texto, int x, int y, int ancho, int largo) {
        JButton boton = new JButton(texto);
        boton.setBounds(x, y, ancho, largo);
        this.add(boton);

        return boton;
    }
    protected JLabel generarEtiqueta (String texto, int x, int y, int ancho, int largo) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, ancho, largo);
        this.add(etiqueta);
        return etiqueta;
    }

    protected JComboBox generarComboBox(List<Seleccion> seleccionList, int x, int y, int ancho, int largo) {
        JComboBox <String> comboBox = new JComboBox<String>();
        this.add(comboBox);
        comboBox.setBounds(x,y,ancho,largo);

        for (Seleccion s: seleccionList) {
            comboBox.addItem(s.getNombre());
        }

        return comboBox;
    }
}