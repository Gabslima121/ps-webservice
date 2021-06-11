package br.com.fiap.itens.services.impl;

import br.com.fiap.itens.dto.Integrante;
import br.com.fiap.itens.entity.IntegrantesEntity;
import br.com.fiap.itens.repository.IntegranteRepository;
import br.com.fiap.itens.services.IntegrantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IntegranteServiceImpl implements IntegrantesService {

    @Autowired
    IntegranteRepository repository;

    @Override
    public List<Integrante> listaIntegrantes() {
        List<IntegrantesEntity> lista = repository.findAll();
        List<Integrante> integrantes = fromTo(lista);
        return integrantes;
    }

    @Override
    public Integrante salvaIntegrante(Integrante integrante) {
        IntegrantesEntity entity = fromTo(integrante);
        entity = repository.save(entity);
        Integrante integrantesRetorno = fromTo(entity);
        return integrantesRetorno;
    }

    @Override
    public Integrante editarIntegrante(Long id) {
        IntegrantesEntity entity = repository.findById(id).get();
        return fromTo(entity);
    }

    private IntegrantesEntity fromTo(Integrante integrante){
        IntegrantesEntity entity =  new IntegrantesEntity();
        entity.setId(integrante.getId());
        entity.setNome(integrante.getNome());
        entity.setResponsabilidade(integrante.getResponsabilidade());
        entity.setTipo(integrante.getTipo());
        return entity;
    }

    private List<Integrante> fromTo(List<IntegrantesEntity> lista){
        List<Integrante> listaDto = new ArrayList<>();
        for (IntegrantesEntity integrantesEntity : lista) {
            Integrante dto = new Integrante();
            dto.setId(integrantesEntity.getId());
            dto.setNome(integrantesEntity.getNome());
            dto.setResponsabilidade(integrantesEntity.getResponsabilidade());
            dto.setTipo(integrantesEntity.getTipo());
            listaDto.add(dto);
        }
        return listaDto;
    }

    private Integrante fromTo(IntegrantesEntity entity){
        Integrante integrante =  new Integrante();
        integrante.setId(entity.getId());
        integrante.setNome(entity.getNome());
        integrante.setResponsabilidade(entity.getResponsabilidade());
        integrante.setTipo(entity.getTipo());
        return integrante;
    }
}
