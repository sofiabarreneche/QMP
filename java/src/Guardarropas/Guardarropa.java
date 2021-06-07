package Guardarropas;
import CarpetaPersonas.Usuario;
import CarpetaPrenda.Prenda;
import CarpetaPrenda.Caracteristicas;


import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

  //hay una lista de prendas que cumplen ciertas condicones para poder
  //ser para determnada cosa(ej ropa viaj) y se elige una
  List<Prenda> partesSuperiores = new ArrayList<Prenda>();
  List<Prenda> partesInferiores= new ArrayList<Prenda>();
  List<Prenda> calzados = new ArrayList<Prenda>();
  List<Prenda> accesorios = new ArrayList<Prenda>();
  Caracteristicas tipoDeRopa;
  List<Prenda> listaDePrendasParaDeterminadoGuardarropas;
  Usuario duenio;
  List<Solicitud> solicitudes = new ArrayList<Solicitud>();

  public Guardarropa(Caracteristicas tipoDeRopa, Usuario duenio){
    this.tipoDeRopa = tipoDeRopa;
    this.duenio = duenio;
  }


  public Prenda seleccionarParteInferior(){
    return partesInferiores.stream().filter(parte -> parte.getCarac() == tipoDeRopa).findAny();
  }
  public Prenda seleccionarParteSuperior(){
    return partesSuperiores.stream().filter(parte -> parte.getCarac() == tipoDeRopa).findAny();
  }
  public Prenda seleccionarCalzado(){
    return calzados.stream().filter(parte -> parte.getCarac() == tipoDeRopa).findAny();
  }
  public Prenda seleccionarAccesorios(){
    return accesorios.stream().filter(parte -> parte.getCarac() == tipoDeRopa).findAny();
  }

  public void cargarLista(){
    listaDePrendasParaDeterminadoGuardarropas.add(seleccionarAccesorios());
    listaDePrendasParaDeterminadoGuardarropas.add(seleccionarCalzado());
    listaDePrendasParaDeterminadoGuardarropas.add(seleccionarParteSuperior());
    listaDePrendasParaDeterminadoGuardarropas.add(seleccionarParteInferior());
  }

  public List<Prenda> getListaDePrendasParaDeterminadoGuardarropas() {
    cargarLista();
    return listaDePrendasParaDeterminadoGuardarropas;
  }

  public void hacerModificacion(Solicitud soli){
    if(duenio.criterioParaAcepptarPrenda(soli.getPrenda())){
      soli.implementarSegunSolicitud(this);
      solicitudes.add(soli);
      listaDePrendasParaDeterminadoGuardarropas.add(soli.getPrenda());
    }
  }

  public void deshacerSolicitud(Solicitud soli){
    solicitudes.remove(soli);
    listaDePrendasParaDeterminadoGuardarropas.remove(soli.getPrenda());
  }

}

