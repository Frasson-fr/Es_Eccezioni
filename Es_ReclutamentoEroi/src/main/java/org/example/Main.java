package org.example;

import static java.lang.IO.println;

public class Main {
    public static void main(String[] args) {
        Reclutatore reclutatore = new Reclutatore();
        int difficoltamissione = 75;

        println("Inizio Sessione Reclutamento (Difficoltà richiesta: " + difficoltamissione + ")\n");

        for (int i = 1; i <= 5; i++) {
            println("Tentativo: " + i);
            try {
                reclutatore.Valutazione(difficoltamissione);
            } catch (EroeNonIdoneoException e) {
                println("Non idoneo!!! " + e.getMessage());
                println("Eroe: " + e.getNome() + ", Potere registrato: " + e.getLivello() + "\n");
            }
        }

        println("Sessione Terminata");
    }
}