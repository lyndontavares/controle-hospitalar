public class Gerente {
    String nome = "Samuel Bobrick";
    double salario = 1500;

    void aumentarSalario() {

        this.salario += this.salario * 0.1;

    }

    void aumentarSalarioVariavel(double taxa) {

        this.salario += this.salario * taxa;
    }
}
