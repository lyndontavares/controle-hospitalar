import java.util.List;
import java.util.ArrayList;

public class TesteNotaFiscal {


    public static void main(String[] args) {


        NotaFiscal notaFiscal = new NotaFiscal();

        notaFiscal.valorCompra = 1000;
        notaFiscal.cpfCliente = "123.123.123-99";

        notaFiscal.listaMercadoria = new ArrayList<Mercadoria>();

        //mercadira 1 : COCA-COLA 3.00 x 10 unidades = 30.00
        Mercadoria mercadoria1 = new Mercadoria();
        mercadoria1.codigoBarra = "1231231213120909";
        mercadoria1.descricao = "COCA-COLA";
        mercadoria1.quantidade = 10;
        mercadoria1.precoUnitario = 3;
        mercadoria1.total = mercadoria1.quantidade * mercadoria1.precoUnitario;

        notaFiscal.listaMercadoria.add(  mercadoria1 );

        System.out.println( notaFiscal.toString() );


    }
}
