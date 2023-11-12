package controllers.prestamo;

public interface IPrestamo {
  public void registroPrestamoLibro();
  public void devolucionPrestamoLibro();
  public boolean verificarDisponibilidadLibro();
}
