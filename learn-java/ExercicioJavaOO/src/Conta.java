public class Conta {
    int numero;
    double saldo = 100;
    double limite = 500;

    void deposita(double valor) {

        this.saldo += valor;

    }

    void saque(double valor) {

        this.saldo -= valor;

    }

    void impExtrato() {

        System.out.println("Extratato da Conta - Seu saldo e de: " + this.saldo + "\n");

    }

    double consultaSaldoDisponivel() {

        return this.saldo + this.limite;

    }

}
