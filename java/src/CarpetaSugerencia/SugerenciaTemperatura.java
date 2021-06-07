package CarpetaSugerencia;
import CarpetaClima.ServicioMeteorologico;
import CarpetaPrenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class SugerenciaTemperatura {
  private List<Prenda> partesSuperiores = new ArrayList<Prenda>();
  private List<Prenda> partesInferiores= new ArrayList<Prenda>();
  private List<Prenda> calzados = new ArrayList<Prenda>();
  private List<Prenda> accesorios = new ArrayList<Prenda>();
  private ServicioMeteorologico climaReciente;
  private List<Prenda> listaSugerencias = new ArrayList<Prenda>();

  public SugerenciaTemperatura(List<Prenda> partesSuperiores, List<Prenda> partesInferiores, List<Prenda> calzados, List<Prenda> accesorios, ServicioMeteorologico climaReciente){
    this.accesorios = accesorios;
    this.calzados = calzados;
    this.partesInferiores = partesInferiores;
    this.partesSuperiores = partesSuperiores;
    this.climaReciente = climaReciente;
  }

  public Prenda sugerirParteSup(){
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.getClima().condicionesClimaticas())).findAny().get();
  }

  public Prenda sugerirParteInf(){
    return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.getClima().condicionesClimaticas())).findAny().get();
  }

  public Prenda sugerirCalzado(){
    return calzados.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.getClima().condicionesClimaticas())).findAny().get();
  }

  public Prenda sugerirAccesorio(){
    return accesorios.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.getClima().condicionesClimaticas())).findAny().get();
  }

  public void cargarLista(){
    listaSugerencias.add(sugerirParteSup());
    listaSugerencias.add(sugerirParteInf());
    listaSugerencias.add(sugerirCalzado());
    listaSugerencias.add(sugerirAccesorio());
  }

  public List<Prenda> sugerir() {
    cargarLista();
    return listaSugerencias;
  }


  public List<String> getAlertas(){
    return climaReciente.getAlertasPublicadas();
  }

  }

