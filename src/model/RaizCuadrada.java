package model;

public class RaizCuadrada extends OperacionMatematica {
    public RaizCuadrada(double valor) {
        super(valor);
    }

    @Override
    public double calcular() throws ExcepcionOperacionInvalida {
        if (valor < 0) {
            throw new ExcepcionOperacionInvalida("No se puede calcular raiz cuadrada de un numero negativo.");
        }
        return Math.sqrt(valor);
    }
}