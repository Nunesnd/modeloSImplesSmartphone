package org.example;

import org.example.aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone modeloS10 = new Iphone();

        modeloS10.navegar();
        modeloS10.reproduzirMusica();
        modeloS10.telefonar();

    }
}