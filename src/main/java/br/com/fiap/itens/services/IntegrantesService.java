package br.com.fiap.itens.services;

import br.com.fiap.itens.dto.Integrante;

import java.util.List;

public interface IntegrantesService {
    List<Integrante> listaIntegrantes();

    Integrante salvaIntegrante(Integrante integrante);

    Integrante editarIntegrante(Long id);
}
