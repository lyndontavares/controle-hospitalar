public class TestaMetodoGerente {

    public static void main(String[] args) {

        Gerente ger = new Gerente();

        System.out.println("Salario atual: " + ger.salario + "\n");

        System.out.println("O gerente: " + ger.nome + " recebera um aumento de salario em 10% \n");

        ger.aumentarSalario();
        System.out.println("Salario atual: " + ger.salario);

        System.out.println("\n O gerente: " + ger.nome + " recebera um aumento de salario em 20% \n");

        ger.aumentarSalarioVariavel(0.2);
        System.out.println("Salario atual: " + ger.salario);
    }
}
