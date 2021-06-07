package CarpetaSugerencia;

import CarpetaPrenda.Prenda;

import java.util.List;

public interface Sugerencia {
  public Prenda sugerirParteSup();

  public Prenda sugerirParteInf();

  public Prenda sugerirCalzado();

  public Prenda sugerirAccesorio();

  public void cargarLista();
  public List<Prenda> sugerir();

  public static List<String> getAlertas();
}
