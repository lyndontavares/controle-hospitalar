//  Faça um programa (utilizando recursividade) que peça para o usuário digitar um número, em seguida,
//  faça a soma de todos os algarismos do número. Exemplos:
//  1111 = 1+1+1+1 = 4
//  2090 = 2 + 0 + 9 + 0 = 11

import java.util.Scanner;

public class Exemplo10 {

    public static int somaAlgarismosB(int num, int somaMomentanea) {
        if (num < 1)
            return somaMomentanea;
        somaMomentanea += (num % 10);
        return somaAlgarismosB(num / 10, somaMomentanea);
    }

    // (Recursividade)
    // Soma de todos os algarismos
    public static void main(String[] args) {
        System.out.println("Digite um número: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int soma = somaAlgarismosB(num, 0);

        System.out.println("O valor da soma dos algarismos é: " + soma);
        in.close();

    }

}
