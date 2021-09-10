package com.JuanDavid;

public class VideoJuego implements Entregable {


    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horaEstimada=" + horaEstimada +
                ", entrega=" + entrega +
                ", tipo='" + tipo + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getHoraEstimada() {
        return horaEstimada;
    }

    public void setHoraEstimada(Integer horaEstimada) {
        this.horaEstimada = horaEstimada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    private String titulo;
    private Integer horaEstimada = 10;
    private boolean entrega = false;
    private String tipo = "accion";
    private String compañia = "samsung";

    public VideoJuego(String titulo, Integer horaEstimada, String tipo, String compañia) {
        this.titulo = titulo;
        this.horaEstimada = horaEstimada;
        this.tipo = tipo;
        this.compañia = compañia;
    }

    public VideoJuego(String title, Integer hourEstimate) {
        this.titulo = title;
        this.horaEstimada = hourEstimate;
    }

    public VideoJuego() {
    }

    @Override
    public void Entregado() {
        this.entrega = true;

    }

    @Override
    public void devolver() {
        // TODO Auto-generated method stub
        this.entrega = false;
    }

    @Override
    public boolean isEntragado() {
        // TODO Auto-generated method stub
        return this.entrega;
    }

    @Override
    public Integer compareTo(Object element) {
        VideoJuego vJuego = (VideoJuego) element;
        return this.horaEstimada - vJuego.getHoraEstimada();
    }
}