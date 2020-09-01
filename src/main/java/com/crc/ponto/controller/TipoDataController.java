package com.crc.ponto.controller;
import com.crc.ponto.model.Ocorrencia;
import com.crc.ponto.model.TipoData;
import com.crc.ponto.service.OcorrenciaService;
import com.crc.ponto.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipoData")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;
    @PostMapping
    public TipoData createTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.saveTipoData(tipoData);
    }
    @GetMapping
    public List<TipoData> getTipoDataList(){

        return tipoDataService.findAll();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getTipoDataByID(@PathVariable("idTipoData") Long idTipoData) throws Exception {
        return ResponseEntity.ok(tipoDataService.getById(idTipoData).orElseThrow(() -> new Exception("Tipo data não Encontrada!")));

    }

    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.updateTipoData(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public ResponseEntity deletarTipoData(@PathVariable Long idTipoData){
        tipoDataService.deletarTipoData(idTipoData);
        return ResponseEntity.ok().build();
    }

}
