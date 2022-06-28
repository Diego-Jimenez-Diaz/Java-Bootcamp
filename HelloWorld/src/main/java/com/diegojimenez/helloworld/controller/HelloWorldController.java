package com.diegojimenez.helloworld.controller;

import com.diegojimenez.helloworld.dto.ResponseDTO;
import com.diegojimenez.helloworld.dto.UserDTO;
import com.diegojimenez.helloworld.service.HelloWorldService;
import com.diegojimenez.helloworld.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")

public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping(value = "diegojimenez/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO<String>> getHelloWorld(){
        ResponseDTO<String> responseDTO = new ResponseDTO<>(Constants.ResponseConstant.SUCCESS.getDescription(), helloWorldService.getHelloWorld());
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = "diegojimenez/hello")
    public ResponseEntity<ResponseDTO<String>> getHelloName(@RequestHeader String name){
        ResponseDTO<String> responseDTO = new ResponseDTO<>(Constants.ResponseConstant.SUCCESS.getDescription(), helloWorldService.getHello(name));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping(value = "diegojimenez/hello/user")
    public ResponseEntity<ResponseDTO<String>> getHelloUser(@RequestBody UserDTO userDTO){
        ResponseDTO<String> responseDTO = new ResponseDTO<>(Constants.ResponseConstant.SUCCESS.getDescription(), helloWorldService.getHelloUser(userDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
