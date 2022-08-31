package com.portfolio.polsze.Interface;

import com.portfolio.polsze.Entity.Persona;
import java.util.List;

public interface IPersonaService {

    // Trae lista de personas
    public List<Persona> getPersona();

    // Guardar un objeto de tipo persona
    public void savePersona(Persona persona);

    // Eliminar un usuario
    public void deletePersona(Long id);

    // Buscar una persona
    public Persona findPersona(Long id);
}
