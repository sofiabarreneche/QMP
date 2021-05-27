package Guardarropas;
import CarpetaPrenda.Prenda;


public class Quitar implements Solicitud {
    private Prenda prenda;
    private Guardarropa guardarropa;
    public void implementarSegunSolicitud(Guardarropa guardarropa) {
      if (!guardarropa.duenio.criterioParaAcepptarPrenda(prenda)) {
        guardarropa.listaDePrendasParaDeterminadoGuardarropas.remove(prenda);
      }
    }
    public Prenda getPrenda() {
      return prenda;
    }
  }

