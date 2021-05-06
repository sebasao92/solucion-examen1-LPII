package factory.abstr;

import util.recibidor.RecibidorDeInformacionUno;
import util.validador.ValidadorUno;

public class UnoFactory implements AbstractFactory {

    @Override
    public ValidadorUno crearValidador() {
        return new ValidadorUno();
    }

    @Override
    public RecibidorDeInformacionUno crearRecibidorInformación() {
        return new RecibidorDeInformacionUno();
    }
}
