package se.lexicon.samaar.booklender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.lexicon.samaar.booklender.DTO.LibraryUserDTO;
import se.lexicon.samaar.booklender.service.LibraryUserService;

import java.util.List;

@RestController
public class LibraryUserController {

    private final LibraryUserService libraryUserService;

    @Autowired
    public LibraryUserController(LibraryUserService libraryUserService) {
        this.libraryUserService = libraryUserService;
    }

    @GetMapping("api/v1/libraryuser/{userId}")
    public ResponseEntity<LibraryUserDTO> findById(@PathVariable("userId") int userId) {
        return ResponseEntity.ok(libraryUserService.findById(userId));

    }
    @GetMapping("api/v1/libraryuser//{email}")
    public ResponseEntity<LibraryUserDTO> findById(@PathVariable("email") String email) {
     return ResponseEntity.ok(libraryUserService.findByEmail(email));
   }

        @PostMapping("api/v1/libraryuser")
    public ResponseEntity<LibraryUserDTO> create(@RequestBody LibraryUserDTO libraryUserDTO) {
            libraryUserDTO = libraryUserService.create(libraryUserDTO);
        return ResponseEntity.ok(libraryUserDTO);

    }
    @GetMapping("api/v1/libraryuser")
    public ResponseEntity<List<LibraryUserDTO>> findAll() {
        return ResponseEntity.ok(libraryUserService.findAll());

    }
    @PutMapping("api/v1/libraryuser/{userId}")
    public ResponseEntity<LibraryUserDTO> update(@PathVariable("userId") int userId,@RequestBody LibraryUserDTO libraryUserDTO) {

        return ResponseEntity.ok(libraryUserService.update(libraryUserDTO));

    }
}
