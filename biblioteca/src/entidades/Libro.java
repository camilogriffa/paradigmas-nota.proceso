package entidades;

public class Libro {
  public int id;
  public String titulo;
  public String autor;
  public String genero;
  public String ISBN;
  public int stock;

  public Libro(int id, String titulo, String autor, String genero, String ISBN, int stock) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.genero = genero;
    this.ISBN = ISBN;
    this.stock = stock;
  }

  // * con DB
  public void actualizarInformacion() {};
  // * con DB
  public void restarStock() {};

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getISBN() {
    return this.ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public int getStock() {
    return this.stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }
}
