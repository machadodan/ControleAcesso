package com.crc.ponto.service;
import com.crc.ponto.model.Ocorrencia;
import com.crc.ponto.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {

    OcorrenciaRepository ocorrenciaRepository;

    @Autowired
    public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
            this.ocorrenciaRepository = ocorrenciaRepository;

    }
    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia){
       return ocorrenciaRepository.save(ocorrencia);

    }

    public List<Ocorrencia> findAll() {
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> getById(Long idOcorrencia) {

        return ocorrenciaRepository.findById(idOcorrencia);
    }

    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);

    }

    public void deletarOcorrencia(Long idOcorrencia) {

        ocorrenciaRepository.deleteById(idOcorrencia);
    }
}
