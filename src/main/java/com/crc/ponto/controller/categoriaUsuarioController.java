package com.crc.ponto.controller;
import com.crc.ponto.model.CategoriaUsuario;
import com.crc.ponto.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoriaUsuario")
public class categoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;
    @PostMapping
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){

        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }
    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList(){

        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> getCategoriaUsuarioByID(@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) throws Exception {
        return ResponseEntity.ok(categoriaUsuarioService.getById(idCategoriaUsuario).orElseThrow(() -> new Exception("Categoria Usuario não Encontrada!")));

    }

    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoriaUsuario}")
    public ResponseEntity deletarCategoriaUsuario(@PathVariable Long idCategoriaUsuario){
        categoriaUsuarioService.deletarCategoriaUsuario(idCategoriaUsuario);
        return ResponseEntity.ok().build();
    }

}
