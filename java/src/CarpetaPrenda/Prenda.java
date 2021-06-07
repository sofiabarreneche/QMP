package CarpetaPrenda;

import CarpetaClima.Clima;

import java.awt.*;

public class Prenda {

  private TipoPrenda tipoPrenda;
  private Color color;
  private TipoMaterial tipomaterial;
  private Color colorSecundario;
  private Trama trama;
  private Caracteristicas carac;
  private TipoDeAlertaQueSoportaLaRopa paraQueTipoDeAlertaQueSoportaLaRopaSeUsa;


  public Prenda(TipoPrenda tipoPrenda, TipoMaterial material, Color color, Trama trama, Caracteristicas carac, TipoDeAlertaQueSoportaLaRopa paraQueTipoDeAlertaQueSoportaLaRopaSeUsa) {
    this.tipoPrenda = tipoPrenda;
    this.color = color;
    this.tipomaterial = material;
    this.trama = trama;
    this.carac = carac;
    this.paraQueTipoDeAlertaQueSoportaLaRopaSeUsa = paraQueTipoDeAlertaQueSoportaLaRopaSeUsa;
  }

  public Prenda(TipoPrenda tipoPrenda,TipoMaterial material, Color color, Color colorSecundario, Trama trama, Caracteristicas carac, TipoDeAlertaQueSoportaLaRopa paraQueTipoDeAlertaQueSoportaLaRopaSeUsa) {
    this.tipoPrenda = tipoPrenda;
    this.color = color;
    this.tipomaterial = material;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.carac = carac;
    this.paraQueTipoDeAlertaQueSoportaLaRopaSeUsa = paraQueTipoDeAlertaQueSoportaLaRopaSeUsa;

  }
  public boolean sePuedeUsarEnEsaAlerta(Clima clima){
    return clima.getAlertas().contains(paraQueTipoDeAlertaQueSoportaLaRopaSeUsa);
  }

  public boolean sePuedeUsarSegunClima(Integer temperatura){
    return tipoPrenda.estaDentroDeTempAdecuada(temperatura);
  }

  public Caracteristicas getCarac() {
    return carac;
  }
}