package CarpetaUsuario;

import CarpetaPrenda.Prenda;
import Guardarropas.Guardarropa;
import Guardarropas.Solicitud;
public class Usuario {
// private List<Prenda> prendasAceptadas = new ArrayList<Prenda>();


  private Guardarropa miGuardarropas;
  public boolean criterioParaAcepptarPrenda(Prenda prenda) {

    return true;//aca habria que poner una condicion y si la cumple ahi retornar true
    //public boolean aceptarPrenda(Prenda prenda){
    //    //  return prendasAceptadas.contains(prenda);
    //    // }
  }
  public void deshacerSolicitud(Solicitud soli) {
    miGuardarropas.deshacerSolicitud(soli);
  }
  public void hacerModificacion(Solicitud soli){
    miGuardarropas.hacerModificacion(soli);
  }


}


