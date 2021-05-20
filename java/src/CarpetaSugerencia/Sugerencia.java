package CarpetaSugerencia;

import CarpetaClima.Clima;
import CarpetaPrenda.Prenda;

import java.util.List;

public class Sugerencia {
  List<Prenda> partesSuperiores = new ArrayList<Prenda>();
  List<Prenda> partesInferiores= new ArrayList<Prenda>();
  List<Prenda> calzados = new ArrayList<Prenda>();
  List<Prenda> accesorios = new ArrayList<Prenda>();
  Clima climaReciente = new Clima;

  public Prenda sugerirParteSup(){
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  public Prenda sugerirParteInf(){
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  public Prenda sugerirCalzado(){
    return calzados.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }

  public Prenda sugerirAccesorio(){
    return accesorios.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
  }
}
