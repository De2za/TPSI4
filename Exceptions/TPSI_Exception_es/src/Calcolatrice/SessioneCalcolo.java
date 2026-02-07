package Calcolatrice;

import java.util.ArrayList;
import java.util.List;

public class SessioneCalcolo {

    private Calcolatrice calcolatrice;
    private List<String> storico;

    public SessioneCalcolo() {
        this.calcolatrice = new Calcolatrice();
        this.storico = new ArrayList<>();
    }

    public double eseguiDivisione(double a, double b) {
        try {
            double risultato = calcolatrice.divide(a, b);
            String voceStorico = String.format("Divisione: %.2f / %.2f = %.4f", a, b, risultato);
            storico.add(voceStorico);
            return risultato;
        } catch (ArithmeticException e) {
            String voceStorico = "Errore: divisione per zero";
            storico.add(voceStorico);
            System.err.println("Eccezione catturata: " + e.getMessage());
            return -1;
        }
    }

    public double computeSqrt(double x) {
        try {
            double risultato = calcolatrice.sqrt(x);
            String voceStorico = String.format("Radice quadrata: √%.2f = %.4f", x, risultato);
            storico.add(voceStorico);
            return risultato;
        } catch (NumeroNegativoException e) {
            String voceStorico = "Errore: impossibile calcolare radice quadrata di numero negativo";
            storico.add(voceStorico);
            System.err.println("Eccezione catturata: " + e.getMessage());
            return -1;
        }
    }

    public List<String> getStorico() {
        return new ArrayList<>(storico);
    }

    public void stampaStorico() {
        System.out.println("\n=== STORICO OPERAZIONI ===");
        if (storico.isEmpty()) {
            System.out.println("Nessuna operazione registrata.");
        } else {
            for (int i = 0; i < storico.size(); i++) {
                System.out.println((i + 1) + ". " + storico.get(i));
            }
        }
        System.out.println("=========================\n");
    }

    public void pulisciStorico() {
        storico.clear();
    }
}