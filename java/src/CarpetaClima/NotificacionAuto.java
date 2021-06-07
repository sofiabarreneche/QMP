package CarpetaClima;

import CapetaNotificaciones.Notificacion;

import java.util.List;
public class NotificacionAuto {

  public void recibirAlertas(List<String> alertas) {
    if(this.granizo(alertas))
      Notificacion.notificar("Se le recomienda no salir con el auto, va a haber GRANIZOOOO!!:(");
  }

  private boolean granizo(List<String> alertas) {
    return alertas.contains("HAIL");
  }

}
