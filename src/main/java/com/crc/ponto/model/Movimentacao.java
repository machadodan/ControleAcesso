package com.crc.ponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

//tabela complexa
public class Movimentacao {

    //tem uma classe embutida(chave composta) usa anotacao Embeded
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    @Entity
    public class MovimentacaoId implements Serializable{
        @Id
        private long idMovimento;
        private long idUsuario;
    }
    //chama mov que acabou de criar acima ref id composto
   @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;
}
