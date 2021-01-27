public class TesteCirculo {

    public static void main(String args[]) {
        Circulo umcirc; // declaracao de uma variavel circulo no metodo main
        umcirc = new Circulo(); // alocação dessa variavel
        System.ou.println("(" + umcirc.x + "," + umcirc.y + "," + umcirc.raio + ")");
        umcirc.x = umcirc.x + 17;
        System.out.println("(" + umcirc.x + "," + umcirc.y + "," + umcirc.raio + ")");
    }
}
