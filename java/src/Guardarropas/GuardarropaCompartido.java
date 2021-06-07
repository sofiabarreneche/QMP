package Guardarropas;

import CarpetaPrenda.Caracteristicas;
import CarpetaPersonas.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GuardarropaCompartido extends Guardarropa{


    List<Usuario> usuarios = new ArrayList<Usuario>();

    public GuardarropaCompartido(Caracteristicas tipoDeRopa, List<Usuario> usuarios) {
      super(tipoDeRopa);
      this.usuarios = usuarios;
    }
  }

