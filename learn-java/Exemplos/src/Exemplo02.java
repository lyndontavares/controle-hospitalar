// Exercício: Crie um programa que efetue a leitura de um nome e exiba a mensagem “olá nome informado“.

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        String nome = "";
        Scanner LerTeclado = new Scanner(System.in);

        System.out.println("Programa de boas vindas!!!!!");
        System.out.print("Qual é o seu nome?: ");
        nome = LerTeclado.nextLine();
        System.out.println("Olá " + nome);
        LerTeclado.close();
    }
}
