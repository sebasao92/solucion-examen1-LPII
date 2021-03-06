package factory.abstr;

import util.recibidor.RecibidorDeInformacionUno;
import util.validador.ValidadorUno;

public interface AbstractFactory {

    ValidadorUno crearValidador();
    RecibidorDeInformacionUno crearRecibidorInformaciÃ³n();
}
