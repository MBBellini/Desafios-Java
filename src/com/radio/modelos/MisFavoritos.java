package com.radio.modelos;

public class MisFavoritos {
   public void agregar(Audio audio){
        if(audio.getCalificacion() >= 7){
            System.out.println(audio.getTitulo() + " Es de las mejores de la decada");
        } else{
            System.out.println(audio.getTitulo() + " También es de los que más me gusta");
        }
    }
}
