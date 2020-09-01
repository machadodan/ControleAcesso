package com.crc.ponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//como instalamos o lombok podemos simplicar a aplicação
//usando as anotação no exemplo subst. os metodos getter e seeter
//simplemente @Getter a classe resumida a isso poder lombok


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //serve para teste software, passagem dados..
@Entity
@Audited  //se a tabela for muito grande e não quiser audita a tabela inteira posso adita so campo.
         // colocando a anotacao em cima do campo que quero.
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}
