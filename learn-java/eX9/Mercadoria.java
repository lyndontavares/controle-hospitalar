public class Mercadoria {


    String codigoBarra;

    String descricao;

    float precoUnitario;

    float quantidade;

    float total;

    @Override
    public String toString() {

        return  "codigoBarra: " + codigoBarra +  " descricao: " + descricao + " precoUnitario: "+ precoUnitario  ;
    }


}
