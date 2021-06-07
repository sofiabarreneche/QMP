package CarpetaPersonas;

import CarpetaPrenda.Prenda;
import Guardarropas.Guardarropa;
import Guardarropas.Solicitud;
import CarpetaClima.*;
import java.util.List;

public class Usuario {
  private Guardarropa miGuardarropas;
  private List<Prenda> listaDiariaDeSugerencias;
  private String email;

  // private List<Prenda> prendasAceptadas = new ArrayList<Prenda>();

  //public boolean aceptarPrenda(Prenda prenda){
  //  return prendasAceptadas.contains(prenda);
  // }

  public String getEmail() {
    return email;
  }

  public boolean criterioParaAcepptarPrenda(Prenda prenda){
  return true; /*esto no deberia ser siempre true*/}

  public void hacerModificacion(Solicitud soli){
    miGuardarropas.hacerModificacion(soli);
  }

  public void cargarSugerencias(List <Prenda> lista){
    listaDiariaDeSugerencias.addAll(lista);
  }

  public List<Prenda> getListaDiariaDeSugerencias() {
    return listaDiariaDeSugerencias;
  }

  public void deshacerSolicitud(Solicitud soli){
    miGuardarropas.deshacerSolicitud(soli);
  }

  public List<String> informarsePaginaUltimasAlertas(ServicioMeteorologico servicio){
    return servicio.getAlertasPublicadas();
  }

}


