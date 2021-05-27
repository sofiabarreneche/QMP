package CarpetaPrenda;
import CarpetaPrenda.Trama;

import java.awt.*;

public class Prenda {
  private TipoPrenda tipoDeLaPrenda;
  private Color color;
  private TipoMaterial tipomaterial;
  private Color colorSecundario;
  private Trama trama;
  private Caracteristicas carac;

  public Prenda(TipoPrenda tipoPrenda, TipoMaterial material, Color color, Trama trama) {
    this.tipoDeLaPrenda = tipoPrenda;
    this.color = color;
    this.tipomaterial = material;
    this.trama = trama;
  }

  public Prenda(TipoPrenda tipoPrenda,TipoMaterial material, Color color, Color colorSecundario, Trama trama) {
    this.tipoDeLaPrenda = tipoPrenda;
    this.color = color;
    this.tipomaterial = material;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  public boolean sePuedeUsarSegunClima(Integer temperatura){
    return tipoDeLaPrenda.estaDentroDeTempAdecuada(temperatura);
  }

  public Caracteristicas getCarac() {
    return carac;
  }
}