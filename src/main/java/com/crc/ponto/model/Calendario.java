package com.crc.ponto.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {

    @Id
    private long idTipoData; //@ManyToOne
    private Long id; //Long da classe wapper
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime localDateTime;  //nova api data java



}
