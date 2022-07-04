package com.diegojimenez.DBSpringJPA.mapping;

import com.diegojimenez.DBSpringJPA.dto.UserDTO;
import com.diegojimenez.DBSpringJPA.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapping {

    public User userDTOTOUser(UserDTO userDTO){
        User user = new User();
        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setAge(userDTO.getAge());
        user.setEmail(userDTO.getEmail());

        return user;
    }

    public UserDTO userTOUserDTO(User user){
        return UserDTO.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .age(user.getAge())
                .email(user.getEmail())
                .build();
    }

    public List<UserDTO> userListTOUserDTOList(List<User> userList){
        List<UserDTO> userDTOList = new ArrayList<>();
        for (User user : userList) {
            userDTOList.add(userTOUserDTO(user));
        }
        return userDTOList;
    }
}
