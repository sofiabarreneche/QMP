package CarpetaSugerencia;
import CarpetaPrenda.Prenda;
import CarpetaClima.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Sugerencia {
    List<Prenda> partesSuperiores = new ArrayList<Prenda>();
    List<Prenda> partesInferiores= new ArrayList<Prenda>();
    List<Prenda> calzados = new ArrayList<Prenda>();
    List<Prenda> accesorios = new ArrayList<Prenda>();
    Clima climaReciente = new Clima();

    public Optional<Prenda> sugerirParteSup(){
      return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
    }

    public Optional<Prenda> sugerirParteInf(){
      return partesInferiores.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
    }

    public Optional<Prenda> sugerirCalzado(){
      return calzados.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
    }

    public Optional<Prenda> sugerirAccesorio(){
      return accesorios.stream().filter(prenda -> prenda.sePuedeUsarSegunClima(climaReciente.condicionesClimaticas())).findAny();
    }


  }

