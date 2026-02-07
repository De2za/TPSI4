package Calcolatrice;

public class NumeroNegativoException extends RuntimeException {

    public NumeroNegativoException(String messaggio) {
        super(messaggio);
    }

    public NumeroNegativoException(String messaggio, Throwable causa) {
        super(messaggio, causa);
    }
}