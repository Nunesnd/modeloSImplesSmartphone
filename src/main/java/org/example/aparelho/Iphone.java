package org.example.aparelho;

import org.example.interfaces.NavegadorInternet;
import org.example.interfaces.ReprodutorMusicas;
import org.example.interfaces.Telefone;

public class Iphone implements Telefone, ReprodutorMusicas, NavegadorInternet {

    @Override
    public void navegar() {

        System.out.println("iPhone Navegando");
    }

    @Override
    public void reproduzirMusica() {
        System.out.println("iPhone tocando música");
    }

    @Override
    public void telefonar() {
        System.out.println("iPhone telefonando");
    }
    
}
