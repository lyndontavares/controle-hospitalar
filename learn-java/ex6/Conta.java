public class Conta {

    int numero;
    String nome;
    double saldo;
    double limite;

    boolean saca(double valor) {
        if (saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    boolean transfere(Conta destino, double valor) {
        if (!this.saca(valor)) {
            return false;
        }
        destino.deposita(valor);
        return true;
    }
}
