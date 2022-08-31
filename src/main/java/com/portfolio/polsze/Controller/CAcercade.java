
package com.portfolio.polsze.Controller;

import com.portfolio.polsze.Dto.DtoAcercade;
import com.portfolio.polsze.Entity.Acercade;
import com.portfolio.polsze.Security.Controller.Mensaje;
import com.portfolio.polsze.Service.SAcercade;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/aboutme")
public class CAcercade {
    @Autowired
    SAcercade sAcercade;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Acercade>> list() {
        List<Acercade> list = sAcercade.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Acercade> getById(@PathVariable("id") int id) {
        if (!sAcercade.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Acercade acercade = sAcercade.getOne(id).get();
        return new ResponseEntity(acercade, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sAcercade.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sAcercade.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoAcercade dtoace) {
        if (StringUtils.isBlank(dtoace.getNombreAc())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sAcercade.existsByNombreAc(dtoace.getNombreAc())) {
            return new ResponseEntity(new Mensaje("Esa persona ya existe"), HttpStatus.BAD_REQUEST);
        }

        Acercade acercade = new Acercade(dtoace.getNombreAc(), dtoace.getApellidoAc(), dtoace.getDescripcionAc(), dtoace.getImgAc());
        sAcercade.save(acercade);

        return new ResponseEntity(new Mensaje("Persona agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoAcercade dtoace) {
        //Validamos si existe el ID
        if (!sAcercade.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //Compara nombre de experiencias
        if (sAcercade.existsByNombreAc(dtoace.getNombreAc()) && sAcercade.getByNombreAc(dtoace.getNombreAc()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa Persona ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtoace.getNombreAc())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Acercade acercade = sAcercade.getOne(id).get();
        acercade.setNombreAc(dtoace.getNombreAc());
        acercade.setApellidoAc(dtoace.getApellidoAc());
        acercade.setDescripcionAc((dtoace.getDescripcionAc()));
        acercade.setImgAc(dtoace.getImgAc());

        sAcercade.save(acercade);
        return new ResponseEntity(new Mensaje("Persona actualizada"), HttpStatus.OK);

    }
}
