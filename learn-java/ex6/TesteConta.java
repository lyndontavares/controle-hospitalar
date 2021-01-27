public class TesteConta {

    public static void main(String args[]) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.nome = "Duke";
        minhaConta.saldo = 1000.0;

        Conta suaConta;
        suaConta = new Conta();

        suaConta.nome = "Aluno";
        suaConta.saldo = 100000.0;

        System.out.println("\nSaldo atual: " + minhaConta.saldo);

        // Saca 200 reais
        minhaConta.saca(200);
        System.out.println("\nSaldo atual: " + minhaConta.saldo);

        System.out.println("\nConta gorda... saldo atual: " + suaConta.saldo);
        System.out.println("\nVocê quer doar dinheiro pra mim?");
        suaConta.transfere(minhaConta, 99999.0);
        System.out.println("\nSeu saldo agora... saldo: " + suaConta.saldo);
        System.out.println("\nMinha conta agora... saldo: " + minhaConta.saldo);
    }
}
