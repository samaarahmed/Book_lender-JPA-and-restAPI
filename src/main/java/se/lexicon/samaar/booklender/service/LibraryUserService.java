package se.lexicon.samaar.booklender.service;

import se.lexicon.samaar.booklender.DTO.LibraryUserDTO;
import se.lexicon.samaar.booklender.model.LibraryUser;

import java.util.List;

public interface LibraryUserService {

    LibraryUserDTO findById(int userId);
    LibraryUserDTO findByEmail( String email);
    List<LibraryUserDTO> findAll();
    LibraryUserDTO create(LibraryUserDTO libraryUserDTO);
    LibraryUserDTO update(LibraryUserDTO libraryUserDTO);
    boolean delete (int userId);

}
