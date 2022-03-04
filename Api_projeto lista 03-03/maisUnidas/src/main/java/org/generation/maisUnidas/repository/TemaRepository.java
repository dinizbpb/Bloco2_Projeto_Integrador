package org.generation.maisUnidas.repository;

import java.util.List;

import org.generation.maisUnidas.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema>findAllByNomeContainingIgnoreCase(String nome);

}
