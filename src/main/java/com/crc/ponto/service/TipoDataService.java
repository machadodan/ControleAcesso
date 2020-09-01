package com.crc.ponto.service;
import com.crc.ponto.model.TipoData;
import com.crc.ponto.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

   TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository) {
            this.tipoDataRepository = tipoDataRepository;

    }
    public TipoData saveTipoData(TipoData tipoData){
       return tipoDataRepository.save(tipoData);

    }

    public List<TipoData> findAll() {

        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> getById(Long idTipoData) {

        return tipoDataRepository.findById(idTipoData);
    }

    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);

    }

    public void deletarTipoData(Long idTipoData) {

        tipoDataRepository.deleteById(idTipoData);
    }
}
