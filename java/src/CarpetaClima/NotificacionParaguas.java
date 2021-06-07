package CarpetaClima;

import CapetaNotificaciones.Notificacion;

import java.util.List;

public class NotificacionParaguas {

  public void recibirAlertas(List<String> alertas) {
    if(this.tormenta(alertas))
      Notificacion.notificar("Se le recomienda salir con paraguas, va a haber una re TORMENTAAA!!:(");
  }

  private boolean tormenta(List<String> alertas) {
    return alertas.contains("STORM");
  }

}
