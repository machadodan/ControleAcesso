package com.crc.ponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

//essa classe ja tem relação com nivel acesso
public class Localidade {
    @Id
    private long id;
    @ManyToOne //1 local. tem Muitos niveis de acesso
    private NivelAcesso nivelAcesso; //ja a relacao. 1nivel acess. ta p N localida. 1localidade ta p 1 nivel acss
    private String descricao;



}
