package se.lexicon.samaar.booklender.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.samaar.booklender.DAO.LibraryUserRepository;
import se.lexicon.samaar.booklender.DTO.LibraryUserDTO;
import se.lexicon.samaar.booklender.model.LibraryUser;
import se.lexicon.samaar.booklender.service.facade.DTOToEntityConverter;
import se.lexicon.samaar.booklender.service.facade.EntityToDTOConverter;

import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class LibraryUserServiceimpl implements LibraryUserService {


    private  final LibraryUserRepository libraryUserRepository;
    @Autowired
    public LibraryUserServiceimpl(LibraryUserRepository libraryUserRepository) {
        this.libraryUserRepository = libraryUserRepository;
    }


    @Override
    public LibraryUserDTO findById(int userId) {


        Optional<LibraryUser> libraryUser= libraryUserRepository.findById(userId);

        LibraryUserDTO dto = null;
            if(libraryUser.isPresent()){
                dto  = new LibraryUserDTO();
                BeanUtils.copyProperties(libraryUser.get(),dto);
        }
            return dto;


    }

    @Override
    public LibraryUserDTO findByEmail(String email) {



            LibraryUser libraryUser = libraryUserRepository.findLibraryUserByEmail(email);

            LibraryUserDTO dto  = new LibraryUserDTO();
                BeanUtils.copyProperties(libraryUser,dto);

            return dto;


        }


    @Override
    public List<LibraryUserDTO> findAll() {
       Iterable<LibraryUser> iterable = libraryUserRepository.findAll();
       List<LibraryUserDTO> dtoList = StreamSupport.stream(iterable.spliterator(),false).map(libraryUser -> {
           LibraryUserDTO dto = new LibraryUserDTO();
           BeanUtils.copyProperties(libraryUser,dto);
           return dto;
       }).collect(Collectors.toList());
        return dtoList;
    }

    @Override
    public LibraryUserDTO create(LibraryUserDTO libraryUserDTO) {
        LibraryUser libraryUser = new LibraryUser();
        BeanUtils.copyProperties(libraryUserDTO,libraryUser);
        libraryUser = libraryUserRepository.save(libraryUser);
        BeanUtils.copyProperties(libraryUser,libraryUserDTO);

        return libraryUserDTO;
    }

    @Override
    public LibraryUserDTO update(LibraryUserDTO libraryUserDTO) {
        {


            Optional<LibraryUser> libraryUseropt = libraryUserRepository.findById(libraryUserDTO.getUserID());

            if (libraryUseropt.isPresent()) {
                LibraryUser libraryUser = new LibraryUser();
                BeanUtils.copyProperties(libraryUserDTO, libraryUser);
                libraryUser = libraryUserRepository.save(libraryUser);
                BeanUtils.copyProperties(libraryUser,libraryUserDTO);
            }
            else {
                //Throw an exception
            }


            return libraryUserDTO;
        }
    }

    @Override
    public boolean delete(int userId) {
        return false;
    }
}
