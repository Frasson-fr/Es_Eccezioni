package org.example;

import net.datafaker.Faker;

import static java.lang.IO.println;

public class Reclutatore {
    private Faker faker;

    public Reclutatore() {
        this.faker = new Faker();
    }

    public void Valutazione(int difficoltamissione) throws EroeNonIdoneoException {
        //Genera un nome da supereroe casuale
        String nomeroe = faker.superhero().name();

        //Genera un livello di potere casuale da 1 a 100
        int potere = faker.number().numberBetween(1, 101);

        println("Candidato esaminato: " + nomeroe + " (Potere: " + potere + ")");

        //Se potere è inferiore a difficoltà lanciamo l'eccezione checked
        if (potere < difficoltamissione) {
            throw new EroeNonIdoneoException(
                    nomeroe,
                    potere,
                    "Eroe scartato: potere insufficiente per la missione!"
            );
        }

        println("Successo!!! " + nomeroe + " è stato reclutato per la missione!\n");
    }
}
