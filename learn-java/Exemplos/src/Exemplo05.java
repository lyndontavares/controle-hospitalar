// Exercício: Crie um programa que calcule a média de um aluno para a matéria de matemática.
// O aluno deve informar seu nome e as quatro notas da matéria.
import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        String nome = "";
        double horasTrabalhadas = 0;
        double valorHora = 0;
        double total = 0;

        Scanner LerTeclado = new Scanner(System.in);

        System.out.println("Calcular salário");
        System.out.println("");

        System.out.print("1.Informe nome funcionário:");
        nome = LerTeclado.next();

        System.out.print("Informe hoas trabalhadas:");
        horasTrabalhadas = LerTeclado.nextFloat();

        System.out.print("Informe valor da hora:");
        valorHora = LerTeclado.nextFloat();

        total = horasTrabalhadas * valorHora;


        System.out.print("ENTRADA       SAIDA");
        System.out.print("====================");
        System.out.print(nome)
        System.out.print("Salário: "+total)

        LerTeclado.close();

        class M {public int a;}
        List<M> m = new ArrayList<>();
        M m1 = new M();
        m1.a=1;
        m.add(m1);
        for (int i = 0; i < m.size; i++) {
            System.out.print( m[i].a )
        }

    }
}
