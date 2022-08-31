
package com.portfolio.polsze.Service;

import com.portfolio.polsze.Entity.Acercade;
import com.portfolio.polsze.Repository.RAcercade;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAcercade {
    @Autowired
    RAcercade rAcercade;
    
    public List<Acercade> list() {
        return rAcercade.findAll();
    }

    public Optional<Acercade> getOne(int id) {
        return rAcercade.findById(id);
    }

    public Optional<Acercade> getByNombreAc(String nombreAc) {
        return rAcercade.findByNombreAc(nombreAc);
    }

    public void save(Acercade acercade) {
        rAcercade.save(acercade);
    }

    public void delete(int id) {
        rAcercade.deleteById(id);
    }

    public boolean existsById(int id) {
        return rAcercade.existsById(id);
    }

    public boolean existsByNombreAc(String nombreAc) {
        return rAcercade.existsByNombreAc(nombreAc);
    }
    
}
