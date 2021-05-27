package Guardarropas;
import CarpetaPrenda.Prenda;

public class Agregar implements Solicitud {
    private Prenda prenda;
    private Guardarropa guardarropa;
    public void implementarSegunSolicitud(Guardarropa guardarropa) {
      if (guardarropa.duenio.criterioParaAcepptarPrenda(prenda)) {
        guardarropa.listaDePrendasParaDeterminadoGuardarropas.add(prenda);
      }
    }

    public Prenda getPrenda() {
      return prenda;
    }
}
