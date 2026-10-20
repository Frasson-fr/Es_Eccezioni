package org.example;

public class ContoBancario {
    private double saldo;

    public ContoBancario(double saldo) {
        this.saldo = saldo;
    }

    public void preleva(double importo) throws SaldoInsufficienteException {
        //Controllo importo non valido (Unchecked)
        if (importo <= 0) {
            throw new ImportoNonValidoException("Errore!!! L'importo del prelievo deve essere maggiore di zero.");
        }

        //Controllo saldo insufficiente (Checked)
        if (importo > saldo) {
            throw new SaldoInsufficienteException(saldo, importo);
        }

        //Se tutto va a buon fine si aggiorna il saldo
        saldo -= importo;
    }

    public double getSaldo() {
        return saldo;
    }
}
