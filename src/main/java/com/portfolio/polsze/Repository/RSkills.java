package com.portfolio.polsze.Repository;

import com.portfolio.polsze.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer> {

    public Optional<Skills> findByNombreSki(String nombreSki);

    public boolean existsByNombreSki(String nombreSki);
}
