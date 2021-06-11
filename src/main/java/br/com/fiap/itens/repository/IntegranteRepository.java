package br.com.fiap.itens.repository;

import br.com.fiap.itens.entity.IntegrantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntegranteRepository  extends JpaRepository<IntegrantesEntity,Long> {
}
