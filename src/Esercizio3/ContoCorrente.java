package Esercizio3;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            if (saldo > 0) {
                saldo -= x;
            } else {
                throw new BancaException("Il conto è in rosso");
            }
        } else {
            if (saldo > 0) {
                saldo = saldo - x - 0.50;
            } else {
                throw new BancaException("Il conto è in rosso");
            }
        }
    }

    double restituisciSaldo() {
        return saldo;
    }
}
