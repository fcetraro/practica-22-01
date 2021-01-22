package controller;

public class Libro {
    private String author;
    private String title;
    private String isbn;

    public Libro(){
        this.author = "";
        this.title = "";
        this.isbn = "";
    }

    public Libro(String author, String title, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author=author;
    }
    public void setTitle(String title) {
        this.title=title;
    }
    public void setIsbn(String isbn) {
        this.isbn=isbn;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getTitle() {
        return this.title;
    }
    public String getIsbn() {
        return this.isbn;
    }

    public void prestamo(){}
    public void devolucion(){}

    //Si cambiamos el nombre a "tostring" da error porque la clase que hereda Libro no contiene el metodo "tostring"
    @Override
    public String toString() {
        return title + ", "+ isbn + ", "+ author;
    }
}
