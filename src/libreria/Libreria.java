package libreria;

import java.util.ArrayList;

public class Libreria {

    ArrayList<Libro> libros = new ArrayList<>();

     public void añadir(Libro libro){
        libros.add(libro);
    }

    public void añadir(Libro... libros){
        for (Libro libro : libros){
            añadir(libro);

        }
    }

    public void amosar() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).toString());

        }
        System.out.println();
    }

    public void borrar(Libro libro){
         if(libros.contains(libro)){
          libros.remove(libro);
         }
    }

    public void vender(Libro libro){
         libro.vender();
    }

    public void limpiar(){
        for (int i = 0; i < libros.size() ; i++) {
            Libro temp =libros.get(i);
            int num = temp.getNumeroUnidades();
            if (num == 0){
                borrar(temp);
            }
        }
    }
}
