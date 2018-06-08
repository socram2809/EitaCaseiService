package br.ufrn.ws.eitacasei.EitaCaseiService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufrn.ws.eitacasei.EitaCaseiService.dominio.Presente;

/**
 * Repositório para as operações de CRUD em um presente
 * @author Marcos
 *
 */
public interface PresenteRepository extends JpaRepository<Presente, Long>{

}
