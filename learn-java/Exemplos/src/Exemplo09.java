// Soma de todos os números de um intervalo

import java.util.Scanner;

public class Exemplo09 {


    public static void main(String[] args) {
        //Criamos uma nova instancia da classe Scanner
        Scanner in = new Scanner(System.in);
        //Imprimimos a frase pedindo o inicio do intervalo
        System.out.println("Informe o início do intevalo: ");
        //Capturamos o inicio do intervalo
        int ini = in.nextInt();
        //Imprimimos a frase pedindo o término do intervalo
        System.out.println("Informe o final do intervalo: ");
        //Capturamos o término do intervalo
        int fim = in.nextInt();

        int i = ini;
        int soma = ini;
        //1..5
        while(i<fim){
            i++;
            soma+=i;
            //soma = soma + i;
        }
        System.out.println(soma);
        in.close();
}
