package com.diegojimenez.DBSpringJPA.service;

import com.diegojimenez.DBSpringJPA.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO insertUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserDTO getUser(Long id);
    void deleteUser(Long id);

}
