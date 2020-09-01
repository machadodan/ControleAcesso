package com.crc.ponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

       @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable

    public class BancoHorasId implements Serializable{
        private long idBancoHoras;
        private long idMovimento;
        private long idUsuario;
    }
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    //para evitar problema data hora valor quebrado uso BigDecimal
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;

}
