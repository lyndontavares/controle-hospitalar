public class Professor extends Pessoa {

    String matricula;

    double retornaSalario() {

        if ( idade == 0)
            { return 0; }
        else if ( idade <= 30 )
            { return 1000; }
        else
            { return 2000; }
    }

}
