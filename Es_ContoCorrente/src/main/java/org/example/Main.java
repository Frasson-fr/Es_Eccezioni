package org.example;

import static java.lang.IO.println;

public class Main {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(100.0);
        println("Conto creato con saldo iniziale: 100.0€\n");
        println("1. Test Prelievo Eccessivo (150€)");

        try {
            conto.preleva(150.0);
        } catch (SaldoInsufficienteException e) {
            println("Eccezione catturata: " + e.getMessage());
            println("Saldo attuale: " + e.getSaldoattuale() + "€, Richiesto: " + e.getImportorichiesto() + "€");
            println("Deficit di denaro: " + e.getDeficit() + "€");
        } finally {
            println("[FINALLY] Blocco finally eseguito: operazione di prelievo terminata.\n");
        }

        //Scenario 2: Prelievo negativo (Unchecked Exception)
        println("2. Test Prelievo Negativo (-20€)");
        try {
            conto.preleva(-20.0);
        } catch (ImportoNonValidoException e) {
            println("Eccezione unchecked catturata: " + e.getMessage());
        }  catch (SaldoInsufficienteException e) {
            println("Errore: " + e.getMessage());
        }
        println();

        //Scenario 3: Prelievo valido
        println("3. Test Prelievo Valido (40€)");
        try {
            conto.preleva(40.0);
            println("Operazione completata con successo! Nuovo saldo: " + conto.getSaldo() + "€");
        } catch (SaldoInsufficienteException e) {
            println("Errore imprevisto: " + e.getMessage());
        }
    }
}