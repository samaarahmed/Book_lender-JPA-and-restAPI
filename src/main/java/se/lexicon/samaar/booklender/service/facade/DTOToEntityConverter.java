package se.lexicon.samaar.booklender.service.facade;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.samaar.booklender.DTO.LibraryUserDTO;
import se.lexicon.samaar.booklender.model.LibraryUser;

@Component
@Transactional
public class DTOToEntityConverter {

    public LibraryUser toEntity(LibraryUserDTO dto) {

        LibraryUser entity = new LibraryUser();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());

        return entity;
    }

}
