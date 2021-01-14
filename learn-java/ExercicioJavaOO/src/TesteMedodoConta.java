public class TesteMedodoConta {
    public static void main(String[] args) {

        Conta c = new Conta();

        c.deposita(875.90);
        c.impExtrato();

        c.saque(250);
        c.impExtrato();

        double saldoDisponivel = c.consultaSaldoDisponivel();
        System.out.println("Seu saldo disponivel e de: " + saldoDisponivel);

    }
}
