package com.encontreiTextil.repository;

import com.encontreiTextil.model.ProfissaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProfissaoRepository extends JpaRepository<ProfissaoModel, Long> {


}
