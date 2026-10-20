package org.example;

public class EroeNonIdoneoException extends Exception {
    private String nome;
    private int livello;

    public EroeNonIdoneoException(String nome, int livello, String messaggio) {
        this.nome = nome;
        this.livello = livello;
        super(messaggio);
    }

    public String getNome() {
        return nome;
    }

    public int getLivello() {
        return livello;
    }
}
