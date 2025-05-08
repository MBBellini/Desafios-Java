package com.radio.principal;

import com.radio.modelos.Cancion;
import com.radio.modelos.MisFavoritos;
import com.radio.modelos.Podcast;

public class Principal {
    public static void main(String[]args){
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Love of my Live");
        miCancion.setArtista("Queen");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Ramona Diaz");
        miPodcast.setTitulo("Cafe con Ramona");

        for (int i = 0; i < 100; i++) {
            miCancion.Favoritos();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reporducir();
        }


        for (int i = 0; i < 100; i++) {
            miPodcast.Favoritos();
        }
        for (int i = 0; i < 1500; i++) {
            miPodcast.reporducir();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproduciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.agregar(miPodcast);
        favoritos.agregar(miCancion);
    }
}
