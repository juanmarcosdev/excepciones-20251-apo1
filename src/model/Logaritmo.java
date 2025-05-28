package model;

public class Logaritmo extends OperacionMatematica {
    public Logaritmo(double valor) {
        super(valor);
    }

    @Override
    public double calcular() throws ExcepcionOperacionInvalida {
        if (valor <= 0) {
            throw new ExcepcionOperacionInvalida("No se puede calcular logaritmo de cero o numero negativo.");
        }
        return Math.log(valor);
    }
}