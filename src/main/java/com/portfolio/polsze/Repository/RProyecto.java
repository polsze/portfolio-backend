package com.portfolio.polsze.Repository;

import com.portfolio.polsze.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RProyecto extends JpaRepository<Proyecto, Integer> {

    public Optional<Proyecto> findByNombrePro(String nombrePro);

    public boolean existsByNombrePro(String nombrePro);
}
