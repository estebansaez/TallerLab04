package modelo;

public class Jugador {
    private String nombre;
    private String numero;
    private String posicion;

    public Jugador(String nombre, String numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public String toString() {
        return (this.nombre + ";" + this.numero + ";" + this.posicion);
    }
}