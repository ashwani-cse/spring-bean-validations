package com.app.bean.validation.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ashwani Kumar
 * Created on 27/12/23.
 */
@Slf4j
@RestController
public class LoginController {

    /*
    * In this class we have used Method level parameter validations.
    * */
    @GetMapping("/login")
    public ResponseEntity<String> login(
            @RequestParam("username") @NotBlank  String username,
            @RequestParam("password") String password) {

        log.info("Validating user with username : {}", username);
        return new ResponseEntity<>("Valid user", HttpStatus.OK);
    }
}
