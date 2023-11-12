package controllers.busqueda;

import entidades.Libro;

public interface IBusqueda {
  public Libro porTitulo();
  public Libro porAutor();
  public Libro porGenero();
  public Libro porISBN();
}
