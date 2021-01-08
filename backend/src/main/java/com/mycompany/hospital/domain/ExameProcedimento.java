package com.mycompany.hospital.domain;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@SuppressWarnings("serial")
@Entity
@Table(name = "exame_procedimentos")
public class ExameProcedimento extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "id_exame")
    private Exame exame;

    @ManyToOne
    @JoinColumn(name = "id_procedimento")
    private Procedimento procedimento;

    @ManyToOne
    @JoinColumn(name = "id_horario")
    private Horario horario;

    @Column(name = "data_consulta")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dataConsulta;

    @Column(name = "custo")
    private BigDecimal custo;

    public BigDecimal getCusto() {
        return this.custo;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }

    public Exame getExame() {
        return this.exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Procedimento getProcedimento() {
        return this.procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }


}
