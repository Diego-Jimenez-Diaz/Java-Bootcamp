package com.diegojimenez.DBSpringJPA.controller;

import com.diegojimenez.DBSpringJPA.dto.UserDTO;
import com.diegojimenez.DBSpringJPA.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> insertUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.insertUser(userDTO), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO){
        return new ResponseEntity<>(userService.updateUser(userDTO), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteUser(@RequestHeader Long id){
        userService.deleteUser(id);
        return new ResponseEntity(HttpStatus.OK);
    }


}
