package com.JuanDavid;

public class Serie implements Entregable {

    private String titulo;
    private Integer temporada;
    private boolean entregar;
    private String tipo = "comedia";
    private String autor = "roberto gomez bola;os";

    public Serie() {
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", temporada=" + temporada +
                ", entregar=" + entregar +
                ", tipo='" + tipo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public Serie(String titulo, Integer temporada, String tipo, String autor) {
        this.titulo = titulo;
        this.temporada = temporada;
        this.tipo = tipo;
        this.autor = autor;
    }

    public Serie(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void Entregado() {
        this.entregar = true;

    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        this.entregar = false;
    }

    @Override
    public boolean isEntragado() {
        // TODO Auto-generated method stub
        return this.entregar;
    }

    @Override
    public Integer compareTo(Object elemnt) {
        Serie serie = (Serie) elemnt;
        return this.temporada - serie.getTemporada();
    }

}

