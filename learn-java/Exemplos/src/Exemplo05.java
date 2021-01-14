// Exercício: Crie um programa que calcule a média de um aluno para a matéria de matemática.
// O aluno deve informar seu nome e as quatro notas da matéria.
import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        String nome = "";
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float n4 = 0;
        double total = 0;
        double media = 0;
        Scanner LerTeclado = new Scanner(System.in);

        System.out.println("Calcula a média de matemática");
        System.out.println("");
        System.out.print("Qual e o seu nome:");
        nome = LerTeclado.nextLine();

        System.out.print("Informe a 1 nota:");
        n1 = LerTeclado.nextFloat();

        System.out.print("Informe a 2 nota:");
        n2 = LerTeclado.nextFloat();

        System.out.print("Informe a 3 nota:");
        n3 = LerTeclado.nextFloat();

        System.out.print("Informe a 4 nota:");
        n4 = LerTeclado.nextFloat();

        total = n1 + n2 + n3 + n4;
        media = total / 4;
        System.out.println(nome + " a sua media é " + media);
        LerTeclado.close();
    }
}
