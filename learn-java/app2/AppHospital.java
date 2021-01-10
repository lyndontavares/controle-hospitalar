import Medico;
import Paciente;
import static java.lang.System.out;

import java.time.LocalDateTime;

public class AppHospital {

    public static void main(String[] args) {

        log("Cadastrado Medico: ISA");
        Medico medico = new Medico();
        medico.setId(1);
        medico.setNome("ISA");


        log("Cadastrado Paciente: LYNDON");
        Paciente paciente = new Paciente();
        paciente.setId(1);
        paciente.setNome("LYNDON");


        log("Agendando Consulta: Paciente=LYNDON  Medico=ISA Data=12/01/2021");

    }

    public static void log(String message) {
        LocalDateTime data = LocalDateTime.now();
        out.println( data.toString() + " - " + message );
    }


}
