package com.crc.ponto.repository;

import com.crc.ponto.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {

}
