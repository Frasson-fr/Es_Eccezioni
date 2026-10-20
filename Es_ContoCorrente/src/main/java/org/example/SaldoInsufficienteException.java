package org.example;

public class SaldoInsufficienteException extends Exception {
    private double saldoattuale;
    private double importorichiesto;

    public SaldoInsufficienteException(double saldoattuale, double importorichiesto) {
        super("Saldo insufficiente per completare l'operazione.");
        this.saldoattuale = saldoattuale;
        this.importorichiesto = importorichiesto;
    }

    public double getSaldoattuale() {
        return saldoattuale;
    }

    public double getImportorichiesto() {
        return importorichiesto;
    }

    //Metodo per calcolare deficit
    public double getDeficit() {
        return importorichiesto - saldoattuale;
    }
}