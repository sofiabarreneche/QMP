package CarpetaClima;
import CarpetaClima.*;
import java.util.List;

public class ServicioMeteorologico {

  private Clima clima;
  private List<String> alertasPublicadas;
  private List<Observer> observersAlerta;
  boolean hayAlertaNueva = false;


  public ServicioMeteorologico(Clima clima){
    this.clima = clima;
    alertasPublicadas.add(clima.getAlertas());
  }

  public String getAlertasDia(){
    return alertasPublicadas.get(alertasPublicadas.size());
  }

  public void actualizarSugerencia(){
    observersAlerta.forEach(observer -> observer.recibirAlertas(alertasPublicadas));
  }
  /* VER COMO IMPLEMENTARLO
    public void hayNuevaAlerta(Clima clima){
      hayAlertaNueva = true;
    }

    public static boolean isHayAlertaNueva() {
      return hayAlertaNueva;
    }
  */
  public List<String> getAlertasPublicadas() {
    return alertasPublicadas;
  }


  public Clima getClima() {
    return clima;
  }

}
