package com.dariofinelli.mascotasdario;

public class Mascota {
    String nombre;

    public int getFoto() {
        return foto;
    }

    int foto;
    int numlikes;

    public String getNombre() {
        return nombre;
    }

    public int getNumlikes() {
        return numlikes;
    }

    public Mascota(String nombre, int foto, int numlikes){
        this.nombre=nombre;
        this.foto=foto;
        this.numlikes=numlikes;
    }


}
