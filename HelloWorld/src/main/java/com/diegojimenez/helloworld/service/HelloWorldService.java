package com.diegojimenez.helloworld.service;

import com.diegojimenez.helloworld.dto.UserDTO;

public interface HelloWorldService {
    String getHelloWorld();
    String getHello(String name);
    String getHelloUser(UserDTO userDTO);
}
