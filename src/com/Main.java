package com;

import libreria.Libreria;
import libreria.Libro;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("titulo1", "elautor1", "a1", 9.99f, 1);
        Libro libro2 = new Libro("titulo2", "elautor2", "a2", 9.99f, 5);

        Libreria libre = new Libreria();

        libre.añadir(libro1, libro2);
        libre.limpiar();
        libre.amosar();

        libre.vender(libro1);
        libre.amosar();

        libre.limpiar();
        libre.amosar();





    }
}
