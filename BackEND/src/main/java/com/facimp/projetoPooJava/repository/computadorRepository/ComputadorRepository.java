package com.facimp.projetoPooJava.repository.computadorRepository;

import com.facimp.projetoPooJava.model.modelComputador.Computador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputadorRepository extends JpaRepository<Computador, Long> {

    List<Computador> findByLoja(String loja);
    List<Computador> findByMac(String mac);
    boolean existsByMac(String mac);
}
