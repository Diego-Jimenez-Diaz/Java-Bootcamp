package com.diegojimenez.DBSpringJPA.service.impl;

import com.diegojimenez.DBSpringJPA.dao.UserDAO;
import com.diegojimenez.DBSpringJPA.dto.UserDTO;
import com.diegojimenez.DBSpringJPA.mapping.UserMapping;
import com.diegojimenez.DBSpringJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Autowired
    UserMapping userMapping;

    @Override
    public UserDTO insertUser(UserDTO userDTO) {
        return userMapping.userTOUserDTO(userDAO.save(userMapping.userDTOTOUser(userDTO)));
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) {
        if(userDAO.existsById(userDTO.getId())){
            return userMapping.userTOUserDTO(userDAO.save(userMapping.userDTOTOUser(userDTO)));
        }else{
            return null;
        }

    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userMapping.userListTOUserDTOList(userDAO.findAll());
    }

    @Override
    public UserDTO getUser(Long id) {
        return userMapping.userTOUserDTO(userDAO.getReferenceById(id));
    }

    @Override
    public void deleteUser(Long id) {
        userDAO.deleteById(id);
    }
}
