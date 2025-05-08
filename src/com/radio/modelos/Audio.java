package com.radio.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproduciones;
    private int totalDeMeGusta;
    private int calificacion;

    public void  Favoritos(){
        this.totalDeMeGusta++;
    }

    public void reporducir(){
        this.totalDeReproduciones++;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getTotalDeReproduciones() {
        return totalDeReproduciones;
    }

    public void setTotalDeReproduciones(int totalDeReproduciones) {
        this.totalDeReproduciones = totalDeReproduciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
