package model;

import model.*;

public class Controller {

    public double operarDivision(double a, double b) throws ExcepcionOperacionInvalida {
        Division div = new Division(a, b);
        return div.calcular();
    }

    public double operarRaiz(double a) throws ExcepcionOperacionInvalida {
        RaizCuadrada raiz = new RaizCuadrada(a);
        return raiz.calcular();
    }

    public double operarLogaritmo(double a) throws ExcepcionOperacionInvalida {
        Logaritmo log = new Logaritmo(a);
        return log.calcular();
    }
}