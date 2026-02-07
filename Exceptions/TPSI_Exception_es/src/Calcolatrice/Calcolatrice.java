package Calcolatrice;

public class Calcolatrice {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Errore matematico: divisione per zero non consentita");
        }
        return a / b;
    }

    public double sqrt(double x) {
        if (x < 0) {
            throw new NumeroNegativoException(
                    "Errore: impossibile calcolare la radice quadrata di un numero negativo (" + x + ")"
            );
        }
        return Math.sqrt(x);
    }
}