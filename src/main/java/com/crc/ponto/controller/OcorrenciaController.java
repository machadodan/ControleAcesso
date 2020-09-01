package com.crc.ponto.controller;
import com.crc.ponto.model.Ocorrencia;
import com.crc.ponto.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;
    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }
    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){

        return ocorrenciaService.findAll();
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> getOcorrenciaByID(@PathVariable("idOcorrencia") Long idOcorrencia) throws Exception {
        return ResponseEntity.ok(ocorrenciaService.getById(idOcorrencia).orElseThrow(() -> new Exception("Ocorrencia não Encontrada!")));

    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public ResponseEntity deletarOcorrencia(@PathVariable Long idOcorrencia){
        ocorrenciaService.deletarOcorrencia(idOcorrencia);
        return ResponseEntity.ok().build();
    }

}
