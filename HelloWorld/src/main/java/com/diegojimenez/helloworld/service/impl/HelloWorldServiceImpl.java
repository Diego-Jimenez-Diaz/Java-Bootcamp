package com.diegojimenez.helloworld.service.impl;

import com.diegojimenez.helloworld.dto.UserDTO;
import com.diegojimenez.helloworld.service.HelloWorldService;
import com.diegojimenez.helloworld.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String getHelloWorld() {
        return "Hello World";
    }

    @Override
    public String getHello(String name) {
        return name.concat(Constants.BLANK_SPACE).concat(Constants.HELLO);
    }

    @Override
    public String getHelloUser(UserDTO userDTO) {
        return userDTO.getName().concat(Constants.BLANK_SPACE).concat(Constants.AGE).concat(Constants.BLANK_SPACE).concat(userDTO.getAge()).concat(Constants.BLANK_SPACE).concat(Constants.HELLO);
    }
}
