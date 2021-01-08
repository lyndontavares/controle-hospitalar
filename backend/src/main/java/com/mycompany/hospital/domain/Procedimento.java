package com.mycompany.hospital.domain;

import javax.persistence.*;

import java.math.BigDecimal;

@SuppressWarnings("serial")
@Entity
@Table(name = "procedimentos")
public class Procedimento extends AbstractEntity {

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "custo")
    private BigDecimal custo;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getCusto() {
        return this.custo;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }

}
