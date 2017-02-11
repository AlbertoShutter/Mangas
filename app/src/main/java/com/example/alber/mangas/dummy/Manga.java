package com.example.alber.mangas.dummy;

/**
 * Created by alber on 10/02/2017.
 */

public class Manga {

    private int IdManga, Tomos;

    private String Nombre, Editorial, Genero;

    public int getIdManga() {
        return IdManga;
    }

    public void setIdManga(int idManga) {
        IdManga = idManga;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
