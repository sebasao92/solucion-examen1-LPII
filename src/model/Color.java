package model;

public enum Color {

    NEGRO(1), BLANCO(2), AZUL(3), VERDE(4), GRIS(5);

    private final int opcion;

    Color(int opcion){
        this.opcion = opcion;
    }

    public int getOpcion() {
        return opcion;
    }
}