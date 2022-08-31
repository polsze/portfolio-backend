
package com.portfolio.polsze.Repository;

import com.portfolio.polsze.Entity.Acercade;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface RAcercade extends JpaRepository<Acercade, Integer> {
    public Optional<Acercade> findByNombreAc(String nombreAc);

    public boolean existsByNombreAc(String nombreAc);
}
