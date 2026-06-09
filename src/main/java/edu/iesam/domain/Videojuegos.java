package edu.iesam.domain;

public class Videojuegos{
    private String Nombre;
    private  String marca;
    private String id;

    public Videojuegos(String nombre, String marca, String id) {
        Nombre = nombre;
        this.marca = marca;
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Videojuegos{" +
                "Nombre='" + Nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
