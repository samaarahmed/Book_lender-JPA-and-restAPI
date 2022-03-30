package se.lexicon.samaar.booklender.service.facade;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.samaar.booklender.DTO.LibraryUserDTO;
import se.lexicon.samaar.booklender.model.LibraryUser;
@Component
@Transactional
public class EntityToDTOConverter {

    public LibraryUserDTO tolibraryUserDTO(LibraryUser libraryUser){

        LibraryUserDTO libraryUserDTO = new LibraryUserDTO();
        libraryUserDTO.setUserID(libraryUser.getUserID());
        libraryUserDTO.setRegDate(libraryUser.getRegDate());
        libraryUserDTO.setName(libraryUser.getName());
        libraryUserDTO.setEmail(libraryUser.getEmail());

        return libraryUserDTO;
    }


}
