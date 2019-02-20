package libreria;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private int numeroUnidades;

    public Libro(){
    }

    public Libro(String titulo, String autor, String isbn, float prezo, int numeroUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", prezo=" + prezo +
                ", numeroUnidades=" + numeroUnidades +
                '}';
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    public void vender(){
         int num = getNumeroUnidades();
         if(num > 0){
             setNumeroUnidades(num - 1);
         }
    }
}
