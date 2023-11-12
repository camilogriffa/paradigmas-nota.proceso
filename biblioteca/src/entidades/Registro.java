package entidades;

public class Registro {
  public int idRegistro;
  public int idLibro;
  public int idUsuario;
  public String fechaRegistro;
  public String fechaDevolucion;

  public Registro(int idRegistro, int idLibro, int idUsuario, String fechaRegistro, String fechaDevolucion) {
    this.idRegistro = idRegistro;
    this.idLibro = idLibro;
    this.idUsuario = idUsuario;
    this.fechaRegistro = fechaRegistro;
    this.fechaDevolucion = fechaDevolucion;
  }

  public int getIdRegistro() {
    return this.idRegistro;
  }

  public void setIdRegistro(int idRegistro) {
    this.idRegistro = idRegistro;
  }

  public int getIdLibro() {
    return this.idLibro;
  }

  public void setIdLibro(int idLibro) {
    this.idLibro = idLibro;
  }

  public int getIdUsuario() {
    return this.idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getFechaRegistro() {
    return this.fechaRegistro;
  }

  public void setFechaRegistro(String fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

  public String getFechaDevolucion() {
    return this.fechaDevolucion;
  }

  public void setFechaDevolucion(String fechaDevolucion) {
    this.fechaDevolucion = fechaDevolucion;
  }
}
