package Calcolatrice;

public class Main {

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║       CALCOLATRICE SCIENTIFICA CON GESTIONE ECCEZIONI      ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");

        SessioneCalcolo sessione = new SessioneCalcolo();

        System.out.println("--- TEST 1: Divisioni Valide ---");
        sessione.eseguiDivisione(10, 2);
        sessione.eseguiDivisione(15, 3);
        sessione.eseguiDivisione(7, 4);

        System.out.println("\n--- TEST 2: Divisione per Zero ---");
        sessione.eseguiDivisione(42, 0);

        System.out.println("\n--- TEST 3: Radici Quadrate Valide ---");
        sessione.computeSqrt(16);
        sessione.computeSqrt(25);
        sessione.computeSqrt(2);

        System.out.println("\n--- TEST 4: Radice di Zero ---");
        sessione.computeSqrt(0);

        System.out.println("\n--- TEST 5: Radice di Numero Negativo ---");
        sessione.computeSqrt(-9);

        System.out.println("\n--- TEST 6: Altre Operazioni ---");
        sessione.eseguiDivisione(100, 5);
        sessione.computeSqrt(144);

        sessione.stampaStorico();

        System.out.println("Numero totale operazioni registrate: " + sessione.getStorico().size());
    }
}
