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
public class CategoriaUsuario {
    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}
