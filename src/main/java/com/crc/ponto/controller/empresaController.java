package com.crc.ponto.controller;
import com.crc.ponto.model.Empresa;
import com.crc.ponto.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class empresaController {

    @Autowired
    EmpresaService empresaService;
    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa){

        return empresaService.saveEmpresa(empresa);
    }
    @GetMapping
    public List<Empresa> getEmpresaList(){

        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaByID(@PathVariable("idEmpresa") Long idEmpresa) throws Exception {
        return ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(() -> new Exception("Empresa não Encontrada!")));

    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity deletarEmpresa(@PathVariable Long idEmpresa){
        empresaService.deletarEmpresa(idEmpresa);
        return ResponseEntity.ok().build();
    }

}
