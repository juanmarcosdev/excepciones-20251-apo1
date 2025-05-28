package ui;

import model.Controller;
import model.ExcepcionOperacionInvalida;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Executable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        try {
            System.out.print("Ingrese numero para raiz cuadrada: ");
            double valor = sc.nextDouble();
            System.out.println("Resultado: " + controller.operarRaiz(valor));

            System.out.print("Ingrese numero para logaritmo: ");
            valor = sc.nextDouble();
            System.out.println("Resultado: " + controller.operarLogaritmo(valor));

            System.out.print("Ingrese dividendo: ");
            double dividendo = sc.nextDouble();
            System.out.print("Ingrese divisor: ");
            double divisor = sc.nextDouble();
            System.out.println("Resultado: " + controller.operarDivision(dividendo, divisor));

        } catch (InputMismatchException e) {
            System.err.println("Error de entrada: debe ingresar un numero vulido.");
        } catch (ExcepcionOperacionInvalida e) {
            System.err.println("Error matemutico: " + e.getMessage());
        }
    }
}