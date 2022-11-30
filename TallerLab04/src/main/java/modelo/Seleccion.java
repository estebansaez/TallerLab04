package modelo;

import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private List <Jugador> jugadores;
    private List <Seleccion> selecciones;
    private String id;
    private String nombre;
    private String ranking;
    private String bandera;

    public Seleccion(String id, String nombre, String ranking, String bandera) {
        this.id = id;
        this.nombre = nombre;
        this.ranking = ranking;
        this.bandera = bandera;
    }

    public Seleccion(){
        this.jugadores= new ArrayList<>();
        this.selecciones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public String getBandera(){return bandera;}

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public List<Seleccion> getSelecciones(){
        return selecciones;
    }

    public Seleccion buscarSeleccionPorNombre(String nombre) {
        for (Seleccion e: this.selecciones) {
            if (e.getNombre().equals(nombre)) {
                return e;
            }
        }
        return null;
    }

    public String toString() {
        return (this.id + ";" + this.nombre + ";" + this.ranking+ ";" +this.bandera);
    }
}
