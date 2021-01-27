import java.util.List;

public class NotaFiscal {

    double valorCompra;

    List<Mercadoria> listaMercadoria;

    String cpfCliente;

    @Override
    public String toString() {
        return  " valorCompra: "+ valorCompra+ " listaMercadoria: "+ listaMercadoria + " cpfCliente: "+ cpfCliente;
    }

}
