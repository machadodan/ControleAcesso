package com.crc.ponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //serve para teste software, passagem da
@Entity
@Audited
public class Empresa {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco; //poderia ser uma entidade
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone; //ta string caso vc queira deixar formatado no banco bonitinho


}
